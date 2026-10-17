package com.github.devnied.emvnfccard.utils;

import com.github.devnied.emvnfccard.enums.TagValueTypeEnum;
import com.github.devnied.emvnfccard.exception.TlvException;
import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import com.github.devnied.emvnfccard.iso7816emv.TLV;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import fr.devnied.bitlib.BytesUtils;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tmm.c;
import ymm.a;
import ymm.g;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
public final class TlvUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) TlvUtil.class);

    /* JADX INFO: renamed from: com.github.devnied.emvnfccard.utils.TlvUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum;

        static {
            int[] iArr = new int[TagValueTypeEnum.values().length];
            $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum = iArr;
            try {
                iArr[TagValueTypeEnum.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum[TagValueTypeEnum.NUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum[TagValueTypeEnum.BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum[TagValueTypeEnum.MIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum[TagValueTypeEnum.DOL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private TlvUtil() {
    }

    public static String getFormattedTagAndLength(byte[] bArr, int i) {
        StringBuilder sb6 = new StringBuilder();
        String spaces = getSpaces(i);
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        boolean z = true;
        while (tLVInputStream.available() > 0) {
            try {
                try {
                    if (z) {
                        z = false;
                    } else {
                        sb6.append("\n");
                    }
                    sb6.append(spaces);
                    ITag iTagSearchTagById = searchTagById(tLVInputStream.readTag());
                    int length = tLVInputStream.readLength();
                    sb6.append(prettyPrintHex(iTagSearchTagById.getTagBytes()));
                    sb6.append(" ");
                    sb6.append(String.format("%02x", Integer.valueOf(length)));
                    sb6.append(" -- ");
                    sb6.append(iTagSearchTagById.getName());
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), (Throwable) e);
                }
            } finally {
                c.a(tLVInputStream);
            }
        }
        return sb6.toString();
    }

    public static int getLength(List<TagAndLength> list) {
        int length = 0;
        if (list != null) {
            Iterator<TagAndLength> it8 = list.iterator();
            while (it8.hasNext()) {
                length += it8.next().getLength();
            }
        }
        return length;
    }

    public static TLV getNextTLV(TLVInputStream tLVInputStream) {
        try {
            try {
                if (tLVInputStream.available() <= 2) {
                    return null;
                }
                ITag iTagSearchTagById = searchTagById(tLVInputStream.readTag());
                int length = tLVInputStream.readLength();
                return tLVInputStream.available() >= length ? new TLV(iTagSearchTagById, length, TLVUtil.getLengthAsBytes(length), tLVInputStream.readValue()) : null;
            } catch (EOFException e) {
                LOGGER.debug(e.getMessage(), (Throwable) e);
                return null;
            } catch (IOException e2) {
                LOGGER.error(e2.getMessage(), (Throwable) e2);
                return null;
            }
        } finally {
            c.a(tLVInputStream);
        }
    }

    public static String getSafePrintChars(byte[] bArr) {
        return bArr == null ? "" : getSafePrintChars(bArr, 0, bArr.length);
    }

    public static String getSpaces(int i) {
        return g.f("", i, p.SPACE_CHAR);
    }

    private static String getTagValueAsString(ITag iTag, byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        int i = AnonymousClass1.$SwitchMap$com$github$devnied$emvnfccard$enums$TagValueTypeEnum[iTag.getTagValueType().ordinal()];
        if (i == 1) {
            sb6.append("=");
            sb6.append(new String(bArr));
        } else if (i == 2) {
            sb6.append("NUMERIC");
        } else if (i == 3) {
            sb6.append("BINARY");
        } else if (i == 4) {
            sb6.append("=");
            sb6.append(getSafePrintChars(bArr));
        } else if (i == 5) {
            sb6.append("");
        }
        return sb6.toString();
    }

    public static byte[] getValue(byte[] bArr, ITag... iTagArr) {
        TLV nextTLV;
        byte[] value = null;
        if (bArr == null) {
            return null;
        }
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        while (tLVInputStream.available() > 0 && (nextTLV = getNextTLV(tLVInputStream)) != null) {
            try {
                if (!a.a(iTagArr, nextTLV.getTag())) {
                    if (nextTLV.getTag().isConstructed() && (value = getValue(nextTLV.getValueBytes(), iTagArr)) != null) {
                        break;
                    }
                } else {
                    return nextTLV.getValueBytes();
                }
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), (Throwable) e);
                return value;
            } finally {
                c.a(tLVInputStream);
            }
        }
        return value;
    }

    public static List<TLV> getlistTLV(byte[] bArr, ITag iTag, boolean z) {
        TLV nextTLV;
        ArrayList arrayList = new ArrayList();
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        while (tLVInputStream.available() > 0 && (nextTLV = getNextTLV(tLVInputStream)) != null) {
            try {
                try {
                    if (z) {
                        arrayList.add(nextTLV);
                    } else if (nextTLV.getTag().isConstructed()) {
                        arrayList.addAll(getlistTLV(nextTLV.getValueBytes(), iTag, nextTLV.getTag() == iTag));
                    }
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), (Throwable) e);
                    c.a(tLVInputStream);
                    return arrayList;
                }
            } finally {
                c.a(tLVInputStream);
            }
        }
        return arrayList;
    }

    public static List<TagAndLength> parseTagAndLength(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr == null) {
            return arrayList;
        }
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        while (tLVInputStream.available() > 0) {
            try {
                try {
                    if (tLVInputStream.available() < 2) {
                        throw new TlvException("Data length < 2 : " + tLVInputStream.available());
                    }
                    arrayList.add(new TagAndLength(searchTagById(tLVInputStream.readTag()), tLVInputStream.readLength()));
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), (Throwable) e);
                    c.a(tLVInputStream);
                    return arrayList;
                }
            } catch (Throwable th10) {
                c.a(tLVInputStream);
                throw th10;
            }
        }
        c.a(tLVInputStream);
        return arrayList;
    }

    public static String prettyPrintAPDUResponse(byte[] bArr) {
        return prettyPrintAPDUResponse(bArr, 0);
    }

    public static String prettyPrintHex(String str, int i) {
        return prettyPrintHex(str, i, true);
    }

    private static ITag searchTagById(int i) {
        return EmvTags.getNotNull(TLVUtil.getTagAsBytes(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r1.setLength(0);
        com.github.devnied.emvnfccard.utils.TlvUtil.LOGGER.debug("TLV format error");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String prettyPrintAPDUResponse(byte[] r9, int r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.devnied.emvnfccard.utils.TlvUtil.prettyPrintAPDUResponse(byte[], int):java.lang.String");
    }

    public static String prettyPrintHex(byte[] bArr) {
        return prettyPrintHex(BytesUtils.bytesToStringNoSpace(bArr), 0, true);
    }

    public static String getSafePrintChars(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "";
        }
        int i3 = i + i2;
        if (bArr.length >= i3) {
            StringBuilder sb6 = new StringBuilder();
            while (i < i3) {
                byte b4 = bArr[i];
                if (b4 >= 32 && b4 < 127) {
                    sb6.append((char) b4);
                } else {
                    sb6.append(".");
                }
                i++;
            }
            return sb6.toString();
        }
        throw new IllegalArgumentException(j6.a.v(com.google.android.gms.internal.mlkit_vision_face.a.w("startPos(", i, i2, ")+length(", ") > byteArray.length("), ")", bArr.length));
    }

    public static String prettyPrintHex(String str, int i, boolean z) {
        StringBuilder sb6 = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            sb6.append(str.charAt(i2));
            i2++;
            if (z && i2 % 32 == 0 && i2 != str.length()) {
                sb6.append("\n");
                sb6.append(getSpaces(i));
            } else if (i2 % 2 == 0 && i2 != str.length()) {
                sb6.append(" ");
            }
        }
        return sb6.toString();
    }

    public static List<TLV> getlistTLV(byte[] bArr, ITag... iTagArr) {
        TLV nextTLV;
        ArrayList arrayList = new ArrayList();
        TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(bArr));
        while (tLVInputStream.available() > 0 && (nextTLV = getNextTLV(tLVInputStream)) != null) {
            try {
                try {
                    if (a.a(iTagArr, nextTLV.getTag())) {
                        arrayList.add(nextTLV);
                    } else if (nextTLV.getTag().isConstructed()) {
                        arrayList.addAll(getlistTLV(nextTLV.getValueBytes(), iTagArr));
                    }
                } catch (IOException e) {
                    LOGGER.error(e.getMessage(), (Throwable) e);
                    c.a(tLVInputStream);
                    return arrayList;
                }
            } finally {
                c.a(tLVInputStream);
            }
        }
        return arrayList;
    }
}
