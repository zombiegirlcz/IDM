package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyHostDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyHostDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyHostDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98038c;
    public final List d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyHostDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyHostDetails[i];
        }
    }

    public HotelsPropertyHostDetails(String str, String str2, String str3, List languages, boolean z) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f98036a = str;
        this.f98037b = z;
        this.f98038c = str2;
        this.d = languages;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyHostDetails)) {
            return false;
        }
        HotelsPropertyHostDetails hotelsPropertyHostDetails = (HotelsPropertyHostDetails) obj2;
        return Intrinsics.f(this.f98036a, hotelsPropertyHostDetails.f98036a) && this.f98037b == hotelsPropertyHostDetails.f98037b && Intrinsics.f(this.f98038c, hotelsPropertyHostDetails.f98038c) && Intrinsics.f(this.d, hotelsPropertyHostDetails.d) && Intrinsics.f(this.e, hotelsPropertyHostDetails.e);
    }

    public final int hashCode() {
        String str = this.f98036a;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f98037b);
        String str2 = this.f98038c;
        int iD = p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98036a);
        dest.writeInt(this.f98037b ? 1 : 0);
        dest.writeString(this.f98038c);
        dest.writeStringList(this.d);
        dest.writeString(this.e);
    }
}
