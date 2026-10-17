package com.revolut.sso.impl.ui.identifier_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.sso.api.models.EmailIdentifierScreenCustomization;
import com.revolut.sso.api.models.PhoneIdentifierScreenCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode", "Landroid/os/Parcelable;", "GetIdentifier", "SignIn", "SignUp", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$GetIdentifier;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$SignIn;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$SignUp;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IdentifierInputScreenContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$SignIn;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn implements IdentifierInputScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f106566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmailIdentifierScreenCustomization f106567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PhoneIdentifierScreenCustomization f106568c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignIn((Clause) parcel.readParcelable(SignIn.class.getClassLoader()), (EmailIdentifierScreenCustomization) parcel.readParcelable(SignIn.class.getClassLoader()), (PhoneIdentifierScreenCustomization) parcel.readParcelable(SignIn.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public SignIn(Clause clause, EmailIdentifierScreenCustomization emailIdentifierScreenCustomization, PhoneIdentifierScreenCustomization phoneIdentifierScreenCustomization, boolean z) {
            Intrinsics.checkNotNullParameter(emailIdentifierScreenCustomization, "emailIdentifierScreenCustomization");
            Intrinsics.checkNotNullParameter(phoneIdentifierScreenCustomization, "phoneIdentifierScreenCustomization");
            this.f106566a = clause;
            this.f106567b = emailIdentifierScreenCustomization;
            this.f106568c = phoneIdentifierScreenCustomization;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignIn)) {
                return false;
            }
            SignIn signIn = (SignIn) obj2;
            return Intrinsics.f(this.f106566a, signIn.f106566a) && Intrinsics.f(this.f106567b, signIn.f106567b) && Intrinsics.f(this.f106568c, signIn.f106568c) && this.d == signIn.d;
        }

        public final int hashCode() {
            Clause clause = this.f106566a;
            return Boolean.hashCode(this.d) + j6.a.c((this.f106567b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31, 31, this.f106568c.f105967a);
        }

        @Override // com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode
        /* JADX INFO: renamed from: r7, reason: from getter */
        public final boolean getF106569a() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106566a, i);
            dest.writeParcelable(this.f106567b, i);
            dest.writeParcelable(this.f106568c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: r7 */
    boolean getF106569a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$GetIdentifier;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetIdentifier implements IdentifierInputScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<GetIdentifier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106565a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetIdentifier(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetIdentifier[i];
            }
        }

        public GetIdentifier(boolean z) {
            this.f106565a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetIdentifier) && this.f106565a == ((GetIdentifier) obj2).f106565a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106565a);
        }

        @Override // com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode
        /* JADX INFO: renamed from: r7, reason: from getter */
        public final boolean getF106569a() {
            return this.f106565a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106565a ? 1 : 0);
        }

        public GetIdentifier() {
            this(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode$SignUp;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$Mode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignUp implements IdentifierInputScreenContract$Mode {

        @NotNull
        public static final Parcelable.Creator<SignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106569a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignUp(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public SignUp(boolean z) {
            this.f106569a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SignUp) && this.f106569a == ((SignUp) obj2).f106569a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106569a);
        }

        @Override // com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$Mode
        /* JADX INFO: renamed from: r7, reason: from getter */
        public final boolean getF106569a() {
            return this.f106569a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106569a ? 1 : 0);
        }

        public SignUp() {
            this(false);
        }
    }
}
