package com.revolut.feature.onboarding.api.exchange_global_access;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;", "Laii/r;", "Landroid/os/Parcelable;", "Companion", "FeatureAvailable", "FeatureNotAvailable", "a", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExchangeGlobalAccessOutput extends r, Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f78173a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput$FeatureAvailable;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeatureAvailable implements ExchangeGlobalAccessOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeatureAvailable f78171a = new FeatureAvailable();

        @NotNull
        public static final Parcelable.Creator<FeatureAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeatureAvailable.f78171a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureAvailable[i];
            }
        }

        private FeatureAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput$FeatureNotAvailable;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeatureNotAvailable implements ExchangeGlobalAccessOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeatureNotAvailable f78172a = new FeatureNotAvailable();

        @NotNull
        public static final Parcelable.Creator<FeatureNotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeatureNotAvailable.f78172a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureNotAvailable[i];
            }
        }

        private FeatureNotAvailable() {
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

    /* JADX INFO: renamed from: com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f78173a = new Companion();

        private Companion() {
        }
    }
}
