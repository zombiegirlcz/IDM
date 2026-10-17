package xdg;

import com.revolut.feature_travel_hotels_models.property.room.BedOption;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public BedOption u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f304440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304441x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f304440w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304441x |= Integer.MIN_VALUE;
        return this.f304440w.Z2(null, null, this);
    }
}
