package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import hs3.u1;
import hs3.w1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/WaitingPopupScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WaitingPopupScreenConfig extends ScreenConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f66429c;
    public final Clause d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<WaitingPopupScreenConfig> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static WaitingPopupScreenConfig a(u1 spinnerMetadata) {
            Intrinsics.checkNotNullParameter(spinnerMetadata, "spinnerMetadata");
            w1 w1Var = spinnerMetadata.d;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_in_progress_popup_title, u.c(w1Var.f154962a), null, 12);
            String str = w1Var.f154963b;
            return new WaitingPopupScreenConfig(textLocalisedClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.credit_application_in_progress_popup_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_application_in_progress_popup_button_turn_notifications_on, null, null, 14));
        }

        public static WaitingPopupScreenConfig b() {
            return new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_manual_underwriting_prompt_waiting_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_prompt_waiting_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_prompt_waiting_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_prompt_waiting_button_turn_notifications_on, null, null, 14));
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WaitingPopupScreenConfig((Clause) parcel.readParcelable(WaitingPopupScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(WaitingPopupScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(WaitingPopupScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(WaitingPopupScreenConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WaitingPopupScreenConfig[i];
        }
    }

    public WaitingPopupScreenConfig(Clause title, Clause clause, Clause confirmButton, Clause turnOnNotificationButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(turnOnNotificationButton, "turnOnNotificationButton");
        this.f66427a = title;
        this.f66428b = clause;
        this.f66429c = confirmButton;
        this.d = turnOnNotificationButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WaitingPopupScreenConfig)) {
            return false;
        }
        WaitingPopupScreenConfig waitingPopupScreenConfig = (WaitingPopupScreenConfig) obj2;
        return Intrinsics.f(this.f66427a, waitingPopupScreenConfig.f66427a) && Intrinsics.f(this.f66428b, waitingPopupScreenConfig.f66428b) && Intrinsics.f(this.f66429c, waitingPopupScreenConfig.f66429c) && Intrinsics.f(this.d, waitingPopupScreenConfig.d);
    }

    public final int hashCode() {
        int iHashCode = this.f66427a.hashCode() * 31;
        Clause clause = this.f66428b;
        return this.d.hashCode() + p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f66429c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66427a, i);
        dest.writeParcelable(this.f66428b, i);
        dest.writeParcelable(this.f66429c, i);
        dest.writeParcelable(this.d, i);
    }
}
