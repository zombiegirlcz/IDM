package com.revolut.feature.bank_account_switching.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wn2.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/domain/DetailsSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "wn2/b", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailsSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DetailsSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f63897b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/domain/DetailsSection$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63900c;
        public final b d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String title, String str, String str2, b bVar, String str3, String str4) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63898a = title;
            this.f63899b = str;
            this.f63900c = str2;
            this.d = bVar;
            this.e = str3;
            this.f = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return Intrinsics.f(this.f63898a, item.f63898a) && Intrinsics.f(this.f63899b, item.f63899b) && Intrinsics.f(this.f63900c, item.f63900c) && this.d == item.d && Intrinsics.f(this.e, item.e) && Intrinsics.f(this.f, item.f);
        }

        public final int hashCode() {
            int iHashCode = this.f63898a.hashCode() * 31;
            String str = this.f63899b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f63900c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            b bVar = this.d;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63898a);
            dest.writeString(this.f63899b);
            dest.writeString(this.f63900c);
            b bVar = this.d;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DetailsSection(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DetailsSection[i];
        }
    }

    public DetailsSection(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63896a = str;
        this.f63897b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DetailsSection)) {
            return false;
        }
        DetailsSection detailsSection = (DetailsSection) obj2;
        return Intrinsics.f(this.f63896a, detailsSection.f63896a) && this.f63897b.equals(detailsSection.f63897b);
    }

    public final int hashCode() {
        String str = this.f63896a;
        return this.f63897b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63896a);
        Iterator itY = j6.a.y(this.f63897b, dest);
        while (itY.hasNext()) {
            ((Item) itY.next()).writeToParcel(dest, i);
        }
    }
}
