package bs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.c {
    public PaymentGroup u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.chat.a f18105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18106y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar, gim.c cVar) {
        super(cVar);
        this.f18105x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18104w = obj2;
        this.f18106y |= Integer.MIN_VALUE;
        return com.revolut.feature.payments.groups.impl.ui_chat.chat.a.I2(this.f18105x, this);
    }
}
