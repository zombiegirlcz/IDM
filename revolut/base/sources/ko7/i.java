package ko7;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f186259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186260x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, gim.c cVar) {
        super(cVar);
        this.f186259w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f186260x |= Integer.MIN_VALUE;
        return this.f186259w.z2(null, this);
    }
}
