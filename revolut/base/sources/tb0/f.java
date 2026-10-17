package tb0;

import com.revolut.feature.backend_flow.domain.models.PromptScreen;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public PromptScreen u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f269424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f269425x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f269424w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f269425x |= Integer.MIN_VALUE;
        return this.f269424w.d3(null, this);
    }
}
