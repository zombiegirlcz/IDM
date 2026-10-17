package com.revolut.retail.feature.balance.picker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/JuniorInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99456c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f99457g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorInfo[i];
        }
    }

    public JuniorInfo(String id10, String firstName, String lastName, String code, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f99454a = id10;
        this.f99455b = firstName;
        this.f99456c = lastName;
        this.d = code;
        this.e = z;
        this.f = str;
        this.f99457g = com.google.android.gms.internal.mlkit_vision_face.a.o(firstName, " ", lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorInfo)) {
            return false;
        }
        JuniorInfo juniorInfo = (JuniorInfo) obj2;
        return Intrinsics.f(this.f99454a, juniorInfo.f99454a) && Intrinsics.f(this.f99455b, juniorInfo.f99455b) && Intrinsics.f(this.f99456c, juniorInfo.f99456c) && Intrinsics.f(this.d, juniorInfo.d) && this.e == juniorInfo.e && Intrinsics.f(this.f, juniorInfo.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c(this.f99454a.hashCode() * 31, 31, this.f99455b), 31, this.f99456c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99454a);
        dest.writeString(this.f99455b);
        dest.writeString(this.f99456c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
    }
}
