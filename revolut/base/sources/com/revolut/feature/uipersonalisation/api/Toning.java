package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/Toning;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Toning implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Toning> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94542b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Toning(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Toning[i];
        }
    }

    public Toning() {
        this((String) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Toning)) {
            return false;
        }
        Toning toning = (Toning) obj2;
        return Intrinsics.f(this.f94541a, toning.f94541a) && Intrinsics.f(this.f94542b, toning.f94542b);
    }

    public final int hashCode() {
        String str = this.f94541a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94542b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94541a);
        dest.writeString(this.f94542b);
    }

    public Toning(String str, String str2) {
        this.f94541a = str;
        this.f94542b = str2;
    }

    public /* synthetic */ Toning(String str, int i) {
        this((i & 1) != 0 ? null : "#DA1B8A", (i & 2) != 0 ? null : str);
    }
}
