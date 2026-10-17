package p1b;

import asi.d;
import cn0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements yri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yri.a f231885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.b f231886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f231887c;

    public c(yri.a screensInteractor, zm0.b sessionController, d userSessionInteractor) {
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        this.f231885a = screensInteractor;
        this.f231886b = sessionController;
        this.f231887c = userSessionInteractor;
    }

    @Override // yri.a
    public final boolean a() {
        return this.f231885a.a();
    }

    @Override // yri.a
    public final void b(boolean z) {
        this.f231885a.b(z);
    }

    @Override // yri.a
    public final void c() {
        yri.a aVar = this.f231885a;
        if (!aVar.d() && this.f231887c.a() == asi.c.EXPIRED) {
            ((g) this.f231886b).i();
        }
        aVar.c();
    }

    @Override // yri.a
    public final boolean d() {
        return this.f231885a.d();
    }

    @Override // yri.a
    public final void e() {
        this.f231885a.e();
    }

    @Override // yri.a
    public final void f() {
        yri.a aVar = this.f231885a;
        aVar.f();
        if (aVar.a()) {
            return;
        }
        ((g) this.f231886b).i();
    }

    @Override // yri.a
    public final void g() {
        this.f231885a.g();
    }

    @Override // yri.a
    public final boolean h() {
        return this.f231885a.h();
    }

    @Override // yri.a
    public final long i() {
        return this.f231885a.i();
    }
}
