package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACProductLink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACProductLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACProductLink> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75004c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACProductLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACProductLink[i];
        }
    }

    public CFACProductLink(String placeholder, String text, String target) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f75002a = placeholder;
        this.f75003b = text;
        this.f75004c = target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACProductLink)) {
            return false;
        }
        CFACProductLink cFACProductLink = (CFACProductLink) obj2;
        return Intrinsics.f(this.f75002a, cFACProductLink.f75002a) && Intrinsics.f(this.f75003b, cFACProductLink.f75003b) && Intrinsics.f(this.f75004c, cFACProductLink.f75004c);
    }

    public final int hashCode() {
        return this.f75004c.hashCode() + p.a.c(this.f75002a.hashCode() * 31, 31, this.f75003b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75002a);
        dest.writeString(this.f75003b);
        dest.writeString(this.f75004c);
    }
}
