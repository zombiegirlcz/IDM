package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.m;
import xl2.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/u;", "", "toString", "()Ljava/lang/String;", "LinkStyle", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InfoListItem implements BackendItem, u {

    @NotNull
    public static final Parcelable.Creator<InfoListItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f63496c;
    public final LinkStyle d;
    public final ArrayList e;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "Link", "Button", "Navigation", "Unknown", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Button;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Link;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Navigation;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Unknown;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class LinkStyle implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Button;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Button extends LinkStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Button f63497a = new Button();

            @NotNull
            public static final Parcelable.Creator<Button> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Button.f63497a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Button[i];
                }
            }

            private Button() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Link;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Link extends LinkStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Link f63498a = new Link();

            @NotNull
            public static final Parcelable.Creator<Link> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Link.f63498a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Link[i];
                }
            }

            private Link() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Navigation;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle;", "<init>", "()V", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Navigation extends LinkStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Navigation f63499a = new Navigation();

            @NotNull
            public static final Parcelable.Creator<Navigation> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Navigation.f63499a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Navigation[i];
                }
            }

            private Navigation() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle$Unknown;", "Lcom/revolut/feature/backend_flow/domain/models/InfoListItem$LinkStyle;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown extends LinkStyle {

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63500a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Unknown(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unknown[i];
                }
            }

            public Unknown(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f63500a = name;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Unknown) && Intrinsics.f(this.f63500a, ((Unknown) obj2).f63500a);
            }

            public final int hashCode() {
                return this.f63500a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63500a);
            }
        }

        private LinkStyle() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            m mVarValueOf = m.valueOf(parcel.readString());
            LinkStyle linkStyle = (LinkStyle) parcel.readParcelable(InfoListItem.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(InfoListItemSubitem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new InfoListItem(string, string2, mVarValueOf, linkStyle, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoListItem[i];
        }
    }

    public InfoListItem(String id10, String str, m style, LinkStyle linkStyle, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63494a = id10;
        this.f63495b = str;
        this.f63496c = style;
        this.d = linkStyle;
        this.e = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InfoListItem)) {
            return false;
        }
        InfoListItem infoListItem = (InfoListItem) obj2;
        return Intrinsics.f(this.f63494a, infoListItem.f63494a) && Intrinsics.f(this.f63495b, infoListItem.f63495b) && this.f63496c == infoListItem.f63496c && Intrinsics.f(this.d, infoListItem.d) && this.e.equals(infoListItem.e);
    }

    public final int hashCode() {
        int iHashCode = this.f63494a.hashCode() * 31;
        String str = this.f63495b;
        int iHashCode2 = (this.f63496c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        LinkStyle linkStyle = this.d;
        return this.e.hashCode() + ((iHashCode2 + (linkStyle != null ? linkStyle.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63494a);
        dest.writeString(this.f63495b);
        dest.writeString(this.f63496c.name());
        dest.writeParcelable(this.d, i);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((InfoListItemSubitem) itY.next()).writeToParcel(dest, i);
        }
    }
}
