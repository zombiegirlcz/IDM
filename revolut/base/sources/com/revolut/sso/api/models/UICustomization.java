package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/UICustomization;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UICustomization implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UICustomization> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f105986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmailIdentifierScreenCustomization f105987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhoneIdentifierScreenCustomization f105988c;
    public final PasswordScreenCustomization d;
    public final CombinedAuthenticationScreenCustomization e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UICustomization((Clause) parcel.readParcelable(UICustomization.class.getClassLoader()), EmailIdentifierScreenCustomization.CREATOR.createFromParcel(parcel), PhoneIdentifierScreenCustomization.CREATOR.createFromParcel(parcel), PasswordScreenCustomization.CREATOR.createFromParcel(parcel), CombinedAuthenticationScreenCustomization.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UICustomization[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UICustomization() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UICustomization)) {
            return false;
        }
        UICustomization uICustomization = (UICustomization) obj2;
        return Intrinsics.f(this.f105986a, uICustomization.f105986a) && Intrinsics.f(this.f105987b, uICustomization.f105987b) && Intrinsics.f(this.f105988c, uICustomization.f105988c) && Intrinsics.f(this.d, uICustomization.d) && Intrinsics.f(this.e, uICustomization.e);
    }

    public final int hashCode() {
        Clause clause = this.f105986a;
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((this.f105987b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31, 31, this.f105988c.f105967a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105986a, i);
        this.f105987b.writeToParcel(dest, i);
        this.f105988c.writeToParcel(dest, i);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
    }

    public UICustomization(Clause clause, EmailIdentifierScreenCustomization emailIdentifierScreenCustomization, PhoneIdentifierScreenCustomization phoneIdentifierScreenCustomization, PasswordScreenCustomization passwordScreenCustomization, CombinedAuthenticationScreenCustomization combinedAuthenticationScreenCustomization) {
        Intrinsics.checkNotNullParameter(emailIdentifierScreenCustomization, "emailIdentifierScreenCustomization");
        Intrinsics.checkNotNullParameter(phoneIdentifierScreenCustomization, "phoneIdentifierScreenCustomization");
        Intrinsics.checkNotNullParameter(passwordScreenCustomization, "passwordScreenCustomization");
        Intrinsics.checkNotNullParameter(combinedAuthenticationScreenCustomization, "combinedAuthenticationScreenCustomization");
        this.f105986a = clause;
        this.f105987b = emailIdentifierScreenCustomization;
        this.f105988c = phoneIdentifierScreenCustomization;
        this.d = passwordScreenCustomization;
        this.e = combinedAuthenticationScreenCustomization;
    }

    public /* synthetic */ UICustomization(PasswordScreenCustomization passwordScreenCustomization, CombinedAuthenticationScreenCustomization combinedAuthenticationScreenCustomization, int i) {
        this(null, new EmailIdentifierScreenCustomization(0), new PhoneIdentifierScreenCustomization(true), (i & 8) != 0 ? new PasswordScreenCustomization(31) : passwordScreenCustomization, (i & 16) != 0 ? new CombinedAuthenticationScreenCustomization(null, 7) : combinedAuthenticationScreenCustomization);
    }
}
