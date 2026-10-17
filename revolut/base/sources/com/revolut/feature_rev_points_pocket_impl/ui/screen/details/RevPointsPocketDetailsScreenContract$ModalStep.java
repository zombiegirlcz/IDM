package com.revolut.feature_rev_points_pocket_impl.ui.screen.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature_rev_points_pocket_impl/ui/screen/details/RevPointsPocketDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ThresholdsBreakdown", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/details/RevPointsPocketDetailsScreenContract$ModalStep$ThresholdsBreakdown;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsPocketDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/details/RevPointsPocketDetailsScreenContract$ModalStep$ThresholdsBreakdown;", "Lcom/revolut/feature_rev_points_pocket_impl/ui/screen/details/RevPointsPocketDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_pocket_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThresholdsBreakdown extends RevPointsPocketDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ThresholdsBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f97813a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ThresholdsBreakdown.class, parcel, arrayList, iE, 1);
                }
                return new ThresholdsBreakdown(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThresholdsBreakdown[i];
            }
        }

        public ThresholdsBreakdown(List thresholds) {
            Intrinsics.checkNotNullParameter(thresholds, "thresholds");
            this.f97813a = thresholds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ThresholdsBreakdown) && Intrinsics.f(this.f97813a, ((ThresholdsBreakdown) obj2).f97813a);
        }

        public final int hashCode() {
            return this.f97813a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f97813a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private RevPointsPocketDetailsScreenContract$ModalStep() {
    }
}
