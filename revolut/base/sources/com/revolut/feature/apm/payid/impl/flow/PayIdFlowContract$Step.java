package com.revolut.feature.apm.payid.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Area", "CreatePayID", "Send", "AddContact", "Settings", "Otp", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$AddContact;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Area;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$CreatePayID;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Otp;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Send;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Settings;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayIdFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$AddContact;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddContact extends PayIdFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddContact f62699a = new AddContact();

        @NotNull
        public static final Parcelable.Creator<AddContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddContact.f62699a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddContact[i];
            }
        }

        private AddContact() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Area;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area extends PayIdFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Area f62700a = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f62700a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$CreatePayID;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreatePayID extends PayIdFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreatePayID f62701a = new CreatePayID();

        @NotNull
        public static final Parcelable.Creator<CreatePayID> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreatePayID.f62701a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePayID[i];
            }
        }

        private CreatePayID() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Otp;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Otp extends PayIdFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Otp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f62702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62703b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Otp((Alias) parcel.readParcelable(Otp.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Otp[i];
            }
        }

        public Otp(Alias alias, String token) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f62702a = alias;
            this.f62703b = token;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Otp)) {
                return false;
            }
            Otp otp = (Otp) obj2;
            return Intrinsics.f(this.f62702a, otp.f62702a) && Intrinsics.f(this.f62703b, otp.f62703b);
        }

        public final int hashCode() {
            return this.f62703b.hashCode() + (this.f62702a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62702a, i);
            dest.writeString(this.f62703b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Send;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send extends PayIdFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f62704a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f62704a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        private Send() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step$Settings;", "Lcom/revolut/feature/apm/payid/impl/flow/PayIdFlowContract$Step;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends PayIdFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f62705a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f62705a;
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

    private PayIdFlowContract$Step() {
    }
}
