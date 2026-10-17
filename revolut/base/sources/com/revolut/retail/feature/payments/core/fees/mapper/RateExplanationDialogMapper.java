package com.revolut.retail.feature.payments.core.fees.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class RateExplanationDialogMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/core/fees/mapper/RateExplanationDialogMapper$LearnMoreFaq;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMoreFaq implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LearnMoreFaq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102137a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LearnMoreFaq(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMoreFaq[i];
            }
        }

        public LearnMoreFaq(String faqKey) {
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            this.f102137a = faqKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LearnMoreFaq) && Intrinsics.f(this.f102137a, ((LearnMoreFaq) obj2).f102137a);
        }

        public final int hashCode() {
            return this.f102137a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102137a);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public static ActionsBottomSheetController a(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_fees_bank_transfer_section_fx_rate, null, null, 14);
        List listK = v.k(new TextLocalisedClause(R$string.payments_breakdown_revolut_rate_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new LearnMoreFaq("question.what-foreign-exchange-rate-will-i-get"), "EXCHANGE_RATE_EXPLANATION_LEARN_MORE", false), 10));
        m70.a.t(t0.f186434a);
        return new ActionsBottomSheetController(new dii.a(new lw0.a(textLocalisedClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 28), null, analyticsProduct, null, null, 24));
    }
}
