package a27;

import et6.h3;
import gr6.p;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import jr6.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.k f708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f710c;
    public final h3 d;
    public final j2 e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f711g;

    public k(gr6.k freelancerKymInteractor, o freelancerNaviCommandPermissionWrapper, p freelancerProductArticleInteractor, h3 freelancerSaleTypeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(freelancerKymInteractor, "freelancerKymInteractor");
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        this.f708a = freelancerKymInteractor;
        this.f709b = freelancerNaviCommandPermissionWrapper;
        this.f710c = freelancerProductArticleInteractor;
        this.d = freelancerSaleTypeAvailabilityInteractor;
        this.e = q.c(null);
        Map mapK = r0.k(new Pair(null, 0), new Pair(y17.h.SALE_VISIBILITY, 1), new Pair(y17.h.PRODUCT_ARTICLE, 2), new Pair(y17.h.WEBSITE_URL, 3), new Pair(y17.h.ANNUAL_INBOUND_VOLUME_BLOCK, 4), new Pair(y17.h.ACCOUNT_RESTRICTION, 5), new Pair(y17.h.KYM_NOT_PASSED, 6), new Pair(y17.h.ALL_CHECKS_PASSED, 7));
        this.f = mapK;
        Iterator it8 = mapK.entrySet().iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) ((Map.Entry) it8.next()).getValue()).intValue();
        while (it8.hasNext()) {
            int iIntValue2 = ((Number) ((Map.Entry) it8.next()).getValue()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        this.f711g = iIntValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r10 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
    
        if (kotlin.Unit.f186387a != r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b A[PHI: r10
      0x011b: PHI (r10v28 java.lang.Object) = 
      (r10v9 java.lang.Object)
      (r10v13 java.lang.Object)
      (r10v17 java.lang.Object)
      (r10v21 java.lang.Object)
      (r10v25 java.lang.Object)
      (r10v30 java.lang.Object)
      (r10v31 java.lang.Object)
     binds: [B:36:0x00bd, B:41:0x00cf, B:46:0x00e1, B:51:0x00f3, B:56:0x0105, B:61:0x0117, B:62:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(y17.h r8, cs6.c r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.a(y17.h, cs6.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(y17.h r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a27.c
            if (r0 == 0) goto L13
            r0 = r8
            a27.c r0 = (a27.c) r0
            int r1 = r0.f700x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f700x = r1
            goto L18
        L13:
            a27.c r0 = new a27.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f700x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference r7 = r0.u
            yhm.o.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            y17.h r8 = y17.h.ACCOUNT_RESTRICTION
            boolean r7 = r6.h(r8, r7)
            if (r7 != 0) goto L3e
            goto L77
        L3e:
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            od0.h r8 = od0.i.Companion
            r8.getClass()
            od0.i r8 = od0.i.f224256b
            r7.<init>(r8)
            a27.d r8 = new a27.d
            r2 = 0
            r8.<init>(r3, r2, r4)
            a27.e r2 = new a27.e
            r5 = 0
            r2.<init>(r7, r4, r5)
            r0.u = r7
            r0.f700x = r3
            jr6.o r3 = r6.f709b
            s17.d r3 = (s17.d) r3
            java.lang.Object r8 = r3.b(r8, r2, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.lang.Object r7 = r7.get()
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor r7 = (com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) r7
            if (r7 == 0) goto L77
            y17.b r8 = new y17.b
            r8.<init>(r7)
            return r8
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.b(y17.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(y17.h r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a27.f
            if (r0 == 0) goto L13
            r0 = r8
            a27.f r0 = (a27.f) r0
            int r1 = r0.f703x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f703x = r1
            goto L18
        L13:
            a27.f r0 = new a27.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f703x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference r7 = r0.u
            yhm.o.b(r8)
            goto L65
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            y17.h r8 = y17.h.ANNUAL_INBOUND_VOLUME_BLOCK
            boolean r7 = r6.h(r8, r7)
            if (r7 != 0) goto L3e
            goto L77
        L3e:
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            od0.h r8 = od0.i.Companion
            r8.getClass()
            od0.i r8 = od0.i.f224256b
            r7.<init>(r8)
            a27.d r8 = new a27.d
            r2 = 1
            r8.<init>(r3, r2, r4)
            a27.e r2 = new a27.e
            r5 = 1
            r2.<init>(r7, r4, r5)
            r0.u = r7
            r0.f703x = r3
            jr6.o r3 = r6.f709b
            s17.d r3 = (s17.d) r3
            java.lang.Object r8 = r3.b(r8, r2, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.lang.Object r7 = r7.get()
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            hr6.a r7 = (hr6.a) r7
            if (r7 == 0) goto L77
            y17.d r8 = new y17.d
            r8.<init>(r7)
            return r8
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.c(y17.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(y17.h r7, cs6.c r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a27.g
            if (r0 == 0) goto L13
            r0 = r9
            a27.g r0 = (a27.g) r0
            int r1 = r0.f704w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f704w = r1
            goto L18
        L13:
            a27.g r0 = new a27.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f704w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r9)
            goto L91
        L39:
            yhm.o.b(r9)
            goto Lad
        L3e:
            yhm.o.b(r9)
            y17.h r9 = y17.h.KYM_NOT_PASSED
            boolean r7 = r6.h(r9, r7)
            if (r7 == 0) goto Lb6
            int[] r7 = a27.a.f695a
            int r8 = r8.ordinal()
            r7 = r7[r8]
            gr6.k r8 = r6.f708a
            if (r7 == r5) goto L98
            if (r7 == r4) goto L7b
            if (r7 != r3) goto L75
            et6.v1 r8 = (et6.v1) r8
            et6.r1 r7 = new et6.r1
            r9 = 0
            r7.<init>(r9)
            et6.u1 r7 = r8.a(r7)
            r0.f704w = r3
            java.lang.Object r9 = vkm.q.x(r7, r0)
            if (r9 != r1) goto L6e
            goto Lac
        L6e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            goto Lb3
        L75:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7b:
            et6.v1 r8 = (et6.v1) r8
            et6.w r7 = new et6.w
            r9 = 29
            r7.<init>(r9)
            et6.u1 r7 = r8.a(r7)
            r0.f704w = r4
            java.lang.Object r9 = vkm.q.x(r7, r0)
            if (r9 != r1) goto L91
            goto Lac
        L91:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            goto Lb3
        L98:
            et6.v1 r8 = (et6.v1) r8
            et6.r1 r7 = new et6.r1
            r9 = 2
            r7.<init>(r9)
            et6.u1 r7 = r8.a(r7)
            r0.f704w = r5
            java.lang.Object r9 = vkm.q.x(r7, r0)
            if (r9 != r1) goto Lad
        Lac:
            return r1
        Lad:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
        Lb3:
            if (r7 != 0) goto Lb6
            goto Lb7
        Lb6:
            r5 = 0
        Lb7:
            if (r5 == 0) goto Lbc
            y17.e r7 = y17.e.f310314a
            return r7
        Lbc:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.d(y17.h, cs6.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(y17.h r5, cs6.c r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof a27.h
            if (r0 == 0) goto L13
            r0 = r7
            a27.h r0 = (a27.h) r0
            int r1 = r0.f705w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f705w = r1
            goto L18
        L13:
            a27.h r0 = new a27.h
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f705w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            y17.h r7 = y17.h.PRODUCT_ARTICLE
            boolean r5 = r4.h(r7, r5)
            if (r5 == 0) goto L58
            cs6.c r5 = cs6.c.CARD_READER
            if (r6 == r5) goto L58
            ir6.f r5 = kotlin.jvm.internal.s.O(r6)
            r0.f705w = r3
            gr6.p r6 = r4.f710c
            et6.x2 r6 = (et6.x2) r6
            java.lang.Object r7 = r6.f(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            ir6.a r7 = (ir6.a) r7
            boolean r5 = r7.f168009a
            if (r5 != 0) goto L58
            y17.f r5 = y17.f.f310316a
            return r5
        L58:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.e(y17.h, cs6.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(y17.h r5, cs6.c r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof a27.i
            if (r0 == 0) goto L13
            r0 = r7
            a27.i r0 = (a27.i) r0
            int r1 = r0.f706w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f706w = r1
            goto L18
        L13:
            a27.i r0 = new a27.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f706w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            y17.h r7 = y17.h.SALE_VISIBILITY
            boolean r5 = r4.h(r7, r5)
            if (r5 == 0) goto L50
            r0.f706w = r3
            et6.h3 r5 = r4.d
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L50
            y17.g r5 = y17.g.f310318a
            return r5
        L50:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.f(y17.h, cs6.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(y17.h r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a27.j
            if (r0 == 0) goto L13
            r0 = r6
            a27.j r0 = (a27.j) r0
            int r1 = r0.f707w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f707w = r1
            goto L18
        L13:
            a27.j r0 = new a27.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f707w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            y17.h r6 = y17.h.WEBSITE_URL
            boolean r5 = r4.h(r6, r5)
            if (r5 == 0) goto L5c
            gr6.k r5 = r4.f708a
            et6.v1 r5 = (et6.v1) r5
            et6.r1 r6 = new et6.r1
            r2 = 1
            r6.<init>(r2)
            et6.u1 r5 = r5.a(r6)
            r0.f707w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L5c
            y17.i r5 = y17.i.f310320a
            return r5
        L5c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a27.k.g(y17.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final boolean h(y17.h hVar, y17.h hVar2) {
        int i = this.f711g;
        Integer numValueOf = Integer.valueOf(i);
        ?? r2 = this.f;
        return ((Number) r2.getOrDefault(hVar, numValueOf)).intValue() >= ((Number) r2.getOrDefault(hVar2, Integer.valueOf(i))).intValue();
    }
}
