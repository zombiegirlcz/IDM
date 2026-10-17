package oe7;

import com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TwilioCallsDynamicFeaturesWorker f224559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f224560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TwilioCallsDynamicFeaturesWorker twilioCallsDynamicFeaturesWorker, Continuation continuation) {
        super(continuation);
        this.f224559w = twilioCallsDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f224560x |= Integer.MIN_VALUE;
        return this.f224559w.doWork(this);
    }
}
