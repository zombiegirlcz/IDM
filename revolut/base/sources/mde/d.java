package mde;

import com.revolut.chat.domain.model.NewTicketContext;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public String u;
    public NewTicketContext.Transaction v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f204559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f204560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f204561y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f204560x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204559w = obj2;
        this.f204561y |= Integer.MIN_VALUE;
        return this.f204560x.h(null, this);
    }
}
