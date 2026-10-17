package com.revolut.feature.learn.shared.impl.ui.course.overview;

import a09.w;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.learn.shared.impl.R$string;
import com.revolut.feature.learn.shared.impl.ui.course.overview.b;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import efm.r;
import g09.h;
import g09.i;
import ghk.a0;
import hy2.k;
import i09.l;
import jki.g;
import jki.p;
import k09.m;
import k09.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import u09.q;
import u09.v;
import u09.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g implements l {
    public final i09.g A;
    public final i09.a B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CourseOverviewScreenContract$InputData f78000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g09.e f78001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f78002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f78003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m09.a f78004t;
    public final l09.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k09.g f78005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f78006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l09.e f78007y;
    public final ihm.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, CourseOverviewScreenContract$InputData inputData, g09.e coursesInteractor, i lessonsInteractor, h glossaryTermsInteractor, m09.a invalidCourseTransformer, l09.a dialogMapper, j60.a bottomExpandableDialog, k09.g cryptoStartLessonExtension, m defaultStartLessonExtension, l09.e rewardsWereAlreadyClaimedPopupProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(coursesInteractor, "coursesInteractor");
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(glossaryTermsInteractor, "glossaryTermsInteractor");
        Intrinsics.checkNotNullParameter(invalidCourseTransformer, "invalidCourseTransformer");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(cryptoStartLessonExtension, "cryptoStartLessonExtension");
        Intrinsics.checkNotNullParameter(defaultStartLessonExtension, "defaultStartLessonExtension");
        Intrinsics.checkNotNullParameter(rewardsWereAlreadyClaimedPopupProvider, "rewardsWereAlreadyClaimedPopupProvider");
        this.f78000p = inputData;
        this.f78001q = coursesInteractor;
        this.f78002r = lessonsInteractor;
        this.f78003s = glossaryTermsInteractor;
        this.f78004t = invalidCourseTransformer;
        this.u = dialogMapper;
        this.v = bottomExpandableDialog;
        this.f78005w = cryptoStartLessonExtension;
        this.f78006x = defaultStartLessonExtension;
        this.f78007y = rewardsWereAlreadyClaimedPopupProvider;
        this.z = j6.a.h("create(...)");
        this.A = new i09.g(new Data(null, null, true, 3, null), false);
        this.B = new i09.a();
    }

    @Override // yji.l
    public final void I1() {
        CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData = this.f78000p;
        v domain = courseOverviewScreenContract$InputData.f77981b;
        h hVar = this.f78003s;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        w wVar = hVar.f139375a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        r rVarCompose = ue0.e.v(wVar.d.g(new a09.v(domain), false)).g(this.z.switchMap(new hy2.l(new hw9.a(this, 20), 19))).compose(this.f78004t);
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        Continuation continuation = null;
        yji.l.a1(this, new a0(rd0.e.b(rVarCompose), this, 24), null, null, new hp2.d(this, continuation, 28), 3);
        if (((i09.g) t2()).f157323a || courseOverviewScreenContract$InputData.f77982c == null) {
            return;
        }
        x2(new k(25));
        l2(new hy2.e(this, continuation, 5), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.z.onNext(Unit.f186387a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.B;
    }

    public final void y2(b event) {
        n nVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, b.c.f77996a)) {
            this.z.onNext(Unit.f186387a);
            return;
        }
        boolean z = event instanceof i09.h;
        j60.a aVar = this.v;
        if (!z) {
            if (Intrinsics.f(event, b.C0515b.f77995a)) {
                j60.a.v(aVar, false, null, 3);
                return;
            }
            if (!Intrinsics.f(event, b.a.f77994a)) {
                throw new NoWhenBranchMatchedException();
            }
            u09.f fVar = (u09.f) ((i09.g) t2()).f157324b.getContent();
            if (fVar == null || !fVar.f276119q) {
                return;
            }
            l09.f fVar2 = (l09.f) this.f78007y;
            fVar2.getClass();
            yji.l.j2(this, new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.investmentlearn_abuse_popup_title, null, null, 14), new TextLocalisedClause(R$string.investmentlearn_abuse_popup_description, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.investmentlearn_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), ((myj.g) fVar2.f191188a).e, null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            return;
        }
        q qVar = ((i09.h) event).f157325a;
        y yVar = qVar.f276149h;
        yVar.getClass();
        if (yVar == y.LOCKED) {
            this.u.getClass();
            t tVar = new t(new TextLocalisedClause(R$string.investmentlearn_locked_lesson_sheet_title, null, null, 14), new TextLocalisedClause(R$string.investmentlearn_locked_lesson_sheet_subtitle, null, null, 14), new rp0.v("DIALOG_MENU_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 24);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.investmentlearn_common_action_got_it, null, null, 14);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i = R$attr.uikit_dp16;
            int i2 = R$attr.uikit_dp24;
            aVar.x(new rp0.y(u.c(new LargeActionButtonDelegate.Model("LOCKED_DIALOG_BUTTON_GOT_IT_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i, i, 496)), tVar, null, null, null, null, 1020));
            return;
        }
        v vVar = this.f78000p.f77981b;
        switch (i09.n.f157333a[vVar.ordinal()]) {
            case 1:
                nVar = this.f78005w;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                nVar = this.f78006x;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        nVar.K1(vVar, qVar);
    }
}
