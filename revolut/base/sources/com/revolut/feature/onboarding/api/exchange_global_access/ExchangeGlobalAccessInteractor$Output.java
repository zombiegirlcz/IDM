package com.revolut.feature.onboarding.api.exchange_global_access;

import android.os.Parcel;
import android.os.Parcelable;
import bla.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output", "Landroid/os/Parcelable;", "ShouldLaunch", "ShouldNotLaunch", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output$ShouldLaunch;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExchangeGlobalAccessInteractor$Output extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output$ShouldLaunch;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShouldLaunch implements ExchangeGlobalAccessInteractor$Output {

        @NotNull
        public static final Parcelable.Creator<ShouldLaunch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f78169a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShouldLaunch(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShouldLaunch[i];
            }
        }

        public ShouldLaunch(c predefinedFeatureState) {
            Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
            this.f78169a = predefinedFeatureState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShouldLaunch) && this.f78169a == ((ShouldLaunch) obj2).f78169a;
        }

        public final int hashCode() {
            return this.f78169a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78169a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessInteractor$Output;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShouldNotLaunch implements ExchangeGlobalAccessInteractor$Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShouldNotLaunch f78170a = new ShouldNotLaunch();

        @NotNull
        public static final Parcelable.Creator<ShouldNotLaunch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShouldNotLaunch.f78170a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShouldNotLaunch[i];
            }
        }

        private ShouldNotLaunch() {
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
