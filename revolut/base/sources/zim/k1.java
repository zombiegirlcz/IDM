package zim;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class k1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f322655b;

    public /* synthetic */ k1(m1 m1Var, int i) {
        this.f322654a = i;
        this.f322655b = m1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322654a) {
            case 0:
                return new l1(this.f322655b);
            default:
                return this.f322655b.q();
        }
    }
}
