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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BottomPromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "Lxl2/v;", "Lxl2/b;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomPromptScreen extends BackendScreen implements v, xl2.b {

    @NotNull
    public static final Parcelable.Creator<BottomPromptScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HtmlStringItem f63328c;
    public final ImageItem d;
    public final ArrayList e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f63329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f63330h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f63331j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            HtmlStringItem htmlStringItemCreateFromParcel = parcel.readInt() == 0 ? null : HtmlStringItem.CREATOR.createFromParcel(parcel);
            ImageItem imageItem = (ImageItem) parcel.readParcelable(BottomPromptScreen.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BottomPromptItem.CREATOR, parcel, arrayList3, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(BottomPromptScreen.class, parcel, arrayList4, iE2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                int iA2 = 0;
                while (iA2 != i3) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Transition.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                while (iE != i5) {
                    iE = j6.a.e(BottomPromptScreen.class, parcel, arrayList2, iE, 1);
                }
            }
            return new BottomPromptScreen(string, string2, htmlStringItemCreateFromParcel, imageItem, arrayList3, arrayList4, arrayList, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomPromptScreen[i];
        }
    }

    public BottomPromptScreen(String id10, String str, HtmlStringItem htmlStringItem, ImageItem imageItem, ArrayList items, List componentItems, List list, List list2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(componentItems, "componentItems");
        this.f63326a = id10;
        this.f63327b = str;
        this.f63328c = htmlStringItem;
        this.d = imageItem;
        this.e = items;
        this.f = componentItems;
        this.f63329g = list;
        this.f63330h = list2;
        this.i = str2;
        this.f63331j = str3;
    }

    public static BottomPromptScreen J(BottomPromptScreen bottomPromptScreen, List list, ArrayList arrayList, String str, int i) {
        String id10 = bottomPromptScreen.f63326a;
        String str2 = bottomPromptScreen.f63327b;
        HtmlStringItem htmlStringItem = bottomPromptScreen.f63328c;
        ImageItem imageItem = bottomPromptScreen.d;
        ArrayList items = bottomPromptScreen.e;
        if ((i & 32) != 0) {
            list = bottomPromptScreen.f;
        }
        List componentItems = list;
        List list2 = bottomPromptScreen.f63329g;
        List list3 = arrayList;
        if ((i & 128) != 0) {
            list3 = bottomPromptScreen.f63330h;
        }
        List list4 = list3;
        if ((i & 256) != 0) {
            str = bottomPromptScreen.i;
        }
        String str3 = bottomPromptScreen.f63331j;
        bottomPromptScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(componentItems, "componentItems");
        return new BottomPromptScreen(id10, str2, htmlStringItem, imageItem, items, componentItems, list2, list4, str, str3);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63326a() {
        return this.f63326a;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF63331j() {
        return this.f63331j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xl2.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getF() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BottomPromptScreen)) {
            return false;
        }
        BottomPromptScreen bottomPromptScreen = (BottomPromptScreen) obj2;
        return Intrinsics.f(this.f63326a, bottomPromptScreen.f63326a) && Intrinsics.f(this.f63327b, bottomPromptScreen.f63327b) && Intrinsics.f(this.f63328c, bottomPromptScreen.f63328c) && Intrinsics.f(this.d, bottomPromptScreen.d) && this.e.equals(bottomPromptScreen.e) && Intrinsics.f(this.f, bottomPromptScreen.f) && Intrinsics.f(this.f63329g, bottomPromptScreen.f63329g) && Intrinsics.f(this.f63330h, bottomPromptScreen.f63330h) && Intrinsics.f(this.i, bottomPromptScreen.i) && Intrinsics.f(this.f63331j, bottomPromptScreen.f63331j);
    }

    public final int hashCode() {
        int iHashCode = this.f63326a.hashCode() * 31;
        String str = this.f63327b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HtmlStringItem htmlStringItem = this.f63328c;
        int iHashCode3 = (iHashCode2 + (htmlStringItem == null ? 0 : htmlStringItem.hashCode())) * 31;
        ImageItem imageItem = this.d;
        int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode3 + (imageItem == null ? 0 : imageItem.hashCode())) * 31, 31), 31, this.f);
        List list = this.f63329g;
        int iHashCode4 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f63330h;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63331j;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // xl2.b
    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getF63330h() {
        return this.f63330h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63326a);
        dest.writeString(this.f63327b);
        HtmlStringItem htmlStringItem = this.f63328c;
        if (htmlStringItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            htmlStringItem.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((BottomPromptItem) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        List list = this.f63329g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Transition) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.f63330h;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeParcelable((Parcelable) itQ2.next(), i);
            }
        }
        dest.writeString(this.i);
        dest.writeString(this.f63331j);
    }
}
