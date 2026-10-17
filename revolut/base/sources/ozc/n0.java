package ozc;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f231300b;

    public /* synthetic */ n0(r0 r0Var, int i) {
        this.f231299a = i;
        this.f231300b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarA0;
        int i = this.f231299a;
        int i2 = 8;
        int i3 = 25;
        int i5 = 7;
        int i6 = 6;
        int i21 = 2;
        int i22 = 0;
        r0 r0Var = this.f231300b;
        switch (i) {
            case 0:
                l0 l0Var = r0Var.d;
                d dVar = r0Var.f231311c;
                h it8 = (h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                switch (q0.f231309a[it8.ordinal()]) {
                    case 1:
                        return rfm.h.f253943a;
                    case 2:
                        return te0.w.f(h.STATE);
                    case 3:
                        return te0.w.f(h.STATE);
                    case 4:
                        t tVar = (t) dVar;
                        ufm.b bVarM = efm.d0.m(Boolean.valueOf(tVar.s3()));
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        rfm.j jVar = new rfm.j(te0.w.H0(bVarM, tVar.D3()), new j0(17, new n(26)), i21);
                        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                        return jVar;
                    case 5:
                        return te0.w.f(h.EVIDENCE_LIST);
                    case 6:
                        return new ufm.i(r0Var.t(), new j0(i2, new n(21)), 1).w();
                    case 7:
                        return te0.w.f(h.FREQUENCY);
                    case 8:
                        if (((gzc.n) ((t) dVar).r3().c()).f.size() <= 1) {
                            return l0Var.b(new ox5.p(i3));
                        }
                        boolean zS = r0Var.s();
                        h hVar = h.OTHER_DOCUMENT;
                        h hVar2 = h.DOCUMENT_LIST;
                        if (!zS) {
                            hVar = hVar2;
                        }
                        return te0.w.f(hVar);
                    case 9:
                        return te0.w.f(h.RESUBMIT_SUMMARY);
                    case 10:
                        return te0.w.f(h.NOTE);
                    case 11:
                        return te0.w.f(h.STATE);
                    case 12:
                        return l0Var.b(new ox5.p(24));
                    case 13:
                        return r0Var.p();
                    case 14:
                        ufm.b bVarM2 = efm.d0.m(Boolean.valueOf(((od0.i) ((s0) ((t) dVar).f231329b).E0().get()).g() == gzc.k.EXTERNAL));
                        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                        ufm.b bVarM3 = efm.d0.m(Boolean.valueOf(((t) dVar).E3()));
                        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                        rfm.j jVar2 = new rfm.j(te0.w.H0(bVarM2, bVarM3), new j0(13, new n0(r0Var, i5)), i21);
                        Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                        return jVar2;
                    case 15:
                        return te0.w.f(h.DOCUMENT_LIST);
                    case 16:
                        efm.k kVarFirstElement = ((t) dVar).z3().firstElement();
                        j0 j0Var = new j0(10, new n0(r0Var, i6));
                        kVarFirstElement.getClass();
                        return new rfm.m(kVarFirstElement, j0Var, 0);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                List warnings = (List) obj2;
                Intrinsics.checkNotNullParameter(warnings, "warnings");
                gzc.z warning = (gzc.z) zhm.d0.d0(warnings);
                if (warning != null) {
                    t tVar2 = (t) r0Var.f231311c;
                    tVar2.getClass();
                    Intrinsics.checkNotNullParameter(warning, "warning");
                    s0 s0Var = (s0) tVar2.f231329b;
                    bVarA0 = te0.w.A0(s0Var.v.getValue(s0Var, s0.z[20]), warning);
                } else {
                    pfm.m mVar = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    bVarA0 = mVar;
                }
                ufm.b bVarM4 = efm.d0.m(Boolean.valueOf(!warnings.isEmpty()));
                Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
                return bVarA0.f(bVarM4);
            case 2:
                com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.sow_splash_income_source_added_can_add_more_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.sow_splash_income_source_added_can_add_more_subtitle, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.sow_splash_income_source_added_can_add_more_action, null, null, 14);
                FinishCommand finishCommand = new FinishCommand(10004, null, null, 6);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.sow_splash_income_source_added_can_add_more_secondary_action, null, null, 14);
                FinishCommand finishCommand2 = ((Boolean) obj2).booleanValue() ? new FinishCommand(10002, null, null, 6) : new FinishCommand(10005, null, null, 6);
                k9 k9Var = k9.FinCrime;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                r0Var.d(ActivityNavigateCommand.a(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, textLocalisedClause4, finishCommand, finishCommand2, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33258545), null, 0, 1015));
                return Unit.f186387a;
            case 3:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new pfm.h(new ne0.o(r0Var, it9, 27), 2);
            case 4:
                gzc.z zVar = (gzc.z) obj2;
                com.revolut.feature.blue_prompt.fullscreen.a aVar2 = ms2.g.Companion;
                TextClause textClause = new TextClause(zVar.f148048a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(zVar.f148049b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                BluePromptContent.MediaContent mediaContent2 = new BluePromptContent.MediaContent(new UrlImage(zVar.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524282));
                TextClause textClause3 = new TextClause(zVar.f148050c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                FinishCommand finishCommand3 = new FinishCommand(10004, null, null, 6);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
                FinishCommand finishCommand4 = new FinishCommand(10005, null, null, 6);
                k9 k9Var2 = k9.FinCrime;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                r0Var.d(ActivityNavigateCommand.a(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar2, textClause, textClause2, mediaContent2, null, textClause3, null, finishCommand3, null, null, resourceImage, finishCommand4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), 33193649), null, 0, 1015));
                return Unit.f186387a;
            case 5:
                od0.i question = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                f0d.d dVar2 = (f0d.d) question.g();
                f0d.e eVar = dVar2 != null ? dVar2.f131086c : null;
                if ((eVar == null ? -1 : q0.f231310b[eVar.ordinal()]) != 1) {
                    return te0.w.f(h.QUESTION);
                }
                r0 r0Var2 = this.f231300b;
                return r0Var2.d.a(new ht0.b0(0, r0Var2, r0.class, "getDocumentStep", "getDocumentStep()Lcom/revolut/feature/selfserve/sow/impl/ui/SowContract$Step;", 0, 17));
            case 6:
                od0.i question2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question2, "question");
                f0d.d dVar3 = (f0d.d) question2.g();
                f0d.e eVar2 = dVar3 != null ? dVar3.f131086c : null;
                return (eVar2 == null ? -1 : q0.f231310b[eVar2.ordinal()]) == 1 ? r0Var.d.b(new ox5.p(26)) : te0.w.f(h.QUESTION);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (((Boolean) pair.f186386b).booleanValue() && ((Boolean) pair.f186385a).booleanValue()) ? te0.w.f(h.BANK_STATEMENT_EVIDENCE_LIST) : r0Var.p();
            case 8:
                Boolean isOtherSourceSelected = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOtherSourceSelected, "isOtherSourceSelected");
                if (isOtherSourceSelected.booleanValue()) {
                    ufm.b bVarM5 = efm.d0.m(isOtherSourceSelected);
                    Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
                    return bVarM5;
                }
                d dVar4 = r0Var.f231311c;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                t tVar3 = (t) dVar4;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter("", "description");
                return te0.w.z0(((s0) tVar3.f231329b).B0(), "").D(isOtherSourceSelected);
            case 9:
                od0.i incomeSourceType = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(incomeSourceType, "incomeSourceType");
                boolean zD = incomeSourceType.d();
                r0Var.getClass();
                boolean zF = Intrinsics.f(incomeSourceType.g(), "OTHER");
                h hVar3 = h.DESCRIPTION;
                h hVar4 = h.FREQUENCY;
                if (!zF) {
                    hVar3 = hVar4;
                }
                return zD ? r0Var.r(hVar3) : r0Var.r(h.EVIDENCE_TYPES);
            case 10:
                FragmentNavigateCommand fragmentNavigateCommand = (FragmentNavigateCommand) obj2;
                Intrinsics.h(fragmentNavigateCommand);
                r0Var.d(fragmentNavigateCommand);
                return Unit.f186387a;
            default:
                r0 r0Var3 = this.f231300b;
                d dVar5 = r0Var3.f231311c;
                h it10 = (h) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                int i32 = 16;
                switch (q0.f231309a[it10.ordinal()]) {
                    case 1:
                        return te0.w.f(h.EVIDENCE_TYPES);
                    case 2:
                        return te0.w.f(h.STATE);
                    case 3:
                        ufm.i iVar = new ufm.i(r0Var3.t(), new j0(i32, new n0(r0Var3, i2)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return new ufm.i(iVar, new j0(i6, new n(20)), 1).w();
                    case 4:
                        return te0.w.f(h.FREQUENCY);
                    case 5:
                        boolean z = ((od0.i) ((s0) ((t) dVar5).f231329b).E0().get()).g() == gzc.k.EXTERNAL;
                        h hVar5 = h.BANK_STATEMENT_EVIDENCE_LIST;
                        h hVar6 = h.NOTE;
                        if (!z) {
                            hVar5 = hVar6;
                        }
                        return te0.w.f(hVar5);
                    case 6:
                        return te0.w.f(h.AMOUNT);
                    case 7:
                        l0 l0Var2 = r0Var3.d;
                        f0d.e questionLevel = f0d.e.EVIDENCE;
                        l0Var2.getClass();
                        Intrinsics.checkNotNullParameter(questionLevel, "questionLevel");
                        pfm.a aVar3 = new pfm.a(new rfm.o(new m1i.t(questionLevel, l0Var2, 25)), new j0(i22, new os9.t(l0Var2, questionLevel, i32)), 3);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                        rfm.e eVar3 = new rfm.e(l0Var2.a(new ht0.b0(0, r0Var3, r0.class, "getDocumentStep", "getDocumentStep()Lcom/revolut/feature/selfserve/sow/impl/ui/SowContract$Step;", 0, 16)), aVar3, 0);
                        Intrinsics.checkNotNullExpressionValue(eVar3, "andThen(...)");
                        return eVar3;
                    case 8:
                        ufm.b bVarM6 = efm.d0.m(Boolean.valueOf(((t) dVar5).E3()));
                        Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
                        rfm.j jVar3 = new rfm.j(bVarM6, new j0(11, new n(22)), i21);
                        Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                        return jVar3;
                    case 9:
                        return te0.w.f(h.RESUBMIT_SUMMARY);
                    case 10:
                        boolean zS3 = ((t) dVar5).s3();
                        h hVar7 = h.STATE;
                        h hVar8 = h.EVIDENCE_TYPES;
                        if (!zS3) {
                            hVar7 = hVar8;
                        }
                        return te0.w.f(hVar7);
                    case 11:
                        return te0.w.f(h.STATE);
                    case 12:
                        boolean zS2 = r0Var3.s();
                        h hVar9 = h.OTHER_DOCUMENT;
                        h hVar10 = h.EVIDENCE_LIST;
                        if (!zS2) {
                            hVar9 = hVar10;
                        }
                        return te0.w.f(hVar9);
                    case 13:
                        return te0.w.f(h.NOTE);
                    case 14:
                        return te0.w.f(h.SUMMARY);
                    case 15:
                        return te0.w.f(h.EVIDENCE_LIST);
                    case 16:
                        efm.k kVarFirstElement2 = ((t) dVar5).z3().firstElement();
                        j0 j0Var2 = new j0(i5, new n0(r0Var3, 5));
                        kVarFirstElement2.getClass();
                        return new rfm.m(kVarFirstElement2, j0Var2, 0);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
        }
    }
}
