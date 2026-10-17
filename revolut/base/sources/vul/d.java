package vul;

import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import java.util.UUID;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ h B;
    public int C;
    public InvestOrderContract$InputData u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InvestOrderContract$InputData.Companion f292413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f292414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public UUID f292415y;
    public bfl.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
