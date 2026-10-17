package com.revolut.otp.input.flow.email.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mni.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CheckEmail", "NoEmailOnDevice", "NoEmailReceived", "ResendMethods", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$CheckEmail;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$NoEmailOnDevice;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$NoEmailReceived;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$ResendMethods;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConfirmEmailWithOtpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$CheckEmail;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step;", "<init>", "()V", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CheckEmail extends ConfirmEmailWithOtpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckEmail f98519a = new CheckEmail();

        @NotNull
        public static final Parcelable.Creator<CheckEmail> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CheckEmail.f98519a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckEmail[i];
            }
        }

        private CheckEmail() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$NoEmailOnDevice;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoEmailOnDevice extends ConfirmEmailWithOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NoEmailOnDevice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98520a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoEmailOnDevice(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoEmailOnDevice[i];
            }
        }

        public NoEmailOnDevice(boolean z) {
            this.f98520a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NoEmailOnDevice) && this.f98520a == ((NoEmailOnDevice) obj2).f98520a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98520a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98520a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$NoEmailReceived;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoEmailReceived extends ConfirmEmailWithOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NoEmailReceived> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f98521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98522b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoEmailReceived(parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoEmailReceived[i];
            }
        }

        public NoEmailReceived(long j2, boolean z) {
            this.f98521a = j2;
            this.f98522b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoEmailReceived)) {
                return false;
            }
            NoEmailReceived noEmailReceived = (NoEmailReceived) obj2;
            return this.f98521a == noEmailReceived.f98521a && this.f98522b == noEmailReceived.f98522b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98522b) + (Long.hashCode(this.f98521a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f98521a);
            dest.writeInt(this.f98522b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step$ResendMethods;", "Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResendMethods extends ConfirmEmailWithOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ResendMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f98523a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b.valueOf(parcel.readString()));
                }
                return new ResendMethods(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResendMethods[i];
            }
        }

        public ResendMethods(List methods) {
            Intrinsics.checkNotNullParameter(methods, "methods");
            this.f98523a = methods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ResendMethods) && Intrinsics.f(this.f98523a, ((ResendMethods) obj2).f98523a);
        }

        public final int hashCode() {
            return this.f98523a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f98523a, dest);
            while (itV.hasNext()) {
                dest.writeString(((b) itV.next()).name());
            }
        }
    }

    private ConfirmEmailWithOtpFlowContract$Step() {
    }
}
