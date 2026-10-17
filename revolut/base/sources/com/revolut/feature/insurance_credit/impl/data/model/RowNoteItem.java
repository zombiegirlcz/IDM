package com.revolut.feature.insurance_credit.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dx4.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import os7.b;
import os7.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/model/RowNoteItem;", "Lcom/revolut/feature/insurance_credit/impl/data/model/ContentItem;", "", "toString", "()Ljava/lang/String;", "os7/c", "os7/b", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RowNoteItem implements ContentItem {

    @NotNull
    public static final Parcelable.Creator<RowNoteItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f75751c;
    public final c d;
    public final b e;
    public final b f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RowNoteItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RowNoteItem[i];
        }
    }

    public RowNoteItem(String id10, String title, a1 a1Var, c cVar, b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f75749a = id10;
        this.f75750b = title;
        this.f75751c = a1Var;
        this.d = cVar;
        this.e = bVar;
        this.f = bVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RowNoteItem)) {
            return false;
        }
        RowNoteItem rowNoteItem = (RowNoteItem) obj2;
        return Intrinsics.f(this.f75749a, rowNoteItem.f75749a) && Intrinsics.f(this.f75750b, rowNoteItem.f75750b) && this.f75751c == rowNoteItem.f75751c && this.d == rowNoteItem.d && this.e == rowNoteItem.e && this.f == rowNoteItem.f;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75749a.hashCode() * 31, 31, this.f75750b);
        a1 a1Var = this.f75751c;
        int iHashCode = (iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f;
        return iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75749a);
        dest.writeString(this.f75750b);
        a1 a1Var = this.f75751c;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        c cVar = this.d;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        b bVar2 = this.f;
        if (bVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar2.name());
        }
    }
}
