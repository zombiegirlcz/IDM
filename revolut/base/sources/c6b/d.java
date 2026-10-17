package c6b;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f21755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f21755w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21756x |= Integer.MIN_VALUE;
        return this.f21755w.a(null, this);
    }
}
