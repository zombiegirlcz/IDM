package my9;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox5.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements z87.d {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f210428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly9.l f210429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o97.r f210430c;

    public q(kpj.f searchDelegate, ly9.l mapper) {
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f210428a = searchDelegate;
        this.f210429b = mapper;
        this.f210430c = o97.r.RECENT_PAID_CONTACTS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return nim.a.w(nim.a.w(xx9.p.b((xx9.p) this.f210428a.f188258b, searchQuery), new t0(14)), new n(this, 0));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f210430c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof my9.p
            if (r4 == 0) goto L13
            r4 = r6
            my9.p r4 = (my9.p) r4
            int r0 = r4.f210427w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f210427w = r0
            goto L1a
        L13:
            my9.p r4 = new my9.p
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f210427w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "searchPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            efm.d0 r5 = oy9.f.a(r5)
            r4.f210427w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L46
            return r0
        L46:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: my9.q.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
