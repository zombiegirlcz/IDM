package com.revolut.feature.retail.global_accounts.impl.onboarding.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CreateCountryProfileArticle", "CountrySelector", "Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step$CountrySelector;", "Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step$CreateCountryProfileArticle;", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CountryProfileOnboardingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step$CountrySelector;", "Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountrySelector implements CountryProfileOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountrySelector f82641a = new CountrySelector();

        @NotNull
        public static final Parcelable.Creator<CountrySelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountrySelector.f82641a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelector[i];
            }
        }

        private CountrySelector() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step$CreateCountryProfileArticle;", "Lcom/revolut/feature/retail/global_accounts/impl/onboarding/ui/CountryProfileOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_global_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateCountryProfileArticle implements CountryProfileOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateCountryProfileArticle f82642a = new CreateCountryProfileArticle();

        @NotNull
        public static final Parcelable.Creator<CreateCountryProfileArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateCountryProfileArticle.f82642a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateCountryProfileArticle[i];
            }
        }

        private CreateCountryProfileArticle() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
