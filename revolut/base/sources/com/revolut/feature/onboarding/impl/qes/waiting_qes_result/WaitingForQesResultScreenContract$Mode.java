package com.revolut.feature.onboarding.impl.qes.waiting_qes_result;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode", "Landroid/os/Parcelable;", "<init>", "()V", "InitProcessAndPollResult", "PollResult", "Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode$InitProcessAndPollResult;", "Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode$PollResult;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WaitingForQesResultScreenContract$Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode$InitProcessAndPollResult;", "Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitProcessAndPollResult extends WaitingForQesResultScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<InitProcessAndPollResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78534a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitProcessAndPollResult(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitProcessAndPollResult[i];
            }
        }

        public InitProcessAndPollResult(String passcode) {
            Intrinsics.checkNotNullParameter(passcode, "passcode");
            this.f78534a = passcode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InitProcessAndPollResult) && Intrinsics.f(this.f78534a, ((InitProcessAndPollResult) obj2).f78534a);
        }

        public final int hashCode() {
            return this.f78534a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78534a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode$PollResult;", "Lcom/revolut/feature/onboarding/impl/qes/waiting_qes_result/WaitingForQesResultScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PollResult extends WaitingForQesResultScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<PollResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ESignatureDetails f78535a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PollResult((ESignatureDetails) parcel.readParcelable(PollResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PollResult[i];
            }
        }

        public PollResult(ESignatureDetails signatureDetails) {
            Intrinsics.checkNotNullParameter(signatureDetails, "signatureDetails");
            this.f78535a = signatureDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PollResult) && Intrinsics.f(this.f78535a, ((PollResult) obj2).f78535a);
        }

        public final int hashCode() {
            return this.f78535a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78535a, i);
        }
    }

    private WaitingForQesResultScreenContract$Mode() {
    }
}
