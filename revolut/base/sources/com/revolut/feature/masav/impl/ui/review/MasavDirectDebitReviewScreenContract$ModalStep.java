package com.revolut.feature.masav.impl.ui.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/masav/impl/ui/review/MasavDirectDebitReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PocketSelector", "Lcom/revolut/feature/masav/impl/ui/review/MasavDirectDebitReviewScreenContract$ModalStep$PocketSelector;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MasavDirectDebitReviewScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/review/MasavDirectDebitReviewScreenContract$ModalStep$PocketSelector;", "Lcom/revolut/feature/masav/impl/ui/review/MasavDirectDebitReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketSelector implements MasavDirectDebitReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PocketSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f78127a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketSelector((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketSelector[i];
            }
        }

        public PocketSelector(d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f78127a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketSelector) && Intrinsics.f(this.f78127a, ((PocketSelector) obj2).f78127a);
        }

        public final int hashCode() {
            return this.f78127a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78127a);
        }
    }
}
