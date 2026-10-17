package wje;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.kh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.spare.change.api.models.CryptoSpareChangeState;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import fu6.t;
import ip0.gu;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.text.d0;
import retrofit2.HttpException;
import tof.a3;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298077a;

    public /* synthetic */ m(int i) {
        this.f298077a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298077a) {
            case 0:
                CryptoSpareChangeState cryptoSpareChangeState = (CryptoSpareChangeState) obj2;
                if (cryptoSpareChangeState instanceof CryptoSpareChangeState.CryptoSpareChangeActive) {
                    CryptoSpareChangeState.CryptoSpareChangeActive cryptoSpareChangeActive = (CryptoSpareChangeState.CryptoSpareChangeActive) cryptoSpareChangeState;
                    return new CryptoSpareChangeInfo(cryptoSpareChangeActive.f70993a, Integer.valueOf(cryptoSpareChangeActive.f70994b));
                }
                if (cryptoSpareChangeState instanceof CryptoSpareChangeState.CryptoSpareChangeNotActive) {
                    return new CryptoSpareChangeInfo(null, null);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                rp0.p it8 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == rp0.p.USER);
            case 2:
                LargeActionButtonDelegate.Model it9 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f52613a, "LIST_ID_CANCEL"));
            case 3:
                Intrinsics.checkNotNullParameter((LargeActionButtonDelegate.Model) obj2, "it");
                return wjk.d.CANCEL_DIALOG_ACTION;
            case 4:
                Intrinsics.checkNotNullParameter((rp0.p) obj2, "it");
                return wjk.d.CANCEL_DIALOG_ACTION;
            case 5:
                LargeActionButtonDelegate.Model it10 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f52613a, "LIST_ID_CONFIRM"));
            case 6:
                Intrinsics.checkNotNullParameter((LargeActionButtonDelegate.Model) obj2, "it");
                return wjk.d.CONFIRM_DIALOG_ACTION;
            case 7:
                wk2.k update = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wk2.k.a(update, false, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16378);
            case 8:
                wk2.k update2 = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wk2.k.a(update2, true, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16382);
            case 9:
                wk2.k update3 = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return wk2.k.a(update3, false, null, false, true, false, 0, 0, 0, false, null, null, null, null, null, 16375);
            case 10:
                wk2.k update4 = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return wk2.k.a(update4, false, null, false, false, true, 0, 0, 0, false, null, null, null, null, null, 16359);
            case 11:
                wk2.k update5 = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return wk2.k.a(update5, true, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16382);
            case 12:
                return wk2.k.a((wk2.k) obj2, false, null, true, false, false, 0, 0, 0, false, null, null, null, null, null, 16379);
            case 13:
                wk2.k kVar = (wk2.k) obj2;
                return wk2.k.a(kVar, false, null, false, false, false, kVar.f + 1, 0, 0, false, null, null, null, null, null, 16351);
            case 14:
                return wk2.k.a((wk2.k) obj2, false, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16359);
            case 15:
                return wk2.k.a((wk2.k) obj2, false, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16359);
            case 16:
                return wk2.k.a((wk2.k) obj2, false, null, false, false, false, 0, 0, 0, false, null, null, null, null, null, 16359);
            case 17:
                wk2.k kVar2 = (wk2.k) obj2;
                return wk2.k.a(kVar2, false, null, false, false, false, 0, 0, kVar2.f298196h + 1, false, null, null, null, null, null, 16255);
            case 18:
                String str = (String) obj2;
                return Boolean.valueOf(str == null || d0.W(str));
            case 19:
                Data referralCampaignData = (Data) obj2;
                Intrinsics.checkNotNullParameter(referralCampaignData, "referralCampaignData");
                Throwable error = referralCampaignData.getError();
                return ((error instanceof HttpException) && ((HttpException) error).code() == 404) ? new Data(null, error, referralCampaignData.getLoading()) : referralCampaignData;
            case 20:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                return observeTransactionProperty.f272581b;
            case 21:
                ((wkg.b) obj2).getClass();
                return new wkg.b(true);
            case 22:
                hha.d it11 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f152287a;
            case 23:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 1, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    int iNextInt = it12.nextInt();
                    gu guVar = new gu(a0.d.n("benefit_category_header_", iNextInt), 0, 0, 30);
                    IntRange intRange = new IntRange(0, 9, 1);
                    ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                    vim.f it13 = intRange.iterator();
                    while (it13.f289625c) {
                        arrayList2.add(new kh(a0.d.g(iNextInt, it13.nextInt(), "benefit_", "_")));
                    }
                    yp0.b.k(arrayList2, 0, R$attr.uikit_dp16, 0, 0, 29);
                    arrayList.add(i2b.a.q(guVar, arrayList2));
                }
                return w.u(arrayList);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 25:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e7l.f fVar = (e7l.f) pair.f186385a;
                do3.n nVar = (do3.n) pair.f186386b;
                List list = fVar.f123366d0;
                return Boolean.valueOf(!zhm.d0.T(list, nVar.k != null ? nz8.d.g(r1) : null));
            case 26:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : it14) {
                    if (obj3 instanceof zm3.i) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 27:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : it15) {
                    if (obj4 instanceof zm3.i) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 28:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(!it16.isEmpty());
            default:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (zm3.j) zhm.d0.b0(it17);
        }
    }

    public /* synthetic */ m(t tVar) {
        this.f298077a = 23;
    }
}
