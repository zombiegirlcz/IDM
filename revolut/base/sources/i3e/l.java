package i3e;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2e.a f158199b;

    public /* synthetic */ l(g2e.a aVar, int i) {
        this.f158198a = i;
        this.f158199b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158198a) {
            case 0:
                return g.a((g) obj2, null, !this.f158199b.b(), null, 11);
            default:
                return y2e.a.a((y2e.a) obj2, null, null, null, this.f158199b, 7);
        }
    }
}
