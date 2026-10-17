package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import aii.m;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"com/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState", "Landroid/os/Parcelable;", "Laii/m;", "<init>", "()V", "Detecting", "Processing", "Finished", "Error", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Detecting;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Error;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Finished;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Processing;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProfileScannerScreenContract$ProcessingState extends m implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Detecting;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState;", "<init>", "()V", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Detecting extends ProfileScannerScreenContract$ProcessingState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Detecting f79650b = new Detecting();

        @NotNull
        public static final Parcelable.Creator<Detecting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Detecting.f79650b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Detecting[i];
            }
        }

        private Detecting() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Error;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState;", "", "toString", "()Ljava/lang/String;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends ProfileScannerScreenContract$ProcessingState {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f79651b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f79651b = throwable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f79651b, ((Error) obj2).f79651b);
        }

        public final int hashCode() {
            return this.f79651b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79651b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Finished;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState;", "<init>", "()V", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Finished extends ProfileScannerScreenContract$ProcessingState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Finished f79652b = new Finished();

        @NotNull
        public static final Parcelable.Creator<Finished> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Finished.f79652b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Finished[i];
            }
        }

        private Finished() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Processing;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState;", "", "toString", "()Ljava/lang/String;", "Type", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Processing extends ProfileScannerScreenContract$ProcessingState {

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f79653b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$ProcessingState$Processing$Type;", "Landroid/os/Parcelable;", "", "FILE", "CAMERA_STREAM", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Type implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type CAMERA_STREAM;

            @NotNull
            public static final Parcelable.Creator<Type> CREATOR;
            public static final Type FILE;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return Type.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Type[i];
                }
            }

            static {
                Type type = new Type("FILE", 0);
                FILE = type;
                Type type2 = new Type("CAMERA_STREAM", 1);
                CAMERA_STREAM = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = s.n(typeArr);
                CREATOR = new a();
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Processing(Type.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Processing[i];
            }
        }

        public Processing(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f79653b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Processing) && this.f79653b == ((Processing) obj2).f79653b;
        }

        public final int hashCode() {
            return this.f79653b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79653b.writeToParcel(dest, i);
        }
    }

    private ProfileScannerScreenContract$ProcessingState() {
    }
}
