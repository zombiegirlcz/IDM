package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.o9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/CombinedAuthenticationScreenCustomization;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedAuthenticationScreenCustomization implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CombinedAuthenticationScreenCustomization> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f105891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9 f105892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f105893c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CombinedAuthenticationScreenCustomization((Clause) parcel.readParcelable(CombinedAuthenticationScreenCustomization.class.getClassLoader()), parcel.readInt() == 0 ? null : o9.valueOf(parcel.readString()), (Image) parcel.readParcelable(CombinedAuthenticationScreenCustomization.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedAuthenticationScreenCustomization[i];
        }
    }

    public CombinedAuthenticationScreenCustomization() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedAuthenticationScreenCustomization)) {
            return false;
        }
        CombinedAuthenticationScreenCustomization combinedAuthenticationScreenCustomization = (CombinedAuthenticationScreenCustomization) obj2;
        return Intrinsics.f(this.f105891a, combinedAuthenticationScreenCustomization.f105891a) && this.f105892b == combinedAuthenticationScreenCustomization.f105892b && Intrinsics.f(this.f105893c, combinedAuthenticationScreenCustomization.f105893c);
    }

    public final int hashCode() {
        Clause clause = this.f105891a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        o9 o9Var = this.f105892b;
        int iHashCode2 = (iHashCode + (o9Var == null ? 0 : o9Var.hashCode())) * 31;
        Image image = this.f105893c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105891a, i);
        o9 o9Var = this.f105892b;
        if (o9Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(o9Var.name());
        }
        dest.writeParcelable(this.f105893c, i);
    }

    public CombinedAuthenticationScreenCustomization(Clause clause, o9 o9Var, Image image) {
        this.f105891a = clause;
        this.f105892b = o9Var;
        this.f105893c = image;
    }

    public /* synthetic */ CombinedAuthenticationScreenCustomization(o9 o9Var, int i) {
        this(null, (i & 2) != 0 ? null : o9Var, null);
    }
}
