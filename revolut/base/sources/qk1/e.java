package qk1;

import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import skm.l;
import yhm.m;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements APMPMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f246942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f246943b;

    public e(AtomicBoolean atomicBoolean, l lVar) {
        this.f246942a = atomicBoolean;
        this.f246943b = lVar;
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
    public final void onFailure(APMPMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f246942a.compareAndSet(false, true)) {
            m.Companion companion = m.INSTANCE;
            this.f246943b.resumeWith(new i(error));
        }
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMCallback
    public final void onSuccess(Object obj2) {
        APMPMLaunchResult result = (APMPMLaunchResult) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f246942a.compareAndSet(false, true)) {
            m.Companion companion = m.INSTANCE;
            this.f246943b.resumeWith(h.f246947a);
        }
    }
}
