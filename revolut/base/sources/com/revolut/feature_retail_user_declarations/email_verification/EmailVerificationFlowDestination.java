package com.revolut.feature_retail_user_declarations.email_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/EmailVerificationFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailVerificationFlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<EmailVerificationFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationFlowInputData f97608a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationFlowDestination(EmailVerificationFlowInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationFlowDestination[i];
        }
    }

    public EmailVerificationFlowDestination(EmailVerificationFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f97608a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EmailVerificationFlowInputData getF97608a() {
        return this.f97608a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EmailVerificationFlowDestination) && Intrinsics.f(this.f97608a, ((EmailVerificationFlowDestination) obj2).f97608a);
    }

    public final int hashCode() {
        return this.f97608a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97608a.writeToParcel(dest, i);
    }

    public EmailVerificationFlowDestination() {
        this(new EmailVerificationFlowInputData(null));
    }
}
