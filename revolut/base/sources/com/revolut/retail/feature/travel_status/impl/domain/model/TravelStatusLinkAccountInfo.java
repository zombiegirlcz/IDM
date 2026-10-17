package com.revolut.retail.feature.travel_status.impl.domain.model;

import a2l.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "InputField", "a2l/d", "LinkAccountAction", "LinkAccountButton", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelStatusLinkAccountInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelStatusLinkAccountInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104294c;
    public final List d;
    public final LinkAccountButton e;
    public final LinkAccountButton f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$InputField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputField implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104297c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputField(parcel.readString(), parcel.readString(), d.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputField[i];
            }
        }

        public InputField(String id10, String label, d keyboardType, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
            this.f104295a = id10;
            this.f104296b = label;
            this.f104297c = keyboardType;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputField)) {
                return false;
            }
            InputField inputField = (InputField) obj2;
            return Intrinsics.f(this.f104295a, inputField.f104295a) && Intrinsics.f(this.f104296b, inputField.f104296b) && this.f104297c == inputField.f104297c && Intrinsics.f(this.d, inputField.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f104297c.hashCode() + p.a.c(this.f104295a.hashCode() * 31, 31, this.f104296b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104295a);
            dest.writeString(this.f104296b);
            dest.writeString(this.f104297c.name());
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction;", "Landroid/os/Parcelable;", "Url", "Api", "Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction$Api;", "Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction$Url;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface LinkAccountAction extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction$Api;", "Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction;", "<init>", "()V", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Api implements LinkAccountAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Api f104298a = new Api();

            @NotNull
            public static final Parcelable.Creator<Api> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Api.f104298a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Api[i];
                }
            }

            private Api() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction$Url;", "Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Url implements LinkAccountAction {

            @NotNull
            public static final Parcelable.Creator<Url> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104299a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Url(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Url[i];
                }
            }

            public Url(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f104299a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Url) && Intrinsics.f(this.f104299a, ((Url) obj2).f104299a);
            }

            public final int hashCode() {
                return this.f104299a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104299a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/domain/model/TravelStatusLinkAccountInfo$LinkAccountButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkAccountButton implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LinkAccountButton> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkAccountAction f104301b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkAccountButton(parcel.readString(), (LinkAccountAction) parcel.readParcelable(LinkAccountButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkAccountButton[i];
            }
        }

        public LinkAccountButton(String label, LinkAccountAction action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f104300a = label;
            this.f104301b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkAccountButton)) {
                return false;
            }
            LinkAccountButton linkAccountButton = (LinkAccountButton) obj2;
            return Intrinsics.f(this.f104300a, linkAccountButton.f104300a) && Intrinsics.f(this.f104301b, linkAccountButton.f104301b);
        }

        public final int hashCode() {
            return this.f104301b.hashCode() + (this.f104300a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104300a);
            dest.writeParcelable(this.f104301b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InputField.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            Parcelable.Creator<LinkAccountButton> creator = LinkAccountButton.CREATOR;
            return new TravelStatusLinkAccountInfo(string, string2, string3, arrayList, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelStatusLinkAccountInfo[i];
        }
    }

    public TravelStatusLinkAccountInfo(String title, String str, String avatarUrl, ArrayList arrayList, LinkAccountButton primaryButton, LinkAccountButton linkAccountButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f104292a = title;
        this.f104293b = str;
        this.f104294c = avatarUrl;
        this.d = arrayList;
        this.e = primaryButton;
        this.f = linkAccountButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelStatusLinkAccountInfo)) {
            return false;
        }
        TravelStatusLinkAccountInfo travelStatusLinkAccountInfo = (TravelStatusLinkAccountInfo) obj2;
        return Intrinsics.f(this.f104292a, travelStatusLinkAccountInfo.f104292a) && Intrinsics.f(this.f104293b, travelStatusLinkAccountInfo.f104293b) && Intrinsics.f(this.f104294c, travelStatusLinkAccountInfo.f104294c) && Intrinsics.f(this.d, travelStatusLinkAccountInfo.d) && Intrinsics.f(this.e, travelStatusLinkAccountInfo.e) && Intrinsics.f(this.f, travelStatusLinkAccountInfo.f);
    }

    public final int hashCode() {
        int iHashCode = this.f104292a.hashCode() * 31;
        String str = this.f104293b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f104294c);
        List list = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        LinkAccountButton linkAccountButton = this.f;
        return iHashCode2 + (linkAccountButton != null ? linkAccountButton.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104292a);
        dest.writeString(this.f104293b);
        dest.writeString(this.f104294c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((InputField) itQ.next()).writeToParcel(dest, i);
            }
        }
        this.e.writeToParcel(dest, i);
        LinkAccountButton linkAccountButton = this.f;
        if (linkAccountButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkAccountButton.writeToParcel(dest, i);
        }
    }
}
