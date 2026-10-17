package hy1;

import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.QvikContact;

/* JADX INFO: loaded from: classes20.dex */
public final class f0 extends gim.c {
    public ApmRecipientSettings u;
    public QvikContact v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f156644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g0 f156645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156646y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.f156645x = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f156644w = obj2;
        this.f156646y |= Integer.MIN_VALUE;
        return this.f156645x.d(null, null, this);
    }
}
