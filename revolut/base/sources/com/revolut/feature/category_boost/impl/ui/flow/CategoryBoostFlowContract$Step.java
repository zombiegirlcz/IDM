package com.revolut.feature.category_boost.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Introduction", "BoostSelection", "BoostsOverview", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$BoostSelection;", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$BoostsOverview;", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$Introduction;", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CategoryBoostFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$BoostSelection;", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step;", "<init>", "()V", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BoostSelection implements CategoryBoostFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BoostSelection f65757a = new BoostSelection();

        @NotNull
        public static final Parcelable.Creator<BoostSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BoostSelection.f65757a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoostSelection[i];
            }
        }

        private BoostSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$BoostsOverview;", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step;", "<init>", "()V", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BoostsOverview implements CategoryBoostFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BoostsOverview f65758a = new BoostsOverview();

        @NotNull
        public static final Parcelable.Creator<BoostsOverview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BoostsOverview.f65758a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoostsOverview[i];
            }
        }

        private BoostsOverview() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step$Introduction;", "Lcom/revolut/feature/category_boost/impl/ui/flow/CategoryBoostFlowContract$Step;", "<init>", "()V", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Introduction implements CategoryBoostFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Introduction f65759a = new Introduction();

        @NotNull
        public static final Parcelable.Creator<Introduction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Introduction.f65759a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Introduction[i];
            }
        }

        private Introduction() {
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
}
