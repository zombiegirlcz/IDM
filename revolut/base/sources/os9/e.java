package os9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements jki.p {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f229265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f229266b;

    public e(nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f229265a = membersMapper;
        this.f229266b = w.y0(new oqj.d(5));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f229269a, new or4.h(this, 27), new oq3.e(13), new nrd.i(this, 24));
    }
}
