package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63256c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendCard[i];
        }
    }

    public BackendCard(String id10, String image, String subtitle, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63254a = id10;
        this.f63255b = image;
        this.f63256c = subtitle;
        this.d = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendCard)) {
            return false;
        }
        BackendCard backendCard = (BackendCard) obj2;
        return Intrinsics.f(this.f63254a, backendCard.f63254a) && Intrinsics.f(this.f63255b, backendCard.f63255b) && Intrinsics.f(this.f63256c, backendCard.f63256c) && Intrinsics.f(this.d, backendCard.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f63254a.hashCode() * 31, 31, this.f63255b), 31, this.f63256c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63254a);
        dest.writeString(this.f63255b);
        dest.writeString(this.f63256c);
        dest.writeString(this.d);
    }
}
