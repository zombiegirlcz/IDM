package kxa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalizedTrackingControllerContract$InputData f190520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f190521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f190522c;
    public final e4m.e d;
    public final e4m.e e;

    public d(f fVar, ViewController viewController, PersonalizedTrackingControllerContract$InputData personalizedTrackingControllerContract$InputData) {
        this.f190521b = fVar;
        this.f190520a = personalizedTrackingControllerContract$InputData;
        this.f190522c = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.d = e4m.b.b(new kr9.m(fVar, this, 1, i));
        this.e = e4m.b.b(new kr9.m(fVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
