package c5a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i5a.a f21497b;

    public /* synthetic */ k0(i5a.a aVar, int i) {
        this.f21496a = i;
        this.f21497b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f21496a) {
            case 0:
                return l.a((l) obj2, new o(this.f21497b), null, null, null, null, false, null, null, null, null, null, null, null, null, false, false, null, false, null, 524286);
            default:
                return l5a.l.a((l5a.l) obj2, this.f21497b, null, null, null, null, false, null, null, false, null, 1022);
        }
    }
}
