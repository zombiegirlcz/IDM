package gq;

import dfj.l1;
import hn0.n;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mm0.q;
import om4.d0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f145475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f145476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df0.b f145477c;
    public final kq.h d;
    public final zm0.c e;
    public final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f145478g;

    public e(d0 scopedTokenRepository, n securityRepositoryInteractor, df0.b dateProvider, kq.h appWidgetsRepository, zm0.c sessionProvider, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scopedTokenRepository, "scopedTokenRepository");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(appWidgetsRepository, "appWidgetsRepository");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f145475a = scopedTokenRepository;
        this.f145476b = securityRepositoryInteractor;
        this.f145477c = dateProvider;
        this.d = appWidgetsRepository;
        this.e = sessionProvider;
        this.f = scope;
        this.f145478g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r17.b((imi.a) r1, r3) != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        if (r17.b((imi.a) r1, r3) != r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119 A[PHI: r15
      0x0119: PHI (r15v4 om4.d0) = (r15v3 om4.d0), (r15v5 om4.d0) binds: [B:54:0x0128, B:50:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gq.e r17, boolean r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.e.a(gq.e, boolean, gim.c):java.lang.Object");
    }

    public final Object b(imi.a aVar, d dVar) throws Throwable {
        this.f145476b.i(new q(aVar.c(), new Long(aVar.b()), aVar.a(), aVar.d()));
        long epochMilli = this.f145477c.a().toEpochMilli();
        kq.h hVar = this.d;
        hVar.getClass();
        l1 l1Var = new l1(hVar, epochMilli, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, l1Var, dVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
