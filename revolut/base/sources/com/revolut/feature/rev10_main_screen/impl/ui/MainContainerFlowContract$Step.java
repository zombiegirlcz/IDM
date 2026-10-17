package com.revolut.feature.rev10_main_screen.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.kompot.navigable.flow.ReusableFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/ReusableFlowStep;", "Tab", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step$Tab;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MainContainerFlowContract$Step extends ReusableFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step$Tab;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/MainContainerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tab implements MainContainerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Tab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MainScreenTab f83436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f83437b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tab((MainScreenTab) parcel.readParcelable(Tab.class.getClassLoader()), parcel.readParcelable(Tab.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tab[i];
            }
        }

        public Tab(MainScreenTab tab2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this.f83436a = tab2;
            this.f83437b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tab)) {
                return false;
            }
            Tab tab2 = (Tab) obj2;
            return Intrinsics.f(this.f83436a, tab2.f83436a) && Intrinsics.f(this.f83437b, tab2.f83437b);
        }

        @Override // com.revolut.kompot.navigable.flow.ReusableFlowStep
        public final String getKey() {
            return this.f83436a.f83420a;
        }

        public final int hashCode() {
            int iHashCode = this.f83436a.f83420a.hashCode() * 31;
            Parcelable parcelable = this.f83437b;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83436a, i);
            dest.writeParcelable(this.f83437b, i);
        }
    }
}
