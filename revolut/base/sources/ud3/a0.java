package ud3;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f279089b;

    public /* synthetic */ a0(Data data, int i) {
        this.f279088a = i;
        this.f279089b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f279088a) {
            case 0:
                Data data = this.f279089b;
                Intrinsics.h(data);
                return i.a((i) obj2, null, null, null, null, null, data, null, null, null, null, null, null, false, 16351);
            case 1:
                Data data2 = this.f279089b;
                Intrinsics.h(data2);
                return i.a((i) obj2, null, null, null, null, null, null, null, data2, null, null, null, null, false, 16255);
            case 2:
                return i.a((i) obj2, null, null, null, this.f279089b, null, null, null, null, null, null, null, null, false, 16375);
            case 3:
                return i.a((i) obj2, null, null, null, null, this.f279089b, null, null, null, null, null, null, null, false, 16367);
            case 4:
                Data data3 = this.f279089b;
                Intrinsics.h(data3);
                return i.a((i) obj2, null, null, null, null, null, null, data3, null, null, null, null, null, false, 16319);
            case 5:
                Data data4 = this.f279089b;
                Intrinsics.h(data4);
                return i.a((i) obj2, null, null, null, null, null, null, null, null, null, data4, null, null, false, 15359);
            case 6:
                return udi.j.a((udi.j) obj2, this.f279089b, null, 2);
            case 7:
                return udi.j.a((udi.j) obj2, null, this.f279089b, 1);
            case 8:
                Data beforeAfterTransactions = new Data(this.f279089b.getContent(), null, false, 6, null);
                TransactionRecogniserDetails recogniserDetails = ((uef.e) obj2).f279352a;
                Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
                Intrinsics.checkNotNullParameter(beforeAfterTransactions, "beforeAfterTransactions");
                return new uef.e(recogniserDetails, beforeAfterTransactions);
            case 9:
                Data data5 = this.f279089b;
                Intrinsics.h(data5);
                return ueg.v.a((ueg.v) obj2, null, null, null, null, null, null, null, data5, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388479);
            case 10:
                return ueg.v.a((ueg.v) obj2, null, this.f279089b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388605);
            case 11:
                return ueg.v.a((ueg.v) obj2, null, null, this.f279089b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388603);
            case 12:
                ((uf7.k) obj2).getClass();
                Data incentiveRewardDetailsContentData = this.f279089b;
                Intrinsics.checkNotNullParameter(incentiveRewardDetailsContentData, "incentiveRewardDetailsContentData");
                return new uf7.k(incentiveRewardDetailsContentData);
            case 13:
                ((uhj.d) obj2).getClass();
                Data giftRecipients = this.f279089b;
                Intrinsics.checkNotNullParameter(giftRecipients, "giftRecipients");
                return new uhj.d(giftRecipients);
            case 14:
                uj7.e eVar = (uj7.e) obj2;
                Data reasonNotListedInfoData = this.f279089b;
                Intrinsics.h(reasonNotListedInfoData);
                List possibleReasons = eVar.f280523a;
                boolean z = eVar.f280525c;
                Intrinsics.checkNotNullParameter(possibleReasons, "possibleReasons");
                Intrinsics.checkNotNullParameter(reasonNotListedInfoData, "reasonNotListedInfoData");
                return new uj7.e(reasonNotListedInfoData, possibleReasons, z);
            case 15:
                ((uj8.a) obj2).getClass();
                Data juniorProfiles = this.f279089b;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                return new uj8.a(juniorProfiles);
            case 16:
                ((uk2.a) obj2).getClass();
                Data listAtms = this.f279089b;
                Intrinsics.checkNotNullParameter(listAtms, "listAtms");
                return new uk2.a(listAtms);
            case 17:
                Data plans = this.f279089b;
                Intrinsics.h(plans);
                ((uk9.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(plans, "plans");
                return new uk9.d(plans);
            case 18:
                return ukh.c.a((ukh.c) obj2, null, null, this.f279089b, 3);
            case 19:
                return ukh.c.a((ukh.c) obj2, this.f279089b, null, null, 6);
            case 20:
                Data data6 = this.f279089b;
                Intrinsics.h(data6);
                return ukk.h.a((ukk.h) obj2, null, data6, 1);
            case 21:
                return ukk.h.a((ukk.h) obj2, this.f279089b, null, 2);
            case 22:
                Data data7 = this.f279089b;
                Intrinsics.h(data7);
                return ulk.g.a((ulk.g) obj2, null, data7, null, null, 27);
            case 23:
                Data data8 = this.f279089b;
                Intrinsics.h(data8);
                return ulk.g.a((ulk.g) obj2, data8, null, null, null, 30);
            case 24:
                return ulk.g.a((ulk.g) obj2, null, null, this.f279089b, null, 23);
            case 25:
                return um2.a.a((um2.a) obj2, this.f279089b, null, null, null, false, null, null, null, 254);
            case 26:
                ((um9.e) obj2).getClass();
                Data ownerAndPayees = this.f279089b;
                Intrinsics.checkNotNullParameter(ownerAndPayees, "ownerAndPayees");
                return new um9.e(ownerAndPayees);
            case 27:
                ((umd.c) obj2).getClass();
                Data budgetData = this.f279089b;
                Intrinsics.checkNotNullParameter(budgetData, "budgetData");
                return new umd.c(budgetData);
            case 28:
                ((umk.f) obj2).getClass();
                Data prompt = this.f279089b;
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                return new umk.f(prompt);
            default:
                ((una.c) obj2).getClass();
                Data consent = this.f279089b;
                Intrinsics.checkNotNullParameter(consent, "consent");
                return new una.c(consent);
        }
    }
}
