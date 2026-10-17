package te0;

import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends e {
    public final String d;
    public final Function3 e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String key, Function3 putToBundleStrategy) {
        this(key, od0.i.f224256b, putToBundleStrategy);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(putToBundleStrategy, "putToBundleStrategy");
        od0.i.Companion.getClass();
    }

    @Override // te0.e
    public final Object d(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!bundle.getBoolean(this.d)) {
            od0.i.Companion.getClass();
            return od0.i.f224256b;
        }
        Object obj2 = bundle.get(this.f270012c);
        Intrinsics.i(obj2, "null cannot be cast to non-null type T of com.revolut.core.data.state.BundleOptionalField");
        od0.i.Companion.getClass();
        return od0.h.a(obj2);
    }

    @Override // te0.e
    public final void e(Bundle bundle, Object obj2) {
        Object objA;
        od0.i value = (od0.i) obj2;
        String str = this.f270012c;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (value.d()) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                this.e.invoke(bundle, str, value.c());
                bundle.putBoolean(this.d, true);
                objA = Unit.f186387a;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BundleOptionalField", p.a.p("Failed to put ", str, " field in bundle"), thA, h0Var);
            }
        }
    }

    public /* synthetic */ m(String str, od0.i iVar) {
        this(str, iVar, l.f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String key, od0.i iVar, Function3 putToBundleStrategy) {
        super(key, iVar);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iVar, "default");
        Intrinsics.checkNotNullParameter(putToBundleStrategy, "putToBundleStrategy");
        this.d = key.concat("_optional");
        this.e = putToBundleStrategy;
    }
}
