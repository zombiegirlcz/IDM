package com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/illion_bankstatements/IllionInfoPopup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IllionInfoPopup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IllionInfoPopup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66458c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IllionInfoPopup(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IllionInfoPopup[i];
        }
    }

    public IllionInfoPopup(String label, String title, String description, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f66456a = label;
        this.f66457b = title;
        this.f66458c = description;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IllionInfoPopup)) {
            return false;
        }
        IllionInfoPopup illionInfoPopup = (IllionInfoPopup) obj2;
        return Intrinsics.f(this.f66456a, illionInfoPopup.f66456a) && Intrinsics.f(this.f66457b, illionInfoPopup.f66457b) && Intrinsics.f(this.f66458c, illionInfoPopup.f66458c) && Intrinsics.f(this.d, illionInfoPopup.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f66456a.hashCode() * 31, 31, this.f66457b), 31, this.f66458c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66456a);
        dest.writeString(this.f66457b);
        dest.writeString(this.f66458c);
        dest.writeString(this.d);
    }
}
