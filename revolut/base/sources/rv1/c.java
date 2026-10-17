package rv1;

import com.revolut.feature.apm.core.models.alias.Alias;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public Alias u;
    public r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f257643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257644y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, gim.c cVar) {
        super(cVar);
        this.f257643x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257642w = obj2;
        this.f257644y |= Integer.MIN_VALUE;
        return this.f257643x.a(null, null, this);
    }
}
