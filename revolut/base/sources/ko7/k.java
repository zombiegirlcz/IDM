package ko7;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f186261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f186262x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f186261w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f186262x |= Integer.MIN_VALUE;
        return l.y2(this.f186261w, null, this);
    }
}
