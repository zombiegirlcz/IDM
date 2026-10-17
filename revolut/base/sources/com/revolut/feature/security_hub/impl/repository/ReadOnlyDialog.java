package com.revolut.feature.security_hub.impl.repository;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/ReadOnlyDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "Button", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReadOnlyDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReadOnlyDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f85496c;
    public final Button d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/ReadOnlyDialog$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85498b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f85497a = title;
            this.f85498b = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f85497a, button.f85497a) && Intrinsics.f(this.f85498b, button.f85498b);
        }

        public final int hashCode() {
            return this.f85498b.hashCode() + (this.f85497a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85497a);
            dest.writeString(this.f85498b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/repository/ReadOnlyDialog$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f85501c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String icon, String title, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f85499a = icon;
            this.f85500b = title;
            this.f85501c = str;
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
            return Intrinsics.f(this.f85499a, item.f85499a) && Intrinsics.f(this.f85500b, item.f85500b) && Intrinsics.f(this.f85501c, item.f85501c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f85499a.hashCode() * 31, 31, this.f85500b);
            String str = this.f85501c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85499a);
            dest.writeString(this.f85500b);
            dest.writeString(this.f85501c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ReadOnlyDialog(string, string2, arrayList, parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReadOnlyDialog[i];
        }
    }

    public ReadOnlyDialog(String title, String str, ArrayList items, Button button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f85494a = title;
        this.f85495b = str;
        this.f85496c = items;
        this.d = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReadOnlyDialog)) {
            return false;
        }
        ReadOnlyDialog readOnlyDialog = (ReadOnlyDialog) obj2;
        return Intrinsics.f(this.f85494a, readOnlyDialog.f85494a) && Intrinsics.f(this.f85495b, readOnlyDialog.f85495b) && this.f85496c.equals(readOnlyDialog.f85496c) && Intrinsics.f(this.d, readOnlyDialog.d);
    }

    public final int hashCode() {
        int iHashCode = this.f85494a.hashCode() * 31;
        String str = this.f85495b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f85496c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Button button = this.d;
        return iB + (button != null ? button.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85494a);
        dest.writeString(this.f85495b);
        Iterator itY = j6.a.y(this.f85496c, dest);
        while (itY.hasNext()) {
            ((Item) itY.next()).writeToParcel(dest, i);
        }
        Button button = this.d;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
    }
}
