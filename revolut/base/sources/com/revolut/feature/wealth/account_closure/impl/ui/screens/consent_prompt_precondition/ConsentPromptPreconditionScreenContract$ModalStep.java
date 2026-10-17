package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/screens/consent_prompt_precondition/ConsentPromptPreconditionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ReviewClosureConditions", "Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/consent_prompt_precondition/ConsentPromptPreconditionScreenContract$ModalStep$ReviewClosureConditions;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConsentPromptPreconditionScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/consent_prompt_precondition/ConsentPromptPreconditionScreenContract$ModalStep$ReviewClosureConditions;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/consent_prompt_precondition/ConsentPromptPreconditionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewClosureConditions implements ConsentPromptPreconditionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReviewClosureConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xug.a f94932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f94933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94934c;
        public final AccountClosureFeedbackOptions d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewClosureConditions(xug.a.valueOf(parcel.readString()), (TradingAccount) parcel.readParcelable(ReviewClosureConditions.class.getClassLoader()), parcel.readString(), (AccountClosureFeedbackOptions) parcel.readParcelable(ReviewClosureConditions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewClosureConditions[i];
            }
        }

        public ReviewClosureConditions(xug.a type, TradingAccount account, String portfolioId, AccountClosureFeedbackOptions feedbackOptions) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
            this.f94932a = type;
            this.f94933b = account;
            this.f94934c = portfolioId;
            this.d = feedbackOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewClosureConditions)) {
                return false;
            }
            ReviewClosureConditions reviewClosureConditions = (ReviewClosureConditions) obj2;
            return this.f94932a == reviewClosureConditions.f94932a && Intrinsics.f(this.f94933b, reviewClosureConditions.f94933b) && Intrinsics.f(this.f94934c, reviewClosureConditions.f94934c) && Intrinsics.f(this.d, reviewClosureConditions.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(o.b(this.f94933b, this.f94932a.hashCode() * 31, 31), 31, this.f94934c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94932a.name());
            dest.writeParcelable(this.f94933b, i);
            dest.writeString(this.f94934c);
            dest.writeParcelable(this.d, i);
        }
    }
}
