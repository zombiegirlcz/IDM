package amf;

import elf.j2;
import klf.h0;
import klf.m1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f6391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f6392c;

    public o(h0 commonDataSource, m1 juniorDataSource, j2 userCommentClickHandler, m userCommentMenuAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(userCommentClickHandler, "userCommentClickHandler");
        Intrinsics.checkNotNullParameter(userCommentMenuAvailabilityChecker, "userCommentMenuAvailabilityChecker");
        this.f6390a = commonDataSource;
        this.f6391b = juniorDataSource;
        this.f6392c = userCommentClickHandler;
    }

    public final cmf.k a(Function2 additionalFilter) {
        Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
        h0 h0Var = this.f6390a;
        return new cmf.k(ta6.a.h(h0Var.d(), this.f6391b.a(), h0Var.j(), new n(this, additionalFilter, null, 0)), u.c(this.f6392c), "Note");
    }
}
