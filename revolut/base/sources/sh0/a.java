package sh0;

import ag.n;
import ie.r;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o7.d;
import zjh.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final void a(Throwable throwable, LinkedHashMap customKeys) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        d dVar = new d();
        for (Map.Entry entry : customKeys.entrySet()) {
            dVar.o((String) entry.getKey(), (String) entry.getValue());
        }
        c cVarB = dVar.b();
        Intrinsics.checkNotNullExpressionValue(cVarB, "build(...)");
        ee.c cVarA = ee.c.a();
        if (throwable == null) {
            return;
        }
        r rVar = cVarA.f125046a;
        rVar.o.f173167a.b(new b0.d(rVar, 9, throwable, (HashMap) cVarB.f322830b));
    }

    public final void b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        r rVar = ee.c.a().f125046a;
        rVar.o.f173167a.b(new n(rVar, 3, key, value));
    }
}
