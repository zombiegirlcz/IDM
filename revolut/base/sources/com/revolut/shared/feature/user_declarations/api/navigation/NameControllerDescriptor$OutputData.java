package com.revolut.shared.feature.user_declarations.api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.user_declarations.api.models.NativeName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/NameControllerDescriptor$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NameControllerDescriptor$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<NameControllerDescriptor$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105061c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NativeName f105062g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NameControllerDescriptor$OutputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NativeName.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NameControllerDescriptor$OutputData[i];
        }
    }

    public NameControllerDescriptor$OutputData(String firstName, String str, String str2, String str3, String str4, String str5, NativeName nativeName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f105059a = firstName;
        this.f105060b = str;
        this.f105061c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f105062g = nativeName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NameControllerDescriptor$OutputData)) {
            return false;
        }
        NameControllerDescriptor$OutputData nameControllerDescriptor$OutputData = (NameControllerDescriptor$OutputData) obj2;
        return Intrinsics.f(this.f105059a, nameControllerDescriptor$OutputData.f105059a) && Intrinsics.f(this.f105060b, nameControllerDescriptor$OutputData.f105060b) && Intrinsics.f(this.f105061c, nameControllerDescriptor$OutputData.f105061c) && Intrinsics.f(this.d, nameControllerDescriptor$OutputData.d) && Intrinsics.f(this.e, nameControllerDescriptor$OutputData.e) && Intrinsics.f(this.f, nameControllerDescriptor$OutputData.f) && Intrinsics.f(this.f105062g, nameControllerDescriptor$OutputData.f105062g);
    }

    public final int hashCode() {
        int iHashCode = this.f105059a.hashCode() * 31;
        String str = this.f105060b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105061c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        NativeName nativeName = this.f105062g;
        return iHashCode6 + (nativeName != null ? nativeName.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105059a);
        dest.writeString(this.f105060b);
        dest.writeString(this.f105061c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        NativeName nativeName = this.f105062g;
        if (nativeName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            nativeName.writeToParcel(dest, i);
        }
    }
}
