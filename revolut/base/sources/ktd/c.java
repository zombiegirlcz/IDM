package ktd;

import a5h.g;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import cxe.u;
import dfj.a2;
import dfj.b2;
import dfj.k0;
import dfj.s3;
import java.util.ArrayList;
import klf.l1;
import kog.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kp0.q;
import od0.i;
import org.jetbrains.annotations.NotNull;
import ppk.f;
import rd0.e;
import vkm.y;
import w4l.h;
import wsg.n;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f189523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f189524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f189525c;

    public c(n walletInteractor, g esimToolProvider, f ratesInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(esimToolProvider, "esimToolProvider");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f189523a = walletInteractor;
        this.f189524b = esimToolProvider;
        this.f189525c = ratesInteractor;
    }

    public final akg.n a(g0j.a travelDestination) {
        Flow gVar;
        Flow gVar2;
        Intrinsics.checkNotNullParameter(travelDestination, "travelDestination");
        ArrayList arrayList = travelDestination.d;
        wi0.b countryCode = travelDestination.f139496b;
        boolean zContains = arrayList.contains(g0j.c.EXCHANGE_RATE);
        i iVar = i.f224256b;
        int i = 3;
        Continuation continuation = null;
        if (zContains) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            xi0.b.Companion.getClass();
            xi0.b bVarB = xi0.a.b(countryCode);
            if (bVarB.equals(xi0.b.f306278p)) {
                bVarB = xi0.b.f306272g;
            }
            h hVar = h.f294642c;
            int i2 = 10;
            gVar = nim.a.A(e.e(nim.a.v(boh.f.e(e.b(this.f189523a.J(AccountId.Personal.f51414a, hVar)), new q(this, bVarB, i2)), new i5f.g(this, bVarB, i2)), h0.f322473a, new l1(i, 8, continuation)), new ksk.h(7));
        } else {
            i.Companion.getClass();
            gVar = new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        if (travelDestination.d.contains(g0j.c.ESIM)) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            g gVar3 = this.f189524b;
            s3 s3Var = (s3) gVar3.f1406b;
            w4l.i loadingStrategy = w4l.i.f294643c;
            t38.e eVarB = s3Var.b(loadingStrategy);
            y yVarB = ((k0) gVar3.f1407c).b(loadingStrategy);
            b2 b2Var = (b2) ((bej.f) gVar3.d);
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            u uVarA = nim.a.A(boh.f.e(nim.a.v(boh.f.e(e.b(b2Var.f113916b.q()), new a2(b2Var, 0)), new ksk.h(3)), new k(gVar3, 18)), new ksk.h(4));
            l1 l1Var = new l1(i, 7, continuation);
            h0 h0Var = h0.f322473a;
            gVar2 = e.e(n14.k.p(nim.a.v(nim.a.v(u0.i(eVarB, yVarB, e.e(uVarA, h0Var, l1Var)), new q(gVar3, countryCode, 9)), new ksk.h(1)), new ksk.h(2)), h0Var, new l1(i, 6, continuation));
        } else {
            i.Companion.getClass();
            gVar2 = new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        return nim.a.v(u0.m(gVar, gVar2), new k(travelDestination, 19));
    }
}
