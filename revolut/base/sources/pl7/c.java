package pl7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public com.revolut.feature.insurance_car.api.navigation.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f237278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f237279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, gim.c cVar) {
        super(cVar);
        this.f237278w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f237279x |= Integer.MIN_VALUE;
        return h.b(this.f237278w, null, this);
    }
}
