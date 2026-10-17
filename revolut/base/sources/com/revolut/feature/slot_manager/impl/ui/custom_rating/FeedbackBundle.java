package com.revolut.feature.slot_manager.impl.ui.custom_rating;

import android.os.Parcel;
import android.os.Parcelable;
import bld.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/ui/custom_rating/FeedbackBundle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedbackBundle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeedbackBundle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87354b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedbackBundle(parcel.readString(), ((o) parcel.readValue(FeedbackBundle.class.getClassLoader())).f16549a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedbackBundle[i];
        }
    }

    public FeedbackBundle(String feedbackId, int i) {
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        this.f87353a = feedbackId;
        this.f87354b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeedbackBundle)) {
            return false;
        }
        FeedbackBundle feedbackBundle = (FeedbackBundle) obj2;
        return Intrinsics.f(this.f87353a, feedbackBundle.f87353a) && this.f87354b == feedbackBundle.f87354b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87354b) + (this.f87353a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87353a);
        dest.writeValue(new o(this.f87354b));
    }
}
