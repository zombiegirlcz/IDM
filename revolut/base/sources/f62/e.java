package f62;

import aii.u;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends yji.n implements c12.f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ApmPaymentProfile f132378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r52.a f132379m;

    public e(ApmPaymentProfile paymentProfile, r52.a apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(paymentProfile, "paymentProfile");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f132378l = paymentProfile;
        this.f132379m = apmNavigationProvider;
    }

    @Override // c12.f
    public final boolean A(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() != 9) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < value.length(); i++) {
            Integer numB = kotlin.text.a.b(value.charAt(i));
            if (numB == null) {
                return false;
            }
            arrayList.add(numB);
        }
        List listW = d0.W(1, arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(listW, 10));
        int i2 = 0;
        for (Object obj2 : listW) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            arrayList2.add(Integer.valueOf(((Number) obj2).intValue() * ((int) Math.pow(2.0d, 8 - i2))));
            i2 = i3;
        }
        int iT0 = d0.T0(arrayList2) % 11;
        return iT0 == 10 ? ((Number) d0.m0(arrayList)).intValue() == 0 : ((Number) d0.m0(arrayList)).intValue() == iT0;
    }

    @Override // c12.f
    public final void x(ApmContact contact, hrf.f direction) {
        u transferOnlyChatDestination;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!(contact instanceof IrisContact)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        IrisContact irisContact = (IrisContact) contact;
        ApmContact.SimpleState simpleState = irisContact.f;
        if (Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
            ApmPaymentProfile apmPaymentProfile = this.f132378l;
            transferOnlyChatDestination = new com.revolut.kompot.common.b(o2(((w52.f) this.f132379m).o(irisContact, direction, t52.b.b(apmPaymentProfile), apmPaymentProfile)), (ModalDestination.Style) null, 6);
        } else {
            if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                throw new NoWhenBranchMatchedException();
            }
            transferOnlyChatDestination = new TransferOnlyChatDestination(new ChatTransferRecipient.ApmTransferRecipient(contact));
        }
        A2(transferOnlyChatDestination);
    }
}
