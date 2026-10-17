package a7e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public Subaccount u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f1849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1850x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f1849w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1850x |= Integer.MIN_VALUE;
        return this.f1849w.b(null, this);
    }
}
