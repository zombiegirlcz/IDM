package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/FormScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "Lxl2/v;", "Lxl2/b;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormScreen extends BackendScreen implements v, xl2.b {

    @NotNull
    public static final Parcelable.Creator<FormScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63469c;
    public final Action d;
    public final List e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f63470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f63471h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f63472j;
    public final HtmlStringItem k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SecondaryDescription f63473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HtmlStringItem f63474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InfoMessageItem f63475n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f63476p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            Boolean boolValueOf2;
            InfoMessageItem infoMessageItemCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FormScreen.class, parcel, arrayList3, iE, 1);
            }
            String string2 = parcel.readString();
            Action action = (Action) parcel.readParcelable(FormScreen.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = j6.a.e(FormScreen.class, parcel, arrayList, iE2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                int iA = 0;
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Transition.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
                infoMessageItemCreateFromParcel = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                infoMessageItemCreateFromParcel = null;
            }
            ArrayList arrayList4 = arrayList2;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            HtmlStringItem htmlStringItem = (HtmlStringItem) (parcel.readInt() == 0 ? infoMessageItemCreateFromParcel : HtmlStringItem.CREATOR.createFromParcel(parcel));
            SecondaryDescription secondaryDescription = (SecondaryDescription) (parcel.readInt() == 0 ? infoMessageItemCreateFromParcel : SecondaryDescription.CREATOR.createFromParcel(parcel));
            HtmlStringItem htmlStringItem2 = (HtmlStringItem) (parcel.readInt() == 0 ? infoMessageItemCreateFromParcel : HtmlStringItem.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                infoMessageItemCreateFromParcel = InfoMessageItem.CREATOR.createFromParcel(parcel);
            }
            return new FormScreen(string, arrayList3, string2, action, arrayList, boolValueOf, arrayList4, boolValueOf2, string3, string4, htmlStringItem, secondaryDescription, htmlStringItem2, infoMessageItemCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormScreen[i];
        }
    }

    public FormScreen(String id10, List items, String str, Action action, List list, Boolean bool, List list2, Boolean bool2, String str2, String str3, HtmlStringItem htmlStringItem, SecondaryDescription secondaryDescription, HtmlStringItem htmlStringItem2, InfoMessageItem infoMessageItem, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63467a = id10;
        this.f63468b = items;
        this.f63469c = str;
        this.d = action;
        this.e = list;
        this.f = bool;
        this.f63470g = list2;
        this.f63471h = bool2;
        this.i = str2;
        this.f63472j = str3;
        this.k = htmlStringItem;
        this.f63473l = secondaryDescription;
        this.f63474m = htmlStringItem2;
        this.f63475n = infoMessageItem;
        this.o = str4;
        this.f63476p = str5;
    }

    public static FormScreen J(FormScreen formScreen, List list, Action action, ArrayList arrayList, String str, int i) {
        String id10 = formScreen.f63467a;
        List items = (i & 2) != 0 ? formScreen.f63468b : list;
        String str2 = formScreen.f63469c;
        Action action2 = (i & 8) != 0 ? formScreen.d : action;
        List list2 = (i & 16) != 0 ? formScreen.e : arrayList;
        Boolean bool = formScreen.f;
        Action action3 = action2;
        List list3 = list2;
        List list4 = formScreen.f63470g;
        Boolean bool2 = formScreen.f63471h;
        String str3 = formScreen.i;
        String str4 = formScreen.f63472j;
        HtmlStringItem htmlStringItem = formScreen.k;
        SecondaryDescription secondaryDescription = formScreen.f63473l;
        HtmlStringItem htmlStringItem2 = formScreen.f63474m;
        InfoMessageItem infoMessageItem = formScreen.f63475n;
        String str5 = (i & 16384) != 0 ? formScreen.o : str;
        String str6 = formScreen.f63476p;
        formScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        return new FormScreen(id10, items, str2, action3, list3, bool, list4, bool2, str3, str4, htmlStringItem, secondaryDescription, htmlStringItem2, infoMessageItem, str5, str6);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63569a() {
        return this.f63467a;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF63476p() {
        return this.f63476p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xl2.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getF63468b() {
        return this.f63468b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormScreen)) {
            return false;
        }
        FormScreen formScreen = (FormScreen) obj2;
        return Intrinsics.f(this.f63467a, formScreen.f63467a) && Intrinsics.f(this.f63468b, formScreen.f63468b) && Intrinsics.f(this.f63469c, formScreen.f63469c) && Intrinsics.f(this.d, formScreen.d) && Intrinsics.f(this.e, formScreen.e) && Intrinsics.f(this.f, formScreen.f) && Intrinsics.f(this.f63470g, formScreen.f63470g) && Intrinsics.f(this.f63471h, formScreen.f63471h) && Intrinsics.f(this.i, formScreen.i) && Intrinsics.f(this.f63472j, formScreen.f63472j) && Intrinsics.f(this.k, formScreen.k) && Intrinsics.f(this.f63473l, formScreen.f63473l) && Intrinsics.f(this.f63474m, formScreen.f63474m) && Intrinsics.f(this.f63475n, formScreen.f63475n) && Intrinsics.f(this.o, formScreen.o) && Intrinsics.f(this.f63476p, formScreen.f63476p);
    }

    public final List getItems() {
        return this.f63468b;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f63467a.hashCode() * 31, 31, this.f63468b);
        String str = this.f63469c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.d;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.f63470g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.f63471h;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63472j;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HtmlStringItem htmlStringItem = this.k;
        int iHashCode9 = (iHashCode8 + (htmlStringItem == null ? 0 : htmlStringItem.hashCode())) * 31;
        SecondaryDescription secondaryDescription = this.f63473l;
        int iHashCode10 = (iHashCode9 + (secondaryDescription == null ? 0 : secondaryDescription.hashCode())) * 31;
        HtmlStringItem htmlStringItem2 = this.f63474m;
        int iHashCode11 = (iHashCode10 + (htmlStringItem2 == null ? 0 : htmlStringItem2.hashCode())) * 31;
        InfoMessageItem infoMessageItem = this.f63475n;
        int iHashCode12 = (iHashCode11 + (infoMessageItem == null ? 0 : infoMessageItem.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f63476p;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getO() {
        return this.o;
    }

    @Override // xl2.b
    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63467a);
        Iterator itV = p.a.v(this.f63468b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f63469c);
        dest.writeParcelable(this.d, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        List list2 = this.f63470g;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((Transition) itQ2.next()).writeToParcel(dest, i);
            }
        }
        Boolean bool2 = this.f63471h;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeString(this.i);
        dest.writeString(this.f63472j);
        HtmlStringItem htmlStringItem = this.k;
        if (htmlStringItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            htmlStringItem.writeToParcel(dest, i);
        }
        SecondaryDescription secondaryDescription = this.f63473l;
        if (secondaryDescription == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            secondaryDescription.writeToParcel(dest, i);
        }
        HtmlStringItem htmlStringItem2 = this.f63474m;
        if (htmlStringItem2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            htmlStringItem2.writeToParcel(dest, i);
        }
        InfoMessageItem infoMessageItem = this.f63475n;
        if (infoMessageItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoMessageItem.writeToParcel(dest, i);
        }
        dest.writeString(this.o);
        dest.writeString(this.f63476p);
    }
}
