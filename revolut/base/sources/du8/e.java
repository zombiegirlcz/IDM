package du8;

import com.google.firebase.messaging.t;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowKycDocPage;
import cu8.d1;
import cu8.f1;
import cu8.g1;
import cu8.i1;
import cu8.j1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import my8.m;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt8.d f117940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f117941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f117942c;
    public final x80.a d;
    public final g1 e;
    public final f1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ln.a f117943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mm.d f117944h;
    public final eli.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tm.g f117945j;

    public e(mt8.d kycInteractor, j1 state, i1 router, x80.a packageNameProvider, g1 presentationModel, f1 navigationProvider, ln.a navigationCommandsDispatcher, mm.d actionsDispatcher, eli.j twoFaErrorHandler, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f117940a = kycInteractor;
        this.f117941b = state;
        this.f117942c = router;
        this.d = packageNameProvider;
        this.e = presentationModel;
        this.f = navigationProvider;
        this.f117943g = navigationCommandsDispatcher;
        this.f117944h = actionsDispatcher;
        this.i = twoFaErrorHandler;
        this.f117945j = actionDelegateFactory.f(new c(this, 2));
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new WorkflowKycDocPage(((m) it8.next()).f210391c));
        }
        return arrayList2;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        d1 action = (d1) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f117945j.a(action);
    }
}
