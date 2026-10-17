package com.revolut.feature.onboarding.impl.qes_terms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.confirmation_code.data.OtpTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/data/QesTermsOtpTask;", "Lcom/revolut/feature/confirmation_code/data/OtpTask;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QesTermsOtpTask implements OtpTask {

    @NotNull
    public static final Parcelable.Creator<QesTermsOtpTask> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78555a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QesTermsOtpTask(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QesTermsOtpTask[i];
        }
    }

    public QesTermsOtpTask(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f78555a = taskId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof QesTermsOtpTask) && Intrinsics.f(this.f78555a, ((QesTermsOtpTask) obj2).f78555a);
    }

    @Override // com.revolut.feature.confirmation_code.data.OtpTask
    /* JADX INFO: renamed from: getTaskId, reason: from getter */
    public final String getF78555a() {
        return this.f78555a;
    }

    public final int hashCode() {
        return this.f78555a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78555a);
    }
}
