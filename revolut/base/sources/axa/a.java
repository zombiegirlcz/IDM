package axa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus;
import com.revolut.feature.referrals.common.data.api.domain.model.common.PromoContent;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Referrer;
import h30.l;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pwa.d;
import zwa.j;
import zwa.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final InviteeStatus.Present a(j jVar) {
        d dVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        s referrer = jVar.getReferrer();
        String value = referrer.getRegisteredIdentityId();
        Intrinsics.checkNotNullParameter(value, "value");
        Referrer referrer2 = new Referrer(value, referrer.getFirstName());
        PromoContent promoContent = new PromoContent(jVar.getPromoContent().getMessage());
        Instant instantOfEpochMilli = Instant.ofEpochMilli(jVar.getDeadline());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "let(...)");
        jo3.a rewardAmount = jVar.getRewardDetails().getRewardAmount();
        dj0.d dVarO = rewardAmount != null ? mo3.a.o(rewardAmount) : null;
        String inviteState = jVar.getInviteState();
        d[] dVarArrValues = d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            d dVar2 = dVarArrValues[i];
            if (a0.z(dVar2.name(), inviteState, true)) {
                dVar = dVar2;
                break;
            }
            i++;
        }
        if (dVar != null) {
            return new InviteeStatus.Present(referrer2, promoContent, instantOfEpochMilli, dVarO, dVar);
        }
        throw new IllegalStateException(l.r("Cannot parse InviteeStatusDto. Unknown inviteState: ", jVar.getInviteState()));
    }
}
