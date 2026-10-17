package hw1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public ApmDescriptor u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f156036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156037x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f156036w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156037x |= Integer.MIN_VALUE;
        return this.f156036w.b(null, this);
    }
}
