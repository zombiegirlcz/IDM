package mx2;

import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import h93.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public c93.e A;
    public j0 B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f G;
    public int H;
    public CardDesignFeatureConfig u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f210157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f210159y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.G = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.F = obj2;
        this.H |= Integer.MIN_VALUE;
        return f.d(this.G, null, this);
    }
}
