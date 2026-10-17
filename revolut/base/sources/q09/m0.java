package q09;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.learn.shared.impl.R$string;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import ip0.aj0;
import ip0.gj0;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.u0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends jki.g implements d0 {
    public static final Set B;

    @NotNull
    public static final i0 Companion = new i0();
    public final l A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g09.i f241197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g09.e f241198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LessonScreenContract$InputData f241199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t09.h f241200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t09.g f241201t;
    public final j60.a u;
    public final s09.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s09.k f241202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ihm.b f241203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public gj0 f241204y;
    public final z1 z;

    static {
        Integer[] elements = {2001, 2002};
        Intrinsics.checkNotNullParameter(elements, "elements");
        B = kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(g09.i lessonsInteractor, g09.e coursesInteractor, LessonScreenContract$InputData inputData, t09.h subtitlesMapper, t09.g videoErrorMapper, j60.a bottomExpandableDialog, s09.d localDeeplinkExtension, s09.k quizExtension, jki.p stateMapper, qd0.b languageProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(coursesInteractor, "coursesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subtitlesMapper, "subtitlesMapper");
        Intrinsics.checkNotNullParameter(videoErrorMapper, "videoErrorMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(localDeeplinkExtension, "localDeeplinkExtension");
        Intrinsics.checkNotNullParameter(quizExtension, "quizExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f241197p = lessonsInteractor;
        this.f241198q = coursesInteractor;
        this.f241199r = inputData;
        this.f241200s = subtitlesMapper;
        this.f241201t = videoErrorMapper;
        this.u = bottomExpandableDialog;
        this.v = localDeeplinkExtension;
        this.f241202w = quizExtension;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f241203x = bVarE;
        this.z = vkm.q.b(1, 5, null);
        this.A = new l(new Data(null, null, true, 3, null), r0.g(), new aj0(zhm.v.k(((s80.b) languageProvider).a(), Locale.UK)));
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarSwitchMap = this.f241203x.switchMap(new c(4, new h0(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, new pkg.e(rd0.e.b(rVarSwitchMap), this, 5), null, null, new k0(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(q09.x r27) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q09.m0.y2(q09.x):void");
    }

    public final void z2(oz0.a aVar) {
        nii.m0 zVar;
        boolean zContains = B.contains(Integer.valueOf(aVar.f231097a));
        t09.g gVar = this.f241201t;
        if (zContains) {
            gVar.getClass();
            zVar = new nii.e0((Clause) new TextLocalisedClause(R$string.investmentlearn_start_lesson_error_no_internet, null, null, 14), (Clause) new TextLocalisedClause(R$string.investmentlearn_start_lesson_error_no_internet_subtitle, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020);
        } else {
            gVar.getClass();
            zVar = new nii.z(new TextLocalisedClause(R$string.investmentlearn_video_player_error_title, null, null, 14), new TextLocalisedClause(R$string.investmentlearn_video_player_error_description, null, null, 14), new TextLocalisedClause(R$string.investmentlearn_video_player_error_view_summary, null, null, 14), null, null, null, false, null, null, null, u0.SAD, null, null, 28660);
        }
        yji.l.b1(this, X1(new y0("video_error", zVar, false, 4)), null, new k0(this, null, 1), 3);
    }
}
