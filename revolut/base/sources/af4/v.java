package af4;

import kotlin.jvm.internal.Intrinsics;
import mx4.f0;
import mx4.z;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f3884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx4.h f3885c;
    public final z d;

    public v(f0 headerMapper, mx4.h actionFooterMapper, z creditScreenConstructorMapper, int i) {
        this.f3883a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
                Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
                Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
                this.f3884b = headerMapper;
                this.f3885c = actionFooterMapper;
                this.d = creditScreenConstructorMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
                Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
                Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
                this.f3884b = headerMapper;
                this.f3885c = actionFooterMapper;
                this.d = creditScreenConstructorMapper;
                break;
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        switch (this.f3883a) {
            case 0:
                h domainState = (h) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return (q) iii.c.f(domainState.f3864a, new a7b.r(this, 28), new ack.f(this, 7), new a2f.q(this, 10));
            default:
                ka4.f domainState2 = (ka4.f) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (ka4.o) iii.c.f(domainState2.f182418b, new k5e.k(this, 16), new k3k.k(this, 14), new joa.j(this, domainState2, 19));
        }
    }
}
