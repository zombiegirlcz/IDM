package dcf;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.shared_separate_favourites.api.multiple_watchlists.MultipleWatchlistsCustomisationScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f112937b;

    public /* synthetic */ g0(Data data, int i) {
        this.f112936a = i;
        this.f112937b = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        switch (this.f112936a) {
            case 0:
                return x.a((x) obj2, null, null, null, null, null, null, this.f112937b, 191);
            case 1:
                Data data = this.f112937b;
                Intrinsics.h(data);
                return x.a((x) obj2, data, null, null, null, null, null, null, 254);
            case 2:
                return x.a((x) obj2, null, this.f112937b, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 3:
                Data data2 = this.f112937b;
                Intrinsics.h(data2);
                return x.a((x) obj2, null, null, data2, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 4:
                return x.a((x) obj2, null, null, null, this.f112937b, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 5:
                return de9.h.a((de9.h) obj2, null, 0L, false, this.f112937b, null, 23);
            case 6:
                dee.n update = (dee.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return dee.n.a(update, null, this.f112937b, null, 5);
            case 7:
                dee.n update2 = (dee.n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return dee.n.a(update2, null, null, this.f112937b, 3);
            case 8:
                dee.n update3 = (dee.n) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return dee.n.a(update3, this.f112937b, null, null, 6);
            case 9:
                Data data3 = this.f112937b;
                Intrinsics.h(data3);
                return dfg.e.a((dfg.e) obj2, null, data3, null, null, 13);
            case 10:
                return dh4.f.a((dh4.f) obj2, this.f112937b, null, 2);
            case 11:
                ((MultipleWatchlistsCustomisationScreen.a) obj2).getClass();
                Data watchlists = this.f112937b;
                Intrinsics.checkNotNullParameter(watchlists, "watchlists");
                return new MultipleWatchlistsCustomisationScreen.a(watchlists);
            case 12:
                return djc.i.a((djc.i) obj2, null, this.f112937b, null, null, null, null, false, Constants.TAG_FB_CHARGING_STATUS);
            case 13:
                return djc.i.a((djc.i) obj2, this.f112937b, null, null, null, null, null, false, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 14:
                return djc.i.a((djc.i) obj2, null, null, this.f112937b, null, null, null, false, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 15:
                ((dk9.p) obj2).getClass();
                Data content = this.f112937b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new dk9.p(content);
            case 16:
                dkb.d dVar = (dkb.d) obj2;
                Data data4 = this.f112937b;
                SavingsChallengeOnboarding savingsChallengeOnboarding = (SavingsChallengeOnboarding) data4.getContent();
                if (savingsChallengeOnboarding != null) {
                    SavingsChallenge.Contribution contribution = savingsChallengeOnboarding.f83099a.f83090g;
                    long j2 = contribution.f83092a.f115082a;
                    long j3 = (contribution.f83093b.f115082a - j2) / ((long) 4);
                    IntRange intRangeO = kotlin.ranges.f.o(0, 5);
                    arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
                    vim.f it8 = intRangeO.iterator();
                    while (it8.f289625c) {
                        arrayList.add(dj0.d.c(contribution.f83092a, (((long) it8.nextInt()) * j3) + j2, null, 2));
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                return dkb.d.a(dVar, data4, 0, arrayList, 2);
            case 17:
                return dm3.e.a((dm3.e) obj2, null, null, this.f112937b, null, null, false, null, false, false, null, 4079);
            case 18:
                Data data5 = this.f112937b;
                Intrinsics.h(data5);
                return dm3.e.a((dm3.e) obj2, null, null, null, data5, null, false, null, false, false, null, 4063);
            case 19:
                return dm3.e.a((dm3.e) obj2, null, null, null, null, this.f112937b, false, null, false, false, null, 4031);
            case 20:
                return dm3.e.a((dm3.e) obj2, null, this.f112937b, null, null, null, false, null, false, false, null, 4087);
            case 21:
                return dmj.a0.a((dmj.a0) obj2, null, null, null, null, this.f112937b, null, false, null, 239);
            case 22:
                return dmj.a0.a((dmj.a0) obj2, null, null, null, this.f112937b, null, null, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 23:
                return dmj.a0.a((dmj.a0) obj2, this.f112937b, null, null, null, null, null, false, null, 254);
            case 24:
                return dnc.d.a((dnc.d) obj2, null, this.f112937b, null, null, null, null, 61);
            case 25:
                return dnc.d.a((dnc.d) obj2, null, null, this.f112937b, null, null, null, 59);
            case 26:
                return dnc.d.a((dnc.d) obj2, null, null, null, this.f112937b, null, null, 55);
            case 27:
                return dnc.d.a((dnc.d) obj2, null, null, null, null, this.f112937b, null, 47);
            case 28:
                return dnc.d.a((dnc.d) obj2, null, null, null, null, null, (ilc.a) this.f112937b.getContent(), 31);
            default:
                return do2.g.a((do2.g) obj2, this.f112937b, null, null, 6);
        }
    }

    public /* synthetic */ g0(Data data, com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a aVar) {
        this.f112936a = 16;
        this.f112937b = data;
    }
}
