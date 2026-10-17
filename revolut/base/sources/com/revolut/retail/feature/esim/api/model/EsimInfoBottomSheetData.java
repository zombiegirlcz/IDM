package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Content", "Item", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimInfoBottomSheetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimInfoBottomSheetData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Content f100286c;
    public final EsimHyperText d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content;", "Landroid/os/Parcelable;", "Items", "Text", "Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content$Items;", "Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content$Text;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Content extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content$Items;", "Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Items implements Content {

            @NotNull
            public static final Parcelable.Creator<Items> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f100287a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Items(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Items[i];
                }
            }

            public Items(ArrayList items) {
                Intrinsics.checkNotNullParameter(items, "items");
                this.f100287a = items;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Items) && this.f100287a.equals(((Items) obj2).f100287a);
            }

            public final int hashCode() {
                return this.f100287a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f100287a, dest);
                while (itY.hasNext()) {
                    ((Item) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content$Text;", "Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Content;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Text implements Content {

            @NotNull
            public static final Parcelable.Creator<Text> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EsimHyperText f100288a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Text(EsimHyperText.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Text[i];
                }
            }

            public Text(EsimHyperText content) {
                Intrinsics.checkNotNullParameter(content, "content");
                this.f100288a = content;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Text) && Intrinsics.f(this.f100288a, ((Text) obj2).f100288a);
            }

            public final int hashCode() {
                return this.f100288a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f100288a.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimInfoBottomSheetData$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimIcon f100289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimHyperText f100291c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item((EsimIcon) parcel.readParcelable(Item.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : EsimHyperText.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(EsimIcon esimIcon, String text, EsimHyperText esimHyperText) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f100289a = esimIcon;
            this.f100290b = text;
            this.f100291c = esimHyperText;
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
            return Intrinsics.f(this.f100289a, item.f100289a) && Intrinsics.f(this.f100290b, item.f100290b) && Intrinsics.f(this.f100291c, item.f100291c);
        }

        public final int hashCode() {
            EsimIcon esimIcon = this.f100289a;
            int iC = p.a.c((esimIcon == null ? 0 : esimIcon.hashCode()) * 31, 31, this.f100290b);
            EsimHyperText esimHyperText = this.f100291c;
            return iC + (esimHyperText != null ? esimHyperText.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100289a, i);
            dest.writeString(this.f100290b);
            EsimHyperText esimHyperText = this.f100291c;
            if (esimHyperText == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                esimHyperText.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimInfoBottomSheetData(parcel.readString(), parcel.readString(), (Content) parcel.readParcelable(EsimInfoBottomSheetData.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimHyperText.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInfoBottomSheetData[i];
        }
    }

    public EsimInfoBottomSheetData(String title, String str, Content content, EsimHyperText esimHyperText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f100284a = title;
        this.f100285b = str;
        this.f100286c = content;
        this.d = esimHyperText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimInfoBottomSheetData)) {
            return false;
        }
        EsimInfoBottomSheetData esimInfoBottomSheetData = (EsimInfoBottomSheetData) obj2;
        return Intrinsics.f(this.f100284a, esimInfoBottomSheetData.f100284a) && Intrinsics.f(this.f100285b, esimInfoBottomSheetData.f100285b) && Intrinsics.f(this.f100286c, esimInfoBottomSheetData.f100286c) && Intrinsics.f(this.d, esimInfoBottomSheetData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f100284a.hashCode() * 31;
        String str = this.f100285b;
        int iHashCode2 = (this.f100286c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        EsimHyperText esimHyperText = this.d;
        return iHashCode2 + (esimHyperText != null ? esimHyperText.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100284a);
        dest.writeString(this.f100285b);
        dest.writeParcelable(this.f100286c, i);
        EsimHyperText esimHyperText = this.d;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
    }
}
