package as1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur1.a f8785b;

    public /* synthetic */ z(ur1.a aVar, int i) {
        this.f8784a = i;
        this.f8785b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8784a) {
            case 0:
                return g.a((g) obj2, null, this.f8785b, null, null, 39);
            default:
                return wr1.g.a((wr1.g) obj2, null, null, this.f8785b, null, 31);
        }
    }
}
