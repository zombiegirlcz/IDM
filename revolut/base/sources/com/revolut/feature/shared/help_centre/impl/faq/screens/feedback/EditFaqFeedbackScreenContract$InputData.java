package com.revolut.feature.shared.help_centre.impl.faq.screens.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/feedback/EditFaqFeedbackScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditFaqFeedbackScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditFaqFeedbackScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feedback f86251a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditFaqFeedbackScreenContract$InputData((Feedback) parcel.readParcelable(EditFaqFeedbackScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditFaqFeedbackScreenContract$InputData[i];
        }
    }

    public EditFaqFeedbackScreenContract$InputData(Feedback feedback) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f86251a = feedback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EditFaqFeedbackScreenContract$InputData) && Intrinsics.f(this.f86251a, ((EditFaqFeedbackScreenContract$InputData) obj2).f86251a);
    }

    public final int hashCode() {
        return this.f86251a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86251a, i);
    }
}
