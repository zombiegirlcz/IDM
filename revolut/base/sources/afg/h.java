package afg;

import b8d.m;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import e2f.n;
import fr8.l;
import k8g.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f4058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f4059c;
    public final /* synthetic */ Data d;

    public /* synthetic */ h(int i, Data data, Data data2, Data data3) {
        this.f4057a = i;
        this.f4058b = data;
        this.f4059c = data2;
        this.d = data3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        Data data3;
        xi0.b bVarA;
        switch (this.f4057a) {
            case 0:
                return e.a((e) obj2, this.f4058b, this.f4059c, this.d, false, 8);
            case 1:
                return aig.i.a((aig.i) obj2, this.f4058b, this.f4059c, this.d, false, false, null, null, SyslogConstants.LOG_CLOCK);
            case 2:
                Data data4 = this.f4058b;
                Intrinsics.h(data4);
                Data data5 = this.d;
                Intrinsics.h(data5);
                return b1c.i.a((b1c.i) obj2, data4, this.f4059c, data5, null, 8);
            case 3:
                return m.a((m) obj2, null, this.f4058b, null, this.f4059c, this.d, false, 101);
            case 4:
                Data coparentsData = this.f4059c;
                Intrinsics.h(coparentsData);
                Data userData = this.d;
                Intrinsics.h(userData);
                ((cq8.c) obj2).getClass();
                Data taskData = this.f4058b;
                Intrinsics.checkNotNullParameter(taskData, "taskData");
                Intrinsics.checkNotNullParameter(coparentsData, "coparentsData");
                Intrinsics.checkNotNullParameter(userData, "userData");
                return new cq8.c(taskData, coparentsData, userData);
            case 5:
                return n.a((n) obj2, this.f4058b, this.f4059c, null, this.d, null, 20);
            case 6:
                Data data6 = this.f4058b;
                Data data7 = this.f4059c;
                l lVar = (l) obj2;
                try {
                    Object content = data6.getContent();
                    if (content != null) {
                        xi0.a aVar = xi0.b.Companion;
                        String str = ((io3.d) content).f163147c;
                        aVar.getClass();
                        bVarA = xi0.a.a(str);
                    } else {
                        bVarA = null;
                    }
                    data = new Data(bVarA, data6.getError(), data6.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data6.getLoading());
                }
                Data data8 = data;
                try {
                    Object content2 = data7.getContent();
                    data2 = new Data(content2 != null ? (psg.a) ((Pair) content2).f186385a : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data7.getLoading());
                }
                Data data9 = data2;
                try {
                    Object content3 = data7.getContent();
                    data3 = new Data(content3 != null ? (JuniorBankingProfile) ((Pair) content3).f186386b : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th12) {
                    data3 = new Data(null, th12, data7.getLoading());
                }
                return l.a(lVar, 0L, null, null, this.d, data6, data8, data3, data9, null, 263);
            case 7:
                h1k.g updateState = (h1k.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return h1k.g.a(updateState, this.f4058b, this.f4059c, this.d, null, null, 99);
            case 8:
                Data data10 = this.d;
                Intrinsics.h(data10);
                return k.a((k) obj2, this.f4058b, this.f4059c, data10, null, false, false, 56);
            case 9:
                return n1g.e.a((n1g.e) obj2, this.f4058b, this.f4059c, this.d, false, 24);
            case 10:
                Data campaignLocations = this.f4059c;
                Intrinsics.h(campaignLocations);
                Data sortingOptions = this.d;
                Intrinsics.h(sortingOptions);
                ((obg.f) obj2).getClass();
                Data campaign = this.f4058b;
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                Intrinsics.checkNotNullParameter(campaignLocations, "campaignLocations");
                Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
                return new obg.f(campaign, campaignLocations, sortingOptions);
            case 11:
                ((pa8.e) obj2).getClass();
                Data juniorProfile = this.f4058b;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Data taxResidencies = this.f4059c;
                Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                Data tinRequiredAgeData = this.d;
                Intrinsics.checkNotNullParameter(tinRequiredAgeData, "tinRequiredAgeData");
                return new pa8.e(juniorProfile, taxResidencies, tinRequiredAgeData);
            case 12:
                Data rewardPreviews = this.f4058b;
                Intrinsics.h(rewardPreviews);
                ((tm8.f) obj2).getClass();
                Intrinsics.checkNotNullParameter(rewardPreviews, "rewardPreviews");
                Data juniorProfile2 = this.f4059c;
                Intrinsics.checkNotNullParameter(juniorProfile2, "juniorProfile");
                Data partnershipsProductState = this.d;
                Intrinsics.checkNotNullParameter(partnershipsProductState, "partnershipsProductState");
                return new tm8.f(rewardPreviews, juniorProfile2, partnershipsProductState);
            case 13:
                tyj.d updateState2 = (tyj.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data data11 = this.f4058b;
                Intrinsics.h(data11);
                Data totalEarnedData = this.f4059c;
                Intrinsics.h(totalEarnedData);
                Data userBaseCurrencyData = this.d;
                Intrinsics.h(userBaseCurrencyData);
                updateState2.getClass();
                Intrinsics.checkNotNullParameter(data11, "data");
                Intrinsics.checkNotNullParameter(totalEarnedData, "totalEarnedData");
                Intrinsics.checkNotNullParameter(userBaseCurrencyData, "userBaseCurrencyData");
                return new tyj.d(data11, totalEarnedData, userBaseCurrencyData);
            case 14:
                ((vaa.j) obj2).getClass();
                Data keysData = this.f4058b;
                Intrinsics.checkNotNullParameter(keysData, "keysData");
                Data recentBeneficiariesData = this.f4059c;
                Intrinsics.checkNotNullParameter(recentBeneficiariesData, "recentBeneficiariesData");
                Data transactionsInfo = this.d;
                Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
                return new vaa.j(keysData, recentBeneficiariesData, transactionsInfo);
            case 15:
                return w3c.e.a((w3c.e) obj2, this.f4058b, this.f4059c, this.d, null, null, null, 56);
            default:
                ((x78.c) obj2).getClass();
                Data juniorProfiles = this.f4058b;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                Data pocketsAvailable = this.f4059c;
                Intrinsics.checkNotNullParameter(pocketsAvailable, "pocketsAvailable");
                Data creationAvailable = this.d;
                Intrinsics.checkNotNullParameter(creationAvailable, "creationAvailable");
                return new x78.c(juniorProfiles, pocketsAvailable, creationAvailable);
        }
    }
}
