package mm7;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public ApplicationForm u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f207173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207174x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f207173w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207174x |= Integer.MIN_VALUE;
        return j.Q2(this.f207173w, null, this);
    }
}
