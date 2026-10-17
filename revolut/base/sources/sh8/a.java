package sh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final v6d.a a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.f(str, "firstPartyMarketing")) {
            return v6d.a.FIRST_PARTY_MARKETING;
        }
        if (Intrinsics.f(str, "thirdPartyMarketing")) {
            return v6d.a.THIRD_PARTY_MARKETING;
        }
        return null;
    }
}
