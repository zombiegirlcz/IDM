package o8c;

import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public AcceptPaymentParams u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$ObjectRef f222997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f222998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f222999y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, gim.c cVar) {
        super(cVar);
        this.f222999y = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f222998x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f222999y.d3(null, null, null, null, this);
    }
}
