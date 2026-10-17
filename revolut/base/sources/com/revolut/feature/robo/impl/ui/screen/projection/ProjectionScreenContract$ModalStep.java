package com.revolut.feature.robo.impl.ui.screen.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Strategy", "EditGoal", "Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep$EditGoal;", "Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep$Strategy;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProjectionScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep$EditGoal;", "Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep;", "<init>", "()V", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditGoal implements ProjectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditGoal f85183a = new EditGoal();

        @NotNull
        public static final Parcelable.Creator<EditGoal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditGoal.f85183a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditGoal[i];
            }
        }

        private EditGoal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep$Strategy;", "Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Strategy implements ProjectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Strategy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Template f85184a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Strategy((Template) parcel.readParcelable(Strategy.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Strategy[i];
            }
        }

        public Strategy(Template selectedTemplate) {
            Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
            this.f85184a = selectedTemplate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Strategy) && Intrinsics.f(this.f85184a, ((Strategy) obj2).f85184a);
        }

        public final int hashCode() {
            return this.f85184a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85184a, i);
        }
    }
}
