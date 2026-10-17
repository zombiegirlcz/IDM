package mm7;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f207170w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f207170w |= Integer.MIN_VALUE;
        return j.O2(this.v, this);
    }
}
