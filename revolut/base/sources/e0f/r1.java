package e0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 implements u51.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hve.b f121679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg6.x f121680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ng0.b f121681c;
    public final p71.a d;
    public final xg6.l e;
    public final gg6.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f121682g;

    public r1(hve.b repository, xg6.x mandateInteractor, ng0.b googlePayInteractor, p71.a externalCardsRepository, xg6.l linkExternalInstitutionsInteractor, gg6.a indiaPreselectedMethodInteractor, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(googlePayInteractor, "googlePayInteractor");
        Intrinsics.checkNotNullParameter(externalCardsRepository, "externalCardsRepository");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(indiaPreselectedMethodInteractor, "indiaPreselectedMethodInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f121679a = repository;
        this.f121680b = mandateInteractor;
        this.f121681c = googlePayInteractor;
        this.d = externalCardsRepository;
        this.e = linkExternalInstitutionsInteractor;
        this.f = indiaPreselectedMethodInteractor;
        this.f121682g = yhm.j.b(new f1(countryInteractor, 0));
    }

    public static final ArrayList a(r1 r1Var, List list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((TopupMethod) obj2).getF().contains(str)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final ArrayList b(r1 r1Var, ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (list != null ? ((TopupMethod) obj2).getF60508a().containsAll(list) : true) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static String p(CardDetails cardDetails) {
        String strV0 = kotlin.text.f0.V0(4, cardDetails.f90566a);
        ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = cardDetails.f90567b;
        int i = expireDateFormatter$CardExpire.f90569a;
        int i2 = expireDateFormatter$CardExpire.f90570b;
        StringBuilder sbK = v0.a.k(i, "last4=", strV0, ", expiryMonth=", ", expiryYear=");
        sbK.append(i2);
        return sbK.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(com.revolut.feature.topup_screen.common.CardDetails r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e0f.h1
            if (r0 == 0) goto L13
            r0 = r10
            e0f.h1 r0 = (e0f.h1) r0
            int r1 = r0.f121611x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121611x = r1
            goto L18
        L13:
            e0f.h1 r0 = new e0f.h1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121611x
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            com.revolut.feature.topup_screen.common.CardDetails r9 = r0.u
            yhm.o.b(r10)
            goto L5f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            p71.a r10 = r8.d
            u21.k r10 = (u21.k) r10
            efm.b r2 = r10.c()
            efm.r r10 = r10.b()
            e07.k r6 = new e07.k
            r6.<init>(r3)
            efm.r r10 = m70.a.g(r10, r4, r6, r5)
            sfm.b r10 = r2.g(r10)
            java.lang.String r2 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            r0.u = r9
            r0.f121611x = r5
            java.lang.Object r10 = nim.a.e(r10, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L74
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "No content extracted on cards reload while saving new card"
            r9.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r9, r10)
            return r4
        L74:
            java.lang.String r0 = r9.f90566a
            java.lang.String r0 = kotlin.text.f0.V0(r3, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L80:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = r10.next()
            r2 = r1
            t61.g r2 = (t61.g) r2
            int r3 = r2.f268140g
            java.lang.String r6 = r2.d
            int r7 = r2.f
            if (r3 != 0) goto L9c
            if (r7 != 0) goto L9c
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            goto Lb1
        L9c:
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r3 == 0) goto Lb0
            int r2 = r2.f268140g
            com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire r3 = r9.f90567b
            int r6 = r3.f90570b
            if (r2 != r6) goto Lb0
            int r2 = r3.f90569a
            if (r7 != r2) goto Lb0
            r2 = r5
            goto Lb1
        Lb0:
            r2 = 0
        Lb1:
            if (r2 == 0) goto L80
            r4 = r1
        Lb4:
            t61.g r4 = (t61.g) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.c(com.revolut.feature.topup_screen.common.CardDetails, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e0f.i1
            if (r0 == 0) goto L13
            r0 = r5
            e0f.i1 r0 = (e0f.i1) r0
            int r1 = r0.f121616w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121616w = r1
            goto L18
        L13:
            e0f.i1 r0 = new e0f.i1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121616w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r5 = 0
            ng0.b r2 = r4.f121681c
            vze.a r2 = (vze.a) r2
            ufm.p r5 = r2.a(r5)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            pfm.z r5 = ue0.e.F(r5, r2)
            r0.f121616w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(yte.n r8, com.revolut.feature.topup_screen.api.model.CheckoutContext r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof e0f.j1
            if (r0 == 0) goto L13
            r0 = r10
            e0f.j1 r0 = (e0f.j1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            e0f.j1 r0 = new e0f.j1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f121622x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            hve.b r3 = r7.f121679a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r10)
            return r10
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            boolean r8 = r0.f121621w
            com.revolut.feature.topup_screen.api.model.CheckoutContext r9 = r0.v
            yte.n r2 = r0.u
            yhm.o.b(r10)
            goto L73
        L41:
            com.revolut.feature.topup_screen.api.model.CheckoutContext r9 = r0.v
            yte.n r8 = r0.u
            yhm.o.b(r10)
            goto L59
        L49:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            r0.z = r6
            java.lang.Object r10 = r7.d(r0)
            if (r10 != r1) goto L59
            goto L94
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0.u = r8
            r0.v = r9
            r0.f121621w = r10
            r0.z = r5
            r2 = r3
            hve.o r2 = (hve.o) r2
            java.lang.Object r2 = r2.g(r8, r10, r9, r0)
            if (r2 != r1) goto L71
            goto L94
        L71:
            r2 = r8
            r8 = r10
        L73:
            w4l.j r10 = w4l.j.f294644c
            hve.o r3 = (hve.o) r3
            vkm.d r9 = r3.f(r2, r8, r10, r9)
            e07.k r10 = new e07.k
            r2 = 3
            r10.<init>(r2)
            r2 = 0
            jhi.b r9 = mo3.a.g(r9, r2, r10, r6)
            r0.u = r2
            r0.v = r2
            r0.f121621w = r8
            r0.z = r4
            java.lang.Object r8 = vkm.q.z(r9, r0)
            if (r8 != r1) goto L95
        L94:
            return r1
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.e(yte.n, com.revolut.feature.topup_screen.api.model.CheckoutContext, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r8.invoke(r9, r13) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r8, kotlin.jvm.functions.Function2 r9, kotlin.jvm.functions.Function2 r10, java.lang.String r11, yte.n r12, gim.c r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof e0f.k1
            if (r0 == 0) goto L14
            r0 = r13
            e0f.k1 r0 = (e0f.k1) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.A = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            e0f.k1 r0 = new e0f.k1
            r0.<init>(r7, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.f121631y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.A
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlin.jvm.functions.Function2 r8 = r13.v
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            yhm.o.b(r0)
            goto La2
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.jvm.functions.Function2 r8 = r13.v
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r9 = r13.u
            yhm.o.b(r0)
            goto L91
        L47:
            yte.n r12 = r13.f121630x
            java.lang.String r11 = r13.f121629w
            kotlin.jvm.functions.Function2 r8 = r13.v
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r8 = r13.u
            yhm.o.b(r0)
        L55:
            r2 = r0
            r0 = r8
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r12
            goto L70
        L5c:
            yhm.o.b(r0)
            r13.u = r8
            r13.v = r10
            r13.f121629w = r11
            r13.f121630x = r12
            r13.A = r5
            java.lang.Object r0 = r9.invoke(r8, r13)
            if (r0 != r1) goto L55
            goto La1
        L70:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto La5
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId r9 = new com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId$StoredMethodId
            r9.<init>(r8)
            r13.u = r0
            r8 = r2
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r13.v = r8
            r13.f121629w = r6
            r13.f121630x = r6
            r13.A = r4
            r12 = 0
            r8 = r7
            java.lang.Object r9 = r8.k(r9, r10, r11, r12, r13)
            if (r9 != r1) goto L8f
            goto La1
        L8f:
            r9 = r0
            r8 = r2
        L91:
            r13.u = r6
            r13.v = r6
            r13.f121629w = r6
            r13.f121630x = r6
            r13.A = r3
            java.lang.Object r8 = r8.invoke(r9, r13)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La5:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.f(com.revolut.feature.topup_screen.api.model.TopUpMethodsContext, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, java.lang.String, yte.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r17, yte.n r18, com.revolut.feature.topup_screen.api.model.CheckoutContext r19, gim.c r20) {
        /*
            r16 = this;
            r2 = r16
            r0 = r17
            r1 = r18
            r3 = r20
            boolean r4 = r3 instanceof e0f.l1
            if (r4 == 0) goto L1b
            r4 = r3
            e0f.l1 r4 = (e0f.l1) r4
            int r5 = r4.B
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.B = r5
            goto L20
        L1b:
            e0f.l1 r4 = new e0f.l1
            r4.<init>(r2, r3)
        L20:
            java.lang.Object r3 = r4.z
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.B
            r7 = 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L57
            if (r6 == r8) goto L44
            if (r6 != r7) goto L3c
            yte.n r0 = r4.v
            java.lang.String r1 = r4.u
            yhm.o.b(r3)
            r4 = r3
            r3 = r0
            r0 = r4
            r4 = r1
            goto La2
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r0 = r4.f121637y
            hve.b r1 = r4.f121636x
            com.revolut.feature.topup_screen.api.model.CheckoutContext r6 = r4.f121635w
            yte.n r8 = r4.v
            java.lang.String r10 = r4.u
            yhm.o.b(r3)
            r12 = r0
            r0 = r10
            r10 = r1
            r1 = r8
        L55:
            r14 = r6
            goto L79
        L57:
            yhm.o.b(r3)
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r3 = new com.revolut.feature.topup_screen.api.model.TopUpMethodsContext
            r3.<init>(r0, r1)
            r4.u = r0
            r4.v = r1
            r6 = r19
            r4.f121635w = r6
            hve.b r10 = r2.f121679a
            r4.f121636x = r10
            r4.f121637y = r3
            r4.B = r8
            java.lang.Object r8 = r2.d(r4)
            if (r8 != r5) goto L76
            goto L9d
        L76:
            r12 = r3
            r3 = r8
            goto L55
        L79:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r13 = r3.booleanValue()
            r4.u = r0
            r4.v = r1
            r4.f121635w = r9
            r4.f121636x = r9
            r4.f121637y = r9
            r4.B = r7
            r11 = r10
            hve.o r11 = (hve.o) r11
            vkm.z1 r3 = r11.f155854l
            hve.i r10 = new hve.i
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            vkm.o2 r4 = new vkm.o2
            r4.<init>(r3, r10)
            if (r4 != r5) goto L9e
        L9d:
            return r5
        L9e:
            r3 = r4
            r4 = r0
            r0 = r3
            r3 = r1
        La2:
            r6 = r0
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            kotlin.Lazy r0 = r2.f121682g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb4
            return r6
        Lb4:
            dp4.p r0 = new dp4.p
            r1 = 9
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            jhi.k r0 = nim.a.u(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.g(java.lang.String, yte.n, com.revolut.feature.topup_screen.api.model.CheckoutContext, gim.c):java.lang.Object");
    }

    public final vkm.d h(String storedMethodId, yte.m mVar, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        hve.o oVar = (hve.o) this.f121679a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return oVar.f155856n.b(new hve.a(storedMethodId, mVar != null ? mVar.name() : null), loadingStrategy);
    }

    public final akg.n i(yte.n contextType) {
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return nim.a.v(vkm.q.Q(new v1(new dz6.o(this, continuation, 11)), new a32.b(continuation, this, contextType, 27)), new dz7.k(23));
    }

    public final wkm.l j(String currency, yte.n contextType, w4l.k loadingStrategy, CheckoutContext checkoutContext, List list) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(new v1(new dz6.o(this, null, 11)), new m1(0, this, contextType, loadingStrategy, checkoutContext, currency, list, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId r17, java.lang.String r18, yte.n r19, boolean r20, gim.c r21) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof e0f.n1
            if (r2 == 0) goto L17
            r2 = r1
            e0f.n1 r2 = (e0f.n1) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.A = r3
            goto L1c
        L17:
            e0f.n1 r2 = new e0f.n1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f121653y
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.A
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L46
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r1)
            goto L9a
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            boolean r4 = r2.f121652x
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r6 = r2.f121651w
            com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId r7 = r2.v
            hve.b r8 = r2.u
            yhm.o.b(r1)
            r14 = r4
            r11 = r6
            r13 = r7
            goto L6d
        L46:
            yhm.o.b(r1)
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r1 = new com.revolut.feature.topup_screen.api.model.TopUpMethodsContext
            r4 = r18
            r7 = r19
            r1.<init>(r4, r7)
            hve.b r8 = r0.f121679a
            r2.u = r8
            r4 = r17
            r2.v = r4
            r2.f121651w = r1
            r7 = r20
            r2.f121652x = r7
            r2.A = r6
            java.lang.Object r6 = r0.d(r2)
            if (r6 != r3) goto L69
            goto L99
        L69:
            r11 = r1
            r13 = r4
            r1 = r6
            r14 = r7
        L6d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r12 = r1.booleanValue()
            r1 = 0
            r2.u = r1
            r2.v = r1
            r2.f121651w = r1
            r2.f121652x = r14
            r2.A = r5
            r10 = r8
            hve.o r10 = (hve.o) r10
            r10.getClass()
            akl.o1 r9 = new akl.o1
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r9, r2)
            if (r1 != r3) goto L95
            goto L97
        L95:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L97:
            if (r1 != r3) goto L9a
        L99:
            return r3
        L9a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.k(com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId, java.lang.String, yte.n, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (kotlin.Unit.f186387a == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof e0f.o1
            if (r0 == 0) goto L13
            r0 = r8
            e0f.o1 r0 = (e0f.o1) r0
            int r1 = r0.f121659x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121659x = r1
            goto L18
        L13:
            e0f.o1 r0 = new e0f.o1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121659x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)
            goto L97
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4c
        L38:
            yhm.o.b(r8)
            xg6.x r8 = r5.f121680b
            pfm.r r7 = r8.e(r7)
            r0.u = r6
            r0.f121659x = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L4c
            goto L96
        L4c:
            r7 = 0
            r0.u = r7
            r0.f121659x = r4
            hve.b r8 = r5.f121679a
            hve.o r8 = (hve.o) r8
            kve.a r0 = r8.f
            kve.b r0 = (kve.b) r0
            r0.getClass()
            java.lang.String r2 = "storedMethodId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            jve.a r2 = r0.b(r6)
            if (r2 == 0) goto L71
            r3 = 31
            jve.a r2 = jve.a.a(r2, r7, r3)
            r0.d(r2)
            goto L82
        L71:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Stored account details should be persisted once mandate revoke called"
            r0.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r7, r7, r0, r2)
            r2 = r7
        L82:
            if (r2 == 0) goto L92
            x4l.c r8 = r8.f155856n
            hve.a r0 = new hve.a
            r0.<init>(r6, r7)
            com.revolut.feature.topup_screen.api.model.StoredMethod r6 = mue.a.a(r2)
            r8.g(r0, r6)
        L92:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            if (r6 != r1) goto L97
        L96:
            return r1
        L97:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.l(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        if (r1 == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.feature.topup_screen.common.CardDetails r21, java.lang.String r22, yte.n r23, boolean r24, gim.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.m(com.revolut.feature.topup_screen.common.CardDetails, java.lang.String, yte.n, boolean, gim.c):java.lang.Object");
    }

    public final void n(TopupMethod method, String currency, yte.n contextType) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        ((hve.o) this.f121679a).i(method, new TopUpMethodsContext(currency, contextType));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (((hve.o) r8).k(r7, r9, null, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r7, yte.n r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof e0f.q1
            if (r0 == 0) goto L13
            r0 = r9
            e0f.q1 r0 = (e0f.q1) r0
            int r1 = r0.f121674y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121674y = r1
            goto L18
        L13:
            e0f.q1 r0 = new e0f.q1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f121672w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121674y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L6a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r7 = r0.v
            hve.b r8 = r0.u
            yhm.o.b(r9)
            goto L54
        L3a:
            yhm.o.b(r9)
            com.revolut.feature.topup_screen.api.model.TopUpMethodsContext r9 = new com.revolut.feature.topup_screen.api.model.TopUpMethodsContext
            r9.<init>(r7, r8)
            hve.b r8 = r6.f121679a
            r0.u = r8
            r0.v = r9
            r0.f121674y = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L51
            goto L69
        L51:
            r5 = r9
            r9 = r7
            r7 = r5
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f121674y = r3
            hve.o r8 = (hve.o) r8
            java.lang.Object r7 = r8.k(r7, r9, r2, r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.r1.o(java.lang.String, yte.n, gim.c):java.lang.Object");
    }
}
