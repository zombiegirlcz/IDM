package pu;

import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroRootFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f239783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelfieIntroRootFlow f239784b;

    public d(a biometricPayload, SelfieIntroRootFlow controller) {
        Intrinsics.checkNotNullParameter(biometricPayload, "biometricPayload");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f239783a = biometricPayload;
        this.f239784b = controller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f239783a, dVar.f239783a) && this.f239784b.equals(dVar.f239784b);
    }

    public final int hashCode() {
        return this.f239784b.hashCode() + (this.f239783a.hashCode() * 31);
    }
}
