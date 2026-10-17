package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements yll.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoAppConsentDestination.InputData f195878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f195879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f195880c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    public b(q0 q0Var, ViewController viewController, RevolutSsoAppConsentDestination.InputData inputData) {
        this.f195880c = q0Var;
        this.f195878a = inputData;
        this.f195879b = viewController;
        this.e = e4m.b.b(new a(q0Var, this, 1));
        this.f = e4m.b.b(new a(q0Var, this, 0));
    }

    @Override // bml.a
    public final d1 b() {
        return new d1(this.f195880c, this.d, 1);
    }

    @Override // gml.a
    public final f1 c() {
        return new f1(this.f195880c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        tll.f extension = new tll.f((tll.e) this.f.get());
        cml.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        return ImmutableSet.of(extension);
    }
}
