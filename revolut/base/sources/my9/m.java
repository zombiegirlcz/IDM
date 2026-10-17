package my9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.payments.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import o97.d0;
import o97.e0;
import o97.f0;
import o97.g0;
import org.jetbrains.annotations.NotNull;
import ox5.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements z87.d {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f210422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly9.l f210423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f210424c;
    public final o97.r d;

    public m(jx0.a searchDelegate, ly9.l mapper) {
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f210422a = searchDelegate;
        this.f210423b = mapper;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f210424c = bVarE;
        this.d = o97.r.GROUPS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        mr9.a aVar = (mr9.a) ((mq9.f) this.f210422a.f179039c);
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        er9.x xVar = (er9.x) aVar.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        final int i = 0;
        efm.r rVarS = pd.b.s(nim.a.w(nim.a.w(xVar.g(false), new e2j.i(searchQuery, 20)), new t0(13)), new Function1(this) { // from class: my9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f210420b;

            {
                this.f210420b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0 f0Var;
                int i2 = i;
                m mVar = this.f210420b;
                switch (i2) {
                    case 0:
                        List items = (List) obj2;
                        Intrinsics.checkNotNullParameter(items, "items");
                        efm.r map = mVar.f210424c.map(new bc(new lsl.d(items, 17), 23));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        Pair pair = (Pair) obj2;
                        List list = (List) pair.f186385a;
                        Object obj3 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        Boolean bool = (Boolean) obj3;
                        int i3 = bool.booleanValue() ? Integer.MAX_VALUE : 3;
                        int size = list.size();
                        boolean zBooleanValue = bool.booleanValue();
                        if (size > 3) {
                            f0Var = new g0(new TextLocalisedClause(R$string.global_search_widgets_groups_title, null, null, 14), zBooleanValue ? new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less, null, null, 14) : new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.Groups", new o97.y(o97.r.GROUPS, null, null, 62));
                        } else {
                            f0Var = new f0(new TextLocalisedClause(R$string.global_search_widgets_groups_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.Groups");
                        }
                        ly9.l lVar = mVar.f210423b;
                        List listV0 = zhm.d0.V0(list, i3);
                        o97.r rVar = o97.r.GROUPS;
                        ArrayList arrayListA = lVar.a(listV0, rVar, new lu5.o(rVar, 16));
                        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                        d0[] elements = {f0Var, new e0(arrayListA)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return kotlin.collections.d.L(elements);
                }
            }
        });
        final int i2 = 1;
        return nim.a.w(rVarS, new Function1(this) { // from class: my9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f210420b;

            {
                this.f210420b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0 f0Var;
                int i22 = i2;
                m mVar = this.f210420b;
                switch (i22) {
                    case 0:
                        List items = (List) obj2;
                        Intrinsics.checkNotNullParameter(items, "items");
                        efm.r map = mVar.f210424c.map(new bc(new lsl.d(items, 17), 23));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        Pair pair = (Pair) obj2;
                        List list = (List) pair.f186385a;
                        Object obj3 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        Boolean bool = (Boolean) obj3;
                        int i3 = bool.booleanValue() ? Integer.MAX_VALUE : 3;
                        int size = list.size();
                        boolean zBooleanValue = bool.booleanValue();
                        if (size > 3) {
                            f0Var = new g0(new TextLocalisedClause(R$string.global_search_widgets_groups_title, null, null, 14), zBooleanValue ? new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less, null, null, 14) : new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.Groups", new o97.y(o97.r.GROUPS, null, null, 62));
                        } else {
                            f0Var = new f0(new TextLocalisedClause(R$string.global_search_widgets_groups_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.Groups");
                        }
                        ly9.l lVar = mVar.f210423b;
                        List listV0 = zhm.d0.V0(list, i3);
                        o97.r rVar = o97.r.GROUPS;
                        ArrayList arrayListA = lVar.a(listV0, rVar, new lu5.o(rVar, 16));
                        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                        d0[] elements = {f0Var, new e0(arrayListA)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return kotlin.collections.d.L(elements);
                }
            }
        });
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
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
            boolean r0 = r7 instanceof my9.l
            if (r0 == 0) goto L13
            r0 = r7
            my9.l r0 = (my9.l) r0
            int r1 = r0.f210421w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210421w = r1
            goto L1a
        L13:
            my9.l r0 = new my9.l
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210421w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L9f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            java.lang.String r7 = "PAYMENTS_SEARCH_LIST_ID.Groups"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            o97.e r7 = o97.e.f223096a
            if (r5 == 0) goto L59
            ihm.b r5 = r4.f210424c
            java.lang.Object r6 = r5.f()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L51
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r5.onNext(r6)
            return r7
        L59:
            java.lang.String r5 = "searchPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.Object r5 = r6.f223136b
            boolean r6 = r5 instanceof ly9.f
            if (r6 == 0) goto L8d
            jx0.a r6 = r4.f210422a
            java.lang.Object r6 = r6.f179038b
            rq9.a r6 = (rq9.a) r6
            ly9.f r5 = (ly9.f) r5
            com.revolut.feature.payments.groups.api.models.PaymentGroup r5 = r5.f200760a
            zr9.a r6 = (zr9.a) r6
            ufm.b r5 = r6.d(r5)
            ox5.t0 r6 = new ox5.t0
            r7 = 12
            r6.<init>(r7)
            oy9.b r7 = new oy9.b
            r2 = 5
            r7.<init>(r6, r2)
            ufm.i r6 = new ufm.i
            r2 = 1
            r6.<init>(r5, r7, r2)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            goto L96
        L8d:
            ufm.b r6 = efm.d0.m(r7)
            java.lang.String r5 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
        L96:
            r0.f210421w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L9f
            return r1
        L9f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: my9.m.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
