package c1g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public int A;
    public TravelExperienceDatesSelection u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f20489y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f20489y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
