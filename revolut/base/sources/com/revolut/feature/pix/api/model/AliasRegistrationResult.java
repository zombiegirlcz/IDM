package com.revolut.feature.pix.api.model;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "Landroid/os/Parcelable;", "Laii/r;", "Success", "Pending", "Failed", "PortabilityRequired", "FailureReason", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Failed;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Pending;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Success;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AliasRegistrationResult extends Parcelable, r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Failed;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failed implements AliasRegistrationResult {

        @NotNull
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FailureReason f80383a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed(FailureReason.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failed[i];
            }
        }

        public Failed() {
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
            return (obj2 instanceof Failed) && this.f80383a == ((Failed) obj2).f80383a;
        }

        public final int hashCode() {
            return this.f80383a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80383a.writeToParcel(dest, i);
        }

        public Failed(FailureReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f80383a = reason;
        }

        public /* synthetic */ Failed(int i) {
            this(FailureReason.UNKNOWN);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$FailureReason;", "Landroid/os/Parcelable;", "", "CLAIM_UNSUPPORTED", "TAX_ID_UNDER_ANALYSIS", "TAX_ID_NOT_FOUND", "UNKNOWN", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FailureReason implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason CLAIM_UNSUPPORTED;

        @NotNull
        public static final Parcelable.Creator<FailureReason> CREATOR;
        public static final FailureReason TAX_ID_NOT_FOUND;
        public static final FailureReason TAX_ID_UNDER_ANALYSIS;
        public static final FailureReason UNKNOWN;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return FailureReason.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FailureReason[i];
            }
        }

        static {
            FailureReason failureReason = new FailureReason("CLAIM_UNSUPPORTED", 0);
            CLAIM_UNSUPPORTED = failureReason;
            FailureReason failureReason2 = new FailureReason("TAX_ID_UNDER_ANALYSIS", 1);
            TAX_ID_UNDER_ANALYSIS = failureReason2;
            FailureReason failureReason3 = new FailureReason("TAX_ID_NOT_FOUND", 2);
            TAX_ID_NOT_FOUND = failureReason3;
            FailureReason failureReason4 = new FailureReason("UNKNOWN", 3);
            UNKNOWN = failureReason4;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4};
            $VALUES = failureReasonArr;
            $ENTRIES = s.n(failureReasonArr);
            CREATOR = new a();
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Pending;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pending implements AliasRegistrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f80384a = new Pending();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pending.f80384a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        private Pending() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "FromSameOwnership", "FromDifferentOwnership", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired$FromDifferentOwnership;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired$FromSameOwnership;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PortabilityRequired implements AliasRegistrationResult {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired$FromDifferentOwnership;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FromDifferentOwnership extends PortabilityRequired {

            @NotNull
            public static final Parcelable.Creator<FromDifferentOwnership> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PortabilityRequestArgsModel.DifferentOwnership f80385a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromDifferentOwnership(PortabilityRequestArgsModel.DifferentOwnership.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FromDifferentOwnership[i];
                }
            }

            public FromDifferentOwnership(PortabilityRequestArgsModel.DifferentOwnership args) {
                Intrinsics.checkNotNullParameter(args, "args");
                this.f80385a = args;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FromDifferentOwnership) && Intrinsics.f(this.f80385a, ((FromDifferentOwnership) obj2).f80385a);
            }

            public final int hashCode() {
                return this.f80385a.hashCode();
            }

            @Override // com.revolut.feature.pix.api.model.AliasRegistrationResult.PortabilityRequired
            public final PortabilityRequestArgsModel j() {
                return this.f80385a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f80385a.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired$FromSameOwnership;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$PortabilityRequired;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FromSameOwnership extends PortabilityRequired {

            @NotNull
            public static final Parcelable.Creator<FromSameOwnership> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PortabilityRequestArgsModel.SameOwnership f80386a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromSameOwnership(PortabilityRequestArgsModel.SameOwnership.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FromSameOwnership[i];
                }
            }

            public FromSameOwnership(PortabilityRequestArgsModel.SameOwnership args) {
                Intrinsics.checkNotNullParameter(args, "args");
                this.f80386a = args;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FromSameOwnership) && Intrinsics.f(this.f80386a, ((FromSameOwnership) obj2).f80386a);
            }

            public final int hashCode() {
                return this.f80386a.hashCode();
            }

            @Override // com.revolut.feature.pix.api.model.AliasRegistrationResult.PortabilityRequired
            public final PortabilityRequestArgsModel j() {
                return this.f80386a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f80386a.writeToParcel(dest, i);
            }
        }

        public abstract PortabilityRequestArgsModel j();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/AliasRegistrationResult$Success;", "Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements AliasRegistrationResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixKey f80387a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((PixKey) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(PixKey pixKey) {
            Intrinsics.checkNotNullParameter(pixKey, "pixKey");
            this.f80387a = pixKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Success) && Intrinsics.f(this.f80387a, ((Success) obj2).f80387a);
        }

        public final int hashCode() {
            return this.f80387a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80387a, i);
        }
    }
}
