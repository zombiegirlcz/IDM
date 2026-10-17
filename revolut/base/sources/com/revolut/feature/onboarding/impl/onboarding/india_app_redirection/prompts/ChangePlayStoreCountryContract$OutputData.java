package com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Close", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryContract$OutputData$Close;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChangePlayStoreCountryContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryContract$OutputData$Close;", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryContract$OutputData;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Close extends ChangePlayStoreCountryContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Close f78445a = new Close();

        @NotNull
        public static final Parcelable.Creator<Close> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Close.f78445a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Close[i];
            }
        }

        private Close() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Close);
        }

        public final int hashCode() {
            return 1568689101;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private ChangePlayStoreCountryContract$OutputData() {
    }
}
