package xoi;

import androidx.fragment.app.Fragment;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.u;
import no.f2;
import org.jetbrains.annotations.NotNull;
import sri.m;
import t1i.n;
import te0.w;
import tnb.g0;
import twl.o;
import x94.q;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends fsi.c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseDelegatesActivity f307863h;
    public final asi.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f307864j;
    public final om0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1b.b f307865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zm0.b f307866m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BaseDelegatesActivity activity, asi.d userSessionInteractor, m navigator, om0.b inactivityTimer, p1b.b navigationProvider, zm0.b sessionController) {
        super(new fsi.b("USER_SESSION_DELEGATE_ID"));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(inactivityTimer, "inactivityTimer");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Companion.getClass();
        this.f307863h = activity;
        this.i = userSessionInteractor;
        this.f307864j = navigator;
        this.k = inactivityTimer;
        this.f307865l = navigationProvider;
        this.f307866m = sessionController;
    }

    public static boolean N(pri.e eVar) {
        if (!(eVar instanceof pri.a)) {
            return false;
        }
        List list = ((pri.a) eVar).f239030h;
        if (list == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((pri.f) it8.next()) instanceof bsi.d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fsi.a
    public final void onStart() {
        BaseDelegatesActivity baseDelegatesActivity = this.f307863h;
        if (!(baseDelegatesActivity instanceof dri.a) || ((dri.a) baseDelegatesActivity).D0()) {
            pri.e eVar = baseDelegatesActivity.f218652a0;
            if (eVar == null || !N(eVar)) {
                List<Fragment> fragments = baseDelegatesActivity.getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                nkm.g gVar = new nkm.g(u.i(d0.Q(fragments), BaseMvpFragment.class));
                while (gVar.hasNext()) {
                    pri.e eVarC = ((BaseMvpFragment) gVar.next()).C();
                    if (eVarC != null && N(eVarC)) {
                        return;
                    }
                }
                asi.c cVarA = this.i.a();
                if (cVarA != asi.c.EXIST) {
                    this.f307864j.c(this.f307865l.a(cVarA));
                    return;
                }
                ihm.j jVar = this.k.f226491b;
                f2 f2Var = new f2(this, 23);
                Function1 function1M = M();
                Function0 function0L = L();
                r rVarOnErrorResumeNext = jVar.onErrorResumeNext(new g0(new q(new BreadcrumbException(), 25)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o(8, f2Var), new o(8, function1M), new n(23, function0L));
                w.j0(this.f137706c, cVarSubscribe);
                Intrinsics.h(cVarSubscribe);
            }
        }
    }
}
