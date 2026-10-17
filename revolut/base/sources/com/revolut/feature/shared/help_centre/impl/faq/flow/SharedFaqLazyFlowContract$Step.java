package com.revolut.feature.shared.help_centre.impl.faq.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Faq", "HelpCenter", "RootFaq", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$Faq;", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$HelpCenter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$RootFaq;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SharedFaqLazyFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$Faq;", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq implements SharedFaqLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FaqNodeBase f86209a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Faq((FaqNodeBase) parcel.readParcelable(Faq.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        public Faq(FaqNodeBase node) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f86209a = node;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Faq) && Intrinsics.f(this.f86209a, ((Faq) obj2).f86209a);
        }

        public final int hashCode() {
            return this.f86209a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86209a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$HelpCenter;", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpCenter implements SharedFaqLazyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpCenter f86210a = new HelpCenter();

        @NotNull
        public static final Parcelable.Creator<HelpCenter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpCenter.f86210a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpCenter[i];
            }
        }

        private HelpCenter() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step$RootFaq;", "Lcom/revolut/feature/shared/help_centre/impl/faq/flow/SharedFaqLazyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RootFaq implements SharedFaqLazyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RootFaq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedFaqDestination.PassthroughData f86211a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RootFaq((SharedFaqDestination.PassthroughData) parcel.readParcelable(RootFaq.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RootFaq[i];
            }
        }

        public RootFaq(SharedFaqDestination.PassthroughData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f86211a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RootFaq) && Intrinsics.f(this.f86211a, ((RootFaq) obj2).f86211a);
        }

        public final int hashCode() {
            return this.f86211a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86211a, i);
        }
    }
}
