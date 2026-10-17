package m5k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.core.models.FundingSource;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public FundingSource u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Clause f202950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f202951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f202952y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f202952y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f202951x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f202952y.a(null, null, null, this);
    }
}
