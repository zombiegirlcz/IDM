package o9k;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.transfer.JuniorPocketCreationDialogFactory$PocketCreatedPayload;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import nii.u1;
import nii.w1;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends yji.n implements v0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0 f223373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f223374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cpf.c f223375n;

    public w0(u0 dialogFactory, b navigationFactory, cpf.c transferResultHandlerExtension) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(transferResultHandlerExtension, "transferResultHandlerExtension");
        this.f223373l = dialogFactory;
        this.f223374m = navigationFactory;
        this.f223375n = transferResultHandlerExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nii.m0 Z2(java.lang.Throwable r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.w0.Z2(java.lang.Throwable):nii.m0");
    }

    public final nii.j0 b3(PeerToPeerTransferData transferData, q9k.a juniorWithPockets) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        TransferScheduleData scheduleData = transferData.f102252n;
        dj0.d amount = transferData.f102256s;
        u0 u0Var = this.f223373l;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        a aVar = u0Var.d;
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        Intrinsics.checkNotNullParameter(amount, "amount");
        LocalDateTime localDateTimeF = ((l80.f) aVar.f223288a).f();
        LocalDateTime localDateTimeB = scheduleData != null ? n1l.b.b(scheduleData, localDateTimeF) : null;
        CurrencyClause.Format.DisplayName displayName = CurrencyClause.Format.DisplayName.f57755a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (localDateTimeB == null || !localDateTimeB.isAfter(localDateTimeF)) {
            int i = R$string.multi_currency_account_footer_confirmation_title;
            xi0.b bVar = amount.f115083b;
            xi0.b bVar2 = amount.f115083b;
            textLocalisedClause = new TextLocalisedClause(i, zhm.v.k(new CurrencyClause(bVar, ticker, null, 4), new TextClause(juniorWithPockets.f243914a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            textLocalisedClause2 = new TextLocalisedClause(R$string.multi_currency_account_footer_confirmation_subtitle, zhm.v.k(new CurrencyClause(bVar2, displayName, null, 4), new TextClause(juniorWithPockets.f243914a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(bVar2, ticker, null, 4), new CurrencyClause(bVar2, ticker, null, 4)), null, 12);
        } else {
            int i2 = R$string.multi_currency_account_footer_confirmation_future_title;
            xi0.b bVar3 = amount.f115083b;
            xi0.b bVar4 = amount.f115083b;
            textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(new CurrencyClause(bVar3, ticker, null, 4), new TextClause(juniorWithPockets.f243914a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(oi0.d.R(localDateTimeB), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12);
            textLocalisedClause2 = new TextLocalisedClause(R$string.multi_currency_account_footer_confirmation_future_subtitle, zhm.v.k(new CurrencyClause(bVar4, displayName, null, 4), new TextClause(juniorWithPockets.f243914a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(bVar4, ticker, null, 4), new CurrencyClause(bVar4, ticker, null, 4)), null, 12);
        }
        nii.j0 configuration = new nii.j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) JuniorPocketCreationDialogFactory$PocketCreatedPayload.f102374a, (u1) new w1(6, new TextLocalisedClause(R$string.multi_currency_account_footer_confirmation_action_got_it, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4068);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration;
    }

    public final void c3(n1 result, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if (result.a().a() instanceof JuniorPocketCreationDialogFactory$PocketCreatedPayload) {
            onFinish.invoke(Boolean.FALSE);
        } else {
            ((wpf.c) this.f223375n).b3(result, onFinish);
        }
    }
}
