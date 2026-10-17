package iq6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.flexible.staking.consent.impl.R$string;
import mii.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0937a Companion = new C0937a();

    /* JADX INFO: renamed from: iq6.a$a, reason: collision with other inner class name */
    public static final class C0937a {
        private C0937a() {
        }
    }

    public final k a(boolean z) {
        return new k("AUTO_STAKING_SETTING_RESULT_SHOT_ID", z ? new TextLocalisedClause(R$string.crypto_staking_auto_earn_popup_on, null, null, 14) : new TextLocalisedClause(R$string.crypto_staking_auto_earn_popup_off, null, null, 14), null, null, null, 28);
    }
}
