package com.github.devnied.emvnfccard.utils;

import com.github.devnied.emvnfccard.enums.SwEnum;
import fr.devnied.bitlib.BytesUtils;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ymm.a;

/* JADX INFO: loaded from: classes16.dex */
public final class ResponseUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) ResponseUtils.class);

    private ResponseUtils() {
    }

    public static boolean contains(byte[] bArr, SwEnum... swEnumArr) {
        SwEnum sw10 = SwEnum.getSW(bArr);
        Logger logger = LOGGER;
        if (logger.isDebugEnabled() && bArr != null) {
            StringBuilder sb6 = new StringBuilder("Response Status <");
            sb6.append(BytesUtils.bytesToStringNoSpace(Arrays.copyOfRange(bArr, Math.max(bArr.length - 2, 0), bArr.length)));
            sb6.append("> : ");
            sb6.append(sw10 != null ? sw10.getDetail() : "Unknow");
            logger.debug(sb6.toString());
        }
        return sw10 != null && a.a(swEnumArr, sw10);
    }

    public static boolean isEquals(byte[] bArr, SwEnum swEnum) {
        return contains(bArr, swEnum);
    }

    public static boolean isSucceed(byte[] bArr) {
        return contains(bArr, SwEnum.SW_9000);
    }
}
