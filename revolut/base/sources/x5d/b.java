package x5d;

import adk.e1;
import adk.h1;
import adk.i;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_rewards.api.model.AdditionalReward;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfoItem;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.sso.api.models.UserInfo;
import com.youTransactor.uCube.payment.PaymentContext;
import com.youTransactor.uCube.rpc.CardReaderType;
import cr9.p;
import dj0.d;
import evh.f0;
import fim.h;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import pyd.c;
import r5b.e;
import r5b.f;
import retrofit2.HttpException;
import sil.j;
import sil.k;
import w5b.d0;
import w5b.g0;
import xga.s;
import yhf.q;
import yhm.m;
import yhm.n;
import yhm.o;
import yki.g;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final d0 A(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String str = eVar.f251564a;
        String str2 = eVar.f251565b;
        String str3 = eVar.f251566c;
        ArrayList<f> arrayList = eVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (f fVar : arrayList) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String str4 = fVar.f251568a;
            String str5 = fVar.f251569b;
            String str6 = fVar.f251570c;
            String lowerCase = fVar.d.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList2.add(new g0(str4, str5, str6, lowerCase));
        }
        String str7 = eVar.e;
        String str8 = eVar.f;
        ParameterisedHyperText parameterisedHyperText = eVar.f251567g;
        return new d0(str, str2, str3, arrayList2, str7, str8, parameterisedHyperText != null ? md7.a.d(parameterisedHyperText) : null);
    }

    public static final String B(BigDecimal bigDecimal) {
        String plainString = bigDecimal.setScale(10, RoundingMode.HALF_DOWN).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return kotlin.text.d0.I0(plainString, '0');
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final w5d.a C(yvh.b r16) {
        /*
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r3 = r0.f317176a
            dj0.d r1 = r0.f317179g
            boolean r4 = r0.f317177b
            java.lang.String r5 = r0.f317178c
            java.lang.String r7 = r0.d
            yvh.h r2 = r0.e
            r6 = -1
            if (r2 != 0) goto L18
            r2 = r6
            goto L20
        L18:
            int[] r8 = x5d.a.f302938b
            int r2 = r2.ordinal()
            r2 = r8[r2]
        L20:
            r8 = 0
            switch(r2) {
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L29;
                case 7: goto L26;
                default: goto L24;
            }
        L24:
            r2 = r8
            goto L3a
        L26:
            java.lang.String r2 = "WEALTH_PORTFOLIO"
            goto L3a
        L29:
            java.lang.String r2 = "LOYALTY_PROFILE"
            goto L3a
        L2c:
            java.lang.String r2 = "CURRENT_POCKET"
            goto L3a
        L2f:
            java.lang.String r2 = "CHARITY_POCKET"
            goto L3a
        L32:
            java.lang.String r2 = "HOLDING"
            goto L3a
        L35:
            java.lang.String r2 = "VAULT"
            goto L3a
        L38:
            java.lang.String r2 = "SAVINGS_POCKET"
        L3a:
            yvh.f r9 = r0.f
            if (r9 != 0) goto L3f
            goto L47
        L3f:
            int[] r6 = x5d.a.f302937a
            int r9 = r9.ordinal()
            r6 = r6[r9]
        L47:
            r9 = 1
            if (r6 == r9) goto L5f
            r9 = 2
            if (r6 == r9) goto L5c
            r9 = 3
            if (r6 == r9) goto L59
            r9 = 4
            if (r6 == r9) goto L55
            r12 = r8
            goto L62
        L55:
            java.lang.String r6 = "BALANCE_ROUNDING"
        L57:
            r12 = r6
            goto L62
        L59:
            java.lang.String r6 = "SPENDING_PERCENTAGE"
            goto L57
        L5c:
            java.lang.String r6 = "DAILY_SAVINGS"
            goto L57
        L5f:
            java.lang.String r6 = "SPARE_CHANGE"
            goto L57
        L62:
            java.lang.Float r10 = r0.f317180h
            if (r1 == 0) goto L6d
            long r13 = r1.f115082a
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            goto L6e
        L6d:
            r6 = r8
        L6e:
            if (r1 == 0) goto L78
            xi0.b r1 = r1.f115083b
            if (r1 == 0) goto L78
            java.lang.String r1 = r1.f306286a
            r9 = r1
            goto L79
        L78:
            r9 = r8
        L79:
            java.lang.Float r11 = r0.i
            java.lang.String r13 = r0.f317181j
            yvh.d r1 = r0.k
            if (r1 == 0) goto L87
            java.lang.String r1 = r1.b()
            r14 = r1
            goto L88
        L87:
            r14 = r8
        L88:
            java.time.ZonedDateTime r0 = r0.f317182l
            if (r0 == 0) goto L94
            long r0 = pu7.a.I(r0)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
        L94:
            r15 = r8
            r8 = r6
            r6 = r2
            w5d.a r2 = new w5d.a
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x5d.b.C(yvh.b):w5d.a");
    }

    public static final ArrayList D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<oq9.w> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (oq9.w wVar : list2) {
            Intrinsics.checkNotNullParameter(wVar, "<this>");
            String str = wVar.f227859a.f227862a;
            d dVar = wVar.f227860b;
            arrayList.add(new p(str, dVar.f115082a, dVar.f115083b.f306286a));
        }
        return arrayList;
    }

    public static final k E(f0 f0Var) {
        j jVar;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        String workflowId = f0Var.getWorkflowId();
        List<String> activeStepTypes = f0Var.getActiveStepTypes();
        ArrayList arrayList = new ArrayList(w.t(activeStepTypes, 10));
        for (String str : activeStepTypes) {
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (a0.z(jVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (jVar == null) {
                throw new UnrecognisedContractException(j6.a.q("Unknown activeStepTypes ", str));
            }
            arrayList.add(jVar);
        }
        return new k(workflowId, arrayList);
    }

    public static final d F(WealthMarginStatus wealthMarginStatus) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(wealthMarginStatus, "<this>");
        try {
            m.Companion companion = m.INSTANCE;
            d dVar = wealthMarginStatus.f95675c;
            WealthMarginBorrowingStatus wealthMarginBorrowingStatus = wealthMarginStatus.e;
            objA = c.O(dVar, wealthMarginBorrowingStatus != null ? wealthMarginBorrowingStatus.f95671b : null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        d dVar2 = (d) (objA instanceof n ? null : objA);
        return dVar2 == null ? new d(0L, wealthMarginStatus.f95675c.f115083b) : dVar2;
    }

    public static final boolean a(lk0.e eVar) {
        return !eVar.f196173c && eVar.f196171a.size() < eVar.f196172b.getF84104a();
    }

    public static final boolean b(um.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Throwable th10 = aVar.f281173b;
        return (th10 instanceof IOException) || (th10 instanceof HttpException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(r60.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ha0.a
            if (r0 == 0) goto L13
            r0 = r6
            ha0.a r0 = (ha0.a) r0
            int r1 = r0.f150344w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150344w = r1
            goto L18
        L13:
            ha0.a r0 = new ha0.a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f150344w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L87
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            r60.b r5 = r0.u
            yhm.o.b(r6)
            goto L4f
        L38:
            yhm.o.b(r6)
            r6 = r5
            r60.d r6 = (r60.d) r6
            rp0.p0 r6 = r6.d
            efm.r r6 = r6.e()
            r0.u = r5
            r0.f150344w = r4
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L4f
            goto L86
        L4f:
            rp0.v0 r6 = (rp0.v0) r6
            boolean r6 = r6.f256202a
            if (r6 == 0) goto L8a
            r0.u = r5
            r0.f150344w = r3
            eim.c r6 = new eim.c
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r6.<init>(r2)
            ha0.b r2 = new ha0.b
            r3 = 0
            r2.<init>(r6, r3)
            r60.d r5 = (r60.d) r5
            r5.getClass()
            java.lang.String r3 = "doOnHide"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r5.f251628g = r2
            rp0.p0 r5 = r5.d
            r5.a()
            java.lang.Object r5 = r6.b()
            if (r5 != r1) goto L84
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
        L84:
            if (r5 != r1) goto L87
        L86:
            return r1
        L87:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L8a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x5d.b.c(r60.b, gim.c):java.lang.Object");
    }

    public static final d d(WealthMarginStatus wealthMarginStatus) throws Throwable {
        d dVar;
        Object objA;
        Intrinsics.checkNotNullParameter(wealthMarginStatus, "<this>");
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus = wealthMarginStatus.e;
        if (wealthMarginBorrowingStatus != null && (dVar = wealthMarginBorrowingStatus.f95672c) != null) {
            if (dVar.f115082a < 0) {
                dVar = null;
            }
            if (dVar != null) {
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = c.H(wealthMarginStatus.f95675c, dVar);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                d dVar2 = (d) objA;
                if (dVar2 == null || !dVar2.f(d.e)) {
                    return null;
                }
                return dVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ueg.c0 e(lk0.g r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.List r10 = r10.f196174a
            java.lang.Object r0 = zhm.d0.o0(r10)
            lk0.e r0 = (lk0.e) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            boolean r0 = r0.f196173c
            if (r0 != r2) goto L17
            r6 = r2
            goto L18
        L17:
            r6 = r1
        L18:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r5 = r0 ^ 1
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r0.next()
            lk0.e r3 = (lk0.e) r3
            java.util.List r3 = r3.f196171a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            zhm.a0.x(r3, r4)
            goto L2d
        L41:
            java.lang.Object r0 = zhm.d0.o0(r10)
            lk0.e r0 = (lk0.e) r0
            r3 = 0
            if (r0 == 0) goto L4d
            java.lang.Throwable r0 = r0.e
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L52
            r7 = r2
            goto L53
        L52:
            r7 = r1
        L53:
            java.lang.Object r0 = zhm.d0.d0(r10)
            lk0.e r0 = (lk0.e) r0
            if (r0 == 0) goto L69
            lk0.f r0 = r0.f196172b
            vfi.a r0 = (vfi.a) r0
            if (r0 == 0) goto L69
            dgi.c r0 = r0.f288659a
            if (r0 == 0) goto L69
            com.revolut.feature_travel_hotels_models.property.search.LocationData r0 = r0.f114671a
            r8 = r0
            goto L6a
        L69:
            r8 = r3
        L6a:
            if (r6 != 0) goto L7b
            java.lang.Object r10 = zhm.d0.o0(r10)
            lk0.e r10 = (lk0.e) r10
            if (r10 == 0) goto L76
            java.lang.String r3 = r10.d
        L76:
            if (r3 == 0) goto L79
            goto L7b
        L79:
            r9 = r1
            goto L7c
        L7b:
            r9 = r2
        L7c:
            ueg.c0 r3 = new ueg.c0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x5d.b.e(lk0.g):ueg.c0");
    }

    public static final fa1.j f(PaymentContext paymentContext) {
        Intrinsics.checkNotNullParameter(paymentContext, "<this>");
        String label = CardReaderType.getLabel(paymentContext.getActivatedReader());
        return Intrinsics.f(label, CardReaderType.NFC.getLabel()) ? fa1.j.CONTACTLESS : Intrinsics.f(label, CardReaderType.ICC.getLabel()) ? fa1.j.CONTACT : fa1.j.UNKNOWN;
    }

    public static final ResourceImage g(boolean z) {
        return z ? new ResourceImage(R$drawable.uikit_icn_24_chevron_up, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static final String h(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            return fundingSource.f92240a;
        }
        if (fundingSource instanceof SavingsAccount) {
            return ((SavingsAccount) fundingSource).e;
        }
        if ((fundingSource instanceof WealthPortfolio) || (fundingSource instanceof DeFiBalanceSource)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d i(nrf.e eVar, nrf.a type) {
        Object next;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = eVar.f218634b.f218638c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((nrf.d) next).f, type.a())) {
                break;
            }
        }
        nrf.d dVar = (nrf.d) next;
        if (dVar != null) {
            return dVar.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Base64Image j(UserInfo userInfo) {
        String str;
        Float f = null;
        Object[] objArr = 0;
        if (userInfo == null || (str = userInfo.i) == null) {
            return null;
        }
        return new Base64Image(str, new ImageTransformations(null, new CircleTransformation(f, (Integer) (objArr == true ? 1 : 0), false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), 4);
    }

    public static final Object k(j60.a aVar, gim.c frame) {
        if (!aVar.j()) {
            return Unit.f186387a;
        }
        eim.c cVar = new eim.c(h.b(frame));
        j60.a.v(aVar, false, new ha0.b(cVar, 1), 1);
        Object objB = cVar.b();
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objB == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB == aVar2 ? objB : Unit.f186387a;
    }

    public static final boolean l(SavingsProduct savingsProduct) {
        Object next;
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Iterator it8 = savingsProduct.f86629s.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((SavingsProduct.ProductRestriction) next).f86659a == com.revolut.feature.shared.savings.models.product.c.CROSS_CURRENCY_TOPUP_RESTRICTION) {
                break;
            }
        }
        SavingsProduct.ProductRestriction productRestriction = (SavingsProduct.ProductRestriction) next;
        boolean z = false;
        if (productRestriction != null && productRestriction.f86660b) {
            z = true;
        }
        return !z;
    }

    public static final boolean m(SavingsProduct savingsProduct) {
        Object next;
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Iterator it8 = savingsProduct.f86629s.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((SavingsProduct.ProductRestriction) next).f86659a == com.revolut.feature.shared.savings.models.product.c.SAVINGS_TO_SAVINGS_TRANSFER_RESTRICTION) {
                break;
            }
        }
        SavingsProduct.ProductRestriction productRestriction = (SavingsProduct.ProductRestriction) next;
        boolean z = false;
        if (productRestriction != null && productRestriction.f86660b) {
            z = true;
        }
        return !z;
    }

    public static final void n(g gVar, ViewController controller, Function2 tillHide, Function1 onQuit, Function2 onResult) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(tillHide, "tillHide");
        Intrinsics.checkNotNullParameter(onQuit, "onQuit");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        controller.l2(new dok.c(tillHide, atomicBoolean, onQuit, 0));
        gVar.a(controller, new a8a.a(atomicBoolean, onResult, 19));
    }

    public static final Double o(WealthMarginStatus wealthMarginStatus) throws Throwable {
        Intrinsics.checkNotNullParameter(wealthMarginStatus, "<this>");
        if (d(wealthMarginStatus) == null) {
            return null;
        }
        d dVarF = F(wealthMarginStatus);
        if (!dVarF.f(d.e)) {
            dVarF = null;
        }
        if (dVarF == null) {
            return null;
        }
        return Double.valueOf(kotlin.ranges.f.e(r0.f115082a / dVarF.f115082a, 0.0d, 1.0d));
    }

    public static final List p(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            xi0.b bVar = (xi0.b) pair.f186385a;
            xi0.b bVar2 = (xi0.b) pair.f186386b;
            if (!Intrinsics.f(bVar, bVar2) && cp5.d.E(bVar) && cp5.d.E(bVar2)) {
                linkedHashSet.add(cp5.d.d(pair));
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet = null;
        }
        if (linkedHashSet != null) {
            return zhm.d0.d1(linkedHashSet);
        }
        return null;
    }

    public static final ShopsDeeplinkOffer q(eid.m mVar, int i, String carouselId) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        String deeplink = mVar.getDeeplink();
        if (deeplink == null && (deeplink = mVar.getWebhook()) == null) {
            return null;
        }
        return new ShopsDeeplinkOffer(deeplink, mVar.getAnalyticsRef(), carouselId, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ec5.b r(com.revolut.feature.crypto.account.impl.model.CryptoAccountDto r17) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5d.b.r(com.revolut.feature.crypto.account.impl.model.CryptoAccountDto):ec5.b");
    }

    public static final ArrayList s(String str, String str2, LinkedHashMap members, List list) {
        String billId = str;
        String groupId = str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(members, "members");
        List<cr9.o> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (cr9.o oVar : list2) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            Intrinsics.checkNotNullParameter(billId, "billId");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(members, "members");
            String strD = oVar.getId();
            oq9.o nVar = (oq9.o) members.get(oVar.getOwnerId());
            if (nVar == null) {
                nVar = new oq9.n(oVar.getOwnerId(), groupId);
            }
            long jA = oVar.getAmount();
            xi0.a aVar = xi0.b.Companion;
            String strB = oVar.getCurrencyCode();
            aVar.getClass();
            d dVar = new d(jA, xi0.a.a(strB));
            jo3.a aVarC = oVar.getExchanged();
            arrayList.add(new oq9.j(strD, billId, groupId, nVar, dVar, aVarC != null ? mo3.a.o(aVarC) : null));
            billId = str;
            groupId = str2;
        }
        return arrayList;
    }

    public static final kq2.p t(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String id10 = qVar.getId();
        String name = qVar.getName();
        String country = qVar.getCountry();
        String phone = qVar.getPhone();
        String strI = qVar.getFirstName();
        String strJ = qVar.getLastName();
        Map accountFields = qVar.getAccountFields();
        if (accountFields == null) {
            accountFields = r0.g();
        }
        return new kq2.p(id10, country, name, phone, strI, strJ, accountFields);
    }

    public static final oga.e u(s sVar) {
        oga.d dVar;
        String str = sVar.f305659a;
        String str2 = sVar.f305660b;
        String str3 = sVar.f305661c;
        if (Intrinsics.f(str3, "PRIMARY")) {
            dVar = oga.d.Primary;
        } else if (Intrinsics.f(str3, "SECONDARY")) {
            dVar = oga.d.Secondary;
        } else {
            if (str3 != null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PricingPlanContextualNudgeMapper", "Unsupported action style: ".concat(str3), null, h0Var);
            }
            dVar = null;
        }
        return new oga.e(str, str2, dVar);
    }

    public static final qta.c v(rpk.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String strB = gVar.getFrom();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(strB);
        xi0.b bVarA2 = xi0.a.a(gVar.getTo());
        BigDecimal bigDecimal = new BigDecimal(gVar.getRate());
        String strA = gVar.getEodRate();
        BigDecimal bigDecimal2 = strA != null ? new BigDecimal(strA) : null;
        Boolean boolG = gVar.getIsWeekend();
        Long lE = gVar.getWeekendEndTime();
        DateTime dateTime = lE != null ? new DateTime(lE.longValue()) : null;
        Long lF = gVar.getWeekendStartTime();
        return new qta.c(bVarA, bVarA2, bigDecimal, bigDecimal2, boolG, lF != null ? new DateTime(lF.longValue()) : null, dateTime);
    }

    public static final e w(d0 d0Var) {
        String str;
        r5b.g gVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String str3 = d0Var.f294805a;
        String str4 = d0Var.f294806b;
        String str5 = d0Var.f294807c;
        List<g0> list = d0Var.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g0 g0Var : list) {
            Intrinsics.checkNotNullParameter(g0Var, str2);
            String str6 = g0Var.f294840a;
            String str7 = g0Var.f294841b;
            String str8 = g0Var.f294842c;
            String upperCase = g0Var.d.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            r5b.g[] gVarArrValues = r5b.g.values();
            int length = gVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = str2;
                    gVar = null;
                    break;
                }
                r5b.g gVar2 = gVarArrValues[i];
                str = str2;
                if (a0.z(gVar2.name(), upperCase, true)) {
                    gVar = gVar2;
                    break;
                }
                i++;
                str2 = str;
            }
            if (gVar == null) {
                gVar = r5b.g.UNKNOWN;
            }
            arrayList.add(new f(str6, str7, str8, gVar));
            str2 = str;
        }
        String str9 = d0Var.e;
        String str10 = d0Var.f;
        ld7.f fVar = d0Var.f294808g;
        return new e(str3, str4, str5, arrayList, str9, str10, fVar != null ? md7.a.a(fVar) : null);
    }

    public static final xck.b x(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        List<adk.f> list = iVar.f3391a;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (adk.f fVar : list) {
            String str = fVar.f3379a;
            String str2 = fVar.f3380b;
            String str3 = fVar.f3381c;
            e1 e1Var = fVar.d;
            String str4 = e1Var.f3376a;
            String str5 = e1Var.f3377b;
            String str6 = e1Var.f3378c;
            List<h1> list2 = e1Var.d;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i));
            for (h1 h1Var : list2) {
                arrayList2.add(new RewardInfoItem(h1Var.f3388a, h1Var.f3389b));
            }
            arrayList.add(new xck.a(str, str2, str3, new RewardInfo(str4, str5, str6, e1Var.e, e1Var.f, arrayList2)));
            i = 10;
        }
        List<adk.c> list3 = iVar.f3392b;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        for (adk.c cVar : list3) {
            arrayList3.add(new AdditionalReward(cVar.f3367a, cVar.f3368b));
        }
        Instant instant = Instant.parse(iVar.f3393c);
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        return new xck.b(arrayList, arrayList3, instant, iVar.d, iVar.e, iVar.f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final yvh.b y(w5d.a aVar) {
        yvh.h hVar;
        yvh.f fVar;
        d dVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f295100a;
        String str2 = aVar.f295103g;
        Long l2 = aVar.f;
        boolean z = aVar.f295101b;
        String str3 = aVar.f295102c;
        String str4 = aVar.e;
        String str5 = aVar.d;
        if (str5 != null) {
            switch (str5.hashCode()) {
                case -1079396548:
                    hVar = !str5.equals("CURRENT_POCKET") ? null : yvh.h.CURRENT_POCKET;
                    break;
                case -856717712:
                    hVar = !str5.equals("LOYALTY_PROFILE") ? null : yvh.h.LOYALTY_PROFILE;
                    break;
                case -4275434:
                    hVar = !str5.equals("WEALTH_PORTFOLIO") ? null : yvh.h.WEALTH_PORTFOLIO;
                    break;
                case 81443346:
                    hVar = !str5.equals("VAULT") ? null : yvh.h.VAULT;
                    break;
                case 1054531580:
                    hVar = !str5.equals("SAVINGS_POCKET") ? null : yvh.h.SAVINGS_POCKET;
                    break;
                case 1809744547:
                    hVar = !str5.equals("HOLDING") ? null : yvh.h.HOLDING;
                    break;
                case 1918674493:
                    hVar = !str5.equals("CHARITY_POCKET") ? null : yvh.h.CHARITY_POCKET;
                    break;
                default:
                    hVar = null;
                    break;
            }
        } else {
            hVar = null;
        }
        String str6 = aVar.f295105j;
        if (str6 != null) {
            switch (str6.hashCode()) {
                case -1574117832:
                    fVar = !str6.equals("SPARE_CHANGE") ? null : yvh.f.SPARE_CHANGE;
                    break;
                case -811823115:
                    fVar = !str6.equals("SPENDING_PERCENTAGE") ? null : yvh.f.SPENDING_PERCENTAGE;
                    break;
                case -247640649:
                    fVar = !str6.equals("BALANCE_ROUNDING") ? null : yvh.f.BALANCE_ROUNDING;
                    break;
                case -55182253:
                    fVar = !str6.equals("DAILY_SAVINGS") ? null : yvh.f.DAILY_SAVINGS;
                    break;
                default:
                    fVar = null;
                    break;
            }
        } else {
            fVar = null;
        }
        if (((l2 == null || str2 == null) ? null : aVar) != null) {
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            xi0.a aVar2 = xi0.b.Companion;
            if (str2 == null) {
                str2 = "";
            }
            aVar2.getClass();
            dVar = new d(jLongValue, xi0.a.a(str2));
        } else {
            dVar = null;
        }
        Float f = aVar.f295104h;
        Float f4 = aVar.i;
        String str7 = aVar.k;
        String str8 = aVar.f295106l;
        yvh.d dVar2 = yvh.d.PERSONAL;
        if (!Intrinsics.f(str8, dVar2.b())) {
            dVar2 = yvh.d.JOINT;
            if (!Intrinsics.f(str8, dVar2.b())) {
                dVar2 = yvh.d.YOUTH;
                if (!Intrinsics.f(str8, dVar2.b())) {
                    dVar2 = yvh.d.PRO;
                    if (!Intrinsics.f(str8, dVar2.b())) {
                        hx7.e.h(new IllegalStateException(j6.a.q("AutoInvestScope was not found for: ", str8)));
                        dVar2 = null;
                    }
                }
            }
        }
        Long l3 = aVar.f295107m;
        return new yvh.b(str, z, str3, str4, hVar, fVar, dVar, f, f4, str7, dVar2, l3 != null ? pu7.a.M(l3.longValue(), g0m.a.f139502a) : null);
    }

    public static final za6.b z(va6.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new za6.b(cVar.getId(), cVar.getTitle(), cVar.getCharities(), cVar.getDescription(), cVar.getBannerUrl(), cVar.getFeatured());
    }
}
