package k1a;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public String u;
    public RecurringSplit v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f180176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180177y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f180176x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180175w = obj2;
        this.f180177y |= Integer.MIN_VALUE;
        return this.f180176x.b(null, null, null, this);
    }
}
