package za0;

import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public BottomPromptScreen u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f320547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320548x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f320547w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320548x |= Integer.MIN_VALUE;
        return this.f320547w.d3(null, this);
    }
}
