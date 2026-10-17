package nm9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreenContract$InputData;
import com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements dli.b {
    public final PayeesConfirmationBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final im9.i f217228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ay9.a f217229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f217230r;

    public m(n stateMapper, PayeesConfirmationBottomSheetScreenContract$InputData inputData, im9.i payeesInteractor, ay9.a recipientPaymentsSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payeesInteractor, "payeesInteractor");
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsInteractor, "recipientPaymentsSettingsInteractor");
        this.o = inputData;
        this.f217228p = payeesInteractor;
        this.f217229q = recipientPaymentsSettingsInteractor;
        this.f217230r = mra.d.b(this, new g(inputData.f79002a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        PayeesConfirmationBottomSheetScreenContract$InputData payeesConfirmationBottomSheetScreenContract$InputData = this.o;
        if (payeesConfirmationBottomSheetScreenContract$InputData.f79003b.size() != 1) {
            H2(this.f217230r, new nfj.l(this, 24));
            return;
        }
        RecipientsPaymentsSettingsRequest$Recipient recipientsPaymentsSettingsRequest$Recipient = (RecipientsPaymentsSettingsRequest$Recipient) d0.a0(payeesConfirmationBottomSheetScreenContract$InputData.f79003b);
        String recipientId = recipientsPaymentsSettingsRequest$Recipient.f79679a;
        im9.i iVar = this.f217228p;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(nim.a.u(new im9.h(iVar, recipientId, continuation, 0), im9.i.d(iVar, null, null, 3)), new nfj.l(recipientsPaymentsSettingsRequest$Recipient, 23)), null, null, new naf.j(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217230r;
    }
}
