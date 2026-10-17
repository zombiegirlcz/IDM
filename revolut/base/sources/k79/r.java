package k79;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import vkm.j2;
import vkm.z1;
import wli.x;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends oki.h implements h {

    @NotNull
    private static final j Companion = new j();
    public final y69.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f181937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r69.a f181938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f181939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f181940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f181941t;
    public final Set u;
    public final j2 v;

    public r(cli.n stateMapper, y69.f revolutFeedInteractor, x deeplinkHandler, r69.a inboxInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revolutFeedInteractor, "revolutFeedInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        this.o = revolutFeedInteractor;
        this.f181937p = deeplinkHandler;
        this.f181938q = inboxInteractor;
        this.f181939r = mra.d.b(this, new g(new Data(null, null, true, 3, null), null, false, false), stateMapper, null, false, 12);
        this.f181940s = vkm.q.c(null);
        this.f181941t = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.u = Collections.newSetFromMap(new ConcurrentHashMap());
        this.v = vkm.q.c(new s69.j(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(k79.r r4, java.util.HashSet r5, gim.c r6) throws java.lang.Exception {
        /*
            boolean r0 = r6 instanceof k79.l
            if (r0 == 0) goto L13
            r0 = r6
            k79.l r0 = (k79.l) r0
            int r1 = r0.f181927x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181927x = r1
            goto L18
        L13:
            k79.l r0 = new k79.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181927x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.HashSet r5 = r0.u
            yhm.o.b(r6)
            goto L57
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            y69.f r6 = r4.o
            java.util.List r2 = zhm.d0.d1(r5)
            r0.u = r5
            r0.f181927x = r3
            r69.a r6 = r6.f311240a
            y69.d r6 = (y69.d) r6
            b79.c r6 = r6.f311235a
            b79.m r6 = (b79.m) r6
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L4f:
            if (r6 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L54:
            if (r6 != r1) goto L57
            return r1
        L57:
            cli.y r6 = r4.f181939r
            jci.h r0 = new jci.h
            r1 = 1
            r0.<init>(r5, r1)
            r4.H2(r6, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k79.r.I2(k79.r, java.util.HashSet, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new q(this, continuation, 1), new yi5.b(26));
        l2(new q(this, continuation, 3), new yi5.b(26));
    }

    public final boolean J2(g79.a aVar) {
        ProductArticleParams productArticleParams = aVar.f141134b;
        Data data = aVar.f141135c;
        if (productArticleParams == null || data.getContent() != null) {
            return false;
        }
        n2(new k0g.b(this, aVar, productArticleParams, (Continuation) null, 16), new whi.b(6));
        return true;
    }

    public final void K2() {
        g79.a aVar;
        s69.d dVar;
        List list = (List) ((g) ((j2) this.f181939r.f22677a).getValue()).f181918a.getContent();
        DateTime dateTime = (list == null || (aVar = (g79.a) d0.o0(list)) == null || (dVar = aVar.f141133a) == null) ? null : dVar.f260160c;
        j2 j2Var = this.v;
        s69.j jVar = (s69.j) j2Var.getValue();
        if (jVar == null || !Intrinsics.f(dateTime, jVar.f260172a)) {
            s69.j jVar2 = new s69.j(dateTime);
            j2Var.getClass();
            j2Var.g(null, jVar2);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        int i = 1;
        n2(new n(vkm.q.Q(this.v, new jy6.l(continuation, this, 11)), new m(this, 0), continuation, i), new whi.b(6));
        n2(new n(this.o.d, new m(this, 1), continuation, i), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f181939r;
    }
}
