package be7;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f14712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0.a f14713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee7.g f14714c;
    public final String d;

    public t(z70.a contextProvider, xg0.a dynamicDelivery, ee7.g voiceCallsLazyWrapper, String twilioModuleName) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(voiceCallsLazyWrapper, "voiceCallsLazyWrapper");
        Intrinsics.checkNotNullParameter(twilioModuleName, "twilioModuleName");
        this.f14712a = contextProvider;
        this.f14713b = dynamicDelivery;
        this.f14714c = voiceCallsLazyWrapper;
        this.d = twilioModuleName;
    }

    public final q0 a() {
        return new q0(((oi0.b) this.f14713b).e(this.f14712a.getContext(), y0.b(this.d)), new s(this, (Continuation) null, 0), 1);
    }
}
