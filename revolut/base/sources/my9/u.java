package my9;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import om4.t3;
import org.jetbrains.annotations.NotNull;
import ox5.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements ky9.a {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.r f210434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly9.l f210435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f210436c;
    public final ihm.b d;
    public final ConcurrentHashMap e;
    public final o97.r f;

    public u(hd.r searchDelegate, ly9.l mapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f210434a = searchDelegate;
        this.f210435b = mapper;
        this.f210436c = uiKitResources;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
        this.e = new ConcurrentHashMap();
        this.f = o97.r.CONTACTS;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, o97.y r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof my9.t
            if (r0 == 0) goto L13
            r0 = r7
            my9.t r0 = (my9.t) r0
            int r1 = r0.f210433w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210433w = r1
            goto L1a
        L13:
            my9.t r0 = new my9.t
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210433w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L6a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "PAYMENTS_SEARCH_LIST_ID.Recipients"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            if (r5 == 0) goto L58
            ihm.b r5 = r4.d
            java.lang.Object r6 = r5.f()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L4e
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r5.onNext(r6)
            o97.e r5 = o97.e.f223096a
            return r5
        L58:
            java.lang.String r5 = "searchPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            efm.d0 r5 = oy9.f.a(r6)
            r0.f210433w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: my9.u.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final efm.r m(String searchQuery, GlobalSearchContext context, o97.s blockConstraint) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockConstraint, "blockConstraint");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        hd.r rVar = this.f210434a;
        efm.r rVarW = nim.a.w(w2j.a.d((d3j.b) rVar.f151364a, searchQuery, true, null, 4), new t0(15));
        lra.d dVar = (lra.d) rVar.f151365b;
        sfm.b bVar = new sfm.b(dVar.f199478b.a(), new lr9.m(new lra.b(dVar, 1), 8), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r map = bVar.map(new oy9.b(new t3(searchQuery, 12), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = ((py9.a) rVar.f151366c).a(searchQuery).map(new oy9.b(new t0(17), 6));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarSwitchMap = nim.a.w(mif.a.f(rVarW, map, map2, rd0.e.c(nim.a.v(((co9.b) rVar.f).c(searchQuery, h0.f322473a), new t0(16)), kotlin.coroutines.g.f186406a)), new oxd.m(rVar, 4)).switchMap(new oy9.b(new oy9.e(rVar, searchQuery, 0), 7));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r map3 = pd.b.s(rVarSwitchMap, new r(this, 0)).map(new bc(new moe.c(this, 10, blockConstraint, searchQuery), 24));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        return map3;
    }
}
