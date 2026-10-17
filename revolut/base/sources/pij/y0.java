package pij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 extends gim.c {
    public int A;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EsimPhoneNumberPorting f236601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f236602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f236603y;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, gim.c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236603y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.J2(this.z, null, null, null, this);
    }
}
