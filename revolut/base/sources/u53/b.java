package u53;

import android.content.Context;
import cp5.c;
import efm.d0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ni0.d;
import ni0.k;
import od0.i;
import te0.w;
import u1.g;
import u3a.q;
import ue0.e;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f277378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0.a f277379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f277380c;

    public b(Context context, k walletPaymentsClientFactory, d walletOptionsBuilderFactory, gi0.a mobileServicesProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(walletPaymentsClientFactory, "walletPaymentsClientFactory");
        Intrinsics.checkNotNullParameter(walletOptionsBuilderFactory, "walletOptionsBuilderFactory");
        Intrinsics.checkNotNullParameter(mobileServicesProvider, "mobileServicesProvider");
        this.f277378a = walletPaymentsClientFactory;
        this.f277379b = mobileServicesProvider;
        this.f277380c = j.b(new g(this, context, 14));
    }

    public final d0 a() {
        boolean zJ = c.j(this.f277379b);
        i iVar = i.f224256b;
        if (!zJ) {
            i.Companion.getClass();
            ufm.b bVarM = d0.m(iVar);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ni0.j jVar = (ni0.j) this.f277380c.getValue();
        jVar.getClass();
        ufm.b bVar = new ufm.b(new nd3.a(jVar, 16), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        ufm.i iVar2 = new ufm.i(w.i0(bVar), new q(new u4e.i(7), 3), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        i.Companion.getClass();
        return e.F(iVar2, iVar);
    }
}
