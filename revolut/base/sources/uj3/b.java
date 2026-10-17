package uj3;

import android.content.Context;
import aw0.o9;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.api.models.creditcard.WithdrawalAvailability;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProductOption;
import com.revolut.feature_travel_hotels_models.property.Distance;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import efm.e;
import efm.r;
import h93.f0;
import if6.i;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jxb.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import ll4.b0;
import oyd.t;
import pcd.x;
import x61.h;
import xei.d;
import xei.f;
import xei.g;
import xei.j;
import za7.c;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.s;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final cr9.g A(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final i B(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new i(hVar.f303022a, hVar.f303023b, hVar.f303024c, hVar.d, hVar.f, hVar.e, hVar.f303025g);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final d C(Distance distance) {
        Intrinsics.checkNotNullParameter(distance, "<this>");
        return new d(distance.f97971a, u1.g(distance.f97972b, lfi.a.f194930b));
    }

    public static final g D(OverallPrice overallPrice) {
        Intrinsics.checkNotNullParameter(overallPrice, "<this>");
        f fVarH = boh.f.H(overallPrice.f98057a);
        f fVarH2 = boh.f.H(overallPrice.f98058b);
        dj0.d dVar = overallPrice.f98059c;
        f fVarH3 = dVar != null ? boh.f.H(dVar) : null;
        ArrayList<PriceFee> arrayList = overallPrice.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PriceFee priceFee : arrayList) {
            Intrinsics.checkNotNullParameter(priceFee, "<this>");
            arrayList2.add(new j(priceFee.f98063a.name(), priceFee.f98064b, priceFee.f98065c, boh.f.H(priceFee.d)));
        }
        dj0.d dVar2 = overallPrice.e;
        return new g(fVarH, fVarH2, fVarH3, arrayList2, dVar2 != null ? boh.f.H(dVar2) : null);
    }

    public static final xei.h E(HotelsPointsRedeemOption hotelsPointsRedeemOption) {
        Intrinsics.checkNotNullParameter(hotelsPointsRedeemOption, "<this>");
        String str = hotelsPointsRedeemOption.f97975a;
        double dJ = hotelsPointsRedeemOption.f97976b.J();
        f fVarH = boh.f.H(hotelsPointsRedeemOption.f97977c);
        RevPoints revPoints = hotelsPointsRedeemOption.d;
        return new xei.h(str, dJ, fVarH, revPoints != null ? Double.valueOf(revPoints.J()) : null, hotelsPointsRedeemOption.e);
    }

    public static final b93.j F(e93.f fVar) {
        String strE;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        b93.b bVarC = fVar.c();
        int i = ka3.a.f182414a[fVar.b().ordinal()];
        if (i == 1) {
            strE = m5l.b.MAESTRO.e();
        } else if (i == 2) {
            strE = m5l.b.MASTERCARD.e();
        } else if (i == 3) {
            strE = m5l.b.VISA.e();
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Brand=" + fVar + " doesn't support yet");
            }
            strE = m5l.b.MULTIBANCO.e();
        }
        return new b93.j(bVarC, strE);
    }

    public static final b2a.a G(String str) {
        Object next;
        Iterator<E> it8 = b2a.a.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((b2a.a) next).getId(), str)) {
                break;
            }
        }
        b2a.a aVar = (b2a.a) next;
        return aVar == null ? b2a.a.UNKNOWN : aVar;
    }

    public static final ArrayList H(TravelFlightsExtraProduct travelFlightsExtraProduct) {
        Intrinsics.checkNotNullParameter(travelFlightsExtraProduct, "<this>");
        ArrayList arrayList = travelFlightsExtraProduct.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            TravelFlightsExtraProductOption travelFlightsExtraProductOption = (TravelFlightsExtraProductOption) obj2;
            if (travelFlightsExtraProductOption.f93510b && travelFlightsExtraProductOption.d != null) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final void a(RoundedBackgroundDrawable roundedBackgroundDrawable, Context context, int i, Integer num) {
        roundedBackgroundDrawable.d(num != null ? num.intValue() : kli.a.s(R$attr.uikit_colorForeground, context), i);
    }

    public static final int b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int[] iArr = {7, 3, 1};
        kotlin.ranges.b bVar = new kotlin.ranges.b('0', '9');
        int iB = q0.b(w.t(bVar, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator<Character> it8 = bVar.iterator();
        while (((vim.a) it8).f289616c) {
            Object next = ((s) it8).next();
            linkedHashMap.put(next, Integer.valueOf(((Character) next).charValue() - '0'));
        }
        kotlin.ranges.b bVar2 = new kotlin.ranges.b('A', 'Z');
        int iB2 = q0.b(w.t(bVar2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator<Character> it9 = bVar2.iterator();
        while (((vim.a) it9).f289616c) {
            linkedHashMap2.put(((s) it9).next(), Integer.valueOf(((Character) r5).charValue() - '7'));
        }
        LinkedHashMap linkedHashMapP = r0.p(linkedHashMap, linkedHashMap2);
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i2 + 1;
            Integer num = (Integer) linkedHashMapP.get(Character.valueOf(str.charAt(i)));
            arrayList.add(Integer.valueOf((num != null ? num.intValue() : 0) * iArr[i2 % 3]));
            i++;
            i2 = i3;
        }
        return d0.T0(arrayList) % 10;
    }

    public static final List c(BigDecimal veryLow, BigDecimal low, BigDecimal moderate, BigDecimal high, BigDecimal veryHigh, BigDecimal extremelyHigh) {
        Intrinsics.checkNotNullParameter(veryLow, "veryLow");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(moderate, "moderate");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(veryHigh, "veryHigh");
        Intrinsics.checkNotNullParameter(extremelyHigh, "extremelyHigh");
        return v.k(new Pair(veryLow, Integer.valueOf(R$string.screener_section_value_explainer_default_very_low)), new Pair(low, Integer.valueOf(R$string.screener_section_value_explainer_default_low)), new Pair(moderate, Integer.valueOf(R$string.screener_section_value_explainer_default_moderate)), new Pair(high, Integer.valueOf(R$string.screener_section_value_explainer_default_high)), new Pair(veryHigh, Integer.valueOf(R$string.screener_section_value_explainer_default_very_high)), new Pair(extremelyHigh, Integer.valueOf(R$string.screener_section_value_explainer_default_extremely_high)));
    }

    public static final List d(BigDecimal contracting, BigDecimal stagnant, BigDecimal slow, BigDecimal moderate, BigDecimal fast, BigDecimal rapid) {
        Intrinsics.checkNotNullParameter(contracting, "contracting");
        Intrinsics.checkNotNullParameter(stagnant, "stagnant");
        Intrinsics.checkNotNullParameter(slow, "slow");
        Intrinsics.checkNotNullParameter(moderate, "moderate");
        Intrinsics.checkNotNullParameter(fast, "fast");
        Intrinsics.checkNotNullParameter(rapid, "rapid");
        return v.k(new Pair(contracting, Integer.valueOf(R$string.screener_section_value_explainer_growth_contracting)), new Pair(stagnant, Integer.valueOf(R$string.screener_section_value_explainer_growth_stagnant)), new Pair(slow, Integer.valueOf(R$string.screener_section_value_explainer_growth_slow)), new Pair(moderate, Integer.valueOf(R$string.screener_section_value_explainer_growth_moderate)), new Pair(fast, Integer.valueOf(R$string.screener_section_value_explainer_growth_fast)), new Pair(rapid, Integer.valueOf(R$string.screener_section_value_explainer_growth_rapid)));
    }

    public static final List e(BigDecimal unprofitable, BigDecimal weak, BigDecimal average, BigDecimal good, BigDecimal strong, BigDecimal excellent) {
        Intrinsics.checkNotNullParameter(unprofitable, "unprofitable");
        Intrinsics.checkNotNullParameter(weak, "weak");
        Intrinsics.checkNotNullParameter(average, "average");
        Intrinsics.checkNotNullParameter(good, "good");
        Intrinsics.checkNotNullParameter(strong, "strong");
        Intrinsics.checkNotNullParameter(excellent, "excellent");
        return v.k(new Pair(unprofitable, Integer.valueOf(R$string.screener_section_value_explainer_profitability_unprofitable)), new Pair(weak, Integer.valueOf(R$string.screener_section_value_explainer_profitability_weak)), new Pair(average, Integer.valueOf(R$string.screener_section_value_explainer_profitability_average)), new Pair(good, Integer.valueOf(R$string.screener_section_value_explainer_profitability_good)), new Pair(strong, Integer.valueOf(R$string.screener_section_value_explainer_profitability_strong)), new Pair(excellent, Integer.valueOf(R$string.screener_section_value_explainer_profitability_excellent)));
    }

    public static final List f(BigDecimal deepValue, BigDecimal undervalued, BigDecimal fairValue, BigDecimal fullyValued, BigDecimal expensive, BigDecimal veryExpensive) {
        Intrinsics.checkNotNullParameter(deepValue, "deepValue");
        Intrinsics.checkNotNullParameter(undervalued, "undervalued");
        Intrinsics.checkNotNullParameter(fairValue, "fairValue");
        Intrinsics.checkNotNullParameter(fullyValued, "fullyValued");
        Intrinsics.checkNotNullParameter(expensive, "expensive");
        Intrinsics.checkNotNullParameter(veryExpensive, "veryExpensive");
        return v.k(new Pair(deepValue, Integer.valueOf(R$string.screener_section_value_explainer_valuation_deep_value)), new Pair(undervalued, Integer.valueOf(R$string.screener_section_value_explainer_valuation_undervalued)), new Pair(fairValue, Integer.valueOf(R$string.screener_section_value_explainer_valuation_fair_value)), new Pair(fullyValued, Integer.valueOf(R$string.screener_section_value_explainer_valuation_fully_valued)), new Pair(expensive, Integer.valueOf(R$string.screener_section_value_explainer_valuation_expensive)), new Pair(veryExpensive, Integer.valueOf(R$string.screener_section_value_explainer_valuation_very_expensive)));
    }

    public static final ArrayList g(List balanceGroups, c hiddenBalancesIdProvider, Function1 includePredicate) {
        Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
        Intrinsics.checkNotNullParameter(hiddenBalancesIdProvider, "hiddenBalancesIdProvider");
        Intrinsics.checkNotNullParameter(includePredicate, "includePredicate");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = balanceGroups.iterator();
        while (it8.hasNext()) {
            k1j.b bVarA = (k1j.b) it8.next();
            List list = bVarA.f180284c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((Boolean) includePredicate.invoke(hiddenBalancesIdProvider.b((BalanceWrapper) obj2))).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                bVarA = null;
            } else if (arrayList2.size() != bVarA.f180284c.size()) {
                bVarA = k1j.b.a(bVarA, arrayList2);
            }
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        return arrayList;
    }

    public static final ArrayList h(e93.f fVar, List plans) {
        Object next;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(plans, "plans");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : plans) {
            Iterator it8 = ((hha.d) obj2).f152290g.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((b93.j) next).f13639a, fVar.c())) {
                    break;
                }
            }
            if (next != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final CardDetailsDesignConfig i(f0 f0Var, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object obj2 = null;
        if (f0Var == null) {
            return null;
        }
        b93.b bVar = f0Var.f150114h.f13639a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (a0.z(((CardDetailsDesignConfig) next).f104700a, bVar.f13615a, true)) {
                obj2 = next;
                break;
            }
        }
        return (CardDetailsDesignConfig) obj2;
    }

    public static final Clause j(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        String str = formScreen.f63469c;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
    }

    public static final HtmlClause k(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        HtmlStringItem htmlStringItem = formScreen.k;
        if (htmlStringItem == null) {
            String str = formScreen.f63472j;
            htmlStringItem = str != null ? new HtmlStringItem(str, null) : null;
        }
        if (htmlStringItem != null) {
            if (kotlin.text.d0.W(htmlStringItem.f63481a)) {
                htmlStringItem = null;
            }
            if (htmlStringItem != null) {
                return v04.b.o(htmlStringItem, null);
            }
        }
        return null;
    }

    public static final String l(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(xVar.d, " ", xVar.e);
    }

    public static final ArrayList m(t tVar, List years) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(years, "years");
        TaxPeriod taxPeriodA = pyd.d.a(tVar);
        List list = years;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            LocalDate localDateWithYear = taxPeriodA.getFrom().withYear(iIntValue);
            LocalDate localDateWithYear2 = taxPeriodA.getFrom().isAfter(taxPeriodA.getTo()) ? taxPeriodA.getTo().withYear(iIntValue + 1) : taxPeriodA.getTo().withYear(iIntValue);
            Intrinsics.h(localDateWithYear);
            Intrinsics.h(localDateWithYear2);
            arrayList.add(new StatementPeriod(localDateWithYear, localDateWithYear2));
        }
        return arrayList;
    }

    public static final TextClause n(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        String str = formScreen.i;
        if (str == null) {
            str = "";
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final boolean o(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((BillType) it8.next()) instanceof BillType.RecurringPaymentBill) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return cp5.d.z(bVar) || cp5.d.y(bVar);
    }

    public static final boolean q(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == a.ENABLED_AND_ONBOARDED;
    }

    public static final qf1.c r(String categoryId) {
        Object next;
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Iterator<E> it8 = qf1.c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((qf1.c) next).getId(), categoryId, true)) {
                break;
            }
        }
        return (qf1.c) next;
    }

    public static r s(nyb.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l lVar = (l) jVar.f220800a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(lVar.f179128h.e(Unit.f186387a, loadingStrategy), new h8b.l(21));
    }

    public static final pfm.h t(final int i, final int i2, final Context context, final com.bumptech.glide.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        pfm.h hVar = new pfm.h(new e() { // from class: qz0.c
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
            @Override // efm.e
            public final void d(pfm.g emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                u8.g eVar = new e(atomicBoolean, emitter, 0);
                com.bumptech.glide.j jVar2 = jVar;
                jVar2.T(eVar);
                final v8.j jVarH = v8.j.h(jVar2.f26098x, i, i2);
                jVar2.S(jVarH, null, jVar2, y8.f.f311599a);
                Intrinsics.checkNotNullExpressionValue(jVarH, "preload(...)");
                final Context context2 = context;
                lfm.d.d(emitter, new lfm.b(new kfm.f() { // from class: qz0.d
                    @Override // kfm.f
                    public final void cancel() {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        com.bumptech.glide.b.d(context2).m(jVarH);
                    }
                }));
            }
        }, 0);
        Intrinsics.checkNotNullExpressionValue(hVar, "create(...)");
        return hVar;
    }

    public static final int u(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public static final CreditCardSecurityDeposit v(qo4.a aVar) {
        b0 b0Var;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strF = aVar.getPocketId();
        long maximum = aVar.getThresholds().getMaximum();
        long minimum = aVar.getThresholds().getMinimum();
        long jA = aVar.getBalance();
        xi0.a aVar2 = xi0.b.Companion;
        String strB = aVar.getCurrency();
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(strB);
        Integer numE = aVar.getMissedRepaymentDaysThreshold();
        int iIntValue = numE != null ? numE.intValue() : aVar.getMissedBillingCyclesThreshold() * 30;
        boolean zC = aVar.getHasSpendingLimit();
        qo4.f fVarI = aVar.getWithdrawalAvailability();
        WithdrawalAvailability withdrawalAvailability = fVarI != null ? new WithdrawalAvailability(mo3.a.o(fVarI.getAvailableToWithdraw()), mo3.a.o(fVarI.getRequiredDeposit())) : null;
        qo4.d dVarG = aVar.getSecurityCoverage();
        int i = dVarG == null ? -1 : on4.d.f226873a[dVarG.ordinal()];
        if (i == -1) {
            b0Var = b0.FULLY_SECURED;
        } else if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b0Var = b0.FULLY_SECURED;
        } else {
            b0Var = b0.PARTIALLY_SECURED;
        }
        return new CreditCardSecurityDeposit(strF, jA, bVarA, minimum, maximum, iIntValue, zC, withdrawalAvailability, b0Var);
    }

    public static final SplitBillLink w(f1a.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new SplitBillLink(lVar.f131211a, lVar.f131212b, lVar.f131213c, lVar.d, lVar.e, G(lVar.f), lVar.f131214g);
    }

    public static final SplitBillLinkDetails x(f1a.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new SplitBillLinkDetails(fVar.f131197a, fVar.f131198b, fVar.f131199c, fVar.d, fVar.e, fVar.f, fVar.f131200g, fVar.f131201h, fVar.i, fVar.f131202j);
    }

    public static final ArrayList y(List list) {
        ekc.c cVar;
        Iterator it8;
        String str;
        ekc.b bVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            hkc.a aVar = (hkc.a) it9.next();
            Intrinsics.checkNotNullParameter(aVar, str2);
            String strH = aVar.getEntityId();
            String strD = aVar.getBadgeType();
            if (strD != null) {
                ekc.c[] cVarArrValues = ekc.c.values();
                int length = cVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArrValues[i];
                    if (a0.z(cVar.name(), strD, true)) {
                        break;
                    }
                    i++;
                }
            } else {
                cVar = null;
            }
            String strI = aVar.getLogoUrl();
            String strC = aVar.getBackgroundImageUrl();
            String strK = aVar.getTitle();
            String strF = aVar.getDescription();
            String strJ = aVar.getLoyaltyDescription();
            ekc.c cVar2 = cVar;
            String strE = aVar.getDeepLink();
            String strA = aVar.getActivation();
            if (strA != null) {
                ekc.b[] bVarArrValues = ekc.b.values();
                int length2 = bVarArrValues.length;
                int i2 = 0;
                while (i2 < length2) {
                    bVar = bVarArrValues[i2];
                    it8 = it9;
                    str = str2;
                    if (a0.z(bVar.name(), strA, true)) {
                        break;
                    }
                    i2++;
                    it9 = it8;
                    str2 = str;
                }
                it8 = it9;
                str = str2;
                bVar = null;
            } else {
                it8 = it9;
                str = str2;
                bVar = null;
            }
            arrayList.add(new ekc.d(strH, cVar2, strI, strC, strK, strF, strJ, strE, bVar, aVar.getEndDate(), aVar.getAnalyticsRef()));
            it9 = it8;
            str2 = str;
        }
        return arrayList;
    }

    public static final ko5.g z(dp5.a0 a0Var) {
        CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        dp5.x xVar = a0Var.f116726b;
        if (xVar != null) {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            long j2 = xVar.f116822b;
            xi0.a aVar = xi0.b.Companion;
            String str = xVar.f116821a;
            aVar.getClass();
            dj0.d dVar = new dj0.d(j2, xi0.a.a(str));
            dj0.d dVar2 = new dj0.d(xVar.f116823c, xi0.a.a(str));
            Long l2 = xVar.d;
            ArrayList arrayList = null;
            dj0.d dVar3 = l2 != null ? new dj0.d(l2.longValue(), xi0.a.a(str)) : null;
            Long l3 = xVar.e;
            dj0.d dVar4 = l3 != null ? new dj0.d(l3.longValue(), xi0.a.a(str)) : null;
            dj0.d dVar5 = new dj0.d(xVar.f, xi0.a.a(str));
            List list = xVar.f116824g;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(hx7.e.r((dl5.a) it8.next()));
                }
            }
            cryptoWithdrawFeesBreakdown = new CryptoWithdrawFeesBreakdown(dVar, dVar2, dVar3, dVar4, dVar5, arrayList);
        } else {
            jo3.a aVar2 = a0Var.f116725a;
            if (aVar2 == null) {
                throw new IllegalStateException("Either networkFee or feeBreakdown must be present");
            }
            cryptoWithdrawFeesBreakdown = new CryptoWithdrawFeesBreakdown(mo3.a.o(aVar2), null, null, null, mo3.a.o(aVar2), null);
        }
        return new ko5.g(cryptoWithdrawFeesBreakdown);
    }
}
