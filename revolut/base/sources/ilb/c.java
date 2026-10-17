package ilb;

import cli.j;
import cli.n;
import cli.o;
import hlb.f;
import ijj.p;
import ijj.r;
import kotlin.jvm.internal.Intrinsics;
import lk7.m;
import llb.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klb.b f162217b;

    public c(klb.a footerMapper, klb.b sectionMapper, int i) {
        this.f162216a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
                Intrinsics.checkNotNullParameter(sectionMapper, "sectionMapper");
                this.f162217b = sectionMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
                Intrinsics.checkNotNullParameter(sectionMapper, "sectionMapper");
                this.f162217b = sectionMapper;
                break;
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        switch (this.f162216a) {
            case 0:
                f domainState = (f) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return (cii.b) iii.c.f(domainState.f153429a, new p(this), new r(7), new igh.o(this, 7));
            default:
                f domainState2 = (f) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (hlb.o) iii.c.f(domainState2.f153429a, new e(0), new m(9), new lk7.n(this, 1));
        }
    }
}
