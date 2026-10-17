package c1g;

import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.c {
    public int A;
    public TravelExperiencesSelectedLocation u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f20492y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f20492y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, this);
    }
}
