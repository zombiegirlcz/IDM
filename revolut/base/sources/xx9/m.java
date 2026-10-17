package xx9;

import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sl3.u;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx9.a f309431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f309432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final px9.c f309433c;
    public final vv9.c d;
    public final com.revolut.domain.interactors.transactions.a e;
    public final k61.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl3.a f309434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f309435h;
    public final yf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o71.a f309436j;
    public final ap5.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bu9.a f309437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aa6.c f309438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ga6.a f309439n;
    public final lra.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mq9.f f309440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fy1.r f309441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f309442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hj8.a f309443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final co9.b f309444t;
    public final wl3.u u;

    public m(kx9.a recentsDao, ecm.q recentGroupsInteractor, px9.c recentMessagesInteractor, vv9.c moneyRequestInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, k61.a transferInteractor, fl3.a contactsRepository, u remoteContactsRepository, yf.c virtualContactsRepository, o71.a beneficiaryRepository, ap5.b cryptoWithdrawInteractor, bu9.a cryptoWalletsFeatureChecker, aa6.c donationsInteractor, ga6.a donationsTransferFeatureChecker, lra.d cardOwnersInteractor, mq9.f groupsInteractor, fy1.r apmRecipientsInteractor, gte.a featureToggleInteractor, hj8.a juniorProfileInteractor, b cryptoRecentRecipientMerger, co9.b paymentCounterpartyInteractor, wl3.u revolutContactPaymentsSettingsInteractor) {
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(recentGroupsInteractor, "recentGroupsInteractor");
        Intrinsics.checkNotNullParameter(recentMessagesInteractor, "recentMessagesInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(remoteContactsRepository, "remoteContactsRepository");
        Intrinsics.checkNotNullParameter(virtualContactsRepository, "virtualContactsRepository");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoWalletsFeatureChecker, "cryptoWalletsFeatureChecker");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsTransferFeatureChecker, "donationsTransferFeatureChecker");
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(apmRecipientsInteractor, "apmRecipientsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(cryptoRecentRecipientMerger, "cryptoRecentRecipientMerger");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        this.f309431a = recentsDao;
        this.f309432b = recentGroupsInteractor;
        this.f309433c = recentMessagesInteractor;
        this.d = moneyRequestInteractor;
        this.e = transactionsInteractor;
        this.f = transferInteractor;
        this.f309434g = contactsRepository;
        this.f309435h = remoteContactsRepository;
        this.i = virtualContactsRepository;
        this.f309436j = beneficiaryRepository;
        this.k = cryptoWithdrawInteractor;
        this.f309437l = cryptoWalletsFeatureChecker;
        this.f309438m = donationsInteractor;
        this.f309439n = donationsTransferFeatureChecker;
        this.o = cardOwnersInteractor;
        this.f309440p = groupsInteractor;
        this.f309441q = apmRecipientsInteractor;
        this.f309442r = featureToggleInteractor;
        this.f309443s = juniorProfileInteractor;
        this.f309444t = paymentCounterpartyInteractor;
        this.u = revolutContactPaymentsSettingsInteractor;
    }

    public final zm3.l a(zm3.l lVar, Set set) {
        Object next;
        if (hx7.q.N(lVar)) {
            Iterator it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((JuniorBankingProfile) next).getF77101g(), lVar.getCode())) {
                    break;
                }
            }
            JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) next;
            if (juniorBankingProfile != null) {
                if (lVar instanceof zm3.j) {
                    return zm3.j.e((zm3.j) lVar, juniorBankingProfile.getF77099b(), juniorBankingProfile.getF77100c(), null, null, 0L, 0, 8185);
                }
                if (lVar instanceof zm3.i) {
                    return lVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!((jte.d) this.f309442r).c(JuniorCoreApi$Toggles.PaymentsWithAllJunior.f76895c)) {
                return null;
            }
        }
        return lVar;
    }
}
