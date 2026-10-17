package loa;

import com.revolut.feature.toggles.models.PublicExperimentDefinition;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public PublicExperimentDefinition u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f197436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f197437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f197438y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f197437x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f197436w = obj2;
        this.f197438y |= Integer.MIN_VALUE;
        return l.y2(this.f197437x, null, this);
    }
}
