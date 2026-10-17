package com.github.devnied.emvnfccard.utils;

import a0.d;
import com.github.devnied.emvnfccard.model.enums.IKeyEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class EnumUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) EnumUtils.class);

    private EnumUtils() {
    }

    public static <T extends IKeyEnum> T getValue(int i, Class<T> cls) {
        for (T t2 : cls.getEnumConstants()) {
            if (t2.getKey() == i) {
                return t2;
            }
        }
        Logger logger = LOGGER;
        StringBuilder sbW = d.w(i, "Unknow value:", " for Enum:");
        sbW.append(cls.getName());
        logger.error(sbW.toString());
        return null;
    }
}
