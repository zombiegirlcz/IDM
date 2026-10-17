package zim;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class e1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f322630b;

    public /* synthetic */ e1(g1 g1Var, int i) {
        this.f322629a = i;
        this.f322630b = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322629a) {
            case 0:
                return new f1(this.f322630b);
            default:
                g1 g1Var = this.f322630b;
                return g1Var.r(g1Var.q(), null);
        }
    }
}
