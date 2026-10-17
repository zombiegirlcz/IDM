package rv1;

import com.revolut.feature.apm.core.models.alias.Alias;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public Alias u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f257666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257667y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, gim.c cVar) {
        super(cVar);
        this.f257666x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257665w = obj2;
        this.f257667y |= Integer.MIN_VALUE;
        return this.f257666x.l(null, null, null, this);
    }
}
