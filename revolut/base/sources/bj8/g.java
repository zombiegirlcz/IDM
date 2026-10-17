package bj8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import yhm.r;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15586a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVar = (r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) rVar.f314201a;
        fo3.c cVar = (fo3.c) rVar.f314202b;
        i iVar = (i) rVar.f314203c;
        Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
        String str = juniorBankingProfile.o;
        if (str == null) {
            throw new IllegalArgumentException(JuniorCardProfileScreenContract.class.getSimpleName().concat(" requires JuniorProfile::receiveTransferUrl not to be null").toString());
        }
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = (PaymentLinkCustomAmountBundle) iVar.f224257a;
        if (paymentLinkCustomAmountBundle == null) {
            paymentLinkCustomAmountBundle = new PaymentLinkCustomAmountBundle(new dj0.d(0L, cVar.d), "");
        }
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle2 = paymentLinkCustomAmountBundle;
        String value = juniorBankingProfile.f77103j;
        Intrinsics.checkNotNullParameter(value, "value");
        String str2 = juniorBankingProfile.f77099b;
        String strT = ta6.a.t(juniorBankingProfile);
        Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
        String str3 = juniorBankingProfile.f77102h;
        if (str3 != null) {
            return new a(value, str2, strT, str3, cVar, str, paymentLinkCustomAmountBundle2, str);
        }
        throw new IllegalArgumentException(JuniorCardProfileScreenContract.class.getSimpleName().concat(" requires JuniorProfile::username not to be null").toString());
    }
}
