package fwf;

import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$ScheduleTab;
import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import te0.w;
import u09.v;
import zhm.d0;
import zhm.r0;
import zw7.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138636a;

    public /* synthetic */ n(int i) {
        this.f138636a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138636a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 1:
                zm0.a passcodeMetadata = (zm0.a) obj2;
                Intrinsics.checkNotNullParameter(passcodeMetadata, "passcodeMetadata");
                if (passcodeMetadata.f323318a == null) {
                    r6.b.D("Passcode has not been saved during sign-in/sign-up");
                }
                return Unit.f186387a;
            case 2:
                mm0.o session = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(session, "session");
                return session instanceof mm0.p ? w.j(m0j.a.IN_PROGRESS) : session instanceof mm0.m ? w.j(m0j.a.NOT_STARTED) : w.j(m0j.a.FINISHED);
            case 3:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("row-loading-", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 4:
                fx5.e updateState = (fx5.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return fx5.e.a(updateState, r0.g(), null, 2);
            case 5:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 6:
                List notifications = (List) obj2;
                Intrinsics.checkNotNullParameter(notifications, "notifications");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : notifications) {
                    switch (fx7.h.f138764a[((f0) obj3).f325779a.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            arrayList.add(obj3);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return arrayList;
            case 7:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return new fxc.m((List) getDefaultLoadingItems3.invoke());
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new fxc.h((List) pair.f186385a, do3.q.y((do3.n) pair.f186386b));
            case 9:
                od0.i optionalCustomisation = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalCustomisation, "optionalCustomisation");
                e93.n nVar = (e93.n) optionalCustomisation.f224257a;
                return Optional.ofNullable(nVar != null ? nVar.d : null);
            case 10:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.u.c(new yl("PORTFOLIO_INSIGHTS_WIDGET_LOADING_LIST_ID", 0, 30));
            case 11:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 12:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 13:
                fy6.i update = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return fy6.i.a(update, null, null, null, InvoicePaymentScheduleScreenContract$ScheduleTab.OneTime.f73903a, 7);
            case 14:
                fy6.i update2 = (fy6.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return fy6.i.a(update2, null, null, null, InvoicePaymentScheduleScreenContract$ScheduleTab.Recurring.f73904a, 7);
            case 15:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                Json.d = false;
                Json.e = false;
                return Unit.f186387a;
            case 16:
                fz6.h update3 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return fz6.h.a(update3, null, null, null, null, null, null, true, 63);
            case 17:
                fz6.h update4 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List list = update4.d;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return fz6.h.a(update4, null, null, null, d0.F0(new InvoiceTemplate.CustomField("", ""), list), null, null, false, LDSFile.EF_SOD_TAG);
            case 18:
                fz6.h update5 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return fz6.h.a(update5, null, null, null, null, null, update5.f139111a.k, false, 95);
            case 19:
                fz6.h update6 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return fz6.h.a(update6, null, null, null, null, update6.f139111a.f86402j, null, false, LDSFile.EF_DG15_TAG);
            case 20:
                fz6.h update7 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return fz6.h.a(update7, null, null, update7.f139111a.d, null, null, null, false, 123);
            case 21:
                fz6.h update8 = (fz6.h) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return fz6.h.a(update8, null, update8.f139111a.i, null, null, null, null, false, ISO781611.SMT_TAG);
            case 22:
                fzd.j update9 = (fzd.j) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return fzd.j.a(update9, new Data(null, null, true, 3, null), null, 2);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    arrayList2.add(new s7(a0.d.n("LOADING_SETTING_ID_", it11.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                IntRange intRange2 = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRange2, 10));
                vim.f it12 = intRange2.iterator();
                while (it12.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("LOADING_PRODUCTS_ID_", it12.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new fzd.m(zhm.u.a(eVarB));
            case 24:
                g03.a it13 = (g03.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 25:
                Function0 getDefaultLoadingItems4 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems4, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems4.invoke();
            case 26:
                u09.f course = (u09.f) obj2;
                Intrinsics.checkNotNullParameter(course, "course");
                List lessons = d0.P0(course.f276114j, new g09.c());
                String id10 = course.f276109a;
                String title = course.f276110b;
                LearnReward reward = course.f276111c;
                String thumbnail = course.d;
                u09.l state = course.e;
                u09.k mode = course.f;
                v domain = course.f276112g;
                String description = course.f276113h;
                int i2 = course.i;
                List lessonsProgress = course.k;
                boolean z = course.f276115l;
                List tags = course.f276116m;
                String str = course.f276117n;
                u09.o oVar = course.o;
                List list2 = course.f276118p;
                boolean z3 = course.f276119q;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(reward, "reward");
                Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(domain, "domain");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(lessons, "lessons");
                Intrinsics.checkNotNullParameter(lessonsProgress, "lessonsProgress");
                Intrinsics.checkNotNullParameter(tags, "tags");
                return new u09.f(id10, title, reward, thumbnail, state, mode, domain, description, i2, lessons, lessonsProgress, z, tags, str, oVar, list2, z3);
            case 27:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                return d0.P0(terms, new g09.g());
            case 28:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj4 = model.u;
                return Boolean.valueOf(obj4 != null ? obj4 instanceof gzc.p : false);
            default:
                return BringIntoViewSpec_androidKt.LocalBringIntoViewSpec$lambda$0((CompositionLocalAccessorScope) obj2);
        }
    }
}
