package va;

import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDetailsFlowContract$InputData f287109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f287110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f287111c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(a aVar, ViewController viewController, UserDetailsFlowContract$InputData userDetailsFlowContract$InputData) {
        this.f287110b = aVar;
        this.f287109a = userDetailsFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.e = e4m.b.b(new r2(aVar, this, 1, i));
        this.f = e4m.b.b(new r2(aVar, this, 0, i));
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
