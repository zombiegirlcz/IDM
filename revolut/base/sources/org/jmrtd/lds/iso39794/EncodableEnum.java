package org.jmrtd.lds.iso39794;

import java.lang.Enum;

/* JADX INFO: loaded from: classes14.dex */
interface EncodableEnum<T extends Enum<T>> {
    static <T> T fromCode(int i, Class<T> cls) {
        for (T t2 : cls.getEnumConstants()) {
            if ((t2 instanceof EncodableEnum) && ((EncodableEnum) t2).getCode() == i) {
                return t2;
            }
        }
        return null;
    }

    int getCode();
}
