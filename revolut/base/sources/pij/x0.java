package pij;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 extends gim.c {
    public String u;
    public EsimPhoneNumberSelections v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f236598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f236600y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, gim.c cVar) {
        super(cVar);
        this.f236599x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f236598w = obj2;
        this.f236600y |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.I2(this.f236599x, null, null, this);
    }
}
