package cjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private a() {
    }

    public static b a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode != -1881086717) {
            if (iHashCode != -364204096) {
                if (iHashCode == 84631219 && value.equals("YOUTH")) {
                    return b.YOUTH;
                }
            } else if (value.equals("BUSINESS")) {
                return b.BUSINESS;
            }
        } else if (value.equals("RETAIL")) {
            return b.RETAIL;
        }
        throw new IllegalStateException("Can't convert ".concat(value).toString());
    }
}
