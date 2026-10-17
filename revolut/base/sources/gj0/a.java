package gj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static c a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int iHashCode = type.hashCode();
        if (iHashCode != 1411860198) {
            if (iHashCode != 1765103501) {
                if (iHashCode == 1967266210 && type.equals("BRANCH")) {
                    return c.BRANCH;
                }
            } else if (type.equals("CONTENT_REF")) {
                return c.CONTENT_REF;
            }
        } else if (type.equals("DEEPLINK")) {
            return c.DEEPLINK;
        }
        throw new IllegalArgumentException(p.a.p("Unknown Pigeon Node Type: '", type, "'"));
    }
}
