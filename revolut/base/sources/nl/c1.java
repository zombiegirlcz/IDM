package nl;

import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c1 implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f216896a;

    public c1(e1 e1Var) {
        this.f216896a = e1Var;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        Disposable it8 = (Disposable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        hx7.e.f(this.f216896a.f216901a);
    }
}
