package rl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static d a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        d dVar = d.PASSCODE;
        if (value.equals(dVar.a())) {
            return dVar;
        }
        d dVar2 = d.PASSKEY;
        if (value.equals(dVar2.a())) {
            return dVar2;
        }
        throw new IllegalStateException(a10.b.s("No type for ", value, " value"));
    }
}
