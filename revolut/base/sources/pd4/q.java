package pd4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d f235084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235085y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar, gim.c cVar) {
        super(cVar);
        this.f235084x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235083w = obj2;
        this.f235085y |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d.I2(this.f235084x, this);
    }
}
