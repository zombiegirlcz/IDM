package ux;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv.a f283715b;

    public /* synthetic */ m(xv.a aVar, int i) {
        this.f283714a = i;
        this.f283715b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f283714a) {
            case 0:
                ((c) obj2).getClass();
                xv.a torchState = this.f283715b;
                Intrinsics.checkNotNullParameter(torchState, "torchState");
                return new c(torchState);
            default:
                ((yx.d) obj2).getClass();
                xv.a torchState2 = this.f283715b;
                Intrinsics.checkNotNullParameter(torchState2, "torchState");
                return new yx.d(torchState2);
        }
    }
}
