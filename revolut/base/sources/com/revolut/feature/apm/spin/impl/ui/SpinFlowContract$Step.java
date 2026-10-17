package com.revolut.feature.apm.spin.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "NewContact", "RecipientsList", "Settings", "Deregister", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Deregister;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$RecipientsList;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Settings;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpinFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Deregister;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deregister implements SpinFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Deregister> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62866a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deregister(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deregister[i];
            }
        }

        public Deregister(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f62866a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deregister) && Intrinsics.f(this.f62866a, ((Deregister) obj2).f62866a);
        }

        public final int hashCode() {
            return this.f62866a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62866a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Intro;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro implements SpinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f62867a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f62867a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact implements SpinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f62868a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f62868a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$RecipientsList;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientsList implements SpinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientsList f62869a = new RecipientsList();

        @NotNull
        public static final Parcelable.Creator<RecipientsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientsList.f62869a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientsList[i];
            }
        }

        private RecipientsList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step$Settings;", "Lcom/revolut/feature/apm/spin/impl/ui/SpinFlowContract$Step;", "<init>", "()V", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings implements SpinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f62870a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f62870a;
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
