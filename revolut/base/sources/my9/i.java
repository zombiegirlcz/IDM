package my9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.payments.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import o97.d0;
import o97.e0;
import o97.g0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements z87.d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dsd.i f210416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly9.l f210417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ll9.b f210418c;
    public final ihm.b d;
    public final o97.r e;
    public ll9.f f;

    public i(dsd.i searchDelegate, ly9.l mapper, a payWithPhotoActionDelegate, ll9.b payWithPhotoExtensionFactory) {
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(payWithPhotoActionDelegate, "payWithPhotoActionDelegate");
        Intrinsics.checkNotNullParameter(payWithPhotoExtensionFactory, "payWithPhotoExtensionFactory");
        this.f210416a = searchDelegate;
        this.f210417b = mapper;
        this.f210418c = payWithPhotoExtensionFactory;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
        this.e = o97.r.GROUP_ACTIONS;
    }

    @Override // z87.f
    public final void c(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        if (this.f == null) {
            e60.a aVarA = a.a(extensions);
            this.f = aVarA != null ? this.f210418c.a(aVarA) : null;
        }
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i = 0;
        efm.r rVarS = pd.b.s(this.f210416a.e(searchQuery, zi0.c.j(f0.f322471a), false), new Function1(this) { // from class: my9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f210414b;

            {
                this.f210414b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0 f0Var;
                int i2 = i;
                int i3 = 16;
                i iVar = this.f210414b;
                switch (i2) {
                    case 0:
                        List items = (List) obj2;
                        Intrinsics.checkNotNullParameter(items, "items");
                        efm.r map = iVar.d.map(new bc(new lsl.d(items, i3), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        Pair pair = (Pair) obj2;
                        List list = (List) pair.f186385a;
                        Object obj3 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        Boolean bool = (Boolean) obj3;
                        int i5 = bool.booleanValue() ? Integer.MAX_VALUE : 3;
                        int size = list.size();
                        boolean zBooleanValue = bool.booleanValue();
                        if (size > 3) {
                            f0Var = new g0(new TextLocalisedClause(R$string.global_search_widgets_group_actions_title, null, null, 14), zBooleanValue ? new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less, null, null, 14) : new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.ActionsGroups", new o97.y(o97.r.GROUP_ACTIONS, null, null, 62));
                        } else {
                            f0Var = new o97.f0(new TextLocalisedClause(R$string.global_search_widgets_group_actions_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.ActionsGroups");
                        }
                        ly9.l lVar = iVar.f210417b;
                        List listV0 = zhm.d0.V0(list, i5);
                        o97.r rVar = o97.r.GROUP_ACTIONS;
                        ArrayList arrayListA = lVar.a(listV0, rVar, new lu5.o(rVar, i3));
                        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                        return zhm.v.k(f0Var, new e0(arrayListA));
                }
            }
        });
        final int i2 = 1;
        return nim.a.w(rVarS, new Function1(this) { // from class: my9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f210414b;

            {
                this.f210414b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d0 f0Var;
                int i22 = i2;
                int i3 = 16;
                i iVar = this.f210414b;
                switch (i22) {
                    case 0:
                        List items = (List) obj2;
                        Intrinsics.checkNotNullParameter(items, "items");
                        efm.r map = iVar.d.map(new bc(new lsl.d(items, i3), 22));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        Pair pair = (Pair) obj2;
                        List list = (List) pair.f186385a;
                        Object obj3 = pair.f186386b;
                        Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                        Boolean bool = (Boolean) obj3;
                        int i5 = bool.booleanValue() ? Integer.MAX_VALUE : 3;
                        int size = list.size();
                        boolean zBooleanValue = bool.booleanValue();
                        if (size > 3) {
                            f0Var = new g0(new TextLocalisedClause(R$string.global_search_widgets_group_actions_title, null, null, 14), zBooleanValue ? new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less, null, null, 14) : new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.ActionsGroups", new o97.y(o97.r.GROUP_ACTIONS, null, null, 62));
                        } else {
                            f0Var = new o97.f0(new TextLocalisedClause(R$string.global_search_widgets_group_actions_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.ActionsGroups");
                        }
                        ly9.l lVar = iVar.f210417b;
                        List listV0 = zhm.d0.V0(list, i5);
                        o97.r rVar = o97.r.GROUP_ACTIONS;
                        ArrayList arrayListA = lVar.a(listV0, rVar, new lu5.o(rVar, i3));
                        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                        return zhm.v.k(f0Var, new e0(arrayListA));
                }
            }
        });
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    @Override // z87.f
    public final Set j() {
        return z0.h(this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, o97.y r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof my9.h
            if (r0 == 0) goto L13
            r0 = r8
            my9.h r0 = (my9.h) r0
            int r1 = r0.f210415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210415w = r1
            goto L1a
        L13:
            my9.h r0 = new my9.h
            gim.c r8 = (gim.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210415w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L87
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            java.lang.String r8 = "PAYMENTS_SEARCH_LIST_ID.ActionsGroups"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r8)
            o97.e r8 = o97.e.f223096a
            if (r6 == 0) goto L58
            ihm.b r6 = r5.d
            java.lang.Object r7 = r6.f()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L50
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r6.onNext(r7)
            return r8
        L58:
            java.lang.String r6 = "searchPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            java.lang.Object r6 = r7.f223136b
            boolean r2 = r6 instanceof ly9.g
            r4 = 0
            if (r2 == 0) goto L67
            ly9.g r6 = (ly9.g) r6
            goto L68
        L67:
            r6 = r4
        L68:
            if (r6 == 0) goto L6c
            x5k.s r4 = r6.f200761a
        L6c:
            boolean r6 = r4 instanceof x5k.i
            if (r6 == 0) goto L78
            ll9.f r6 = r5.f
            if (r6 == 0) goto L77
            r6.Z2()
        L77:
            return r8
        L78:
            dsd.i r6 = r5.f210416a
            efm.d0 r6 = r6.c(r7)
            r0.f210415w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            o97.x r8 = (o97.x) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: my9.i.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
