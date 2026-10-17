package oe7;

import com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ TwilioCallsDynamicFeaturesWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f224561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TwilioCallsDynamicFeaturesWorker twilioCallsDynamicFeaturesWorker, gim.c cVar) {
        super(cVar);
        this.v = twilioCallsDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f224561w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
