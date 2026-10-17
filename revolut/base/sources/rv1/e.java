package rv1;

import com.revolut.feature.apm.core.models.alias.Alias;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public Alias u;
    public Alias v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f257647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f257648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f257649y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, gim.c cVar) {
        super(cVar);
        this.f257649y = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257648x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f257649y.b(null, null, null, this);
    }
}
