package tyg;

import com.revolut.data.model.Data;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public Data u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ou5.b f275570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f275571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ou5.b bVar, gim.c cVar) {
        super(cVar);
        this.f275570w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f275571x |= Integer.MIN_VALUE;
        return this.f275570w.m(null, null, null, this);
    }
}
