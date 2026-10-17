package oq3;

import al4.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ft3.a0;
import ft3.a1;
import ft3.d1;
import ft3.e1;
import ft3.f0;
import ft3.g0;
import ft3.g1;
import ft3.j1;
import ft3.k0;
import ft3.n0;
import ft3.p0;
import ft3.q0;
import ft3.r0;
import ft3.s0;
import ft3.t0;
import ft3.u0;
import ft3.v0;
import ft3.w;
import ft3.w0;
import ft3.x0;
import ft3.y0;
import ft3.z0;
import grl.b4;
import grl.r2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import om4.y3;
import ood.o0;
import op0.o3;
import org.jetbrains.annotations.NotNull;
import pq3.r;
import pq3.s;
import pq3.u;
import pq3.v;
import pq3.x;
import pq3.y;
import pq3.z;
import xq3.t;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements kq3.c {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f227722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz3.c f227723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f227724c;
    public final xq3.j d;
    public final up3.b e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xq3.d f227725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hz3.c f227726h;
    public final gte.a i;

    public m(sri.m navigator, rz3.c creditApplicationRouter, t creditLimitIncreaseApplicationInteractor, xq3.j creditApplicationLifecycleInteractor, up3.b creditFeatureAvailabilityInteractor, q creditCardProductInteractor, xq3.d creditApplicationDeclineInvitationInteractor, hz3.c creditApplicationCommandsFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(creditLimitIncreaseApplicationInteractor, "creditLimitIncreaseApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(creditFeatureAvailabilityInteractor, "creditFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationDeclineInvitationInteractor, "creditApplicationDeclineInvitationInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f227722a = navigator;
        this.f227723b = creditApplicationRouter;
        this.f227724c = creditLimitIncreaseApplicationInteractor;
        this.d = creditApplicationLifecycleInteractor;
        this.e = creditFeatureAvailabilityInteractor;
        this.f = creditCardProductInteractor;
        this.f227725g = creditApplicationDeclineInvitationInteractor;
        this.f227726h = creditApplicationCommandsFactory;
        this.i = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(oq3.m r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof oq3.k
            if (r0 == 0) goto L13
            r0 = r6
            oq3.k r0 = (oq3.k) r0
            int r1 = r0.f227718w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227718w = r1
            goto L18
        L13:
            oq3.k r0 = new oq3.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227718w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xq3.j r5 = r5.d
            ft3.c1 r6 = ft3.d1.Companion
            ft3.j1 r2 = ft3.j1.CREDIT_CARD_LIMIT_INCREASE
            r4 = 0
            ft3.d1 r6 = mif.a.m(r6, r2, r4)
            java.util.Set r6 = zhm.y0.b(r6)
            r0.f227718w = r3
            java.lang.Object r6 = xq3.j.g(r5, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            r0 = 0
            if (r5 == 0) goto L5c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L5c
        L5a:
            r3 = r0
            goto L70
        L5c:
            java.util.Iterator r5 = r6.iterator()
        L60:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r5.next()
            it3.d r6 = (it3.d) r6
            boolean r6 = r6.f168324b
            if (r6 == 0) goto L60
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.m.b(oq3.m, gim.c):java.lang.Object");
    }

    public static i g(m mVar, jf0.c cVar, yp3.f fVar, int i) {
        Boolean boolE0;
        Boolean boolE02;
        Boolean boolE03;
        y0 u0Var = null;
        if ((i & 2) != 0) {
            fVar = null;
        }
        String str = (String) cVar.d.get("skipArticles");
        boolean zBooleanValue = false;
        yp3.d dVar = (str == null || (boolE03 = d0.E0(str)) == null) ? false : boolE03.booleanValue() ? yp3.d.FORCE_SKIP : yp3.d.DEFAULT;
        if (fVar == null) {
            String str2 = (String) cVar.d.get("skipIntro");
            fVar = (str2 == null || (boolE02 = d0.E0(str2)) == null) ? false : boolE02.booleanValue() ? yp3.f.SKIP_ALL : yp3.f.SHOW_ALL;
        }
        r2 r2Var = r2.DEEPLINK;
        HashMap map = cVar.d;
        String str3 = (String) map.get("utm_source");
        it3.j jVar = it3.k.Companion;
        String str4 = (String) map.get("productMetadata");
        jVar.getClass();
        it3.k kVarA = it3.j.a(str4);
        switch (kVarA == null ? -1 : j.f227717a[kVarA.ordinal()]) {
            case -1:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                u0Var = !((jte.d) mVar.i).c(CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c) ? x0.f137890a : s0.f137872a;
                break;
            case 2:
                u0Var = v0.f137882a;
                break;
            case 3:
                u0Var = w0.f137887a;
                break;
            case 4:
                u0Var = t0.f137874a;
                break;
            case 5:
                u0Var = s0.f137872a;
                break;
            case 6:
                u0Var = r0.f137867a;
                break;
            case 7:
                String str5 = (String) map.get("invitationId");
                if (str5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("InvitationId is not present for INVITATION product metadata");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    u0Var = new u0(str5);
                }
                break;
        }
        a1 a1Var = new a1(r2Var, str3, null, u0Var, null, 20);
        String str6 = (String) map.get("areYouLeavingScreenEnabled");
        if (str6 != null && (boolE0 = d0.E0(str6)) != null) {
            zBooleanValue = boolE0.booleanValue();
        }
        return new i(dVar, fVar, a1Var, zBooleanValue);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z.Companion.getClass();
        return pq3.e.a(deeplink) != null;
    }

    public final ufm.i c() {
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(rd0.e.n(((y3) this.f).e(w4l.j.f294644c, true), h0.f322473a), null, new e(0), 1), kotlin.coroutines.g.f186406a).firstOrError();
        o3 o3Var = new o3(28, new o0(21));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, o3Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final pfm.h d(q0 q0Var, boolean z, i iVar) {
        FeatureCommand featureCommand = new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(iVar.f227716c, q0Var, wp3.a.OPEN_EXISTING_APPLICATION, iVar.f227714a, null, iVar.f227715b, null, null, null, null, b4.EXPIRED_OR_INVALID_KEY_VALUE));
        return z ? i(com.revolut.retail.core.navigation.a.c(this.f227723b.f258504c.c(), featureCommand)) : i(featureCommand);
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) throws Throwable {
        z.Companion.getClass();
        z zVarA = pq3.e.a(cVar);
        if (zVarA != null) {
            if (zVarA instanceof pq3.l) {
                return j(cVar, w.INSTANCE, new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null), (gim.c) continuation);
            }
            if (zVarA instanceof x) {
                return j(cVar, ft3.o0.INSTANCE, new d1(j1.FIXED_TERM_CREDIT, gt3.d.REFINANCING, null), (gim.c) continuation);
            }
            if (zVarA instanceof pq3.t) {
                return j(cVar, ft3.d.INSTANCE, mif.a.m(d1.Companion, j1.BUY_NOW_PAY_LATER, null), (gim.c) continuation);
            }
            if (zVarA instanceof pq3.m) {
                return j(cVar, a0.INSTANCE, mif.a.m(d1.Companion, j1.MORTGAGE, null), (gim.c) continuation);
            }
            if (zVarA instanceof s) {
                return j(cVar, g0.INSTANCE, mif.a.m(d1.Companion, j1.OVERDRAFT, null), (gim.c) continuation);
            }
            if (zVarA instanceof y) {
                return j(cVar, p0.INSTANCE, mif.a.m(d1.Companion, j1.REFINANCING_MORTGAGE, null), (gim.c) continuation);
            }
            if (zVarA instanceof v) {
                return j(cVar, new n0(n14.k.c(((v) zVarA).f238681a, 0)), mif.a.m(d1.Companion, j1.POST_TERMINATION_REPAYMENT_PLAN, null), (gim.c) continuation);
            }
            if (zVarA instanceof u) {
                return j(cVar, new k0(n14.k.c(((u) zVarA).f238681a, 0)), mif.a.m(d1.Companion, j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, null), (gim.c) continuation);
            }
            if (zVarA instanceof pq3.n) {
                String strC = n14.k.c(((pq3.n) zVarA).f238681a, 0);
                gt3.e eVar = gt3.e.FORBEARANCE;
                return j(cVar, new ft3.d0(strC, eVar), new d1(j1.MORTGAGE_RENEGOTIATION, eVar, null), (gim.c) continuation);
            }
            if (zVarA instanceof pq3.o) {
                String strC2 = n14.k.c(((pq3.o) zVarA).f238681a, 0);
                gt3.e eVar2 = gt3.e.REFURBISHMENT;
                return j(cVar, new ft3.d0(strC2, eVar2), new d1(j1.MORTGAGE_RENEGOTIATION, eVar2, null), (gim.c) continuation);
            }
            if (zVarA instanceof pq3.q) {
                return j(cVar, new f0((String) ((pq3.q) zVarA).f238680b.d.get("loanId")), mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, null), (gim.c) continuation);
            }
            if (zVarA instanceof r) {
                return new q06.h(new BridgeDestination(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Success("ID_NOTIFY_ME_DIALOG", new TextLocalisedClause(R$string.credit_notify_me_title, null, null, 14), new TextLocalisedClause(R$string.credit_notify_me_description, null, null, 14), null, null, 2040), null, null, null, null, 510)), null);
            }
            if (zVarA instanceof pq3.w) {
                return new q06.h(new BridgeDestination(new FeatureCommand(CreditApplicationFeatureConfig.RecommendedValuators.f66202a)), null);
            }
            if (zVarA instanceof pq3.d) {
                pq3.d dVar = (pq3.d) zVarA;
                d1 d1VarA = dVar.a();
                if (d1VarA != null) {
                    i iVarG = g(this, cVar, null, 3);
                    return new q06.h(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.CancelApplication(n14.k.c(dVar.f238681a, 1), d1VarA, iVarG.f227716c, iVarG.d))), null);
                }
            } else if (!(zVarA instanceof pq3.f) && !(zVarA instanceof pq3.g) && !(zVarA instanceof pq3.i) && !(zVarA instanceof pq3.j) && !(zVarA instanceof pq3.k) && !(zVarA instanceof pq3.c) && !(zVarA instanceof pq3.h)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) throws Throwable {
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z.Companion.getClass();
        z zVarA = pq3.e.a(deeplink);
        String str = 0;
        if (zVarA instanceof pq3.f) {
            i iVarG = g(this, deeplink, null, 3);
            a1 a1Var = iVarG.f227716c;
            y0 y0Var = a1Var.d;
            if (y0Var instanceof x0) {
                if (((jte.d) this.i).c(CreditApplicationApi$Toggles.CreditBuilderCardEntryPoint.f66186c)) {
                    y0Var = s0.f137872a;
                }
            }
            y0 y0Var2 = y0Var;
            r2 analyticsEntryPoint = a1Var.f137797a;
            String str2 = a1Var.f137798b;
            z0 z0Var = a1Var.f137799c;
            dj0.d dVar = a1Var.e;
            Intrinsics.checkNotNullParameter(analyticsEntryPoint, "analyticsEntryPoint");
            a1 entryPointPayload = new a1(analyticsEntryPoint, str2, z0Var, y0Var2, dVar);
            yp3.d productArticleStrategy = iVarG.f227714a;
            yp3.f productIntroStrategy = iVarG.f227715b;
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
            Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
            Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
            FeatureCommand featureCommand = new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(entryPointPayload, new ft3.g(null, y0Var2 != null ? y0Var2.c0() : null, 1), wp3.a.OPEN_EXISTING_APPLICATION, productArticleStrategy, null, productIntroStrategy, null, null, null, null, b4.EXPIRED_OR_INVALID_KEY_VALUE));
            return h(z ? i(com.revolut.retail.core.navigation.a.c(this.f227723b.f258504c.c(), featureCommand)) : i(featureCommand), mif.a.m(d1.Companion, j1.CREDIT_CARD, y0Var2 != null ? y0Var2.c0() : null));
        }
        if (zVarA instanceof pq3.g) {
            ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new oh4.i(this, mif.a.m(d1.Companion, j1.CREDIT_CARD_LIMIT_INCREASE, null), (Continuation) str, 26)), new f(4, new d(this, g(this, deeplink, null, 3), z)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        if (zVarA instanceof pq3.i) {
            i iVarG2 = g(this, deeplink, null, 3);
            y0 y0Var3 = iVarG2.f227716c.d;
            pfm.h hVar = new pfm.h(new b7c.b(y0Var3, this, z, iVarG2, 2), 1);
            Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
            return h(hVar, mif.a.m(d1.Companion, j1.FAMILY_CREDIT_CARD, y0Var3 != null ? y0Var3.c0() : null));
        }
        if (zVarA instanceof pq3.l) {
            return h(d(w.INSTANCE, z, g(this, deeplink, null, 3)), new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null));
        }
        if (zVarA instanceof x) {
            return h(d(ft3.o0.INSTANCE, z, g(this, deeplink, null, 3)), new d1(j1.FIXED_TERM_CREDIT, gt3.d.REFINANCING, null));
        }
        if (zVarA instanceof pq3.t) {
            return h(d(ft3.d.INSTANCE, z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.BUY_NOW_PAY_LATER, null));
        }
        if (zVarA instanceof pq3.m) {
            return h(d(a0.INSTANCE, z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.MORTGAGE, null));
        }
        if (zVarA instanceof s) {
            return h(d(g0.INSTANCE, z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.OVERDRAFT, null));
        }
        if (zVarA instanceof y) {
            return h(d(p0.INSTANCE, z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.REFINANCING_MORTGAGE, null));
        }
        if (zVarA instanceof pq3.j) {
            pq3.j jVar = (pq3.j) zVarA;
            String strE = jVar.f238678b.e(3);
            Matcher matcher = jVar.f238681a;
            d1 d1VarB = g1.b(matcher.group(1) + "-fbr");
            if (d1VarB != null) {
                Intrinsics.checkNotNullParameter(d1VarB, "<this>");
                Iterator it8 = g1.f137832a.entrySet().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((Map.Entry) next).getValue(), d1VarB)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                String str3 = entry != null ? (String) entry.getKey() : null;
                Lazy lazyY0 = te0.w.y0(new e1(d1VarB, 0));
                str = str3;
                if (str3 == null) {
                    str = (String) lazyY0.getValue();
                }
            }
            if (str == 0 || d0.W(str)) {
                hx7.e.n(new IllegalArgumentException(j6.a.q("Self-service forbearance not supported for this product: ", matcher.group(1))));
            }
            i iVarG3 = g(this, deeplink, yp3.f.SKIP_ALL, 1);
            if (str == 0 || d0.W(str)) {
                ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            }
            d1 d1VarA = g1.a(str);
            q0.Companion.getClass();
            return h(d(ft3.e.a(d1VarA, strE), z, iVarG3), d1VarA);
        }
        if (zVarA instanceof pq3.k) {
            jf0.c cVar = ((pq3.k) zVarA).f238679b;
            String strE2 = cVar.e(3);
            String strE3 = cVar.e(2);
            i iVarG4 = g(this, deeplink, yp3.f.SKIP_RESUME_INTRO, 1);
            d1 d1VarA2 = g1.a(strE3);
            ufm.i iVar2 = new ufm.i(te0.w.o0(skm.p0.f264003c, new oh4.i(this, d1VarA2, (Continuation) str, 26)), new o3(26, new ael.s(8, strE2, d1VarA2, this, iVarG4, z)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
            return iVar2;
        }
        if (zVarA instanceof v) {
            return h(d(new n0(n14.k.c(((v) zVarA).f238681a, 0)), z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.POST_TERMINATION_REPAYMENT_PLAN, null));
        }
        if (zVarA instanceof u) {
            return h(d(new k0(n14.k.c(((u) zVarA).f238681a, 0)), z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, null));
        }
        if (zVarA instanceof pq3.o) {
            String strC = n14.k.c(((pq3.o) zVarA).f238681a, 0);
            gt3.e eVar = gt3.e.REFURBISHMENT;
            return h(d(new ft3.d0(strC, eVar), z, g(this, deeplink, null, 3)), new d1(j1.MORTGAGE_RENEGOTIATION, eVar, null));
        }
        if (zVarA instanceof pq3.n) {
            String strC2 = n14.k.c(((pq3.n) zVarA).f238681a, 0);
            gt3.e eVar2 = gt3.e.FORBEARANCE;
            return h(d(new ft3.d0(strC2, eVar2), z, g(this, deeplink, null, 3)), new d1(j1.MORTGAGE_RENEGOTIATION, eVar2, null));
        }
        if (zVarA instanceof r) {
            pfm.z zVarD = i(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Success("ID_NOTIFY_ME_DIALOG", new TextLocalisedClause(R$string.credit_notify_me_title, null, null, 14), new TextLocalisedClause(R$string.credit_notify_me_description, null, null, 14), null, null, 2040), null, null, null, null, 510)).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        if (zVarA instanceof pq3.w) {
            pfm.z zVarD2 = i(new FeatureCommand(CreditApplicationFeatureConfig.RecommendedValuators.f66202a)).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
            return zVarD2;
        }
        if (zVarA instanceof pq3.c) {
            pfm.h hVar2 = new pfm.h(new a6j.b(this, z, deeplink, 15), 1);
            Intrinsics.checkNotNullExpressionValue(hVar2, "defer(...)");
            return h(hVar2, mif.a.m(d1.Companion, j1.BASIC_CREDIT_CARD, null));
        }
        if (zVarA instanceof pq3.h) {
            pq3.h hVar3 = (pq3.h) zVarA;
            pfm.a aVar = new pfm.a(te0.w.o0(skm.p0.f264003c, new oh4.i(this, hVar3, (Continuation) str, 27)), new f(3, new ood.k(this, hVar3, 18)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            return h(aVar, mif.a.m(d1.Companion, j1.FAMILY_CREDIT_CARD, null));
        }
        if (zVarA instanceof pq3.q) {
            return h(d(new f0((String) ((pq3.q) zVarA).f238680b.d.get("loanId")), z, g(this, deeplink, null, 3)), mif.a.m(d1.Companion, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC, null));
        }
        if (!(zVarA instanceof pq3.d)) {
            if (zVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
            ufm.b bVarM2 = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        pq3.d dVar2 = (pq3.d) zVarA;
        d1 d1VarA3 = dVar2.a();
        if (d1VarA3 == null) {
            return efm.d0.m(Boolean.FALSE);
        }
        i iVarG5 = g(this, deeplink, null, 3);
        return i(new FeatureCommand(new CreditApplicationFeatureConfig.CancelApplication(n14.k.c(dVar2.f238681a, 1), d1VarA3, iVarG5.f227716c, iVarG5.d))).f(efm.d0.m(Boolean.TRUE));
    }

    public final ufm.i h(efm.b bVar, d1 d1Var) {
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new oh4.i(this, d1Var, (Continuation) null, 26)), new o3(25, new mli.h(bVar, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final pfm.h i(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new ne0.o(this, naviCommand, 16), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(jf0.c r20, ft3.q0 r21, ft3.d1 r22, gim.c r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof oq3.l
            if (r2 == 0) goto L17
            r2 = r1
            oq3.l r2 = (oq3.l) r2
            int r3 = r2.f227721y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f227721y = r3
            goto L1c
        L17:
            oq3.l r2 = new oq3.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f227719w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f227721y
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            ft3.q0 r3 = r2.v
            jf0.c r2 = r2.u
            yhm.o.b(r1)
            r9 = r3
            goto L5e
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            yhm.o.b(r1)
            kotlinx.coroutines.d r1 = skm.p0.f264003c
            oh4.i r4 = new oh4.i
            r7 = 26
            r8 = r22
            r4.<init>(r0, r8, r6, r7)
            ufm.b r1 = te0.w.o0(r1, r4)
            r4 = r20
            r2.u = r4
            r7 = r21
            r2.v = r7
            r2.f227721y = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L5c
            return r3
        L5c:
            r2 = r4
            r9 = r7
        L5e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L67
            return r6
        L67:
            r1 = 3
            oq3.i r1 = g(r0, r2, r6, r1)
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            yp3.d r11 = r1.f227714a
            wp3.a r10 = wp3.a.OPEN_EXISTING_APPLICATION
            yp3.f r13 = r1.f227715b
            ft3.a1 r8 = r1.f227716c
            com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$StartApplication r7 = new com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$StartApplication
            r17 = 0
            r18 = 2000(0x7d0, float:2.803E-42)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.<init>(r7)
            q06.h r1 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r3 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r3.<init>(r2)
            r1.<init>(r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.m.j(jf0.c, ft3.q0, ft3.d1, gim.c):java.lang.Object");
    }
}
