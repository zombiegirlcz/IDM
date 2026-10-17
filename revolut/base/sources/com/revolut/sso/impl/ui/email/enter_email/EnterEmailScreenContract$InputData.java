package com.revolut.sso.impl.ui.email.enter_email;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnterEmailScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EnterEmailScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f106527a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode;", "Landroid/os/Parcelable;", "LostAccess", "Create", "Verify", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$Create;", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$LostAccess;", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$Verify;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$Create;", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Create implements Mode {

            @NotNull
            public static final Parcelable.Creator<Create> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f106528a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Create(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Create[i];
                }
            }

            public Create(boolean z) {
                this.f106528a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Create) && this.f106528a == ((Create) obj2).f106528a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f106528a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f106528a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$LostAccess;", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class LostAccess implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LostAccess f106529a = new LostAccess();

            @NotNull
            public static final Parcelable.Creator<LostAccess> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LostAccess.f106529a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LostAccess[i];
                }
            }

            private LostAccess() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode$Verify;", "Lcom/revolut/sso/impl/ui/email/enter_email/EnterEmailScreenContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Verify implements Mode {

            @NotNull
            public static final Parcelable.Creator<Verify> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106530a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Verify(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Verify[i];
                }
            }

            public Verify(String currentEmail) {
                Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
                this.f106530a = currentEmail;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Verify) && Intrinsics.f(this.f106530a, ((Verify) obj2).f106530a);
            }

            public final int hashCode() {
                return this.f106530a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f106530a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EnterEmailScreenContract$InputData((Mode) parcel.readParcelable(EnterEmailScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EnterEmailScreenContract$InputData[i];
        }
    }

    public EnterEmailScreenContract$InputData(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f106527a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EnterEmailScreenContract$InputData) && Intrinsics.f(this.f106527a, ((EnterEmailScreenContract$InputData) obj2).f106527a);
    }

    public final int hashCode() {
        return this.f106527a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106527a, i);
    }
}
