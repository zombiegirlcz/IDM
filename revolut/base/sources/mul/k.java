package mul;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.RichVideoPlayerView;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.payments.messaging.data.api.model.Mention;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.shared.feature.wealth.models.config.Links;
import efm.r;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import jv0.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import ms0.g3;
import ms0.h3;
import ms0.o2;
import ms0.r2;
import mx0.q5;
import mx0.r1;
import mx0.s0;
import mx0.t1;
import mx0.u1;
import nel.n;
import retrofit2.HttpException;
import z0h.k0;
import z0h.p1;
import z0h.t1;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209062a;

    public /* synthetic */ k(int i) {
        this.f209062a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        int i = 0;
        iVar = null;
        iVar = null;
        iVar = null;
        iVar = null;
        iVar = null;
        dv9.i iVar = null;
        switch (this.f209062a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVar = new aim.e(2);
                while (i < 2) {
                    eVar.add(new s7(a0.d.n("LOADING_CELL_DETAILS_ID", i), 0, 0, 0, 0, false, null, 126));
                    i++;
                }
                aim.e eVarA = u.a(eVar);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 1:
                return mv2.c.a((mv2.c) obj2, "", null, 2);
            case 2:
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList.add(new SplitAccountsItemGroup.LoadingItem(a0.d.n("LOADING_EARN_ITEM_", it9.nextInt()), true, true));
                }
                return new SplitAccountsItemGroup.LoadingGroup(arrayList);
            case 3:
                MatchResult match = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(match, "match");
                return new Mention((String) match.c().get(1), match.getRange().f186448a, match.getRange().f186449b + 1);
            case 4:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(f0.f322471a, false, null, 3);
            case 5:
                List freshMessages = (List) obj2;
                Intrinsics.checkNotNullParameter(freshMessages, "freshMessages");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : freshMessages) {
                    if (!((MessageItem) obj3).getF79534g()) {
                        arrayList2.add(obj3);
                    }
                }
                return new Data(arrayList2, null, false, 2, null);
            case 6:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(it11, false, null, 3);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (Data) pair.f186385a;
            case 8:
                Pair it12 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Unit.f186387a;
            case 9:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                return (httpException == null || httpException.code() != 404) ? efm.b.n(error) : pfm.m.f235744a;
            case 10:
                List pendingList = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingList, "pendingList");
                return r.fromIterable(pendingList);
            case 11:
                kv9.a eligibility = (kv9.a) obj2;
                Intrinsics.checkNotNullParameter(eligibility, "eligibilityResult");
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                String reason = eligibility.getReason();
                if (reason != null) {
                    switch (reason.hashCode()) {
                        case -2093369835:
                            if (reason.equals("UNSUPPORTED")) {
                                iVar = dv9.i.UNSUPPORTED;
                            }
                            break;
                        case 212909025:
                            if (reason.equals("OPTED_OUT")) {
                                iVar = dv9.i.OPTED_OUT;
                            }
                            break;
                        case 1208714864:
                            if (reason.equals("TEXT_NOT_SUPPORTED")) {
                                iVar = dv9.i.TEXT_NOT_SUPPORTED;
                            }
                            break;
                        case 1793967400:
                            if (reason.equals("BLOCKED_BY_TOO_MANY_USERS")) {
                                iVar = dv9.i.BLOCKED_BY_TOO_MANY_USERS;
                            }
                            break;
                    }
                }
                return new dv9.j(eligibility.getEligible(), eligibility.getPublicKey(), iVar);
            case 12:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zi0.c.P(f0.f322471a, false, null, 3);
            case 13:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(it14, false, null, 3);
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return (Data) pair2.f186385a;
            case 15:
                eue.i it15 = (eue.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15 instanceof eue.c);
            case 16:
                eue.i it16 = (eue.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Long l2 = it16.f129558a;
                if (l2 != null && l2.longValue() == 1002) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                CandleStickGraphDelegate.a state = (CandleStickGraphDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                od0.h hVar = od0.i.Companion;
                y1 y1Var = state instanceof y1 ? (y1) state : null;
                hVar.getClass();
                return od0.h.a(y1Var);
            case 18:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                n nVar = (n) pair3.f186385a;
                t1 t1Var = (t1) pair3.f186386b;
                Links links = t1Var.f318563a;
                hel.b bVar = t1Var.f318564b;
                return new p1(u.c(new k0(links, bVar, nVar.f214597c, nVar.i)), bVar);
            case 19:
                s0 it17 = (s0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f209981a;
            case 20:
                r1 it18 = (r1) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return t1.a.f210006a;
            case 21:
                h3 it19 = (h3) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (it19 instanceof g3) {
                    return (g3) it19;
                }
                return null;
            case 22:
                g3 it20 = (g3) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                o2 o2Var = it20.f208260a;
                r2 story = it20.f208261b;
                o2Var.getClass();
                Intrinsics.checkNotNullParameter(story, "story");
                return Integer.valueOf(o2Var.f208351a.indexOf(story));
            case 23:
                g3 it21 = (g3) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                r2 r2Var = it21.f208261b;
                return new u1(r2Var.f208393a, r2Var.e);
            case 24:
                ListCellDelegate.Model it22 = (ListCellDelegate.Model) obj2;
                int i2 = ExpandableTextView.o;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj4 = it22.f52696g;
                if (obj4 instanceof q5) {
                    return (q5) obj4;
                }
                return null;
            case 25:
                Pair pair4 = (Pair) obj2;
                int i3 = MapView.f58767w;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                ah0.g gVar = (ah0.g) pair4.f186385a;
                Intrinsics.h(gVar);
                View viewA = i26.l.a(gVar, null);
                Intrinsics.checkNotNullParameter(viewA, "<this>");
                int height = viewA.getHeight();
                return Float.valueOf(height == 0 ? BitmapDescriptorFactory.HUE_RED : viewA.getWidth() / height);
            case 26:
                Boolean hideInProgress = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hideInProgress, "hideInProgress");
                return Boolean.valueOf(!hideInProgress.booleanValue());
            case 27:
                CharSequence it23 = (CharSequence) obj2;
                int i5 = PhoneInputTextView.f58821g;
                Intrinsics.checkNotNullParameter(it23, "it");
                StringBuilder sb6 = new StringBuilder();
                int length = it23.length();
                while (i < length) {
                    char cCharAt = it23.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb6.append(cCharAt);
                    }
                    i++;
                }
                return sb6;
            case 28:
                jv0.m it24 = (jv0.m) obj2;
                int i6 = RichVideoPlayerView.f58848c;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(it24 instanceof p);
            default:
                jv0.m it25 = (jv0.m) obj2;
                int i21 = RichVideoPlayerView.f58848c;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Unit.f186387a;
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f209062a = i;
    }
}
