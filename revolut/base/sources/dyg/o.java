package dyg;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vyg.a f121123b;

    public /* synthetic */ o(vyg.a aVar, int i) {
        this.f121122a = i;
        this.f121123b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121122a) {
            case 0:
                return h.a((h) obj2, null, this.f121123b, null, null, null, 439);
            default:
                return gzg.n.a((gzg.n) obj2, null, null, null, null, false, null, null, this.f121123b, 6143);
        }
    }
}
