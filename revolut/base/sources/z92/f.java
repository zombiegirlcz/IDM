package z92;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ar9.r;
import ar9.s;
import ar9.t;
import au0.r0;
import aw0.o9;
import aw0.u4;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupAnalytics;
import com.revolut.feature.payments.groups.models.GroupCurrencySpend;
import com.revolut.feature.payments.groups.models.GroupSettings;
import com.revolut.feature.shops.api.model.ShopsProductOffer;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentGroups;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentSection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import d0j.f0;
import d0j.g0;
import d0j.k;
import d0j.n;
import d0j.o;
import d0j.p;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.ej;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.y;
import kotlin.text.z;
import kotlinx.coroutines.flow.Flow;
import mx0.c7;
import ntj.l;
import ntj.n1;
import ntj.q1;
import ntj.u;
import okl.l1;
import oq9.m;
import org.joda.time.DateTime;
import p35.b0;
import vge.c1;
import vge.g1;
import vkm.q0;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class f {
    public static final k A(l lVar) {
        n nVar;
        p pVar;
        String str;
        f0 f0Var;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str2 = lVar.f219087a;
        String str3 = lVar.f219088b;
        String str4 = lVar.f219089c;
        String str5 = lVar.d;
        String str6 = lVar.e;
        n[] nVarArrValues = n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (a0.z(nVar.name(), str6, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = n.UNKNOWN;
        }
        n nVar2 = nVar;
        String str7 = lVar.f;
        Long l2 = lVar.f219090g;
        Instant instantOfEpochMilli = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null;
        Long l3 = lVar.f219091h;
        Instant instantOfEpochMilli2 = l3 != null ? Instant.ofEpochMilli(l3.longValue()) : null;
        Integer num = lVar.i;
        List<u> list = lVar.f219092j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (u uVar : list) {
            String str8 = uVar.f219129a;
            String str9 = uVar.f219130b;
            String str10 = uVar.f219131c;
            p[] pVarArrValues = p.values();
            Instant instant = instantOfEpochMilli2;
            int length2 = pVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    pVar = null;
                    break;
                }
                pVar = pVarArrValues[i2];
                int i3 = i2;
                int i5 = length2;
                if (a0.z(pVar.name(), str10, true)) {
                    break;
                }
                i2 = i3 + 1;
                length2 = i5;
            }
            if (pVar == null) {
                pVar = p.NOT_STARTED;
            }
            p pVar2 = pVar;
            String str11 = uVar.d;
            q1 q1Var = uVar.e;
            g0 g0Var = q1Var != null ? new g0(q1Var.f219114a) : null;
            n1 n1Var = uVar.f;
            if (n1Var != null) {
                str = str11;
                f0Var = new f0(n1Var.f219105a, n1Var.f219106b);
            } else {
                str = str11;
                f0Var = null;
            }
            arrayList.add(new o(str8, str9, pVar2, str, g0Var, f0Var, uVar.f219132g));
            instantOfEpochMilli2 = instant;
        }
        Instant instant2 = instantOfEpochMilli2;
        Boolean bool = lVar.k;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        ntj.i iVar = lVar.f219093l;
        d0j.i iVar2 = iVar != null ? new d0j.i(iVar.f219074a, iVar.f219075b) : null;
        Boolean bool2 = lVar.f219094m;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = lVar.f219095n;
        return new k(str2, str3, str4, str5, nVar2, str7, instantOfEpochMilli, instant2, num, arrayList, zBooleanValue, iVar2, zBooleanValue2, bool3 != null ? bool3.booleanValue() : true);
    }

    public static final ArrayList B(List list, List members) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(members, "members");
        List<r> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (r rVar : list2) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : members) {
                if (Intrinsics.f(rVar.f8572a, ((t) obj2).f8582b)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.add(w(rVar, arrayList2));
        }
        return arrayList;
    }

    public static final List C(List list, xi0.b bVar) {
        if (list == null) {
            return zhm.f0.f322471a;
        }
        List<ar9.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ar9.b bVar2 : list2) {
            xi0.a aVar = xi0.b.Companion;
            String strC = bVar2.getCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(strC);
            arrayList.add(new GroupCurrencySpend(new dj0.d(bVar2.getAmount(), bVarA), new dj0.d(bVar2.getAmountInBaseCurrency(), bVar), bVarA));
        }
        return arrayList;
    }

    public static final p35.e D(k55.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        jo3.a aVarD = cVar.getPrincipalAmount();
        dj0.d dVarO = aVarD != null ? mo3.a.o(aVarD) : null;
        jo3.a aVarC = cVar.getLoanAmount();
        dj0.d dVarO2 = aVarC != null ? mo3.a.o(aVarC) : null;
        jo3.a aVarB = cVar.getInterestAmount();
        dj0.d dVarO3 = aVarB != null ? mo3.a.o(aVarB) : null;
        jo3.a aVarE = cVar.getStampDutyAmount();
        dj0.d dVarO4 = aVarE != null ? mo3.a.o(aVarE) : null;
        jo3.a aVarF = cVar.getTotalAmount();
        dj0.d dVarO5 = aVarF != null ? mo3.a.o(aVarF) : null;
        jo3.a aVarA = cVar.getFeeAmountOpt();
        return new p35.e(dVarO, dVarO2, dVarO3, dVarO4, dVarO5, aVarA != null ? mo3.a.o(aVarA) : null);
    }

    public static final p35.e E(m55.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        jo3.a aVarD = aVar.getPrincipalAmount();
        dj0.d dVarO = aVarD != null ? mo3.a.o(aVarD) : null;
        jo3.a aVarC = aVar.getLoanAmount();
        dj0.d dVarO2 = aVarC != null ? mo3.a.o(aVarC) : null;
        jo3.a aVarB = aVar.getInterestAmount();
        dj0.d dVarO3 = aVarB != null ? mo3.a.o(aVarB) : null;
        jo3.a aVarE = aVar.getStampDutyAmount();
        dj0.d dVarO4 = aVarE != null ? mo3.a.o(aVarE) : null;
        jo3.a aVarF = aVar.getTotalAmount();
        dj0.d dVarO5 = aVarF != null ? mo3.a.o(aVarF) : null;
        jo3.a aVarA = aVar.getFeeAmountOpt();
        return new p35.e(dVarO, dVarO2, dVarO3, dVarO4, dVarO5, aVarA != null ? mo3.a.o(aVarA) : null);
    }

    public static final b0 F(k55.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        k55.c cVarD = pVar.getRegularBreakdown();
        p35.e eVarD = cVarD != null ? D(cVarD) : null;
        k55.c cVarB = pVar.getOverdueBreakdown();
        p35.e eVarD2 = cVarB != null ? D(cVarB) : null;
        jo3.a aVarC = pVar.getOverduePenaltyAmount();
        dj0.d dVarO = aVarC != null ? mo3.a.o(aVarC) : null;
        k55.c cVarA = pVar.getOutstandingBreakdown();
        p35.e eVarD3 = cVarA != null ? D(cVarA) : null;
        jo3.a aVarE = pVar.getStampDutyOverLateInterestAmount();
        return new b0(eVarD, eVarD2, dVarO, eVarD3, aVarE != null ? mo3.a.o(aVarE) : null, mo3.a.o(pVar.getTotalAmount()));
    }

    public static final b0 G(m55.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        m55.a aVarD = cVar.getRegularBreakdown();
        p35.e eVarE = aVarD != null ? E(aVarD) : null;
        m55.a aVarB = cVar.getOverdueBreakdown();
        p35.e eVarE2 = aVarB != null ? E(aVarB) : null;
        jo3.a aVarC = cVar.getOverduePenaltyAmount();
        dj0.d dVarO = aVarC != null ? mo3.a.o(aVarC) : null;
        m55.a aVarA = cVar.getOutstandingBreakdown();
        p35.e eVarE3 = aVarA != null ? E(aVarA) : null;
        jo3.a aVarE = cVar.getStampDutyOverLateInterestAmount();
        return new b0(eVarE, eVarE2, dVarO, eVarE3, aVarE != null ? mo3.a.o(aVarE) : null, mo3.a.o(cVar.getTotalAmount()));
    }

    public static final xp3.c H(er3.c cVar) {
        xp3.d dVar;
        xp3.d dVar2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String preference = cVar.getPreference();
        if (preference != null) {
            xp3.d[] dVarArrValues = xp3.d.values();
            int length = dVarArrValues.length;
            for (int i = 0; i < length; i++) {
                dVar = dVarArrValues[i];
                if (a0.z(dVar.name(), preference, true)) {
                    break;
                }
            }
            dVar = null;
        } else {
            dVar = null;
        }
        List<String> availableOptions = cVar.getAvailableOptions();
        ArrayList arrayList = new ArrayList();
        for (String str : availableOptions) {
            xp3.d[] dVarArrValues2 = xp3.d.values();
            int length2 = dVarArrValues2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    dVar2 = null;
                    break;
                }
                dVar2 = dVarArrValues2[i2];
                if (a0.z(dVar2.name(), str, true)) {
                    break;
                }
                i2++;
            }
            if (dVar2 == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CreditLimitIncreasePreferenceMapper", p.a.p("Unsupported ", str, " value"), null, h0Var);
                dVar2 = null;
            }
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return new xp3.c(dVar, arrayList);
    }

    public static final ArrayList I(List list) {
        List<GroupCurrencySpend> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (GroupCurrencySpend groupCurrencySpend : list2) {
            arrayList.add(new ar9.b(groupCurrencySpend.f79500a.f306286a, groupCurrencySpend.f79501b.f115082a, groupCurrencySpend.f79502c.f115082a));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final ar9.r J(com.revolut.feature.payments.groups.api.models.PaymentGroup r23) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z92.f.J(com.revolut.feature.payments.groups.api.models.PaymentGroup):ar9.r");
    }

    public static final LocalDateTime K(long j2) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(...)");
        return localDateTimeOfInstant;
    }

    public static final ArrayList L(PaymentGroup paymentGroup) {
        t tVar;
        Intrinsics.checkNotNullParameter(paymentGroup, "<this>");
        List<oq9.o> list = paymentGroup.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (oq9.o oVar : list) {
            String groupId = paymentGroup.f79285a;
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            if (oVar instanceof oq9.l) {
                ar9.u uVar = ar9.u.ACTIVE;
                oq9.l lVar = (oq9.l) oVar;
                String str = lVar.f227836a;
                s sVarB = br9.g.b(lVar.f227838c);
                s sVarB2 = br9.g.b(lVar.d);
                String str2 = lVar.e;
                String str3 = lVar.f;
                wi0.b bVar = lVar.f227839g;
                tVar = new t(str, groupId, sVarB, sVarB2, uVar, str2, str3, bVar != null ? bVar.f297794a : null, Boolean.valueOf(lVar.f227840h));
            } else {
                if (oVar instanceof m) {
                    ar9.u uVar2 = ar9.u.PENDING;
                    m mVar = (m) oVar;
                    String str4 = mVar.f227841a;
                    s sVarB3 = br9.g.b(mVar.f227843c);
                    s sVarB4 = br9.g.b(mVar.d);
                    String str5 = mVar.e;
                    String str6 = mVar.f;
                    wi0.b bVar2 = mVar.f227844g;
                    tVar = new t(str4, groupId, sVarB3, sVarB4, uVar2, str5, str6, bVar2 != null ? bVar2.f297794a : null, Boolean.valueOf(mVar.f227845h));
                } else {
                    if (!(oVar instanceof oq9.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = new t(((oq9.n) oVar).f227846a, groupId, null, null, ar9.u.UNKNOWN, null, null, null, null);
                }
            }
            arrayList.add(tVar);
        }
        return arrayList;
    }

    public static final m55.a M(p35.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        dj0.d dVar = eVar.f232619a;
        jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
        dj0.d dVar2 = eVar.f232620b;
        jo3.a aVarP2 = dVar2 != null ? mo3.a.p(dVar2) : null;
        dj0.d dVar3 = eVar.f232621c;
        jo3.a aVarP3 = dVar3 != null ? mo3.a.p(dVar3) : null;
        dj0.d dVar4 = eVar.e;
        return new m55.a(40, aVarP, aVarP2, aVarP3, dVar4 != null ? mo3.a.p(dVar4) : null);
    }

    public static final m55.c N(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        p35.e eVar = b0Var.f232606a;
        m55.a aVarM = eVar != null ? M(eVar) : null;
        p35.e eVar2 = b0Var.f232607b;
        m55.a aVarM2 = eVar2 != null ? M(eVar2) : null;
        p35.e eVar3 = b0Var.d;
        m55.a aVarM3 = eVar3 != null ? M(eVar3) : null;
        dj0.d dVar = b0Var.f232608c;
        return new m55.c(aVarM, aVarM2, aVarM3, dVar != null ? mo3.a.p(dVar) : null, mo3.a.p(b0Var.f));
    }

    public static esk.b O(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listN0 = d0.n0(str, new String[]{"|"}, 0, 6);
        return new esk.b(Integer.parseInt((String) listN0.get(1)), true, z.m((String) listN0.get(2)));
    }

    public static final String P(esk.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return "SUB_PERIOD_TAB_ID|" + bVar.f128995a + "|" + bVar.f128996b;
    }

    public static final void a(aim.e eVar, CellDetailsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (model == null) {
            return;
        }
        eVar.add(model);
    }

    public static final void b(ActionFooterView footer, ScreenContentRecyclerView screenContentRecyclerView) {
        Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(footer, "footer");
        screenContentRecyclerView.setInsetsAdjustmentsEnabled(false);
        if (footer.isLaidOut()) {
            screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingRight(), footer.getHeight());
        }
        androidx.camera.viewfinder.a aVar = new androidx.camera.viewfinder.a(screenContentRecyclerView, 4);
        footer.addOnLayoutChangeListener(aVar);
        if (screenContentRecyclerView.isAttachedToWindow()) {
            screenContentRecyclerView.addOnAttachStateChangeListener(new dok.k(screenContentRecyclerView, footer, aVar, 0));
        } else {
            footer.removeOnLayoutChangeListener(aVar);
        }
    }

    public static boolean c(boolean z, boolean z3, fgm.l lVar, su9.c cVar, Disposable disposable, ngm.n nVar) {
        if (nVar.d) {
            cVar.clear();
            disposable.dispose();
            return true;
        }
        if (!z || !z3) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        lVar.onComplete();
        return true;
    }

    public static final Flow d(List list, c1 interactor, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        if (list.isEmpty()) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        List<ProductContext> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ProductContext productContext : list2) {
            arrayList.add(nim.a.v(((g1) interactor).a(productContext, dataLoadingMode), new jeg.g(productContext, 14)));
        }
        Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
        return nim.a.v(u0.l((Flow[]) Arrays.copyOf(flowArr, flowArr.length)), new je5.n(27));
    }

    public static final ej e(int i, boolean z) {
        Float fValueOf = Float.valueOf(16.0f);
        aim.e eVarB = zhm.u.b();
        eVarB.add(new TextLocalisedClause(i, null, null, 14));
        if (z) {
            m70.a.t(t0.f186434a);
            eVarB.add(new TextClause(a0.C(" ", 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            eVarB.add(new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16));
        }
        return new ej("SMART_SEARCH_DISCLAIMER_ITEM_ID", new c7(new CompositeClause(zhm.u.a(eVarB), null, new Click(6, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) null, "SMART_SEARCH_DISCLAIMER_ITEM_ID", false), null, 10), false, null, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.f215261a.addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(su9.c r8, ahm.c r9, io.reactivex.rxjava3.disposables.Disposable r10, ngm.n r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.e
            boolean r3 = r8.isEmpty()
            r5 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            boolean r8 = c(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L13
            goto L32
        L13:
            boolean r2 = r7.e
            java.lang.Object r8 = r5.poll()
            if (r8 != 0) goto L1d
            r3 = r0
            goto L1f
        L1d:
            r9 = 0
            r3 = r9
        L1f:
            boolean r9 = c(r2, r3, r4, r5, r6, r7)
            r10 = r3
            if (r9 == 0) goto L27
            goto L32
        L27:
            if (r10 == 0) goto L38
            int r8 = -r1
            java.util.concurrent.atomic.AtomicInteger r9 = r7.f215261a
            int r1 = r9.addAndGet(r8)
            if (r1 != 0) goto L33
        L32:
            return
        L33:
            r9 = r4
            r8 = r5
            r10 = r6
            r11 = r7
            goto L2
        L38:
            r7.b(r4, r8)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: z92.f.f(su9.c, ahm.c, io.reactivex.rxjava3.disposables.Disposable, ngm.n):void");
    }

    public static final View g(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getId() == i) {
            return view;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return g(i, view2);
        }
        return null;
    }

    public static final DocumentGroup h(ApplicableDocuments applicableDocuments) {
        AlternativeDocumentSection alternativeDocumentSection;
        Intrinsics.checkNotNullParameter(applicableDocuments, "<this>");
        DocumentGroup documentGroup = (DocumentGroup) zhm.d0.d0(applicableDocuments.f105573a);
        if (documentGroup != null) {
            return documentGroup;
        }
        AlternativeDocumentGroups alternativeDocumentGroups = applicableDocuments.f105574b;
        if (alternativeDocumentGroups == null || (alternativeDocumentSection = (AlternativeDocumentSection) zhm.d0.d0(alternativeDocumentGroups.f105570a)) == null) {
            return null;
        }
        return (DocumentGroup) zhm.d0.d0(alternativeDocumentSection.f105572b);
    }

    public static final Activity i(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        return null;
    }

    public static final dj0.d j(io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new dj0.d(dVar.i, l(dVar));
    }

    public static final String k(BeneficiarySpecialPurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return j6.a.q("CACHE_KEY_SELF_BENEFICIARIES_", purpose.name());
    }

    public static final xi0.b l(io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        aVar.getClass();
        return xi0.a.a(str);
    }

    public static final int m(boolean z) {
        return z ? R$style.UiKitTheme_Mono : R$style.UiKitTheme_TransparentCompat;
    }

    public static final Clause n(uc3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (sd3.k.f261818a[dVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.cashback_source_metal_title, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.cashback_source_plan_title, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.cashback_source_rewards_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.cashback_source_stays_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.cashback_source_credit_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.cashback_source_pro_title, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.cashback_source_gifts_title, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.cashback_source_shops_title, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.cashback_source_shopping_title, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.cashback_source_travel_title, null, null, 14);
            case 11:
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final PeriodPreferenceType o(he3.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof he3.m) {
            return PeriodPreferenceType.MONTH;
        }
        if (pVar instanceof he3.n) {
            return PeriodPreferenceType.WEEK;
        }
        if (pVar instanceof he3.o) {
            return PeriodPreferenceType.YEAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean p(Instant instant, Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return instant != null && instant.isAfter(now);
    }

    public static boolean q(int i) {
        List list = (List) m70.a.k().get(Integer.valueOf(i));
        return (list == null || list.contains("001")) ? false : true;
    }

    public static boolean r(String str) {
        return !str.equals("001");
    }

    public static final l1 s(Function2 action, Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return new l1(new q0(new vkm.t0(flow, 2), new k01.i(action, null, 1), 1), 10);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.time.LocalDateTime] */
    public static final LocalDateTime t(String timeString) {
        Intrinsics.checkNotNullParameter(timeString, "timeString");
        LocalDateTime localDateTimeWithNano = Instant.parse(timeString).atZone(ZoneId.systemDefault()).toLocalDateTime().withNano(0);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWithNano, "withNano(...)");
        return localDateTimeWithNano;
    }

    public static final void u(NavBarWithBigTile navBarWithBigTile, u4 headerData) {
        Intrinsics.checkNotNullParameter(navBarWithBigTile, "<this>");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        navBarWithBigTile.setNavigationButtonIcon(headerData.f10556a);
        navBarWithBigTile.setToolbarTitle(headerData.e);
        navBarWithBigTile.setTitle(headerData.d);
        navBarWithBigTile.setIcon(headerData.f10557b, r0.DEFAULT);
        navBarWithBigTile.setBackgroundImage(headerData.f10559g);
        navBarWithBigTile.setSocialProofLabel(headerData.f);
        navBarWithBigTile.setActionStatusLabel(headerData.f10558c);
        navBarWithBigTile.setActions(headerData.f10560h);
    }

    public static final qf1.c v(TotalWealthCategoryKey totalWealthCategoryKey) {
        Intrinsics.checkNotNullParameter(totalWealthCategoryKey, "<this>");
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Cash) {
            return qf1.c.ACCOUNTS;
        }
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Savings) {
            return qf1.c.SAVE;
        }
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Credit) {
            return qf1.c.BORROW;
        }
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Invest) {
            return qf1.c.INVEST;
        }
        if (totalWealthCategoryKey instanceof TotalWealthCategoryKey.Crypto) {
            return qf1.c.CRYPTO;
        }
        if (!(totalWealthCategoryKey instanceof TotalWealthCategoryKey.Joint) && !(totalWealthCategoryKey instanceof TotalWealthCategoryKey.Pro) && !(totalWealthCategoryKey instanceof TotalWealthCategoryKey.Youth) && !(totalWealthCategoryKey instanceof TotalWealthCategoryKey.Linked)) {
            throw new NoWhenBranchMatchedException();
        }
        return qf1.c.ACCOUNTS;
    }

    public static final PaymentGroup w(r rVar, List members) {
        xi0.b bVarA;
        String str;
        oq9.a aVar;
        st9.b bVar;
        xi0.b bVarA2;
        String str2;
        String str3;
        GroupAnalytics groupAnalytics;
        dj0.d dVar;
        dj0.d dVar2;
        oq9.e bVar2;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(members, "members");
        String str4 = rVar.f8572a;
        String str5 = rVar.f8573b;
        String str6 = rVar.f8574c;
        ArrayList arrayListS = zi0.c.S(members);
        String str7 = rVar.d;
        if (str7 != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str7);
        } else {
            bVarA = null;
        }
        ar9.e eVar = rVar.e;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            ar9.f fVarA = eVar.getPersonal();
            Intrinsics.checkNotNullParameter(fVarA, "<this>");
            int i = br9.b.f17953a[fVarA.getCalculationType().ordinal()];
            if (i == 1) {
                str = str4;
                Long lD = fVarA.getOweAmount();
                if (lD != null) {
                    long jLongValue = lD.longValue();
                    xi0.a aVar2 = xi0.b.Companion;
                    String strC = fVarA.getCurrencyCode();
                    aVar2.getClass();
                    dVar = new dj0.d(jLongValue, xi0.a.a(strC));
                } else {
                    dVar = null;
                }
                Long lE = fVarA.getOwedAmount();
                if (lE != null) {
                    long jLongValue2 = lE.longValue();
                    xi0.a aVar3 = xi0.b.Companion;
                    String strC2 = fVarA.getCurrencyCode();
                    aVar3.getClass();
                    dVar2 = new dj0.d(jLongValue2, xi0.a.a(strC2));
                } else {
                    dVar2 = null;
                }
                bVar2 = new oq9.b(dVar, dVar2, v04.b.C(fVarA.getState()));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = str4;
                long jA = fVarA.getAmount();
                xi0.a aVar4 = xi0.b.Companion;
                String strC3 = fVarA.getCurrencyCode();
                aVar4.getClass();
                bVar2 = new oq9.c(new dj0.d(jA, xi0.a.a(strC3)), v04.b.C(fVarA.getState()));
            }
            ar9.i iVarB = eVar.getTotal();
            Intrinsics.checkNotNullParameter(iVarB, "<this>");
            long amount = iVarB.getAmount();
            xi0.a aVar5 = xi0.b.Companion;
            String currencyCode = iVarB.getCurrencyCode();
            aVar5.getClass();
            aVar = new oq9.a(bVar2, new oq9.f(new dj0.d(amount, xi0.a.a(currencyCode))));
        } else {
            str = str4;
            aVar = null;
        }
        boolean z = rVar.f;
        oq9.a aVar6 = aVar;
        DateTime dateTime = new DateTime(rVar.f8575g);
        Long l2 = rVar.f8576h;
        DateTime dateTime2 = l2 != null ? new DateTime(l2.longValue()) : null;
        ar9.d dVar3 = rVar.i;
        Intrinsics.checkNotNullParameter(dVar3, "<this>");
        int i2 = br9.f.f17959a[dVar3.getCalculationType().ordinal()];
        if (i2 == 1) {
            bVar = st9.b.DUMB;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = st9.b.SMART;
        }
        String baseCurrency = dVar3.getBaseCurrency();
        if (baseCurrency != null) {
            xi0.b.Companion.getClass();
            bVarA2 = xi0.a.a(baseCurrency);
        } else {
            bVarA2 = null;
        }
        GroupSettings groupSettings = new GroupSettings(bVar, bVarA2);
        ar9.a aVar7 = rVar.f8577j;
        if (aVar7 != null) {
            Intrinsics.checkNotNullParameter(aVar7, "<this>");
            xi0.a aVar8 = xi0.b.Companion;
            String strA = aVar7.getCurrency();
            aVar8.getClass();
            xi0.b bVarA3 = xi0.a.a(strA);
            str2 = str5;
            str3 = str6;
            groupAnalytics = new GroupAnalytics(new dj0.d(aVar7.getTotalSpentByGroup(), bVarA3), new dj0.d(aVar7.getTotalSpentByCurrentMember(), bVarA3), C(aVar7.getTotalSpentByGroupByCurrency(), bVarA3), C(aVar7.getTotalSpentByCurrentMemberByCurrency(), bVarA3));
        } else {
            str2 = str5;
            str3 = str6;
            groupAnalytics = null;
        }
        return new PaymentGroup(str, str2, str3, arrayListS, bVarA, aVar6, z, dateTime, dateTime2, groupSettings, groupAnalytics);
    }

    public static final ShopsProductOffer x(eid.z zVar, String carouselId) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        String id10 = zVar.getId();
        String analyticsRef = zVar.getAnalyticsRef();
        String points = zVar.getPoints();
        Double dK = points != null ? y.k(points) : null;
        String productArticleId = zVar.getProductArticleId();
        if (id10 == null || analyticsRef == null) {
            return null;
        }
        return new ShopsProductOffer(id10, productArticleId, dK, carouselId, analyticsRef);
    }

    public static final ShopsProductOffer y(sid.t tVar, String carouselId) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        String id10 = tVar.getId();
        String analyticsRef = tVar.getAnalyticsRef();
        String points = tVar.getPoints();
        Double dK = points != null ? y.k(points) : null;
        String productArticleId = tVar.getProductArticleId();
        if (id10 == null || analyticsRef == null) {
            return null;
        }
        return new ShopsProductOffer(id10, productArticleId, dK, carouselId, analyticsRef);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2 z(xfg.d r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2 r1 = new com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2
            java.lang.String r2 = r13.getId()
            java.lang.String r3 = r13.getExternalId()
            xfg.u r4 = r13.getProvider()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getId()
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = r4.getLogoUrl()
            java.lang.String r4 = r4.getUnit()
            if (r4 == 0) goto L44
            hfg.t0[] r7 = hfg.t0.values()
            int r8 = r7.length
            r9 = 0
        L2e:
            if (r9 >= r8) goto L41
            r10 = r7[r9]
            java.lang.String r11 = r10.name()
            r12 = 1
            boolean r11 = kotlin.text.a0.z(r11, r4, r12)
            if (r11 == 0) goto L3e
            goto L42
        L3e:
            int r9 = r9 + 1
            goto L2e
        L41:
            r10 = 0
        L42:
            if (r10 != 0) goto L46
        L44:
            hfg.t0 r10 = hfg.t0.MILES
        L46:
            com.revolut.feature.travel.miles.api.model.TravelMilesProviderSummary r4 = new com.revolut.feature.travel.miles.api.model.TravelMilesProviderSummary
            r4.<init>(r0, r5, r6, r10)
            java.util.List r13 = r13.getPrimaryAirlines()
            if (r13 != 0) goto L53
            zhm.f0 r13 = zhm.f0.f322471a
        L53:
            r1.<init>(r2, r3, r4, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z92.f.z(xfg.d):com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2");
    }
}
