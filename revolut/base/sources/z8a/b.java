package z8a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public AliasRegistrationType u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f320048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320049x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f320048w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320049x |= Integer.MIN_VALUE;
        return this.f320048w.Z2(null, this);
    }
}
