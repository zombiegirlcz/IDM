package om4;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardUseCreditLimitApi;
import com.revolut.feature.credit.card.api.models.limits.CreditCardLimits;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class x2 implements al4.n {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.c1 f226745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f226746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.q f226747c;
    public final wsg.b d;
    public final ep4.a e;
    public final dp4.c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al4.p f226748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f226749h;
    public final k3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final al4.d f226750j;
    public final k0 k;

    public x2(dp4.c1 creditCardRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor, al4.q creditCardProductInteractor, wsg.b walletsInteractor, ep4.a creditCardImageProvider, dp4.c0 creditCardInstalmentRepository, al4.p creditCardProductFeatureTogglesInteractor, gte.a featureToggleInteractor, k3 creditCardPreferencesInteractor, al4.d creditCardAdditionalCardholdersInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(creditCardRepository, "creditCardRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(creditCardImageProvider, "creditCardImageProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentRepository, "creditCardInstalmentRepository");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardPreferencesInteractor, "creditCardPreferencesInteractor");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f226745a = creditCardRepository;
        this.f226746b = transactionsInteractor;
        this.f226747c = creditCardProductInteractor;
        this.d = walletsInteractor;
        this.e = creditCardImageProvider;
        this.f = creditCardInstalmentRepository;
        this.f226748g = creditCardProductFeatureTogglesInteractor;
        this.f226749h = featureToggleInteractor;
        this.i = creditCardPreferencesInteractor;
        this.f226750j = creditCardAdditionalCardholdersInteractor;
        this.k = creditCardFeatureInteractor;
    }

    public static xw4.a D(yw4.p pVar, io3.d dVar) {
        if (pVar.e == yw4.q.TERMINATED) {
            return xw4.a.TERMINATED;
        }
        yw4.m mVar = pVar.f317329h;
        if ((mVar != null ? mVar.f317323c : 0L) > 0) {
            return xw4.a.OVERDUE;
        }
        return (dVar != null ? Math.abs(dVar.i) : 0L) > Math.abs(pVar.f317327c) ? xw4.a.LIMIT_EXCEEDED : xw4.a.HEALTHY;
    }

    public static final jhi.k a(x2 x2Var, yw4.p pVar, w4l.k kVar) {
        vkm.d dVarP = x2Var.p(pVar.f317325a, kVar);
        k0 k0Var = x2Var.k;
        String facilityId = pVar.f317325a;
        cxe.u uVarA = k0Var.a(facilityId, kVar);
        cxe.u uVarA2 = x2Var.i.a(facilityId, kVar);
        l lVar = (l) x2Var.f226750j;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return nim.a.u(new oli.f(null, pVar), zh9.u0.m(zh9.u0.i(dVarP, uVarA, uVarA2), xam.a.h(new au.c0((Continuation) null, lVar, facilityId, 18), vkm.q.q(lVar.f226626c.d()))));
    }

    public static final akg.n b(x2 x2Var, yw4.p pVar, w4l.k kVar) {
        return nim.a.v(zh9.u0.m(x2Var.i.a(pVar.f317325a, kVar), ((l) x2Var.f226750j).b(pVar.f317325a, kVar)), new z1(pVar, 0));
    }

    public static final CreditCard c(x2 x2Var, d2 d2Var, List list) {
        Object next;
        String str;
        Object next2;
        String str2;
        long j2;
        boolean z;
        ep4.a aVar = x2Var.e;
        if (!(d2Var instanceof b2)) {
            if (!(d2Var instanceof c2)) {
                throw new NoWhenBranchMatchedException();
            }
            c2 c2Var = (c2) d2Var;
            yw4.p pVar = c2Var.f226542a;
            el4.a aVar2 = c2Var.f226544c;
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((io3.d) next).f163145a, pVar.f317326b)) {
                    break;
                }
            }
            io3.d dVar = (io3.d) next;
            xi0.b bVar = aVar2.f;
            String str3 = pVar.f317325a;
            if (dVar == null || (str = dVar.f163145a) == null) {
                str = pVar.f317326b;
            }
            String str4 = str;
            dj0.d dVar2 = aVar2.f127243b;
            dj0.d dVar3 = aVar2.f127244c;
            yw4.q qVar = pVar.e;
            xw4.a aVarD = D(pVar, dVar);
            LayeredImage layeredImageA = aVar.a();
            dj0.d dVar4 = aVar2.f127242a;
            yw4.n nVar = pVar.f317330j;
            boolean z3 = (nVar != null ? nVar.f317324a : null) == null;
            dj0.d dVar5 = new dj0.d(0L, bVar);
            dj0.d dVar6 = new dj0.d(0L, bVar);
            yw4.m mVar = pVar.f317329h;
            int i = mVar != null ? mVar.e : 0;
            yw4.h hVar = pVar.i;
            dj0.d dVar7 = new dj0.d(0L, bVar);
            zhm.f0 f0Var = zhm.f0.f322471a;
            yw4.b bVar2 = c2Var.f226543b;
            yw4.a aVar3 = bVar2.f317315a;
            boolean z4 = bVar2.f317316b.size() == 2;
            String str5 = pVar.k;
            yw4.l lVar = pVar.f317331l;
            long j3 = pVar.f317332m;
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            return new CreditCard(str3, str4, dVar2, dVar4, dVar5, dVar3, dVar6, qVar, aVarD, layeredImageA, z3, bVar, i, hVar, null, dVar7, f0Var, aVar3, z4, str5, lVar, AdditionalCardholdersState.NotAvailable.f69812a, j3, pyd.c.f0(localDateNow), pVar.f317333n);
        }
        b2 b2Var = (b2) d2Var;
        ll4.u uVar = b2Var.f226528b;
        yw4.p pVar2 = b2Var.f226527a;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((io3.d) next2).f163145a, pVar2.f317326b)) {
                break;
            }
        }
        io3.d dVar8 = (io3.d) next2;
        xi0.b bVar3 = pVar2.d;
        yw4.m mVar2 = pVar2.f317329h;
        yw4.n nVar2 = pVar2.f317330j;
        dj0.d dVarA = dVar8 != null ? z92.f.j(dVar8).a() : new dj0.d(0L, bVar3);
        long j5 = dVarA.f115082a;
        long jAbs = Math.abs(pVar2.f317327c);
        dj0.d dVar9 = new dj0.d(jAbs, bVar3);
        String str6 = pVar2.f317325a;
        if (dVar8 == null || (str2 = dVar8.f163145a) == null) {
            str2 = pVar2.f317326b;
        }
        yw4.q qVar2 = pVar2.e;
        xw4.a aVarD2 = D(pVar2, dVar8);
        LayeredImage layeredImageA2 = aVar.a();
        String str7 = str2;
        dj0.d dVar10 = new dj0.d(Math.max(jAbs - j5, 0L), bVar3);
        if ((nVar2 != null ? nVar2.f317324a : null) == null) {
            j2 = j5;
            z = true;
        } else {
            j2 = j5;
            z = false;
        }
        dj0.d dVar11 = new dj0.d(Math.max(0L, j2 - jAbs), bVar3);
        dj0.d dVar12 = new dj0.d(mVar2 != null ? mVar2.f317323c : 0L, bVar3);
        int i2 = mVar2 != null ? mVar2.e : 0;
        yw4.h hVar2 = pVar2.i;
        yw4.o oVar = nVar2 != null ? nVar2.f317324a : null;
        dj0.d dVar13 = uVar.v;
        List list2 = b2Var.f226529c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList.add(((yw4.g) it10.next()).f317317a);
        }
        yw4.b bVar4 = b2Var.d;
        return new CreditCard(str6, str7, dVarA, dVar10, dVar11, dVar9, dVar12, qVar2, aVarD2, layeredImageA2, z, bVar3, i2, hVar2, oVar, dVar13, arrayList, bVar4.f317315a, bVar4.f317316b.size() == 2, pVar2.k, pVar2.f317331l, b2Var.e, pVar2.f317332m, uVar.f, pVar2.f317333n);
    }

    public final Flow A(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(zh9.u0.i(h(facilityId, loadingStrategy), C(facilityId, ll4.w.MAIN_POCKET, loadingStrategy), E(facilityId, loadingStrategy)), new ok7.c(this, 10)));
    }

    public final Flow B(String pocketId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new i2(this, loadingStrategy, null, 2), ((y3) this.f226747c).g(pocketId));
    }

    public final vkm.d C(String facilityId, ll4.w paymentOption, w4l.k loadingStrategy) {
        String strName;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = this.f226745a.f116614h;
        int i = dp4.t0.f116697a[paymentOption.ordinal()];
        if (i == 1) {
            strName = paymentOption.name();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strName = null;
        }
        return cVar.b(new cp4.e0(facilityId, strName), loadingStrategy);
    }

    public final vkm.d E(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f226745a.f116621r.b(facilityId, loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof om4.o2
            if (r0 == 0) goto L13
            r0 = r9
            om4.o2 r0 = (om4.o2) r0
            int r1 = r0.f226655x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226655x = r1
            goto L18
        L13:
            om4.o2 r0 = new om4.o2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226655x
            r3 = 0
            dp4.c1 r4 = r7.f226745a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            yhm.o.b(r9)
            goto L63
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L50
        L3b:
            yhm.o.b(r9)
            r0.u = r8
            r0.f226655x = r6
            x4l.c r9 = r4.f116619p
            java.lang.Object r9 = r9.d(r8, r3, r0)
            if (r9 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L4d:
            if (r9 != r1) goto L50
            goto L62
        L50:
            r9 = 0
            r0.u = r9
            r0.f226655x = r5
            x4l.c r9 = r4.f116620q
            java.lang.Object r8 = r9.d(r8, r3, r0)
            if (r8 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L60:
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.F(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.p2
            if (r0 == 0) goto L13
            r0 = r7
            om4.p2 r0 = (om4.p2) r0
            int r1 = r0.f226662w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226662w = r1
            goto L18
        L13:
            om4.p2 r0 = new om4.p2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226662w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L45
        L28:
            r6 = move-exception
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            c00.d r7 = new c00.d     // Catch: java.lang.Throwable -> L28
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L28
            r0.f226662w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = skm.e0.G(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L45
            return r1
        L45:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L50
        L4a:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L50:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 == 0) goto L5f
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r6, r7)
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.G(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object H(gim.c cVar) {
        Object objG = skm.e0.G(new oh4.i(this, null), cVar);
        return objG == fim.a.COROUTINE_SUSPENDED ? objG : Unit.f186387a;
    }

    public final Object I(String str, gim.c cVar) {
        Object objD = this.f226745a.f116625x.d(new cp4.k(str), false, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public final Object J(String str, LocalDate localDate, gim.i iVar) {
        String string = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objD = this.f226745a.f116617m.d(new cp4.u(str, string), false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.s2
            if (r0 == 0) goto L13
            r0 = r7
            om4.s2 r0 = (om4.s2) r0
            int r1 = r0.f226691x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226691x = r1
            goto L18
        L13:
            om4.s2 r0 = new om4.s2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226691x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            yw4.f r7 = yw4.f.IN_APP_STATEMENT
            r0.u = r6
            r0.f226691x = r4
            om4.k0 r2 = r5.k
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L6c
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r7 = 0
            r0.u = r7
            r0.f226691x = r3
            dp4.c1 r7 = r5.f226745a
            x4l.c r7 = r7.f116616l
            cp4.v r2 = new cp4.v
            r2.<init>(r6)
            r6 = 0
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L6a:
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.K(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r7 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof om4.t2
            if (r0 == 0) goto L13
            r0 = r8
            om4.t2 r0 = (om4.t2) r0
            int r1 = r0.f226701x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226701x = r1
            goto L18
        L13:
            om4.t2 r0 = new om4.t2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226701x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L3b:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L4f
        L41:
            yhm.o.b(r8)
            r0.u = r7
            r0.f226701x = r5
            java.lang.Object r8 = r6.H(r0)
            if (r8 != r1) goto L4f
            goto L76
        L4f:
            ll4.w r8 = ll4.w.MAIN_POCKET
            r0.u = r7
            r0.f226701x = r4
            java.lang.Object r8 = r6.M(r7, r8, r0)
            if (r8 != r1) goto L5c
            goto L76
        L5c:
            r8 = 0
            r0.u = r8
            r0.f226701x = r3
            dp4.c1 r8 = r6.f226745a
            x4l.c r8 = r8.f116621r
            r2 = 0
            java.lang.Object r7 = r8.d(r7, r2, r0)
            if (r7 != r1) goto L6d
            goto L6f
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6f:
            if (r7 != r1) goto L72
            goto L74
        L72:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L74:
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.L(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object M(String str, ll4.w wVar, gim.c cVar) {
        String strName;
        x4l.c cVar2 = this.f226745a.f116614h;
        int i = dp4.t0.f116697a[wVar.ordinal()];
        if (i == 1) {
            strName = wVar.name();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strName = null;
        }
        Object objD = cVar2.d(new cp4.e0(str, strName), false, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.u2
            if (r0 == 0) goto L13
            r0 = r7
            om4.u2 r0 = (om4.u2) r0
            int r1 = r0.f226714x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226714x = r1
            goto L18
        L13:
            om4.u2 r0 = new om4.u2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226714x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            ll4.m r7 = ll4.m.CHANGE_DUE_DATE_BUTTON
            r0.u = r6
            r0.f226714x = r4
            java.lang.Object r7 = r5.v(r6, r7, r0)
            if (r7 != r1) goto L48
            goto L6a
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6e
            r7 = 0
            r0.u = r7
            r0.f226714x = r3
            dp4.c1 r7 = r5.f226745a
            x4l.c r7 = r7.f116624w
            cp4.l0 r2 = new cp4.l0
            r2.<init>(r6)
            r6 = 0
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L68:
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.N(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.v2
            if (r0 == 0) goto L13
            r0 = r7
            om4.v2 r0 = (om4.v2) r0
            int r1 = r0.f226724x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226724x = r1
            goto L18
        L13:
            om4.v2 r0 = new om4.v2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226724x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            ll4.m r7 = ll4.m.CHANGE_DUE_DATE_BUTTON
            r0.u = r6
            r0.f226724x = r4
            java.lang.Object r7 = r5.v(r6, r7, r0)
            if (r7 != r1) goto L48
            goto L68
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6a
            r7 = 0
            r0.u = r7
            r0.f226724x = r3
            dce.s0 r2 = new dce.s0
            r3 = 19
            dp4.c1 r4 = r5.f226745a
            r2.<init>(r4, r6, r7, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            return r6
        L6a:
            zhm.f0 r6 = zhm.f0.f322471a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.O(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (G(r4, r2) == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.String r18, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, gim.c r24) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof om4.w2
            if (r2 == 0) goto L17
            r2 = r1
            om4.w2 r2 = (om4.w2) r2
            int r3 = r2.f226734y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f226734y = r3
            goto L1c
        L17:
            om4.w2 r2 = new om4.w2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f226732w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f226734y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            yhm.o.b(r1)
            goto L7c
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            long r6 = r2.v
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            goto L6e
        L3e:
            yhm.o.b(r1)
            r13 = r18
            r2.u = r13
            r9 = r19
            r2.v = r9
            r2.f226734y = r6
            dp4.b1 r8 = new dp4.b1
            r16 = 0
            dp4.c1 r15 = r0.f226745a
            r11 = r21
            r12 = r22
            r14 = r23
            r8.<init>(r9, r11, r12, r13, r14, r15, r16)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r8, r2)
            if (r1 != r3) goto L65
            goto L67
        L65:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L67:
            if (r1 != r3) goto L6a
            goto L7b
        L6a:
            r4 = r18
            r6 = r19
        L6e:
            r1 = 0
            r2.u = r1
            r2.v = r6
            r2.f226734y = r5
            java.lang.Object r1 = r0.G(r4, r2)
            if (r1 != r3) goto L7c
        L7b:
            return r3
        L7c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.P(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final akg.n d(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dp4.c1 c1Var = this.f226745a;
        vkm.d dVarB = c1Var.f116619p.b(facilityId, loadingStrategy);
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(dVarB, nim.a.A(rd0.e.n(c1Var.f116620q.b(facilityId, loadingStrategy), zhm.h0.f322473a), new o0(17))), new o0(18));
    }

    public final vkm.q0 e(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowF = f(facilityId);
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.n(nim.a.v(zh9.u0.m(flowF, this.f226745a.f116622s.b(facilityId, loadingStrategy)), new o0(14)), zhm.h0.f322473a);
    }

    public final Flow f(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new oli.f(this, null, 4), nim.a.v(this.f226745a.f116623t.b(facilityId, loadingStrategy), new o0(20)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (N(r12, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r12, int r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof om4.e2
            if (r0 == 0) goto L13
            r0 = r14
            om4.e2 r0 = (om4.e2) r0
            int r1 = r0.f226563y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226563y = r1
            goto L18
        L13:
            om4.e2 r0 = new om4.e2
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f226561w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226563y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto L74
        L2b:
            r0 = move-exception
            r12 = r0
            goto L79
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            int r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L63
        L3e:
            yhm.o.b(r14)
            r0.u = r12
            r0.v = r13
            r0.f226563y = r4
            dp4.y0 r5 = new dp4.y0
            r10 = 0
            dp4.c1 r6 = r11.f226745a
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5e:
            if (r12 != r1) goto L61
            goto L73
        L61:
            r12 = r7
            r13 = r8
        L63:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.v = r13     // Catch: java.lang.Throwable -> L2b
            r0.f226563y = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = r11.N(r12, r0)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L7f
        L79:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L7f:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto L8e
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L8e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.g(java.lang.String, int, gim.c):java.lang.Object");
    }

    public final akg.n h(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(l(loadingStrategy), new o23.l(facilityId, 29));
    }

    public final Flow i(yw4.p facility, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facility, "facility");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(xam.a.h(new a9h.a(facility, this, loadingStrategy, (Continuation) null, 18), vkm.q.q(nim.a.v(this.d.e(loadingStrategy), new o0(19)))));
    }

    public final vkm.d j(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f226745a.f116626y.b(new cp4.j(facilityId), loadingStrategy);
    }

    public final Object k(String str, rl4.a aVar, n3j.w wVar) throws Throwable {
        Continuation continuation = null;
        if (!((jte.d) this.f226749h).c(CreditCardApi$Toggles$CreditCardUseCreditLimitApi.f68689c)) {
            return null;
        }
        dce.s0 s0Var = new dce.s0(this.f226745a, str, aVar, continuation, 16);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, s0Var, wVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : (CreditCardLimits) objJ;
    }

    public final Flow l(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(xam.a.h(new i2(this, loadingStrategy, null, 0), vkm.q.q(zh9.u0.m(((y3) this.f226747c).e(loadingStrategy, true), nim.a.v(this.d.e(loadingStrategy), new o0(19))))));
    }

    public final akg.n m(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(l(loadingStrategy), new o0(21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof om4.j2
            if (r0 == 0) goto L13
            r0 = r10
            om4.j2 r0 = (om4.j2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            om4.j2 r0 = new om4.j2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f226609y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            od0.i r3 = od0.i.f224256b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            od0.h r9 = r0.f226607w
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L8c
        L2f:
            r9 = move-exception
            goto L9d
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r0.f226608x
            om4.x2 r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2f
            r7 = r10
            r10 = r9
            r9 = r5
            r5 = r2
            r2 = r7
            goto L63
        L49:
            yhm.o.b(r10)
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r0.u = r9     // Catch: java.lang.Throwable -> L2f
            r0.v = r8     // Catch: java.lang.Throwable -> L2f
            r10 = 0
            r0.f226608x = r10     // Catch: java.lang.Throwable -> L2f
            r0.A = r5     // Catch: java.lang.Throwable -> L2f
            om4.k0 r2 = r8.k     // Catch: java.lang.Throwable -> L2f
            yw4.f r5 = yw4.f.CREDIT_LIMIT_DECREASE     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.b(r9, r5, r0)     // Catch: java.lang.Throwable -> L2f
            if (r2 != r1) goto L62
            goto L8a
        L62:
            r5 = r8
        L63:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L94
            od0.h r2 = od0.i.Companion     // Catch: java.lang.Throwable -> L2f
            dp4.c1 r5 = r5.f226745a     // Catch: java.lang.Throwable -> L2f
            r0.u = r6     // Catch: java.lang.Throwable -> L2f
            r0.v = r6     // Catch: java.lang.Throwable -> L2f
            r0.f226607w = r2     // Catch: java.lang.Throwable -> L2f
            r0.f226608x = r10     // Catch: java.lang.Throwable -> L2f
            r0.A = r4     // Catch: java.lang.Throwable -> L2f
            dlk.k r10 = new dlk.k     // Catch: java.lang.Throwable -> L2f
            r4 = 12
            r10.<init>(r5, r9, r6, r4)     // Catch: java.lang.Throwable -> L2f
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2f
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = skm.e0.J(r9, r10, r0)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r9 = r2
        L8c:
            r9.getClass()     // Catch: java.lang.Throwable -> L2f
            od0.i r9 = od0.h.a(r10)     // Catch: java.lang.Throwable -> L2f
            goto L9a
        L94:
            od0.h r9 = od0.i.Companion     // Catch: java.lang.Throwable -> L2f
            r9.getClass()     // Catch: java.lang.Throwable -> L2f
            r9 = r3
        L9a:
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2f
            goto La3
        L9d:
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        La3:
            java.lang.Throwable r10 = yhm.m.a(r9)
            if (r10 == 0) goto Lb2
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r6, r6, r10, r0)
        Lb2:
            boolean r10 = r9 instanceof yhm.n
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            r6 = r9
        Lb8:
            od0.i r6 = (od0.i) r6
            if (r6 != 0) goto Lc2
            od0.h r9 = od0.i.Companion
            r9.getClass()
            goto Lc3
        Lc2:
            r3 = r6
        Lc3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.n(java.lang.String, gim.c):java.lang.Object");
    }

    public final wkm.l o(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return vkm.q.Q(new vkm.v1(new k2(this, facilityId, continuation, 0)), new mki.d(continuation, this, facilityId, loadingStrategy, 3));
    }

    public final vkm.d p(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f226745a.i.b(facilityId, loadingStrategy);
    }

    public final String q(String facilityId, String fileName) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        dp4.c1 c1Var = this.f226745a;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return com.google.android.gms.internal.mlkit_vision_face.a.p(c1Var.d.getBaseUrl(), "/credit/", facilityId, "/statement?fileName=", fileName);
    }

    public final vkm.d r(String facilityId, LocalDate startDate, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = this.f226745a.f116617m;
        String string = startDate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return cVar.b(new cp4.u(facilityId, string), loadingStrategy);
    }

    public final vkm.d s(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f226745a.f116616l.b(new cp4.v(facilityId), loadingStrategy);
    }

    public final vkm.d t(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f226745a.f116618n.b(new cp4.w(facilityId), loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof om4.m2
            if (r0 == 0) goto L13
            r0 = r6
            om4.m2 r0 = (om4.m2) r0
            int r1 = r0.f226638w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226638w = r1
            goto L18
        L13:
            om4.m2 r0 = new om4.m2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226638w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            al4.q r6 = r4.f226747c
            om4.y3 r6 = (om4.y3) r6
            kotlinx.coroutines.flow.Flow r5 = r6.i(r5)
            r0.f226638w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.u(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object v(String facilityId, ll4.m mVar, gim.c cVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.j loadingStrategy = w4l.j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.x(mo3.a.g(nim.a.A(rd0.e.n(nim.a.v(this.f226745a.v.b(new cp4.h0(facilityId), loadingStrategy), new ok7.c(mVar, 9)), zhm.h0.f322473a), new o0(16)), null, new ol6.b(9), 1), cVar);
    }

    public final Object w(String str, String str2, gim.c cVar) throws Throwable {
        dce.s0 s0Var = new dce.s0(this.f226745a, str, str2, null, 17);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, s0Var, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof om4.n2
            if (r0 == 0) goto L13
            r0 = r9
            om4.n2 r0 = (om4.n2) r0
            int r1 = r0.f226649y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226649y = r1
            goto L18
        L13:
            om4.n2 r0 = new om4.n2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f226647w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226649y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            od0.h r8 = r0.v
            yhm.o.b(r9)
            goto L74
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L4c
        L3a:
            yhm.o.b(r9)
            r0.u = r8
            r0.f226649y = r4
            yw4.f r9 = yw4.f.CREDIT_LIMIT_DECREASE
            om4.k0 r2 = r7.k
            java.lang.Object r9 = r2.b(r8, r9, r0)
            if (r9 != r1) goto L4c
            goto L70
        L4c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7c
            od0.h r9 = od0.i.Companion
            r2 = 0
            r0.u = r2
            r0.v = r9
            r0.f226649y = r3
            dce.s0 r3 = new dce.s0
            r4 = 18
            dp4.c1 r5 = r7.f226745a
            r3.<init>(r5, r8, r2, r4)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r3, r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            r6 = r9
            r9 = r8
            r8 = r6
        L74:
            r8.getClass()
            od0.i r8 = od0.h.a(r9)
            return r8
        L7c:
            od0.h r8 = od0.i.Companion
            r8.getClass()
            od0.i r8 = od0.i.f224256b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x2.x(java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow y(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return xam.a.h(new i2(this, loadingStrategy, continuation, 1), vkm.q.R(nim.a.v(((y3) this.f226747c).f(facilityId, w4l.j.f294644c), new o0(15)), new hr4.b(3, 9, continuation)));
    }

    public final Flow z(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new h0(zhm.f0.f322471a, null, this, facilityId, loadingStrategy, 2), this.k.c(facilityId, yw4.f.BALANCE_TRANSFER, w4l.j.f294644c));
    }
}
