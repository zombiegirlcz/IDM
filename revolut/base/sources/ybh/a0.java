package ybh;

import android.graphics.Bitmap;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$DomainState;
import ip0.nb0;
import ip0.pb0;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312290a;

    public /* synthetic */ a0(int i) {
        this.f312290a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f312290a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 1:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, 129023);
            case 2:
                n update2 = (n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return n.a(update2, null, null, null, null, null, null, null, null, null, null, null, false, true, false, null, null, false, 126975);
            case 3:
                n it8 = (n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f312323a;
            case 4:
                n update3 = (n) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return n.a(update3, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, 131007);
            case 5:
                n it9 = (n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f312323a;
            case 6:
                dj0.d it10 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.k());
            case 7:
                n update4 = (n) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return n.a(update4, null, null, null, null, null, null, null, null, null, null, null, false, true, false, null, null, false, 126975);
            case 8:
                n update5 = (n) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return n.a(update5, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, 126975);
            case 9:
                n update6 = (n) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return n.a(update6, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, false, 124927);
            case 10:
                CenteredAmountDelegate.Model it11 = (CenteredAmountDelegate.Model) obj2;
                WealthAddMoneyScreen.Companion aVar = WealthAddMoneyScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it11, "it");
                bw0.m mVar = it11.e;
                Object obj4 = mVar != null ? mVar.e : null;
                usb.d dVar = obj4 instanceof usb.d ? (usb.d) obj4 : null;
                if (dVar != null) {
                    return dVar.f282867a;
                }
                return null;
            case 11:
                CenteredAmountDelegate.Model it12 = (CenteredAmountDelegate.Model) obj2;
                WealthAddMoneyScreen.Companion aVar2 = WealthAddMoneyScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it12, "it");
                bw0.m mVar2 = it12.e;
                Object obj5 = mVar2 != null ? mVar2.e : null;
                usb.n nVar = obj5 instanceof usb.n ? (usb.n) obj5 : null;
                usb.m mVar3 = nVar != null ? nVar.f282882a : null;
                if (mVar3 instanceof usb.j) {
                    return (usb.j) mVar3;
                }
                return null;
            case 12:
                p0.a it13 = (p0.a) obj2;
                WealthAddMoneyScreen.Companion aVar3 = WealthAddMoneyScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj6 = it13.f256150a;
                if (obj6 instanceof o) {
                    return (o) obj6;
                }
                return null;
            case 13:
                ty0.a it14 = (ty0.a) obj2;
                WealthAddMoneyScreen.Companion aVar4 = WealthAddMoneyScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 14:
                CryptoDirectDepositFlowContract$DomainState update7 = (CryptoDirectDepositFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                update7.getClass();
                return new CryptoDirectDepositFlowContract$DomainState(null, null);
            case 15:
                yc4.f update8 = (yc4.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                String applicationId = update8.f312514a;
                boolean z = update8.f312515b;
                boolean z3 = update8.f312516c;
                Locale locale = update8.d;
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                Intrinsics.checkNotNullParameter(locale, "locale");
                return new yc4.f(applicationId, z, z3, locale, false);
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Set set = (Set) pair.f186386b;
                Iterator it15 = list.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next = it15.next();
                        if (!set.contains(((sf8.m) next).f262361b)) {
                            obj3 = next;
                        }
                    }
                }
                sf8.m mVar4 = (sf8.m) obj3;
                return mVar4 == null ? (sf8.m) zhm.d0.b0(list) : mVar4;
            case 17:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                sf8.m mVar5 = (sf8.m) pair2.f186385a;
                return ((Set) pair2.f186386b).contains(mVar5.f262361b) ? org.bouncycastle.jcajce.provider.digest.a.s(3, null) : new go.g(mVar5, 2);
            case 18:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(!it16.isEmpty());
            case 19:
                Bitmap cardImage = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(cardImage, "cardImage");
                return new BitmapImage(cardImage, false, new ImageTransformations((CircleTransformation) null, false, false, (Integer) null, (Integer) null, (Integer) null, 503), 10);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 21:
                Date it17 = (Date) obj2;
                KProperty[] kPropertyArr = TravelHotelsDatesPickerScreen.P;
                Intrinsics.checkNotNullParameter(it17, "it");
                Instant instant = it17.toInstant();
                Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
                return oi0.d.W(instant);
            case 22:
                bla.c it18 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 == bla.c.ENABLED);
            case 23:
                Map profiles = (Map) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                Collection collectionValues = profiles.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z = false;
                } else {
                    Iterator it19 = collectionValues.iterator();
                    while (it19.hasNext()) {
                        int i = yd8.j.f312648a[((JuniorBankingProfile) it19.next()).f77104l.ordinal()];
                        if (i != 1) {
                            if (i != 2 && i != 3 && i != 4 && i != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    z = false;
                }
                return new Pair(Boolean.valueOf(z), profiles);
            case 24:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return zhm.d0.E0((List) pair3.f186385a, (List) pair3.f186386b);
            case 25:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                List listP0 = zhm.d0.P0(payments, new q2j.v(new yd9.j(), 25));
                ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it20 = listP0.iterator();
                while (it20.hasNext()) {
                    arrayList.add(new wd9.b((qua.p) it20.next()));
                }
                return arrayList;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0VarA = nb0.a(pb0.Companion, "ORDER_SUMMARY_LOADING_ID", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(pb0VarA);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 28:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return (cgi.f) zhm.d0.d0(it21);
            default:
                File candidate = (File) obj2;
                Intrinsics.checkNotNullParameter(candidate, "candidate");
                return Boolean.valueOf(candidate.isFile());
        }
    }
}
