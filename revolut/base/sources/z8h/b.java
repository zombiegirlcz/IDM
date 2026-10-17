package z8h;

import aw0.o9;
import cfl.v;
import cli.n;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.captcha.api.models.CaptchaError;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsScreenContract$SignSmsConfiguration;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import efm.d0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import ms0.h4;
import od0.h;
import od0.i;
import rfm.o;
import zbj.q;
import zbj.u0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320133a;

    public /* synthetic */ b(int i) {
        this.f320133a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f320133a;
        i iVar = i.f224256b;
        Object obj3 = null;
        switch (i) {
            case 0:
                v accountState = (v) obj2;
                Intrinsics.checkNotNullParameter(accountState, "accountState");
                Intrinsics.checkNotNullParameter(accountState, "<this>");
                switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105340c[accountState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z = false;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                i.Companion.getClass();
                return iVar;
            case 2:
                i.Companion.getClass();
                return iVar;
            case 3:
                zx0.i it8 = (zx0.i) obj2;
                PeerToPeerAmountScreen.a aVar = PeerToPeerAmountScreen.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj4 = it8.f326000g;
                if (obj4 instanceof h9i.c) {
                    return (h9i.c) obj4;
                }
                return null;
            case 4:
                ty0.a it9 = (ty0.a) obj2;
                PeerToPeerAmountScreen.a aVar2 = PeerToPeerAmountScreen.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f275445a;
            case 5:
                CenteredAmountDelegate.Model it10 = (CenteredAmountDelegate.Model) obj2;
                PeerToPeerAmountScreen.a aVar3 = PeerToPeerAmountScreen.Companion;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.f51981p;
                if (obj5 instanceof yof.b) {
                    return (yof.b) obj5;
                }
                return null;
            case 6:
                PeerToPeerTransferData updateTransferData = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PeerToPeerTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, null, null, 261631);
            case 7:
                bla.c it11 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 == bla.c.ENABLED);
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "LOADING_1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 10:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.length() > 0);
            case 11:
                List verificationOptions = (List) obj2;
                Intrinsics.checkNotNullParameter(verificationOptions, "verificationOptions");
                Iterator it13 = verificationOptions.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next = it13.next();
                        if (((u61.a) next).f277465a == ChannelType.EMAIL) {
                            obj3 = next;
                        }
                    }
                }
                u61.a aVar4 = (u61.a) obj3;
                return (aVar4 == null || (str = aVar4.f277466b) == null) ? "" : str;
            case 12:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new yab.a(it14);
            case 13:
                SignSmsScreenContract$SignSmsConfiguration it15 = (SignSmsScreenContract$SignSmsConfiguration) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new o(new s2i.i(it15, 24));
            case 14:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof CaptchaError.ChallengeClosed) {
                    return d0.l(error);
                }
                i.Companion.getClass();
                return d0.m(iVar);
            case 15:
                SignSmsScreenContract$SignSmsConfiguration config = (SignSmsScreenContract$SignSmsConfiguration) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.getI());
            case 16:
                String it16 = (String) obj2;
                SignSmsStepFragment.Companion aVar5 = SignSmsStepFragment.INSTANCE;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new yab.a(it16);
            case 17:
                Throwable th10 = (Throwable) obj2;
                SignSmsStepFragment.Companion aVar6 = SignSmsStepFragment.INSTANCE;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 18:
                zac.f update = (zac.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return zac.f.a(update, null, null, 11);
            case 19:
                hce.a model = (hce.a) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                i.Companion.getClass();
                return h.a(model);
            case 20:
                Date it17 = (Date) obj2;
                KProperty[] kPropertyArr = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                Intrinsics.checkNotNullParameter(it17, "it");
                Instant instant = it17.toInstant();
                Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
                return oi0.d.W(instant);
            case 21:
                zag.d it18 = (zag.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f320689c;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it19 = intRange.iterator();
                while (it19.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("LIST_ID_LOADING_ABOUT_", it19.nextInt()), false, 0, false, 28));
                }
                eVarB.addAll(yp0.b.h(arrayList, new gu("LIST_ID_ABOUT_HEADER", 0, 0, 30), null, 0, 126));
                eVarB.add(new gu("LIST_ID_LINKS_HEADER", 0, R$attr.uikit_dp12, 26));
                IntRange intRange2 = new IntRange(1, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange2, 10));
                vim.f it20 = intRange2.iterator();
                while (it20.f289625c) {
                    arrayList2.add(new SmallActionButtonDelegate.Model(a0.d.n("LIST_ID_LOADING_LINKS_", it20.nextInt()), h4.SHIMMER, null, null, new TextClause("Action", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, 0, 0, 0, 32728));
                }
                eVarB.add(new eg("LIST_ID_LOADING_LINKS_SCROLLER", arrayList2, null, 8.0f, R$attr.uikit_dp0, 0, 948));
                return u.a(eVarB);
            case 23:
                ((Function0) obj2).invoke();
                return Unit.f186387a;
            case 24:
                zb6.h it21 = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f320806b;
            case 25:
                zb6.h it22 = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return t1.u(it22.f320805a, it22.d, it22.f320806b);
            case 26:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new dj0.d(0L, currency);
            case 27:
                e7l.f config2 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                LinkedHashSet linkedHashSet = config2.M;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : linkedHashSet) {
                    String str2 = (String) obj6;
                    Set set = config2.U;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it23 = set.iterator();
                        while (it23.hasNext()) {
                            if (Intrinsics.f(((xi0.b) it23.next()).f306286a, str2)) {
                            }
                            break;
                        }
                    }
                    arrayList3.add(obj6);
                }
                return zhm.d0.i1(arrayList3);
            case 28:
                q update2 = (q) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q.a(update2, null, null, null, null, null, null, null, null, null, null, null, u0.WALLET, 12287);
            default:
                q update3 = (q) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return q.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, 16127);
        }
    }

    public /* synthetic */ b(n nVar, int i) {
        this.f320133a = i;
    }
}
