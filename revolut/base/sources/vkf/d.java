package vkf;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import pie.s;
import pie.v;
import vge.i0;
import vge.v2;
import vge.y2;
import vkm.j2;
import wda.r;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f289927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f289928c;
    public final Object d;

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f289926a = i;
        this.f289927b = obj2;
        this.f289928c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r50, kotlin.coroutines.Continuation r51) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ww4.a
            if (r0 == 0) goto L13
            r0 = r10
            ww4.a r0 = (ww4.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ww4.a r0 = new ww4.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L5c
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.f289927b
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            ww4.b r2 = new ww4.b
            java.lang.Object r4 = r8.f289928c
            ww4.f r4 = (ww4.f) r4
            java.lang.Object r5 = r8.d
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r4, r5)
            ww4.c r6 = new ww4.c
            r6.<init>(r4, r5)
            ww4.d r7 = new ww4.d
            r7.<init>(r4, r5)
            java.lang.Object r9 = iii.c.f(r9, r2, r6, r7)
            r0.v = r3
            java.lang.Object r9 = r10.emit(r9, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof x8h.v
            if (r0 == 0) goto L13
            r0 = r12
            x8h.v r0 = (x8h.v) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            x8h.v r0 = new x8h.v
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L77
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f289927b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            r4 = r11
            com.revolut.data.model.Data r4 = (com.revolut.data.model.Data) r4
            java.lang.Object r11 = r10.f289928c
            x8h.y r11 = (x8h.y) r11
            java.lang.Object r2 = r10.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Throwable r5 = r4.getError()
            java.util.List r5 = zhm.v.l(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r2 = zhm.d0.E0(r5, r2)
            r11.getClass()
            int r11 = r2.size()
            if (r11 <= r3) goto L5f
            io.reactivex.exceptions.CompositeException r11 = new io.reactivex.exceptions.CompositeException
            r11.<init>(r2)
        L5d:
            r6 = r11
            goto L66
        L5f:
            java.lang.Object r11 = zhm.d0.d0(r2)
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            goto L5d
        L66:
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            com.revolut.data.model.Data r11 = com.revolut.data.model.Data.copy$default(r4, r5, r6, r7, r8, r9)
            r0.v = r3
            java.lang.Object r11 = r12.emit(r11, r0)
            if (r11 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object d(Object obj2, Continuation continuation) {
        Object value;
        LinkedHashMap linkedHashMapZ;
        Data itemsData = (Data) obj2;
        xge.g gVar = (xge.g) this.f289927b;
        i0 i0Var = gVar.k;
        ProductSpaceIdentifier spaceIdentifier = (ProductSpaceIdentifier) this.f289928c;
        s sVar = (s) this.d;
        tge.a accountsKey = new tge.a(spaceIdentifier, sVar.a());
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(accountsKey, "accountsKey");
        Intrinsics.checkNotNullParameter(itemsData, "itemsData");
        List list = (List) itemsData.getContent();
        if (list == null) {
            list = f0.f322471a;
        }
        boolean loading = itemsData.getLoading();
        j2 j2Var = i0Var.f288917a;
        do {
            value = j2Var.getValue();
            Map map = (Map) value;
            List list2 = (List) map.get(accountsKey);
            linkedHashMapZ = r0.z(map);
            if (!list.isEmpty() || !loading) {
                list2 = list;
            }
            linkedHashMapZ.put(accountsKey, list2);
        } while (!j2Var.h(value, linkedHashMapZ));
        List list3 = (List) itemsData.getContent();
        if (list3 != null) {
            y2 y2Var = gVar.f305714g;
            v subSpaceIdentifier = sVar.a();
            List list4 = list3;
            ArrayList accountIds = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                accountIds.add(((SubSpaceAccountItem) it8.next()).f89560b.getF89504c());
            }
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            Intrinsics.checkNotNullParameter(accountIds, "accountIds");
            y2Var.b(new v2(spaceIdentifier, subSpaceIdentifier)).setValue(accountIds);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y20.x0
            if (r0 == 0) goto L13
            r0 = r9
            y20.x0 r0 = (y20.x0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            y20.x0 r0 = new y20.x0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L78
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            int r8 = r0.f310568y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f310567x
            yhm.o.b(r9)
            goto L68
        L3b:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f289927b
            r2 = r9
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            v20.n r8 = (v20.n) r8
            java.util.UUID r9 = r8.getTicketId()
            java.lang.Object r6 = r7.f289928c
            java.util.UUID r6 = (java.util.UUID) r6
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r6)
            r6 = 0
            if (r9 != 0) goto L56
            r9 = r5
            goto L69
        L56:
            java.lang.Object r9 = r7.d
            y20.b1 r9 = (y20.b1) r9
            r0.f310567x = r2
            r0.f310568y = r6
            r0.v = r4
            java.lang.Object r9 = r9.g(r8, r0)
            if (r9 != r1) goto L67
            goto L77
        L67:
            r8 = r6
        L68:
            r6 = r8
        L69:
            if (r9 == 0) goto L78
            r0.f310567x = r5
            r0.f310568y = r6
            r0.v = r3
            java.lang.Object r8 = r2.emit(r9, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yc7.f
            if (r0 == 0) goto L13
            r0 = r11
            yc7.f r0 = (yc7.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            yc7.f r0 = new yc7.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L63
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            java.lang.Object r11 = r9.f289927b
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            com.revolut.data.model.Data r10 = (com.revolut.data.model.Data) r10
            java.lang.Object r2 = r9.f289928c
            yc7.j r2 = (yc7.j) r2
            java.lang.Object r4 = r9.d
            java.lang.String r4 = (java.lang.String) r4
            y9d.c r5 = new y9d.c
            r6 = 6
            r5.<init>(r6, r4, r2)
            f28.b0 r6 = new f28.b0
            r7 = 26
            r6.<init>(r2, r4, r7)
            b9d.k r7 = new b9d.k
            r8 = 17
            r7.<init>(r8, r4, r2)
            java.lang.Object r10 = iii.c.f(r10, r5, r6, r7)
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r10 = (com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model) r10
            r0.v = r3
            java.lang.Object r10 = r11.emit(r10, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yed.j0
            if (r0 == 0) goto L13
            r0 = r6
            yed.j0 r0 = (yed.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            yed.j0 r0 = new yed.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L63
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f289927b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r2 = r4.f289928c
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r2 = (com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey) r2
            java.lang.Object r5 = r5.get(r2)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto L57
            java.lang.Object r5 = r5.getContent()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L57
            java.lang.Object r2 = r4.d
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r5 = r5.get(r2)
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            goto L58
        L57:
            r5 = 0
        L58:
            if (r5 == 0) goto L63
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.Object r2 = r0.f289928c
            yt9.g r2 = (yt9.g) r2
            cm4.a r3 = r2.f
            boolean r4 = r1 instanceof yt9.d
            if (r4 == 0) goto L1d
            r4 = r1
            yt9.d r4 = (yt9.d) r4
            int r5 = r4.v
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.v = r5
            goto L22
        L1d:
            yt9.d r4 = new yt9.d
            r4.<init>(r0, r1)
        L22:
            java.lang.Object r1 = r4.u
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.v
            r7 = 1
            if (r6 == 0) goto L39
            if (r6 != r7) goto L31
            yhm.o.b(r1)
            goto L82
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f289927b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r9 = r22
            dj0.d r9 = (dj0.d) r9
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r6 = new com.revolut.feature.payments.api.mapper.PaymentPocketInfo
            r8 = r3
            wq4.a r8 = (wq4.a) r8
            ep4.a r8 = r8.f299405a
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r14 = r8.a()
            wq4.a r3 = (wq4.a) r3
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = r3.b()
            com.revolut.core.ui_kit.models.MoneyClause r8 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r15 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r19 = 0
            r20 = 15
            r16 = 0
            r17 = 0
            r18 = 0
            r15.<init>(r16, r17, r18, r19, r20)
            r12 = 0
            r13 = 12
            r11 = 0
            r10 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r9 = r0.d
            com.revolut.feature.transfer.core.models.CountryProfile r9 = (com.revolut.feature.transfer.core.models.CountryProfile) r9
            com.revolut.core.ui_kit.models.Clause r2 = r2.c(r8, r9)
            r6.<init>(r3, r2, r14)
            r4.v = r7
            java.lang.Object r1 = r1.emit(r6, r4)
            if (r1 != r5) goto L82
            return r5
        L82:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r6.emit(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zc7.e
            if (r0 == 0) goto L13
            r0 = r9
            zc7.e r0 = (zc7.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zc7.e r0 = new zc7.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto La5
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            int r8 = r0.z
            java.lang.Boolean r2 = r0.f321245y
            kotlinx.coroutines.flow.FlowCollector r6 = r0.f321244x
            yhm.o.b(r9)
            goto L77
        L3e:
            yhm.o.b(r9)
            java.lang.Object r9 = r7.f289927b
            r6 = r9
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            r2 = r8
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r8 = r7.f289928c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "TotalWealthItems"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r9 != 0) goto L5d
            java.lang.String r9 = "TotalWealthLarge"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L95
        L5d:
            java.lang.Object r8 = r7.d
            zc7.i r8 = (zc7.i) r8
            ang.f r8 = r8.e
            efm.d0 r8 = r8.f(r5)
            r0.f321244x = r6
            r0.f321245y = r2
            r0.z = r5
            r0.v = r4
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L76
            goto La4
        L76:
            r8 = r5
        L77:
            do3.n r9 = (do3.n) r9
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8f
            java.util.Set r2 = zc7.i.k
            kotlin.jvm.internal.Intrinsics.h(r9)
            wi0.b r9 = do3.q.y(r9)
            boolean r9 = r2.contains(r9)
            if (r9 != 0) goto L8f
            goto L90
        L8f:
            r4 = r5
        L90:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r5 = r8
        L95:
            r8 = 0
            r0.f321244x = r8
            r0.f321245y = r8
            r0.z = r5
            r0.v = r3
            java.lang.Object r8 = r6.emit(r2, r0)
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x062c A[LOOP:1: B:309:0x0626->B:311:0x062c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:558:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r44, kotlin.coroutines.Continuation r45) {
        /*
            Method dump skipped, instruction units count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ d(Ref$ObjectRef ref$ObjectRef, Function3 function3, FlowCollector flowCollector, int i) {
        this.f289926a = i;
        this.f289928c = ref$ObjectRef;
        this.d = function3;
        this.f289927b = flowCollector;
    }

    public d(FlowCollector flowCollector, PaymentMethod.Pocket pocket, wdb.w wVar, dj0.d dVar) {
        this.f289926a = 12;
        this.f289927b = flowCollector;
        this.f289928c = pocket;
        this.d = dVar;
    }

    public d(FlowCollector flowCollector, wbg.s sVar, PaymentMethod.Pocket pocket, ecg.b bVar) {
        this.f289926a = 8;
        this.f289927b = flowCollector;
        this.f289928c = pocket;
        this.d = bVar;
    }

    public d(FlowCollector flowCollector, r rVar, io3.d dVar, xi0.b bVar) {
        this.f289926a = 11;
        this.f289927b = flowCollector;
        this.f289928c = rVar;
        this.d = dVar;
    }

    public d(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f289926a = 16;
        this.f289927b = coroutineContext;
        this.f289928c = zkm.w.b(coroutineContext);
        this.d = new wgb.v(flowCollector, (Continuation) null, 13);
    }
}
