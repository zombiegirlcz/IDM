package com.revolut.retail.feature.trading_onboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType;", "Landroid/os/Parcelable;", "BackendDriven", "FrontendDriven", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType$BackendDriven;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType$FrontendDriven;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingPartType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType$FrontendDriven;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FrontendDriven implements OnboardingPartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FrontendDriven f104094a = new FrontendDriven();

        @NotNull
        public static final Parcelable.Creator<FrontendDriven> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FrontendDriven.f104094a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FrontendDriven[i];
            }
        }

        private FrontendDriven() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType$BackendDriven;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPartType;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackendDriven implements OnboardingPartType {

        @NotNull
        public static final Parcelable.Creator<BackendDriven> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104093a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackendDriven(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackendDriven[i];
            }
        }

        public BackendDriven(boolean z) {
            this.f104093a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BackendDriven) && this.f104093a == ((BackendDriven) obj2).f104093a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104093a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104093a ? 1 : 0);
        }

        public BackendDriven() {
            this(false);
        }
    }
}
