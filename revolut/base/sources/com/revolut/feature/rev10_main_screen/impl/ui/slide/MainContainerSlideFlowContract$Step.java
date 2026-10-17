package com.revolut.feature.rev10_main_screen.impl.ui.slide;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dy0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Main", "Sliding", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step$Main;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step$Sliding;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MainContainerSlideFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step$Main;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step;", "<init>", "()V", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Main extends MainContainerSlideFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Main f83448a = new Main();

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Main.f83448a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        private Main() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step$Sliding;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sliding extends MainContainerSlideFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Sliding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f83449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83450b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sliding(o.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sliding[i];
            }
        }

        public Sliding(o direction, boolean z) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f83449a = direction;
            this.f83450b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Sliding)) {
                return false;
            }
            Sliding sliding = (Sliding) obj2;
            return this.f83449a == sliding.f83449a && this.f83450b == sliding.f83450b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83450b) + (this.f83449a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83449a.name());
            dest.writeInt(this.f83450b ? 1 : 0);
        }
    }

    private MainContainerSlideFlowContract$Step() {
    }
}
