package nl;

import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d1 implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f216897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl.s f216898b;

    public d1(e1 e1Var, sl.s sVar) {
        this.f216897a = e1Var;
        this.f216898b = sVar;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        PoaHostFragment.PoaResult result = (PoaHostFragment.PoaResult) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result, PoaHostFragment.PoaResult.Exit.INSTANCE)) {
            Observable observableJust = Observable.just(z0.f216971b);
            Intrinsics.h(observableJust);
            return observableJust;
        }
        if (Intrinsics.f(result, PoaHostFragment.PoaResult.Canceled.INSTANCE)) {
            Observable observableJust2 = Observable.just(z0.f216970a);
            Intrinsics.h(observableJust2);
            return observableJust2;
        }
        if (!(result instanceof PoaHostFragment.PoaResult.OnDocumentSubmittedResult)) {
            throw new NoWhenBranchMatchedException();
        }
        e1 e1Var = this.f216897a;
        Completable completableA = e1Var.f216902b.a(this.f216898b, ((PoaHostFragment.PoaResult.OnDocumentSubmittedResult) result).getDocumentId());
        c1 c1Var = new c1(e1Var);
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        completableA.getClass();
        return new ogm.m(completableA, c1Var, bVar, bVar2, bVar2).d(Observable.just(z0.f216972c));
    }
}
