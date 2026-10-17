package cjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {
    private r() {
    }

    public static s a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        s sVar = s.GLOBAL;
        if (value.equals(sVar.a())) {
            return sVar;
        }
        s sVar2 = s.REGIONAL;
        if (value.equals(sVar2.a())) {
            return sVar2;
        }
        throw new IllegalStateException(value.concat(" is not supported").toString());
    }
}
