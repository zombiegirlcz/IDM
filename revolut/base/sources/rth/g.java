package rth;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityStep;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public EligibilityStep u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f257245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257246y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.f257245x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257244w = obj2;
        this.f257246y |= Integer.MIN_VALUE;
        return this.f257245x.j(null, this);
    }
}
