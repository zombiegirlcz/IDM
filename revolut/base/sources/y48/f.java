package y48;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends n implements qf0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Json f310827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qf0.c f310828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f310829n;
    public final k38.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f310830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f310831q;

    public f(Json json, qf0.c exceptionsOverseer, r0 jointAccountsInteractor, k38.d jointRepository, g jointMcyErrorDialogMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointRepository, "jointRepository");
        Intrinsics.checkNotNullParameter(jointMcyErrorDialogMapper, "jointMcyErrorDialogMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f310827l = json;
        this.f310828m = exceptionsOverseer;
        this.f310829n = jointAccountsInteractor;
        this.o = jointRepository;
        this.f310830p = jointMcyErrorDialogMapper;
        this.f310831q = featureToggleInteractor;
    }

    @Override // yji.n
    public final void F2() {
        this.f310828m.a(this);
    }

    @Override // yji.n
    public final void H2() {
        this.f310828m.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (skm.e0.J(r12, r5, r13) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // qf0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.Exception r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y48.f.P(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
