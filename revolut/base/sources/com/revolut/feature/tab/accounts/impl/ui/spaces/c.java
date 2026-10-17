package com.revolut.feature.tab.accounts.impl.ui.spaces;

import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pie.v;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f89627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xge.a f89628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f89629c;
    public final hlm.c d;

    public c(j mapper, xge.a accountSpacesInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(accountSpacesInteractor, "accountSpacesInteractor");
        this.f89627a = mapper;
        this.f89628b = accountSpacesInteractor;
        this.d = hlm.d.a();
    }

    public static ArrayList b(ArrayList arrayList, ProductSpaceIdentifier productSpaceIdentifier, v vVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            SpaceContentListMapper$ItemParcel.SubspaceValueItem subspaceValueItemA = d.a((koi.j) it8.next());
            ProductAccountDescriptor$Value productAccountDescriptor$Value = null;
            if (Intrinsics.f(subspaceValueItemA != null ? subspaceValueItemA.f89619a : null, productSpaceIdentifier) && subspaceValueItemA.f89620b == vVar) {
                productAccountDescriptor$Value = subspaceValueItemA.f89621c;
            }
            if (productAccountDescriptor$Value != null) {
                arrayList2.add(productAccountDescriptor$Value);
            }
        }
        return arrayList2;
    }

    public static ArrayList c(List list, ProductSpaceIdentifier productSpaceIdentifier, v vVar, List list2) {
        List<SpaceContentModel> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (SpaceContentModel spaceContentModelA : list3) {
            if (Intrinsics.f(spaceContentModelA.f89556a, productSpaceIdentifier)) {
                List<SubSpaceContentModel> list4 = spaceContentModelA.f89558c;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                for (SubSpaceContentModel subSpaceContentModelC : list4) {
                    if (subSpaceContentModelC.getE() == vVar) {
                        if (subSpaceContentModelC instanceof SubSpaceContentModel.FlatSubSpaceContentModel) {
                            SubSpaceContentModel.FlatSubSpaceContentModel flatSubSpaceContentModel = (SubSpaceContentModel.FlatSubSpaceContentModel) subSpaceContentModelC;
                            subSpaceContentModelC = SubSpaceContentModel.FlatSubSpaceContentModel.c(flatSubSpaceContentModel, d(flatSubSpaceContentModel.f89563c, list2));
                        } else {
                            if (!(subSpaceContentModelC instanceof SubSpaceContentModel.GroupedSubSpaceContentModel)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SubSpaceContentModel.GroupedSubSpaceContentModel groupedSubSpaceContentModel = (SubSpaceContentModel.GroupedSubSpaceContentModel) subSpaceContentModelC;
                            subSpaceContentModelC = SubSpaceContentModel.GroupedSubSpaceContentModel.c(groupedSubSpaceContentModel, false, d(groupedSubSpaceContentModel.f, list2), 15);
                        }
                    }
                    arrayList2.add(subSpaceContentModelC);
                }
                spaceContentModelA = SpaceContentModel.a(spaceContentModelA, arrayList2);
            }
            arrayList.add(spaceContentModelA);
        }
        return arrayList;
    }

    public static List d(List list, List list2) {
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayListF1 = d0.f1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            ProductAccountId productAccountId = (ProductAccountId) it8.next();
            Iterator it9 = arrayListF1.iterator();
            int i = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i = -1;
                    break;
                }
                SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) it9.next();
                if (subSpaceAccountItem.f89560b.getF89499a() && Intrinsics.f(subSpaceAccountItem.f89560b.getF89504c().f89729a, productAccountId.f89729a)) {
                    break;
                }
                i++;
            }
            SubSpaceAccountItem subSpaceAccountItem2 = i >= 0 ? (SubSpaceAccountItem) arrayListF1.remove(i) : null;
            if (subSpaceAccountItem2 != null) {
                arrayList.add(subSpaceAccountItem2);
            }
        }
        return d0.E0(arrayListF1, arrayList);
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00ba: INVOKE (r7 I:hlm.a), (r6 I:java.lang.Object) INTERFACE call: hlm.a.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)], block:B:58:0x00ba */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:44:0x00a0, B:25:0x005e, B:31:0x006f, B:28:0x0063, B:30:0x006d, B:36:0x0079, B:52:0x00af, B:54:0x00b3, B:56:0x00b7, B:57:0x00b9, B:46:0x00a4, B:48:0x00a8), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009f -> B:44:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof aie.h
            if (r0 == 0) goto L13
            r0 = r12
            aie.h r0 = (aie.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            aie.h r0 = new aie.h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f5244y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            int r2 = r0.f5243x
            int r3 = r0.f5242w
            int r5 = r0.v
            hlm.a r7 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L35
            goto La0
        L35:
            r12 = move-exception
            goto Laf
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            int r2 = r0.v
            hlm.a r5 = r0.u
            yhm.o.b(r12)
            goto L5c
        L48:
            yhm.o.b(r12)
            hlm.c r12 = r11.d
            r0.u = r12
            r0.v = r3
            r0.A = r5
            java.lang.Object r2 = r12.lock(r6, r0)
            if (r2 != r1) goto L5a
            goto L9e
        L5a:
            r5 = r12
            r2 = r3
        L5c:
            r7 = r5
            r5 = r2
        L5e:
            com.revolut.feature.tab.accounts.impl.ui.spaces.b r12 = r11.f89629c     // Catch: java.lang.Throwable -> L77
            if (r12 != 0) goto L63
            goto L6f
        L63:
            java.util.List r2 = r12.e     // Catch: java.lang.Throwable -> L77
            java.util.List r8 = r12.d     // Catch: java.lang.Throwable -> L77
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L79
            r11.f89629c = r6     // Catch: java.lang.Throwable -> L77
        L6f:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L77
            r7.unlock(r6)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L77:
            r12 = move-exception
            goto Lba
        L79:
            int r8 = r12.f     // Catch: java.lang.Throwable -> L77
            xge.a r9 = r11.f89628b     // Catch: java.lang.Throwable -> Lad
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r10 = r12.f89624a     // Catch: java.lang.Throwable -> Lad
            pie.v r12 = r12.f89625b     // Catch: java.lang.Throwable -> Lad
            r0.u = r7     // Catch: java.lang.Throwable -> Lad
            r0.v = r5     // Catch: java.lang.Throwable -> Lad
            r0.f5242w = r3     // Catch: java.lang.Throwable -> Lad
            r0.f5243x = r8     // Catch: java.lang.Throwable -> Lad
            r0.A = r4     // Catch: java.lang.Throwable -> Lad
            xge.g r9 = (xge.g) r9     // Catch: java.lang.Throwable -> Lad
            xge.b0 r9 = r9.e     // Catch: java.lang.Throwable -> Lad
            xge.g0 r9 = (xge.g0) r9     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r12 = r9.f(r10, r12, r2, r0)     // Catch: java.lang.Throwable -> Lad
            fim.a r2 = fim.a.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> Lad
            if (r12 != r2) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> Lad
        L9c:
            if (r12 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r2 = r8
        La0:
            com.revolut.feature.tab.accounts.impl.ui.spaces.b r12 = r11.f89629c     // Catch: java.lang.Throwable -> L77
            if (r12 == 0) goto L5e
            int r12 = r12.f     // Catch: java.lang.Throwable -> L77
            if (r12 != r2) goto L5e
            r11.f89629c = r6     // Catch: java.lang.Throwable -> L77
            goto L5e
        Lab:
            r2 = r8
            goto Laf
        Lad:
            r12 = move-exception
            goto Lab
        Laf:
            com.revolut.feature.tab.accounts.impl.ui.spaces.b r0 = r11.f89629c     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto Lb9
            int r0 = r0.f     // Catch: java.lang.Throwable -> L77
            if (r0 != r2) goto Lb9
            r11.f89629c = r6     // Catch: java.lang.Throwable -> L77
        Lb9:
            throw r12     // Catch: java.lang.Throwable -> L77
        Lba:
            r7.unlock(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.spaces.c.a(gim.c):java.lang.Object");
    }
}
