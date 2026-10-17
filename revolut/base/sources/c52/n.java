package c52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public TransferReviewInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21387x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, gim.c cVar) {
        super(cVar);
        this.f21386w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21387x |= Integer.MIN_VALUE;
        return this.f21386w.l3(null, this);
    }
}
