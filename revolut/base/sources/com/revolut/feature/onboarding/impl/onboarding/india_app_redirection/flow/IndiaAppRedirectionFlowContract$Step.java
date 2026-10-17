package com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DownloadIndiaApp", "ChangeCountry", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step$ChangeCountry;", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step$DownloadIndiaApp;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IndiaAppRedirectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step$DownloadIndiaApp;", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DownloadIndiaApp extends IndiaAppRedirectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DownloadIndiaApp f78442a = new DownloadIndiaApp();

        @NotNull
        public static final Parcelable.Creator<DownloadIndiaApp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DownloadIndiaApp.f78442a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DownloadIndiaApp[i];
            }
        }

        private DownloadIndiaApp() {
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

    private IndiaAppRedirectionFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step$ChangeCountry;", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/flow/IndiaAppRedirectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCountry extends IndiaAppRedirectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78441a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCountry(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCountry[i];
            }
        }

        public ChangeCountry(boolean z) {
            this.f78441a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeCountry) && this.f78441a == ((ChangeCountry) obj2).f78441a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78441a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78441a ? 1 : 0);
        }

        public ChangeCountry() {
            this(false);
        }
    }
}
