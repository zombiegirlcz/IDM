package eob;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zf8.k;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements mf1.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f127889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an8.b f127890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f127891c;
    public final String d;

    public f(k juniorAccountInfoProvider, j savingsProductDataEntryPointTypeMapping, an8.b juniorSavingProductInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(savingsProductDataEntryPointTypeMapping, "savingsProductDataEntryPointTypeMapping");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f127889a = juniorAccountInfoProvider;
        this.f127890b = juniorSavingProductInteractor;
        this.f127891c = userInteractor;
        this.d = ne8.a.f214420c.a();
    }

    @Override // mf1.a
    public final Flow a() {
        Flow flowH = xam.a.h(new enb.f(this, null, 4), nim.a.v(this.f127889a.c(null, w4l.h.f294642c), new elb.a(18)));
        h0 h0Var = h0.f322473a;
        return rd0.e.e(new a87.b(mo3.a.g(nim.a.v(u0.m(rd0.e.e(nim.a.A(rd0.e.n(flowH, h0Var), new elb.a(19)), h0Var, new e(3, 1, null)), q.q(nim.a.v(this.f127891c.j(w4l.j.f294644c), new elb.a(17)))), new elb.a(this, 16)), null, new en6.a(4), 1), 15), h0Var, new e(3, 0, null));
    }

    @Override // mf1.a
    public final String b() {
        return this.d;
    }
}
