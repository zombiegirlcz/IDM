package u7l;

import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public EventAppearance u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f277978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f277979x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f277978w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f277979x |= Integer.MIN_VALUE;
        return this.f277978w.a(null, this);
    }
}
