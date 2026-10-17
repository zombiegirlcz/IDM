package com.revolut.feature.apm.iris.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Area", "RecipientList", "NewContact", "Pay", "Settings", "Registration", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Area;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Pay;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$RecipientList;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Registration;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Settings;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IrisFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Area;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area implements IrisFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Area f62499a = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f62499a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        private Area() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro implements IrisFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f62500a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f62500a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact implements IrisFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f62501a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f62501a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        private NewContact() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Pay;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pay implements IrisFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IrisNavigation$StartType.Pay f62502a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pay((IrisNavigation$StartType.Pay) parcel.readParcelable(Pay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pay[i];
            }
        }

        public Pay(IrisNavigation$StartType.Pay startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f62502a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pay) && Intrinsics.f(this.f62502a, ((Pay) obj2).f62502a);
        }

        public final int hashCode() {
            return this.f62502a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62502a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$RecipientList;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientList implements IrisFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientList f62503a = new RecipientList();

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientList.f62503a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientList[i];
            }
        }

        private RecipientList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Registration;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registration implements IrisFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IrisRegistrationStatus.NotRegistered f62504a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registration((IrisRegistrationStatus.NotRegistered) parcel.readParcelable(Registration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registration[i];
            }
        }

        public Registration(IrisRegistrationStatus.NotRegistered status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f62504a = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registration) && Intrinsics.f(this.f62504a, ((Registration) obj2).f62504a);
        }

        public final int hashCode() {
            return this.f62504a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62504a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step$Settings;", "Lcom/revolut/feature/apm/iris/impl/ui/IrisFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings implements IrisFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f62505a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f62505a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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
