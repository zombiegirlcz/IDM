package g72;

import com.revolut.feature.apm.core.models.recipients.MultibancoContact;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public MultibancoContact u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f141077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141078x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f141077w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141078x |= Integer.MIN_VALUE;
        return this.f141077w.e(null, this);
    }
}
