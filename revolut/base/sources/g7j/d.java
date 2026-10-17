package g7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public ExchangeOrderDraft u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f141205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f141206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f141207y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f141206x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f141205w = obj2;
        this.f141207y |= Integer.MIN_VALUE;
        return this.f141206x.a(null, null, null, null, this);
    }
}
