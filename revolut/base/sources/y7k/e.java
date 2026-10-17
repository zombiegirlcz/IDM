package y7k;

import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public int A;
    public Serializable u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.l f311539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SupportedTargetCurrencies.Unordered f311540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f311541y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f311541y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
