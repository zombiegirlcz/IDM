package o9k;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.t1;
import nii.u1;
import o9k.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f223290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferData f223291c;

    public /* synthetic */ a0(j0 j0Var, PeerToPeerTransferData peerToPeerTransferData, int i) {
        this.f223289a = i;
        this.f223290b = j0Var;
        this.f223291c = peerToPeerTransferData;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        String str;
        List listL;
        int i = this.f223289a;
        PeerToPeerTransferData transferData = this.f223291c;
        j0 j0Var = this.f223290b;
        switch (i) {
            case 0:
                o transactionResult = (o) obj2;
                Intrinsics.checkNotNullParameter(transactionResult, "loadTransactionResult");
                v0 v0Var = j0Var.f223322l.f223380c;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                if ((transactionResult instanceof n) || Intrinsics.f(transactionResult, o.a.f223342a) || (transactionResult instanceof p) || (transactionResult instanceof q)) {
                    return null;
                }
                if (transactionResult instanceof r) {
                    PeerToPeerTransferDescriptor descriptor = ((r) transactionResult).f223353a;
                    w0 w0Var = (w0) v0Var;
                    w0Var.getClass();
                    Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    u0 u0Var = w0Var.f223373l;
                    PeerToPeerRecipient recipient = transferData.f102247g;
                    dj0.d amount = transferData.f102256s;
                    u0Var.getClass();
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    return ((wpf.a) u0Var.f223368a).c(new TextClause(t8k.a.f(recipient), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_outgoing_status_success_arriving_instantly, null, null, 14), amount).f216244b;
                }
                if (transactionResult instanceof v) {
                    w0 w0Var2 = (w0) v0Var;
                    w0Var2.getClass();
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    u0 u0Var2 = w0Var2.f223373l;
                    dj0.d amount2 = transferData.f102256s;
                    String beneficiaryName = t8k.a.f(transferData.f102247g);
                    u0Var2.getClass();
                    Intrinsics.checkNotNullParameter(amount2, "amount");
                    Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
                    return ((wpf.a) u0Var2.f223368a).a(amount2.a(), new TextClause(beneficiaryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)).f216244b;
                }
                if (!(transactionResult instanceof u)) {
                    if (transactionResult instanceof s) {
                        return ((w0) v0Var).b3(transferData, ((s) transactionResult).f223358b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                u uVar = (u) transactionResult;
                bgf.e popup = uVar.f223366b.f15198c;
                int i2 = w.f223372a[uVar.f223365a.ordinal()];
                if (i2 == 1) {
                    if (popup == null) {
                        return null;
                    }
                    w0 w0Var3 = (w0) v0Var;
                    w0Var3.getClass();
                    Intrinsics.checkNotNullParameter(popup, "popup");
                    u0 u0Var3 = w0Var3.f223373l;
                    String title = popup.f15192b;
                    String str2 = popup.f15193c;
                    bgf.d dVar = popup.e;
                    str = dVar != null ? dVar.f15190a : null;
                    u0Var3.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    return ((wpf.a) u0Var3.f223368a).e(title, str2, str).f216244b;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (popup == null) {
                    return null;
                }
                w0 w0Var4 = (w0) v0Var;
                w0Var4.getClass();
                Intrinsics.checkNotNullParameter(popup, "popup");
                u0 u0Var4 = w0Var4.f223373l;
                String title2 = popup.f15192b;
                String str3 = popup.f15193c;
                bgf.d dVar2 = popup.e;
                str = dVar2 != null ? dVar2.f15190a : null;
                u0Var4.getClass();
                Intrinsics.checkNotNullParameter(title2, "title");
                return ((wpf.a) u0Var4.f223368a).d(title2, str3, str).f216244b;
            case 1:
                h resultBehaviour = (h) obj2;
                Intrinsics.checkNotNullParameter(resultBehaviour, "behaviour");
                v0 v0Var2 = (v0) j0Var.o.f189085b;
                Intrinsics.checkNotNullParameter(resultBehaviour, "resultBehaviour");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                if ((resultBehaviour instanceof d) || (resultBehaviour instanceof e)) {
                    return null;
                }
                if (!(resultBehaviour instanceof f)) {
                    if (resultBehaviour instanceof g) {
                        return ((w0) v0Var2).b3(transferData, ((g) resultBehaviour).f223310b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                qua.p descriptor2 = ((f) resultBehaviour).f223307a;
                w0 w0Var5 = (w0) v0Var2;
                w0Var5.getClass();
                Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                u0 u0Var5 = w0Var5.f223373l;
                PeerToPeerRecipient recipient2 = transferData.f102247g;
                TransferScheduleData scheduleData = transferData.f102252n;
                dj0.d amount3 = transferData.f102256s;
                String note = transferData.i;
                u0Var5.getClass();
                Intrinsics.checkNotNullParameter(recipient2, "recipient");
                Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
                Intrinsics.checkNotNullParameter(amount3, "amount");
                Intrinsics.checkNotNullParameter(note, "note");
                cpf.b bVar = u0Var5.f223368a;
                TextClause textClause = new TextClause(t8k.a.f(recipient2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                boolean z = scheduleData.f104286b != jli.c.PERIOD_SELECTION_NONE;
                Clause timeClause = new TimeClause(scheduleData.f104285a, TimeClause.Format.DateLong.f57962b, null, null, 12);
                TextClause textClause2 = !kotlin.text.d0.W(note) ? new TextClause(note.concat("\n\n"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                if (z) {
                    boolean zIsEqual = LocalDate.now().isEqual(Instant.ofEpochMilli(scheduleData.f104285a).atZone(ZoneId.systemDefault()).toLocalDate());
                    if (zIsEqual) {
                        timeClause = new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_recurring_status_weekday_today, null, null, 14);
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_recurring_status_recurring, zhm.v.k(epf.b.e(scheduleData.f104286b), timeClause), null, 12);
                    if (zIsEqual) {
                        Object[] elements = {textClause2, textLocalisedClause, new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_recurring_status_scheduled_on_prefix_from_today, null, null, 14), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        listL = kotlin.collections.d.L(elements);
                    } else {
                        Object[] elements2 = {textClause2, textLocalisedClause};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        listL = kotlin.collections.d.L(elements2);
                    }
                } else {
                    Object[] elements3 = {textClause2, new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_recurring_status_scheduled_on, zhm.u.c(timeClause), null, 12)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    listL = kotlin.collections.d.L(elements3);
                }
                return ((wpf.a) bVar).b(amount3, textClause, new CompositeClause(listL, null, null, null, 14)).f216244b;
            default:
                MoneyRequest descriptor3 = (MoneyRequest) obj2;
                Intrinsics.checkNotNullParameter(descriptor3, "result");
                w0 w0Var6 = (w0) j0Var.f223324n;
                w0Var6.getClass();
                Intrinsics.checkNotNullParameter(descriptor3, "descriptor");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                u0 u0Var6 = w0Var6.f223373l;
                PeerToPeerRecipient recipient3 = transferData.f102247g;
                dj0.d amount4 = transferData.f102256s;
                String note2 = transferData.i;
                u0Var6.getClass();
                Intrinsics.checkNotNullParameter(recipient3, "recipient");
                Intrinsics.checkNotNullParameter(amount4, "amount");
                Intrinsics.checkNotNullParameter(note2, "note");
                TextClause receiver = new TextClause(t8k.a.f(recipient3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause3 = !kotlin.text.d0.W(note2) ? new TextClause(note2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                Intrinsics.checkNotNullParameter(amount4, "amount");
                Intrinsics.checkNotNullParameter(receiver, "receiver");
                nii.j0 configuration = new nii.j0((Clause) new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_result_incoming_success_title, zhm.v.k(new MoneyClause(amount4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), receiver), null, 12), (Clause) textClause3, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4084);
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return configuration;
        }
    }
}
