package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends gim.c {
    public int A;
    public qq9.d u;
    public PaymentGroup v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f189346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f189347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f189348y;
    public final /* synthetic */ n0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.z = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f189348y = obj2;
        this.A |= Integer.MIN_VALUE;
        return n0.Z2(this.z, null, null, null, this);
    }
}
