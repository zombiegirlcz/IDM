package opi;

import android.os.Bundle;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.d0;
import efm.r;
import ip0.v7;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import op0.o3;
import org.jetbrains.annotations.NotNull;
import rnd.k;
import rof.e;
import rp0.m;
import rp0.o;
import rp0.y;
import te0.w;
import ufm.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends fsi.c implements d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final fsi.b f227679p = new fsi.b("EXPANDABLE_DIALOG_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseDelegatesActivity f227680h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f227681j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f227682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f227683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f227684n;
    public Function0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseDelegatesActivity activity) {
        super(f227679p);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f227680h = activity;
        this.f227683m = w.y0(new lm.d(19));
        this.f227684n = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final m N() {
        this.i = true;
        Q();
        return (m) this.f227683m.getValue();
    }

    public final efm.b O() {
        return N().c();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void Q() {
        if (this.i && this.k && !this.f227681j) {
            ((m) this.f227683m.getValue()).e(this.f227680h);
            this.f227681j = true;
        }
    }

    public final r R() {
        return N().f();
    }

    public final r V() {
        return N().h();
    }

    public final void W(Function0 adapterProvider) {
        Intrinsics.checkNotNullParameter(adapterProvider, "adapterProvider");
        this.o = adapterProvider;
        this.f227682l = true;
        m mVarN = N();
        mVarN.getClass();
        Intrinsics.checkNotNullParameter(adapterProvider, "adapterProvider");
        mVarN.f256124m = null;
        mVarN.f256125n = adapterProvider;
        o oVar = mVarN.f;
        if (oVar != null) {
            mVarN.j(oVar.c());
        }
    }

    public final r W0() {
        r map = N().f256126p.map(new e(12, new k(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void X(Function0 delegatesProvider) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        this.i = true;
        Q();
        this.f227684n.put("DEFAULT_LEGACY_DELEGATES_KEY", delegatesProvider.invoke());
    }

    public final void Y(String delegatesKey, List delegates) {
        Intrinsics.checkNotNullParameter(delegatesKey, "delegatesKey");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f227684n.put(delegatesKey, delegates);
    }

    public final void Z(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String strC = model.c();
        if (strC == null) {
            strC = "DEFAULT_LEGACY_DELEGATES_KEY";
        }
        if (this.f227682l) {
            strC.equals("DEFAULT_LEGACY_DELEGATES_KEY");
        }
        List list = (List) this.f227684n.get(strC);
        if (list == null && strC.equals("DEFAULT_LEGACY_DELEGATES_KEY") && this.f227682l) {
            Function0 adapterProvider = this.o;
            if (adapterProvider != null) {
                m mVarN = N();
                mVarN.getClass();
                Intrinsics.checkNotNullParameter(adapterProvider, "adapterProvider");
                mVarN.f256124m = null;
                mVarN.f256125n = adapterProvider;
                o oVar = mVarN.f;
                if (oVar != null) {
                    mVarN.j(oVar.c());
                }
            }
        } else {
            if (list == null) {
                throw new IllegalArgumentException(j6.a.s("Delegates for the key ", strC, " not found. Make sure you called setDelegatesProvider method with the key ", strC, " before showing the dialog"));
            }
            N().i(new d4h.a(list, 4));
        }
        N().l(model, true);
    }

    public final efm.b a0(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        m mVarN = N();
        r rVarStartWith = mVarN.f256121h.startWith((efm.w) r.fromCallable(new af.d(new eki.e(mVarN), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        d0 d0VarFirstOrError = rVarStartWith.filter(new o3(18, new o0(16))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return v7.x(new f(o70.a.i(d0VarFirstOrError), new o3(19, new ood.k(this, model, 16)), 3), "ignoreElement(...)");
    }

    public final void b0(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        N().m(model);
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        this.k = true;
        Q();
    }
}
