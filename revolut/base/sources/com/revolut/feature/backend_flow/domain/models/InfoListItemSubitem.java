package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItemSubitem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Link", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoListItemSubitem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoListItemSubitem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HtmlStringItem f63503c;
    public final BackendFlowIcon d;
    public final Link e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f63504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63505h;
    public final String i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItemSubitem$Link;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63508c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(String str, String str2, String str3) {
            this.f63506a = str;
            this.f63507b = str2;
            this.f63508c = str3;
            str2 = str3 != null ? str3 : str2;
            if (str2 == null) {
                throw new IllegalArgumentException("Both `deeplink` and `hyperlink` are null");
            }
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Link)) {
                return false;
            }
            Link link = (Link) obj2;
            return Intrinsics.f(this.f63506a, link.f63506a) && Intrinsics.f(this.f63507b, link.f63507b) && Intrinsics.f(this.f63508c, link.f63508c);
        }

        public final int hashCode() {
            String str = this.f63506a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f63507b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f63508c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63506a);
            dest.writeString(this.f63507b);
            dest.writeString(this.f63508c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            HtmlStringItem htmlStringItemCreateFromParcel = parcel.readInt() == 0 ? null : HtmlStringItem.CREATOR.createFromParcel(parcel);
            BackendFlowIcon backendFlowIcon = (BackendFlowIcon) parcel.readParcelable(InfoListItemSubitem.class.getClassLoader());
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InfoListItemSubitem(string, string2, htmlStringItemCreateFromParcel, backendFlowIcon, linkCreateFromParcel, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoListItemSubitem[i];
        }
    }

    public InfoListItemSubitem(String id10, String title, HtmlStringItem htmlStringItem, BackendFlowIcon backendFlowIcon, Link link, Boolean bool, Boolean bool2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63501a = id10;
        this.f63502b = title;
        this.f63503c = htmlStringItem;
        this.d = backendFlowIcon;
        this.e = link;
        this.f = bool;
        this.f63504g = bool2;
        this.f63505h = str;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoListItemSubitem)) {
            return false;
        }
        InfoListItemSubitem infoListItemSubitem = (InfoListItemSubitem) obj2;
        return Intrinsics.f(this.f63501a, infoListItemSubitem.f63501a) && Intrinsics.f(this.f63502b, infoListItemSubitem.f63502b) && Intrinsics.f(this.f63503c, infoListItemSubitem.f63503c) && Intrinsics.f(this.d, infoListItemSubitem.d) && Intrinsics.f(this.e, infoListItemSubitem.e) && Intrinsics.f(this.f, infoListItemSubitem.f) && Intrinsics.f(this.f63504g, infoListItemSubitem.f63504g) && Intrinsics.f(this.f63505h, infoListItemSubitem.f63505h) && Intrinsics.f(this.i, infoListItemSubitem.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63501a.hashCode() * 31, 31, this.f63502b);
        HtmlStringItem htmlStringItem = this.f63503c;
        int iHashCode = (iC + (htmlStringItem == null ? 0 : htmlStringItem.hashCode())) * 31;
        BackendFlowIcon backendFlowIcon = this.d;
        int iHashCode2 = (iHashCode + (backendFlowIcon == null ? 0 : backendFlowIcon.hashCode())) * 31;
        Link link = this.e;
        int iHashCode3 = (iHashCode2 + (link == null ? 0 : link.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f63504g;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f63505h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63501a);
        dest.writeString(this.f63502b);
        HtmlStringItem htmlStringItem = this.f63503c;
        if (htmlStringItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            htmlStringItem.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        Link link = this.e;
        if (link == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            link.writeToParcel(dest, i);
        }
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f63504g;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeString(this.f63505h);
        dest.writeString(this.i);
    }
}
