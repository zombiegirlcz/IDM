package com.revolut.sso.impl.ui.password_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode", "Landroid/os/Parcelable;", "Confirmation", "Default", "Welcome", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Confirmation;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Default;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Welcome;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PasswordFlowContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Default;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements PasswordFlowContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f106620b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(0);
        }

        @Override // com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Mode
        /* JADX INFO: renamed from: B7, reason: from getter */
        public final Integer getD() {
            return this.f106620b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return this.f106619a == r56.f106619a && Intrinsics.f(this.f106620b, r56.f106620b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f106619a) * 31;
            Integer num = this.f106620b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106619a ? 1 : 0);
            Integer num = this.f106620b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public Default(boolean z, Integer num) {
            this.f106619a = z;
            this.f106620b = num;
        }

        public /* synthetic */ Default(int i) {
            this(false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Welcome;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Welcome implements PasswordFlowContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Welcome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f106621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f106622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f106623c;
        public final Integer d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Welcome((Clause) parcel.readParcelable(Welcome.class.getClassLoader()), (Image) parcel.readParcelable(Welcome.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Welcome[i];
            }
        }

        public Welcome(Clause message, Image image, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f106621a = message;
            this.f106622b = image;
            this.f106623c = z;
            this.d = num;
        }

        @Override // com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Mode
        /* JADX INFO: renamed from: B7, reason: from getter */
        public final Integer getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Welcome)) {
                return false;
            }
            Welcome welcome = (Welcome) obj2;
            return Intrinsics.f(this.f106621a, welcome.f106621a) && Intrinsics.f(this.f106622b, welcome.f106622b) && this.f106623c == welcome.f106623c && Intrinsics.f(this.d, welcome.d);
        }

        public final int hashCode() {
            int iHashCode = this.f106621a.hashCode() * 31;
            Image image = this.f106622b;
            int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f106623c);
            Integer num = this.d;
            return iC + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106621a, i);
            dest.writeParcelable(this.f106622b, i);
            dest.writeInt(this.f106623c ? 1 : 0);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    /* JADX INFO: renamed from: B7 */
    Integer getD();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode$Confirmation;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements PasswordFlowContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f106618b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(boolean z, Integer num) {
            this.f106617a = z;
            this.f106618b = num;
        }

        @Override // com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Mode
        /* JADX INFO: renamed from: B7, reason: from getter */
        public final Integer getD() {
            return this.f106618b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return this.f106617a == confirmation.f106617a && Intrinsics.f(this.f106618b, confirmation.f106618b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f106617a) * 31;
            Integer num = this.f106618b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106617a ? 1 : 0);
            Integer num = this.f106618b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public Confirmation() {
            this(false, null);
        }
    }
}
