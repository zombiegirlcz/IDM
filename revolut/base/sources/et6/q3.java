package et6;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends gim.c {
    public int A;
    public String u;
    public FreelancerTaxProfileSchedule v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FreelancerTaxProfile f129312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f129313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f129314y;
    public final /* synthetic */ r10.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r10.f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129314y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.y0((String) null, (FreelancerTaxProfileSchedule) null, false, this);
    }
}
