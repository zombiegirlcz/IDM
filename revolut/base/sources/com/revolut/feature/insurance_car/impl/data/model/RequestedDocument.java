package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.y1;
import kl7.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/RequestedDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/z1", "kl7/y1", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequestedDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RequestedDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f75302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75303c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f75304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y1 f75305h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RequestedDocumentRequirements f75306j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RequestedDocument(parcel.readString(), z1.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), y1.valueOf(parcel.readString()), parcel.readString(), RequestedDocumentRequirements.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestedDocument[i];
        }
    }

    public RequestedDocument(String id10, z1 type, String group, String title, String description, String hint, String str, y1 state, String str2, RequestedDocumentRequirements requirements) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.f75301a = id10;
        this.f75302b = type;
        this.f75303c = group;
        this.d = title;
        this.e = description;
        this.f = hint;
        this.f75304g = str;
        this.f75305h = state;
        this.i = str2;
        this.f75306j = requirements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RequestedDocument)) {
            return false;
        }
        RequestedDocument requestedDocument = (RequestedDocument) obj2;
        return Intrinsics.f(this.f75301a, requestedDocument.f75301a) && this.f75302b == requestedDocument.f75302b && Intrinsics.f(this.f75303c, requestedDocument.f75303c) && Intrinsics.f(this.d, requestedDocument.d) && Intrinsics.f(this.e, requestedDocument.e) && Intrinsics.f(this.f, requestedDocument.f) && Intrinsics.f(this.f75304g, requestedDocument.f75304g) && this.f75305h == requestedDocument.f75305h && Intrinsics.f(this.i, requestedDocument.i) && Intrinsics.f(this.f75306j, requestedDocument.f75306j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((this.f75302b.hashCode() + (this.f75301a.hashCode() * 31)) * 31, 31, this.f75303c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f75304g;
        int iHashCode = (this.f75305h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.i;
        return this.f75306j.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75301a);
        dest.writeString(this.f75302b.name());
        dest.writeString(this.f75303c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f75304g);
        dest.writeString(this.f75305h.name());
        dest.writeString(this.i);
        this.f75306j.writeToParcel(dest, i);
    }
}
