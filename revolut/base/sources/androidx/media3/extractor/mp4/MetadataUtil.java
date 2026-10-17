package androidx.media3.extractor.mp4;

import a0.d;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* JADX INFO: loaded from: classes.dex */
abstract class MetadataUtil {
    private static CommentFrame parseCommentAttribute(int i, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i2 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        String str = fullBoxFlags == 13 ? "image/jpeg" : fullBoxFlags == 14 ? "image/png" : null;
        if (str == null) {
            a.z(fullBoxFlags, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i2 = i - 16;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int i2 = parsableByteArray.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == 169 || i3 == 253) {
                int i5 = 16777215 & i2;
                if (i5 == 6516084) {
                    return parseCommentAttribute(i2, parsableByteArray);
                }
                if (i5 == 7233901 || i5 == 7631467) {
                    return parseTextAttribute(i2, "TIT2", parsableByteArray);
                }
                if (i5 == 6516589 || i5 == 7828084) {
                    return parseTextAttribute(i2, "TCOM", parsableByteArray);
                }
                if (i5 == 6578553) {
                    return parseTextAttribute(i2, "TDRC", parsableByteArray);
                }
                if (i5 == 4280916) {
                    return parseTextAttribute(i2, "TPE1", parsableByteArray);
                }
                if (i5 == 7630703) {
                    return parseTextAttribute(i2, "TSSE", parsableByteArray);
                }
                if (i5 == 6384738) {
                    return parseTextAttribute(i2, "TALB", parsableByteArray);
                }
                if (i5 == 7108978) {
                    return parseTextAttribute(i2, "USLT", parsableByteArray);
                }
                if (i5 == 6776174) {
                    return parseTextAttribute(i2, "TCON", parsableByteArray);
                }
                if (i5 == 6779504) {
                    return parseTextAttribute(i2, "TIT1", parsableByteArray);
                }
                if (i5 == 7173742) {
                    return parseTextAttribute(i2, "MVNM", parsableByteArray);
                }
                if (i5 == 7173737) {
                    return parseIntegerAttribute(i2, "MVIN", parsableByteArray, true, false);
                }
            } else {
                if (i2 == 1735291493) {
                    return parseStandardGenreAttribute(parsableByteArray);
                }
                if (i2 == 1684632427) {
                    return parseIndexAndCountAttribute(i2, "TPOS", parsableByteArray);
                }
                if (i2 == 1953655662) {
                    return parseIndexAndCountAttribute(i2, "TRCK", parsableByteArray);
                }
                if (i2 == 1953329263) {
                    return parseIntegerAttribute(i2, "TBPM", parsableByteArray, true, false);
                }
                if (i2 == 1668311404) {
                    return parseIntegerAttribute(i2, "TCMP", parsableByteArray, true, true);
                }
                if (i2 == 1668249202) {
                    return parseCoverArt(parsableByteArray);
                }
                if (i2 == 1631670868) {
                    return parseTextAttribute(i2, "TPE2", parsableByteArray);
                }
                if (i2 == 1936682605) {
                    return parseTextAttribute(i2, "TSOT", parsableByteArray);
                }
                if (i2 == 1936679276) {
                    return parseTextAttribute(i2, "TSOA", parsableByteArray);
                }
                if (i2 == 1936679282) {
                    return parseTextAttribute(i2, "TSOP", parsableByteArray);
                }
                if (i2 == 1936679265) {
                    return parseTextAttribute(i2, "TSO2", parsableByteArray);
                }
                if (i2 == 1936679791) {
                    return parseTextAttribute(i2, "TSOC", parsableByteArray);
                }
                if (i2 == 1920233063) {
                    return parseIntegerAttribute(i2, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (i2 == 1885823344) {
                    return parseIntegerAttribute(i2, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (i2 == 1936683886) {
                    return parseTextAttribute(i2, "TVSHOWSORT", parsableByteArray);
                }
                if (i2 == 1953919848) {
                    return parseTextAttribute(i2, "TVSHOW", parsableByteArray);
                }
                if (i2 == 757935405) {
                    return parseInternalAttribute(parsableByteArray, i);
                }
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + Mp4Box.getBoxTypeString(i2));
            parsableByteArray.setPosition(i);
            return null;
        } finally {
            parsableByteArray.setPosition(i);
        }
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i2 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String strN = d.n("", unsignedShort);
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strN = a.k(unsignedShort2, strN, "/");
                }
                return new TextInformationFrame(str, null, ImmutableList.of(strN));
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    private static Id3Frame parseIntegerAttribute(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z3) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z3) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.of(Integer.toString(integerAttribute))) : new CommentFrame("und", str, Integer.toString(integerAttribute));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i5 = parsableByteArray.readInt();
            int i6 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i6 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i5 - 12);
            } else if (i6 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i5 - 12);
            } else {
                if (i6 == 1684108385) {
                    i2 = position;
                    i3 = i5;
                }
                parsableByteArray.skipBytes(i5 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i2);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i3 - 16));
    }

    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i) {
                return null;
            }
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i3 = parsableByteArray.readInt();
                int i5 = parsableByteArray.readInt();
                int i6 = i2 - 16;
                byte[] bArr = new byte[i6];
                parsableByteArray.readBytes(bArr, 0, i6);
                return new MdtaMetadataEntry(str, bArr, i5, i3);
            }
            parsableByteArray.setPosition(position + i2);
        }
    }

    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String strResolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new TextInformationFrame("TCON", null, ImmutableList.of(strResolveV1Genre));
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static TextInformationFrame parseTextAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, ImmutableList.of(parsableByteArray.readNullTerminatedString(i2 - 16)));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    public static void setFormatGaplessInfo(int i, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setFormatMetadata(int i, Metadata metadata, Format.Builder builder, Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            UnmodifiableIterator it8 = metadata.getEntriesOfType(MdtaMetadataEntry.class).iterator();
            while (it8.hasNext()) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) it8.next();
                if (!mdtaMetadataEntry.key.equals("com.android.capture.fps") || i == 2) {
                    metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i2 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i2 != 3) {
                if (i2 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                    return parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                return parsableByteArray.readUnsignedInt24();
            }
        }
        Log.w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }
}
