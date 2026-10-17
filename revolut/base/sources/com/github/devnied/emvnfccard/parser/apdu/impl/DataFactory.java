package com.github.devnied.emvnfccard.parser.apdu.impl;

import com.github.devnied.emvnfccard.model.enums.IKeyEnum;
import com.github.devnied.emvnfccard.parser.apdu.annotation.AnnotationData;
import com.github.devnied.emvnfccard.utils.EnumUtils;
import fr.devnied.bitlib.BitUtils;
import java.util.Calendar;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class DataFactory {
    public static final int BCD_DATE = 1;
    public static final int CPCL_DATE = 2;
    public static final int HALF_BYTE_SIZE = 4;
    public static final String BCD_FORMAT = "BCD_Format";
    public static final Logger LOGGER = LoggerFactory.getLogger(DataFactory.class.getName());

    private DataFactory() {
    }

    public static Date calculateCplcDate(byte[] bArr) throws IllegalArgumentException {
        if (bArr == null || bArr.length != 2) {
            throw new IllegalArgumentException("Error! CLCP Date values consist always of exactly 2 bytes");
        }
        if (bArr[0] == 0 && bArr[1] == 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = i - (i % 10);
        int i3 = (bArr[0] & 15) * 100;
        byte b4 = bArr[1];
        int i5 = (((b4 >>> 4) & 15) * 10) + i3 + (b4 & 15);
        if (i5 > 366) {
            throw new IllegalArgumentException("Invalid date (or are we parsing it wrong??)");
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        int i6 = i2 + ((bArr[0] >>> 4) & 15);
        calendar2.set(1, i6);
        calendar2.set(6, i5);
        while (calendar2.after(calendar)) {
            i6 -= 10;
            calendar2.clear();
            calendar2.set(1, i6);
            calendar2.set(6, i5);
        }
        return calendar2.getTime();
    }

    private static Date getDate(AnnotationData annotationData, BitUtils bitUtils) {
        return annotationData.getDateStandard() == 1 ? bitUtils.getNextDate(annotationData.getSize(), annotationData.getFormat(), true) : annotationData.getDateStandard() == 2 ? calculateCplcDate(bitUtils.getNextByte(annotationData.getSize())) : bitUtils.getNextDate(annotationData.getSize(), annotationData.getFormat());
    }

    private static IKeyEnum getEnum(AnnotationData annotationData, BitUtils bitUtils) {
        int i;
        try {
            i = Integer.parseInt(bitUtils.getNextHexaString(annotationData.getSize()), annotationData.isReadHexa() ? 16 : 10);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        return EnumUtils.getValue(i, annotationData.getField().getType());
    }

    private static Float getFloat(AnnotationData annotationData, BitUtils bitUtils) {
        return "BCD_Format".equals(annotationData.getFormat()) ? Float.valueOf(Float.parseFloat(bitUtils.getNextHexaString(annotationData.getSize()))) : Float.valueOf(getInteger(annotationData, bitUtils));
    }

    private static int getInteger(AnnotationData annotationData, BitUtils bitUtils) {
        return bitUtils.getNextInteger(annotationData.getSize());
    }

    public static Object getObject(AnnotationData annotationData, BitUtils bitUtils) {
        Class<?> type = annotationData.getField().getType();
        if (type.equals(Integer.class)) {
            return Integer.valueOf(getInteger(annotationData, bitUtils));
        }
        if (type.equals(Float.class)) {
            return getFloat(annotationData, bitUtils);
        }
        if (type.equals(String.class)) {
            return getString(annotationData, bitUtils);
        }
        if (type.equals(Date.class)) {
            return getDate(annotationData, bitUtils);
        }
        if (type.isEnum()) {
            return getEnum(annotationData, bitUtils);
        }
        return null;
    }

    private static String getString(AnnotationData annotationData, BitUtils bitUtils) {
        return annotationData.isReadHexa() ? bitUtils.getNextHexaString(annotationData.getSize()) : bitUtils.getNextString(annotationData.getSize()).trim();
    }
}
