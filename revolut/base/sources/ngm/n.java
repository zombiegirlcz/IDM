package ngm;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.o9;
import com.revolut.chat_core.R$plurals;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.internal.views.ProgressPagingIndicatorView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.model.MandateConstraints;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Sender;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimerItem;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimerModal;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesTermsAndConditions;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUnlimitedCountryProfile;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUserCapabilities;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPacPortOutCredentials;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberStacPortOutCredentials;
import grl.he;
import gwi.a5;
import gwi.b4;
import gwi.d5;
import gwi.g5;
import gwi.v3;
import gwi.y3;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.lm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k1m.e0;
import kfj.c1;
import kfj.f1;
import kfj.g2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import le.u1;
import lq0.o;
import lq0.p;
import lq0.q;
import org.joda.time.DateTime;
import svi.s0;
import uvg.x;
import uvg.y;
import uvg.z;
import vkm.v1;
import xzg.o0;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public abstract class n implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f215261a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ahm.c f215262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final su9.c f215263c;
    public volatile boolean d;
    public volatile boolean e;

    public n(ahm.c cVar, su9.c cVar2) {
        this.f215262b = cVar;
        this.f215263c = cVar2;
    }

    public static final ArrayList A(on4.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List facilities = eVar.getFacilities();
        ArrayList arrayList = new ArrayList(w.t(facilities, 10));
        Iterator it8 = facilities.iterator();
        while (it8.hasNext()) {
            arrayList.add(C((on4.f) it8.next()));
        }
        return arrayList;
    }

    public static final xvg.b B(z zVar, TotalValueChartFacade totalValueChartFacade) {
        TotalValueChartFacade totalValueChartFacade2;
        TotalValueChartFacade totalValueChartFacadeA;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        x xVarB = zVar.getChart();
        TotalValueChartPointFacade totalValueChartPointFacade = null;
        if (xVarB != null) {
            DateTime dateTimeC = xVarB.getStart();
            DateTime dateTimeA = xVarB.getEnd();
            List<y> listB = xVarB.getPoints();
            ArrayList arrayList = new ArrayList(w.t(listB, 10));
            for (y yVar : listB) {
                DateTime dateTimeC2 = yVar.getTimestamp();
                dj0.d dVarO = mo3.a.o(yVar.getAmount());
                jo3.a aVarB = yVar.getCumulativeNetTopUp();
                arrayList.add(new TotalValueChartPointFacade(dVarO, aVarB != null ? mo3.a.o(aVarB) : null, dateTimeC2));
            }
            totalValueChartFacade2 = new TotalValueChartFacade(null, null, arrayList, dateTimeC, dateTimeA);
        } else {
            totalValueChartFacade2 = totalValueChartFacade;
        }
        boolean z = (totalValueChartFacade2 == null || totalValueChartFacade2.f94987c.isEmpty()) ? false : true;
        if (z) {
            Pair pairO = o((TotalValueChartPointFacade) d0.b0(totalValueChartFacade2.f94987c), (TotalValueChartPointFacade) d0.m0(totalValueChartFacade2.f94987c));
            totalValueChartFacadeA = TotalValueChartFacade.a(totalValueChartFacade2, null, null, (dj0.d) pairO.f186385a, (dj0.d) pairO.f186386b, 7);
        } else {
            totalValueChartFacadeA = totalValueChartFacade2;
        }
        y yVarC = zVar.getLivePoint();
        if (yVarC != null) {
            DateTime dateTimeC3 = yVarC.getTimestamp();
            dj0.d dVarO2 = mo3.a.o(yVarC.getAmount());
            jo3.a aVarB2 = yVarC.getCumulativeNetTopUp();
            totalValueChartPointFacade = new TotalValueChartPointFacade(dVarO2, aVarB2 != null ? mo3.a.o(aVarB2) : null, dateTimeC3);
        }
        return new xvg.b((!z || totalValueChartPointFacade == null) ? totalValueChartFacadeA : e(totalValueChartFacade2, totalValueChartPointFacade), totalValueChartFacadeA, totalValueChartPointFacade);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yw4.p C(on4.f r25) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ngm.n.C(on4.f):yw4.p");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final on4.f D(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
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
        java.lang.NullPointerException
        */

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public static final ai6.b E(Mandate mandate) {
        Intrinsics.checkNotNullParameter(mandate, "<this>");
        String str = mandate.f72224a;
        String str2 = mandate.f72225b;
        MandateConstraints mandateConstraints = mandate.f72226c;
        return new ai6.b(str, str2, new ai6.a(hx7.a.A(mandateConstraints.f72227a), hx7.a.A(mandateConstraints.f72228b), hx7.a.A(mandateConstraints.f72229c)), u1.g(mandate.d, xh6.a.f305827a), Boolean.valueOf(mandate.e));
    }

    public static final df6.a F(IndiaUpiApplications indiaUpiApplications) {
        Intrinsics.checkNotNullParameter(indiaUpiApplications, "<this>");
        List<IndiaUpiProvider> list = indiaUpiApplications.f72372a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (IndiaUpiProvider indiaUpiProvider : list) {
            Intrinsics.checkNotNullParameter(indiaUpiProvider, "<this>");
            arrayList.add(new df6.b(indiaUpiProvider.f72374a, indiaUpiProvider.f72375b, indiaUpiProvider.f72376c, indiaUpiProvider.d));
        }
        List<IndiaUpiProvider> list2 = indiaUpiApplications.f72373b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (IndiaUpiProvider indiaUpiProvider2 : list2) {
            Intrinsics.checkNotNullParameter(indiaUpiProvider2, "<this>");
            arrayList2.add(new df6.b(indiaUpiProvider2.f72374a, indiaUpiProvider2.f72375b, indiaUpiProvider2.f72376c, indiaUpiProvider2.d));
        }
        return new df6.a(arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public static final Map G(dkg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Pair pair = new Pair("theme", aVar.f115516a.getF94454a());
        xjg.j jVar = aVar.f115518c;
        akg.b.Companion.getClass();
        return r0.k(pair, new Pair("accent", u1.g(jVar, akg.a.f5929c)), new Pair("light_dark_mode", u1.g(aVar.f115517b, akg.a.f5928b)));
    }

    public static final xvg.b H(TotalValueChartFacade totalValueChartFacade, TotalValueChartPointFacade totalValueChartPointFacade) {
        Intrinsics.checkNotNullParameter(totalValueChartFacade, "<this>");
        return new xvg.b((totalValueChartPointFacade == null || totalValueChartFacade.f94987c.isEmpty()) ? totalValueChartFacade : e(totalValueChartFacade, totalValueChartPointFacade), totalValueChartFacade, totalValueChartPointFacade);
    }

    public static final String I(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return jli.g.e(kotlin.text.d0.F0(lowerCase).toString());
    }

    public static final kq8.g J(JuniorBlockInboundTransferNavigation$Sender juniorBlockInboundTransferNavigation$Sender, boolean z) {
        Intrinsics.checkNotNullParameter(juniorBlockInboundTransferNavigation$Sender, "<this>");
        return new kq8.g(juniorBlockInboundTransferNavigation$Sender.f, juniorBlockInboundTransferNavigation$Sender.f77416g, juniorBlockInboundTransferNavigation$Sender.f77413a, juniorBlockInboundTransferNavigation$Sender.f77414b, juniorBlockInboundTransferNavigation$Sender.f77415c, juniorBlockInboundTransferNavigation$Sender.d, juniorBlockInboundTransferNavigation$Sender.e, z);
    }

    public static final v1 K(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new v1(new iji.d(2, (Continuation) null, block));
    }

    public static k1m.l a(e0 e0Var, Class cls, String str) {
        k1m.l lVarB = e0Var.b(cls, h0.f322473a, str);
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        return lVarB;
    }

    public static final String c(yj1.e eVar) {
        if (eVar instanceof yj1.c) {
            return j6.a.q("AIR_TIP_LEARN_SECURITY_", ((yj1.c) eVar).f314377a);
        }
        if (!(eVar instanceof yj1.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return "AIR_TIP_LEARN_PRODUCT_TYPE_" + ((yj1.b) eVar).f314376a;
    }

    public static final lm d() {
        int i = R$attr.uikit_colorPlanUltraDark_30;
        int i2 = R$attr.uikit_colorTransparent;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        return new lm(new UiKitGradient(new int[]{R$attr.uikit_colorPlanUltraDark_40, R$attr.uikit_colorPlanUltraLight_40, R$attr.uikit_colorPlanUltraMid_40, R$attr.uikit_colorPlanUltraLightBlue_40}, new float[]{0.2f, 0.5f, 0.8f, 1.0f}, GradientDrawable.Orientation.BL_TR), new UiKitGradient(i, i2));
    }

    public static final TotalValueChartFacade e(TotalValueChartFacade totalValueChartFacade, TotalValueChartPointFacade livePoint) {
        Intrinsics.checkNotNullParameter(totalValueChartFacade, "<this>");
        Intrinsics.checkNotNullParameter(livePoint, "livePoint");
        ArrayList arrayListF0 = d0.F0(livePoint, totalValueChartFacade.f94987c);
        Pair pairO = o((TotalValueChartPointFacade) d0.b0(arrayListF0), (TotalValueChartPointFacade) d0.m0(arrayListF0));
        return TotalValueChartFacade.a(totalValueChartFacade, livePoint.f94988a, arrayListF0, (dj0.d) pairO.f186385a, (dj0.d) pairO.f186386b, 1);
    }

    public static final Clause f(v20.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List uploads = cVar.getUploads();
        int i = 0;
        if (!(uploads instanceof Collection) || !uploads.isEmpty()) {
            Iterator it8 = uploads.iterator();
            while (it8.hasNext()) {
                if (z50.k.d(((v20.a) it8.next()).getUpload().getMediaType()) && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        int size = cVar.getUploads().size() - i;
        if (i > 0 && size > 0) {
            return new TextLocalisedClause(R$string.chat_message_attachment_preview_mixed_count, v.k(new TextLocalisedQuantityClause(R$plurals.chat_message_attachment_preview_photos_count, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), new TextLocalisedQuantityClause(R$plurals.chat_message_attachment_preview_files_count, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24)), null, 12);
        }
        if (i == 1) {
            return new TextLocalisedClause(R$string.chat_message_file_photo, null, null, 14);
        }
        if (i > 1) {
            int i2 = i;
            return new TextLocalisedQuantityClause(R$plurals.chat_message_attachment_preview_photos_count, Integer.valueOf(i2), u.c(Integer.valueOf(i2)), (Style) null, 24);
        }
        if (size != 1) {
            return new TextLocalisedQuantityClause(R$plurals.chat_message_attachment_preview_files_count, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24);
        }
        String strD = ((v20.a) d0.b0(cVar.getUploads())).getUpload().getFileName();
        return (strD == null || strD.length() == 0) ? new TextLocalisedClause(R$string.chat_message_file, null, null, 14) : new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final FragmentNavigateCommand g(FragmentNavigateCommand fragmentNavigateCommand) {
        Intrinsics.checkNotNullParameter(fragmentNavigateCommand, "<this>");
        return FragmentNavigateCommand.a(fragmentNavigateCommand, R$anim.slide_in_end, R$anim.slide_out_start, R$anim.slide_in_start, R$anim.slide_out_end, 1087);
    }

    public static final FragmentNavigateCommand h(FragmentNavigateCommand fragmentNavigateCommand) {
        Intrinsics.checkNotNullParameter(fragmentNavigateCommand, "<this>");
        return FragmentNavigateCommand.a(fragmentNavigateCommand, R$anim.slide_in_start, R$anim.slide_out_end, R$anim.slide_in_end, R$anim.slide_out_start, 1087);
    }

    public static final List i() {
        Float fValueOf = Float.valueOf(29.46f);
        Float fValueOf2 = Float.valueOf(32.97f);
        Float fValueOf3 = Float.valueOf(35.59f);
        Float fValueOf4 = Float.valueOf(32.09f);
        Float fValueOf5 = Float.valueOf(29.96f);
        Float fValueOf6 = Float.valueOf(34.88f);
        return v.k(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf4, fValueOf6, Float.valueOf(38.78f), Float.valueOf(38.77f), fValueOf6, Float.valueOf(30.69f), Float.valueOf(26.3f), Float.valueOf(26.93f), Float.valueOf(29.18f), Float.valueOf(23.32f), Float.valueOf(16.3f), Float.valueOf(7.61f), Float.valueOf(0.35f), Float.valueOf(3.11f), Float.valueOf(7.54f), Float.valueOf(16.98f), Float.valueOf(22.48f), Float.valueOf(21.43f), Float.valueOf(25.81f), Float.valueOf(35.64f), Float.valueOf(42.18f), Float.valueOf(46.74f), Float.valueOf(39.72f), Float.valueOf(28.84f), Float.valueOf(37.0f), Float.valueOf(47.88f));
    }

    public static final p m(ax0.c out, ax0.b into, boolean z) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(into, "into");
        ConstraintLayout hostView = into.f10820a.getHostView();
        ActionFooterView actionFooterView = into.f10820a.getActionFooterView();
        if (z) {
            out.e.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        aim.e eVarB = u.b();
        UIKitTextView uIKitTextView = out.f10824b;
        ProgressPagingIndicatorView progressPagingIndicatorView = out.f;
        mif.e0.d(eVarB, uIKitTextView);
        mif.e0.d(eVarB, out.f10825c);
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        mif.e0.d(eVarB2, into.f10821b);
        mif.e0.d(eVarB2, into.f10822c);
        aim.e eVarA2 = u.a(eVarB2);
        aim.e eVarB3 = u.b();
        eVarB3.addAll(eVarA);
        eVarB3.addAll(eVarA2);
        eVarB3.add(actionFooterView);
        eVarB3.add(progressPagingIndicatorView);
        aim.e eVarA3 = u.a(eVarB3);
        lq0.d dVar = z ? lq0.d.BOTTOM_TO_TOP : lq0.d.TOP_TO_BOTTOM;
        q qVar = new q();
        lq0.e eVar = new lq0.e(hostView, dVar);
        eVar.a(actionFooterView);
        qVar.m(eVar);
        lq0.f fVar = new lq0.f();
        ListIterator listIterator = eVarA3.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            fVar.a((View) bVar.next());
        }
        qVar.m(fVar);
        if (z) {
            ListIterator listIterator2 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar2 = (aim.b) listIterator2;
                if (!bVar2.hasNext()) {
                    break;
                }
                ((View) bVar2.next()).setVisibility(0);
            }
            ListIterator listIterator3 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar3 = (aim.b) listIterator3;
                if (!bVar3.hasNext()) {
                    break;
                }
                ((View) bVar3.next()).setVisibility(8);
            }
            actionFooterView.setVisibility(8);
            progressPagingIndicatorView.setVisibility(0);
        } else {
            ListIterator listIterator4 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar4 = (aim.b) listIterator4;
                if (!bVar4.hasNext()) {
                    break;
                }
                ((View) bVar4.next()).setVisibility(8);
            }
            ListIterator listIterator5 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar5 = (aim.b) listIterator5;
                if (!bVar5.hasNext()) {
                    break;
                }
                ((View) bVar5.next()).setVisibility(0);
            }
            actionFooterView.setVisibility(0);
            progressPagingIndicatorView.setVisibility(8);
        }
        p.Companion.getClass();
        p pVarA = o.a(hostView, qVar);
        if (z) {
            ListIterator listIterator6 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar6 = (aim.b) listIterator6;
                if (!bVar6.hasNext()) {
                    break;
                }
                ((View) bVar6.next()).setVisibility(8);
            }
            ListIterator listIterator7 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar7 = (aim.b) listIterator7;
                if (!bVar7.hasNext()) {
                    actionFooterView.setVisibility(0);
                    progressPagingIndicatorView.setVisibility(8);
                    return pVarA;
                }
                ((View) bVar7.next()).setVisibility(0);
            }
        } else {
            ListIterator listIterator8 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar8 = (aim.b) listIterator8;
                if (!bVar8.hasNext()) {
                    break;
                }
                ((View) bVar8.next()).setVisibility(0);
            }
            ListIterator listIterator9 = eVarA2.listIterator(0);
            while (true) {
                aim.b bVar9 = (aim.b) listIterator9;
                if (!bVar9.hasNext()) {
                    actionFooterView.setVisibility(8);
                    progressPagingIndicatorView.setVisibility(0);
                    return pVarA;
                }
                ((View) bVar9.next()).setVisibility(8);
            }
        }
    }

    public static final String n(vd8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(aVar.f287814b, " ", aVar.f287815c);
    }

    public static final Pair o(TotalValueChartPointFacade totalValueChartPointFacade, TotalValueChartPointFacade totalValueChartPointFacade2) {
        return new Pair(totalValueChartPointFacade2.f94990c, pyd.c.H(pyd.c.H(totalValueChartPointFacade2.f94989b, totalValueChartPointFacade.f94989b), pyd.c.H(pyd.c.M(totalValueChartPointFacade2.f94990c), pyd.c.M(totalValueChartPointFacade.f94990c))));
    }

    public static final boolean p(yt8.i iVar) {
        return iVar == yt8.i.PASSED;
    }

    public static final boolean q(yt8.i iVar) {
        return iVar == yt8.i.PENDING;
    }

    public static final boolean r(yt8.i iVar) {
        return iVar == yt8.i.FAILED || iVar == yt8.i.NONE;
    }

    public static final void s(WebView webView, qod.c params) throws IOException {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        String strValueOf = String.valueOf(params.f.intValue());
        if (strValueOf == null) {
            strValueOf = "0";
        }
        String strA = params.f248158a.a();
        String strK0 = d0.k0(params.f248159b, ",", "[", "]", 0, new qnd.c(14), 24);
        String str = params.f248160c;
        boolean z = params.e;
        boolean z3 = params.d;
        StringBuilder sbM = v0.a.m("\n    {\n        quality: '", strA, "',\n        activeCountries: ", strK0, ",\n        initiallyFocusedCountry: '");
        sbM.append(str);
        sbM.append("',\n        skipRevealAnimation: ");
        sbM.append(z);
        sbM.append(",\n        selectInitiallyFocusedCountry: ");
        sbM.append(z3);
        sbM.append(",\n        topOffset: ");
        sbM.append(strValueOf);
        sbM.append("\n    }\n    ");
        webView.evaluateJavascript(t.e("\n    window.onCountrySelected(\n        function(countryCode) {\n            window.Android.onCountrySelected(countryCode);\n        }\n    );\n    try {\n        window.onGlobeError(\n            function(error, context) {\n                window.Android.onErrorCaught(error, context);\n            }\n        );\n    } catch (error) {\n    }\n    window.load(\n        " + t.e(sbM.toString()) + ",\n        function(success) {\n            if (success) {\n                window.Android.onGlobeReady(true);\n            } else {\n                window.Android.onGlobeReady(false);\n            }\n        }\n    );\n    "), null);
    }

    public static final Pair t(AlertItem alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "<this>");
        return new Pair(alertItem.getF86877b().f86863a, alertItem.getF86878c());
    }

    public static final he u(o0 o0Var) {
        switch (o0Var == null ? -1 : wke.a.f298272a[o0Var.ordinal()]) {
            case -1:
            case 7:
            case 8:
                return he.NOT_AVAILABLE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return he.NOT_ONBOARDED;
            case 2:
                return he.PENDING;
            case 3:
                return he.ACTIVE;
            case 4:
            case 5:
            case 6:
                return he.OFFBOARDING;
        }
    }

    public static final String v(e8h.e0 e0Var) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        int i = d7h.b.f111967a[e0Var.f123682a.ordinal()];
        if (i == 1) {
            str = "STOCK";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "CRYPTO";
        }
        int i2 = d7h.b.f111968b[e0Var.f123683b.ordinal()];
        if (i2 == 1) {
            str2 = "OneDay";
        } else if (i2 == 2) {
            str2 = "OneMonth";
        } else if (i2 == 3) {
            str2 = "OneWeek";
        } else if (i2 == 4) {
            str2 = "OneYear";
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "FiveYears";
        }
        return p.a.p("TOP_MOVERS_PREFIX_", str, str2);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public static final Mandate w(ai6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strB = bVar.getId();
        String strC = bVar.getInstitutionId();
        ai6.a aVarA = bVar.getConstraints();
        MandateConstraints mandateConstraints = new MandateConstraints(hx7.a.v(aVarA.getMaximumIndividualLimit()), hx7.a.v(aVarA.getMaximumMonthlyLimit()), hx7.a.v(aVarA.getUsedMonthlyLimit()));
        qe6.c cVar = (qe6.c) u1.t(bVar.getState(), qe6.c.UNKNOWN, xh6.a.f305827a);
        Boolean boolD = bVar.getReplaceable();
        return new Mandate(strB, strC, mandateConstraints, cVar, boolD != null ? boolD.booleanValue() : true);
    }

    public static final IndiaUpiApplications x(df6.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<df6.b> listB = aVar.getPopular();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (df6.b bVar : listB) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new IndiaUpiProvider(bVar.getId(), bVar.getName(), bVar.getLogo(), bVar.getAndroidPackage(), false));
        }
        List<df6.b> listA = aVar.getOthers();
        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
        for (df6.b bVar2 : listA) {
            Intrinsics.checkNotNullParameter(bVar2, "<this>");
            arrayList2.add(new IndiaUpiProvider(bVar2.getId(), bVar2.getName(), bVar2.getLogo(), bVar2.getAndroidPackage(), false));
        }
        return new IndiaUpiApplications(arrayList, arrayList2);
    }

    public static final AirportLoungesUserCapabilities y(g5 g5Var) {
        AirportLoungesTermsAndConditions airportLoungesTermsAndConditions;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(g5Var, "<this>");
        List<d5> list = g5Var.f147403a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d5 d5Var : list) {
            Intrinsics.checkNotNullParameter(d5Var, "<this>");
            arrayList.add(new AirportLoungesUnlimitedCountryProfile(d5Var.f147374a, d5Var.f147375b));
        }
        String str2 = g5Var.f147404b;
        Boolean bool = g5Var.f147405c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = g5Var.d;
        a5 a5Var = g5Var.e;
        AirportLoungesDisclaimer airportLoungesDisclaimer = null;
        if (a5Var != null) {
            Intrinsics.checkNotNullParameter(a5Var, "<this>");
            ParameterisedHyperTextContent parameterisedHyperTextContentB = md7.a.b(a5Var.f147339a);
            ld7.c cVar = a5Var.f147340b;
            ParameterisedHyperTextContent parameterisedHyperTextContentB2 = cVar != null ? md7.a.b(cVar) : null;
            ld7.c cVar2 = a5Var.f147341c;
            ParameterisedHyperTextContent parameterisedHyperTextContentB3 = cVar2 != null ? md7.a.b(cVar2) : null;
            ld7.c cVar3 = a5Var.d;
            ParameterisedHyperTextContent parameterisedHyperTextContentB4 = cVar3 != null ? md7.a.b(cVar3) : null;
            ld7.c cVar4 = a5Var.e;
            airportLoungesTermsAndConditions = new AirportLoungesTermsAndConditions(parameterisedHyperTextContentB, parameterisedHyperTextContentB2, parameterisedHyperTextContentB3, parameterisedHyperTextContentB4, cVar4 != null ? md7.a.b(cVar4) : null);
        } else {
            airportLoungesTermsAndConditions = null;
        }
        v3 v3Var = g5Var.f;
        if (v3Var != null) {
            Intrinsics.checkNotNullParameter(v3Var, "<this>");
            String str4 = v3Var.d;
            s0 s0Var = Intrinsics.f(str4, "STRICT") ? s0.STRICT : Intrinsics.f(str4, "LOOSE") ? s0.LOOSE : null;
            if (s0Var != null) {
                String str5 = v3Var.f147539a;
                b4 b4Var = v3Var.f147540b;
                Intrinsics.checkNotNullParameter(b4Var, "<this>");
                String str6 = b4Var.f147350a;
                ParameterisedHyperText parameterisedHyperTextA = md7.a.a(b4Var.f147351b);
                List list2 = b4Var.f147352c;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    y3 y3Var = (y3) it8.next();
                    Intrinsics.checkNotNullParameter(y3Var, str);
                    arrayList2.add(new AirportLoungesDisclaimerItem(y3Var.f147569a, y3Var.f147570b, md7.a.a(y3Var.f147571c)));
                    it8 = it8;
                    str = str;
                }
                airportLoungesDisclaimer = new AirportLoungesDisclaimer(str5, new AirportLoungesDisclaimerModal(str6, parameterisedHyperTextA, arrayList2), v3Var.f147541c, s0Var);
            }
        }
        return new AirportLoungesUserCapabilities(arrayList, str2, zBooleanValue, str3, airportLoungesTermsAndConditions, airportLoungesDisclaimer);
    }

    public static final EsimPhoneNumberPortOutCredentials z(f1 f1Var) {
        EsimPhoneNumberPacPortOutCredentials esimPhoneNumberPacPortOutCredentials;
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        c1 pac2 = f1Var.getPac();
        EsimPhoneNumberStacPortOutCredentials esimPhoneNumberStacPortOutCredentials = null;
        if (pac2 != null) {
            Intrinsics.checkNotNullParameter(pac2, "<this>");
            esimPhoneNumberPacPortOutCredentials = new EsimPhoneNumberPacPortOutCredentials(pac2.getCode());
        } else {
            esimPhoneNumberPacPortOutCredentials = null;
        }
        g2 stac = f1Var.getStac();
        if (stac != null) {
            Intrinsics.checkNotNullParameter(stac, "<this>");
            esimPhoneNumberStacPortOutCredentials = new EsimPhoneNumberStacPortOutCredentials(stac.getCode());
        }
        return new EsimPhoneNumberPortOutCredentials(esimPhoneNumberPacPortOutCredentials, esimPhoneNumberStacPortOutCredentials);
    }

    public abstract void b(fgm.l lVar, Object obj2);

    public final boolean j() {
        return this.f215261a.getAndIncrement() == 0;
    }

    public final void k(Object obj2, Disposable disposable) {
        AtomicInteger atomicInteger = this.f215261a;
        int i = atomicInteger.get();
        ahm.c cVar = this.f215262b;
        su9.c cVar2 = this.f215263c;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            b(cVar, obj2);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            cVar2.offer(obj2);
            if (!j()) {
                return;
            }
        }
        z92.f.f(cVar2, cVar, disposable, this);
    }

    public final void l(Object obj2, Disposable disposable) {
        AtomicInteger atomicInteger = this.f215261a;
        int i = atomicInteger.get();
        ahm.c cVar = this.f215262b;
        su9.c cVar2 = this.f215263c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            cVar2.offer(obj2);
            if (!j()) {
                return;
            }
        } else if (cVar2.isEmpty()) {
            b(cVar, obj2);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            cVar2.offer(obj2);
        }
        z92.f.f(cVar2, cVar, disposable, this);
    }
}
