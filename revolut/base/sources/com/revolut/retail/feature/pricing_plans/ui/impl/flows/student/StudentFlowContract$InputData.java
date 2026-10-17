package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StudentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f103261a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode;", "Landroid/os/Parcelable;", "VerificationCode", "Verification", "Default", "Status", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Status;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Verification;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$VerificationCode;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f103262a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f103262a;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Status;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Status implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Status f103263a = new Status();

            @NotNull
            public static final Parcelable.Creator<Status> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Status.f103263a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Status[i];
                }
            }

            private Status() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$Verification;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Verification implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Verification f103264a = new Verification();

            @NotNull
            public static final Parcelable.Creator<Verification> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Verification.f103264a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Verification[i];
                }
            }

            private Verification() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode$VerificationCode;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/student/StudentFlowContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VerificationCode implements Mode {

            @NotNull
            public static final Parcelable.Creator<VerificationCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f103265a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VerificationCode(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new VerificationCode[i];
                }
            }

            public VerificationCode(String verificationCode) {
                Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
                this.f103265a = verificationCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof VerificationCode) && Intrinsics.f(this.f103265a, ((VerificationCode) obj2).f103265a);
            }

            public final int hashCode() {
                return this.f103265a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f103265a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StudentFlowContract$InputData((Mode) parcel.readParcelable(StudentFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StudentFlowContract$InputData[i];
        }
    }

    public StudentFlowContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof StudentFlowContract$InputData) && Intrinsics.f(this.f103261a, ((StudentFlowContract$InputData) obj2).f103261a);
    }

    public final int hashCode() {
        return this.f103261a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103261a, i);
    }

    public StudentFlowContract$InputData(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f103261a = mode;
    }

    public /* synthetic */ StudentFlowContract$InputData(int i) {
        this(Mode.Default.f103262a);
    }
}
