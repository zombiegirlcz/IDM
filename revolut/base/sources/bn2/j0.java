package bn2;

import com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg3.a f17019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.v f17020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vjg.g f17021c;
    public final l80.e d;
    public final fnc.s e;

    public j0(lg3.a checklistChallengesInteractor, r10.v premiumStatusProvider, vjg.g themeCatalog, l80.e dateProvider, fnc.s userInfoProvider, gm2.a backgroundPickerConfig) {
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(premiumStatusProvider, "premiumStatusProvider");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(userInfoProvider, "userInfoProvider");
        Intrinsics.checkNotNullParameter(backgroundPickerConfig, "backgroundPickerConfig");
        this.f17019a = checklistChallengesInteractor;
        this.f17020b = premiumStatusProvider;
        this.f17021c = themeCatalog;
        this.d = dateProvider;
        this.e = userInfoProvider;
    }

    public final Flow a() {
        ArrayList arrayListF = ((gwl.d) this.f17021c).f();
        ArrayList<GlobalThemeDeclaration> arrayList = new ArrayList();
        for (Object obj2 : arrayListF) {
            if (((GlobalThemeDeclaration) obj2).K5(this.d)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (GlobalThemeDeclaration globalThemeDeclaration : arrayList) {
            if (globalThemeDeclaration.P7() != null) {
                z = true;
            }
            vjg.e eVarH8 = globalThemeDeclaration.getD();
            if (eVarH8 != null) {
                arrayList2.add(eVarH8);
            }
        }
        Set setI1 = zhm.d0.i1(arrayList2);
        if (setI1.isEmpty() && !z) {
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList3.add(new ThemesInteractor$Theme((GlobalThemeDeclaration) it8.next(), UiAssetLockState.Available.f63805a));
            }
            return new go.g(zhm.d0.P0(arrayList3, new a9j.f(new a9j.f(new i0(), 7), 8)), 2);
        }
        Continuation continuation = null;
        Flow flowH = vkm.q.H(new bi2.n(this, continuation, 10), ((pg3.b) this.f17019a).f());
        ffk.t tVar = (ffk.t) this.f17020b.f250864c;
        Flow flowH2 = vkm.q.H(new h0(2, null), nim.a.v(u0.m(rd0.e.b(tVar.n()), rd0.e.b(tVar.q())), new ijj.p(27)));
        Flow flowH3 = vkm.q.H(new a2c.c(2, 12, continuation), nim.a.v(((ang.f) this.e.f136657b).j(w4l.h.f294642c), new ijj.p(28)));
        if (!setI1.contains(vjg.e.CHALLENGE)) {
            flowH = null;
        }
        if (flowH == null) {
            flowH = new go.g(r0.g(), 2);
        }
        if (!setI1.contains(vjg.e.PLAN)) {
            flowH2 = null;
        }
        if (flowH2 == null) {
            flowH2 = new go.g(r0.g(), 2);
        }
        if (!z) {
            flowH3 = null;
        }
        if (flowH3 == null) {
            flowH3 = new go.g(null, 2);
        }
        return ta6.a.h(flowH, flowH2, flowH3, new g0(arrayList, this, null));
    }
}
