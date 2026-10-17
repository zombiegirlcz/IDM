package yy9;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.uicomponent.R$dimen;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.rv;
import ip0.s7;
import ip0.sy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import z0h.p1;
import z0h.t1;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317921a;

    public /* synthetic */ s(int i) {
        this.f317921a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f317921a) {
            case 0:
                return (String) a10.b.n((MatchResult) obj2, "it", 1);
            case 1:
                MatchResult match = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(match, "match");
                String upperCase = new Regex("\\s").replace(match.getValue(), "").toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                wi0.a aVar = wi0.b.Companion;
                String strSubstring = upperCase.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                aVar.getClass();
                wi0.b bVarA = wi0.a.a(strSubstring);
                if (((Set) wi0.b.I3.getValue()).contains(bVarA)) {
                    return new SendFromClipboardType.BankTransferFields(q0.c(new Pair(AccountFieldType.IBAN, upperCase)), bVarA, null, null);
                }
                return null;
            case 2:
                return (String) a10.b.n((MatchResult) obj2, "it", 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rv rvVar = new rv("LOADING_TITLE_ID", null, 62);
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(rvVar, nb0.b(nb0Var, "LOADING_BODY_ID_1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_BODY_ID_2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                s7 s7Var = new s7("LOADING_HOW_TO_ACCESS_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new yyi.i(null, zhm.d0.E0(zhm.u.c(s7Var), listK));
            case 4:
                RecyclerView setup = (RecyclerView) obj2;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.setOverScrollMode(2);
                int i = R$dimen.dp_16;
                Intrinsics.checkNotNullParameter(setup, "<this>");
                setup.setOutlineProvider(new or0.t(setup.getResources().getDimensionPixelSize(i), 1));
                setup.setClipToOutline(true);
                return Unit.f186387a;
            case 5:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                throw null;
            case 6:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "model");
                throw null;
            case 7:
                h41.b to6 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to6, "$this$to");
                return Boolean.valueOf(to6.f);
            case 8:
                h41.b to10 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to10, "$this$to");
                return Boolean.valueOf(to10.f149280h);
            case 9:
                h41.b to11 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to11, "$this$to");
                return Boolean.valueOf(to11.f149279g);
            case 10:
                h41.b to12 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to12, "$this$to");
                return Boolean.valueOf(to12.f149285p);
            case 11:
                h41.b to13 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to13, "$this$to");
                return Boolean.valueOf(to13.k);
            case 12:
                h41.b to14 = (h41.b) obj2;
                Intrinsics.checkNotNullParameter(to14, "$this$to");
                return Boolean.valueOf(to14.i);
            case 13:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f53228a, "ADD_FILE_MODEL_ID"));
            case 14:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!Intrinsics.f(it9.f53228a, "ADD_FILE_MODEL_ID"));
            case 15:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.u;
                return Boolean.valueOf((obj3 instanceof yzc.f ? (yzc.f) obj3 : null) != null);
            case 16:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.u;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.selfserve.sow.impl.ui.evidencelist.SowEvidenceListContract.AttachedFile");
                return (yzc.f) obj4;
            case 17:
                z0f.q it10 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f318275c;
            case 18:
                z0f.q it11 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f318273a;
            case 19:
                com.revolut.domain.models.topup.methods.b it12 = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.d;
            case 20:
                z0f.q update = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return z0f.q.a(update, null, null, null, null, null, false, null, null, 3839);
            case 21:
                z0f.q update2 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return z0f.q.a(update2, null, null, null, null, null, !update2.f318276g, null, null, 4031);
            case 22:
                z0f.q update3 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return z0f.q.a(update3, null, null, null, null, null, false, null, null, 3839);
            case 23:
                z0f.q it13 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f318273a;
            case 24:
                com.revolut.domain.models.topup.methods.b it14 = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 26:
                t1 t1Var = (t1) obj2;
                Intrinsics.checkNotNullParameter(t1Var, "<destruct>");
                Links links = t1Var.f318563a;
                hel.b bVar = t1Var.f318564b;
                return new p1(zhm.u.c(new WealthDisclaimersContract$Disclaimer$Investment.News(links, bVar)), bVar);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("LOADING_HEADER", 0, 0, 30);
                ArrayList arrayList = new ArrayList(5);
                for (int i2 = 0; i2 < 5; i2++) {
                    arrayList.add(new sy(a0.d.n("LOADING_NEWS_", i2), null, 62));
                }
                List listQ = i2b.a.q(guVar, arrayList);
                yp0.b.k(listQ, 0, 0, 0, 0, 31);
                return listQ;
            case 28:
                List autoInvestsList = (List) obj2;
                Intrinsics.checkNotNullParameter(autoInvestsList, "autoInvestsList");
                Iterator it15 = autoInvestsList.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next = it15.next();
                        if (((yvh.b) next).e == yvh.h.LOYALTY_PROFILE) {
                        }
                    } else {
                        next = null;
                    }
                }
                yvh.b bVar2 = (yvh.b) next;
                if (bVar2 != null) {
                    od0.i.Companion.getClass();
                    return od0.h.a(bVar2);
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f317921a = i;
    }
}
