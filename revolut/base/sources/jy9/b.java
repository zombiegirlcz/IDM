package jy9;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import iy9.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final iy9.b a(RecipientPaymentsSettings.Setting setting) {
        Intrinsics.checkNotNullParameter(setting, "<this>");
        int i = a.f179351a[setting.f79675a.ordinal()];
        if (i == 1) {
            return new iy9.b(iy9.a.PEER_TO_PEER_CHAT_MESSAGING, setting.b());
        }
        if (i == 2) {
            return new iy9.b(iy9.a.BLOCK_USER, setting.b());
        }
        if (i == 3) {
            return new iy9.b(iy9.a.TWO_FA_REQUIRED, setting.b());
        }
        if (i == 4) {
            return new iy9.b(iy9.a.NOTIFICATIONS, setting.b());
        }
        if (i == 5) {
            return new iy9.b(iy9.a.HIDE_P2P_CHAT_HISTORY, setting.b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RecipientPaymentsSettings.Setting b(iy9.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        iy9.a aVar = bVar.f169640a;
        boolean z = bVar.f169641b;
        int i = a.f179352b[aVar.ordinal()];
        if (i == 1) {
            return new RecipientPaymentsSettings.Setting(c.PEER_TO_PEER_CHAT_MESSAGING, new RecipientPaymentsSettings.Setting.Value.Binary(z));
        }
        if (i == 2) {
            return new RecipientPaymentsSettings.Setting(c.BLOCK_USER, new RecipientPaymentsSettings.Setting.Value.Binary(z));
        }
        if (i == 3) {
            return new RecipientPaymentsSettings.Setting(c.TWO_FA_REQUIRED, new RecipientPaymentsSettings.Setting.Value.Binary(z));
        }
        if (i == 4) {
            return new RecipientPaymentsSettings.Setting(c.NOTIFICATIONS, new RecipientPaymentsSettings.Setting.Value.Binary(z));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError(null, 1, null);
    }
}
