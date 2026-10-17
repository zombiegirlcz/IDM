package ui0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import kotlin.text.o;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static d a(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        o oVarE = d.f.e(raw);
        if (oVarE == null) {
            throw new IllegalArgumentException("error while parse ".concat(raw));
        }
        m mVar = (m) oVarE.c();
        int i = Integer.parseInt((String) mVar.get(1));
        int i2 = Integer.parseInt((String) mVar.get(2));
        String str = (String) mVar.get(3);
        return new d(i, i2, str.length() == 0 ? 0 : Integer.parseInt(str), 0, null);
    }
}
