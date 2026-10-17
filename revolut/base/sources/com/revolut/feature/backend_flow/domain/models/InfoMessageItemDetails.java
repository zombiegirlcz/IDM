package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoMessageItemDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoMessageItemDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoMessageItemDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63513c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InfoMessageItemDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoMessageItemDetails[i];
        }
    }

    public InfoMessageItemDetails(String title, String description, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f63511a = title;
        this.f63512b = description;
        this.f63513c = buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoMessageItemDetails)) {
            return false;
        }
        InfoMessageItemDetails infoMessageItemDetails = (InfoMessageItemDetails) obj2;
        return Intrinsics.f(this.f63511a, infoMessageItemDetails.f63511a) && Intrinsics.f(this.f63512b, infoMessageItemDetails.f63512b) && Intrinsics.f(this.f63513c, infoMessageItemDetails.f63513c);
    }

    public final int hashCode() {
        return this.f63513c.hashCode() + p.a.c(this.f63511a.hashCode() * 31, 31, this.f63512b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63511a);
        dest.writeString(this.f63512b);
        dest.writeString(this.f63513c);
    }
}
