package com.fourthline.orca.internal;

import com.fourthline.orca.internal.xp0;
import com.fourthline.orca.internal.yp0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ukm.u f31774a = vc.s.a(0, null, null, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ukm.u f31775b = vc.s.a(0, null, null, 7);

    public static final class a implements vp0 {
        public a() {
        }

        @Override // com.fourthline.orca.internal.vp0
        public void a() {
            ow.this.f31774a.mo3647trySendJP2dKIU(xp0.a.f35072a);
            ow.this.f31775b.mo3647trySendJP2dKIU(yp0.a.f35407a);
        }
    }

    public final iq0 a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new iq0(coroutineScope, vkm.q.K(this.f31774a), this.f31775b);
    }

    public final tp0 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new tp0(tracker);
    }

    public final vp0 b() {
        return new a();
    }

    public final fq0 a() {
        return new k2(this.f31774a, this.f31775b);
    }

    public final uw a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new uw(tracker);
    }
}
