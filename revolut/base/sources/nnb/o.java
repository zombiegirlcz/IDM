package nnb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nme.c0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f217505w;
    public final SavingsAccountsSelectionControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f217506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gnb.b f217507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f217508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f217509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f217510t;
    public boolean u;
    public final y v;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.t2;
        aVar.getClass();
        wi0.b[] elements = {bVar, wi0.b.f297770q3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f217505w = kotlin.collections.d.y0(elements);
    }

    public o(SavingsAccountsSelectionControllerDescriptor$InputData inputData, ijb.a savingsProductInteractor, gnb.b savingsDocumentInteractor, ang.f userInteractor, gte.a featureToggleInteractor, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsDocumentInteractor, "savingsDocumentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f217506p = savingsProductInteractor;
        this.f217507q = savingsDocumentInteractor;
        this.f217508r = userInteractor;
        this.f217509s = w.y0(new l(featureToggleInteractor, 0));
        this.f217510t = new vii.b();
        this.v = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f83140a, true, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, yh5.b.d(vkm.q.Q(this.f217510t, new mk0.f(continuation, this, 25)), vkm.q.q(new a07.p(nim.a.v(this.f217508r.j(w4l.j.f294644c), new c0(22)), 26))), null, null, new nn7.d(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
