package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Default", "Action", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData$Action;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData$Default;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TabLifestyleScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData$Action;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements TabLifestyleScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f89916a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(Parcelable parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f89916a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Action) && Intrinsics.f(this.f89916a, ((Action) obj2).f89916a);
        }

        public final int hashCode() {
            return this.f89916a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89916a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData$Default;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$InputData;", "<init>", "()V", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements TabLifestyleScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f89917a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f89917a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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
