package ga2;

import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public int A;
    public Continuation u;
    public f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BeneficiarySpecialPurpose f142045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Continuation f142046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f142047y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f142047y = obj2;
        this.A |= Integer.MIN_VALUE;
        return d.Z2(this.z, null, null, null, null, this);
    }
}
