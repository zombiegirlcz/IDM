package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowOutputData;", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Verified", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowOutputData$Verified;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EmailVerificationOtpFlowOutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowOutputData$Verified;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowOutputData;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Verified extends EmailVerificationOtpFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Verified f97627a = new Verified();

        @NotNull
        public static final Parcelable.Creator<Verified> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Verified.f97627a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Verified[i];
            }
        }

        private Verified() {
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

    private EmailVerificationOtpFlowOutputData() {
    }
}
