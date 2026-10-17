package hu1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c02.d f155510b;

    public /* synthetic */ b0(c02.d dVar, int i) {
        this.f155509a = i;
        this.f155510b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155509a) {
            case 0:
                return o.a((o) obj2, null, null, null, false, false, false, false, this.f155510b.f20102b, null, 383);
            default:
                return qu1.a.a((qu1.a) obj2, this.f155510b.f20102b);
        }
    }
}
