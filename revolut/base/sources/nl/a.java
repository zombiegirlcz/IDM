package nl;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ObservableTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216871a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f216872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl.g0 f216873c;

    public /* synthetic */ a(kl.g0 g0Var, e eVar) {
        this.f216873c = g0Var;
        this.f216872b = eVar;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource b(Observable upstream) {
        switch (this.f216871a) {
            case 0:
                kl.g0 onEmptyBackStack = this.f216873c;
                Intrinsics.checkNotNullParameter(onEmptyBackStack, "$onEmptyBackStack");
                e this$0 = this.f216872b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(upstream, "upstream");
                return upstream.map(new kl.c0(d.f)).map(new jul.o(onEmptyBackStack, this$0, 14));
            default:
                e this$02 = this.f216872b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                kl.g0 onEmptyBackStack2 = this.f216873c;
                Intrinsics.checkNotNullParameter(onEmptyBackStack2, "$onEmptyBackStack");
                Intrinsics.checkNotNullParameter(upstream, "upstream");
                return upstream.map(new kl.c0(c.f)).doOnNext(new kgm.i(this$02, onEmptyBackStack2, 11)).ignoreElements().k();
        }
    }

    public /* synthetic */ a(e eVar, kl.g0 g0Var) {
        this.f216872b = eVar;
        this.f216873c = g0Var;
    }
}
