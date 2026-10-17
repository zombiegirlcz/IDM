package com.revolut.retail.core.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ChooserActivityDestination;", "Lcom/revolut/retail/core/navigation/ActivityDestination;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooserActivityDestination extends ActivityDestination {

    @NotNull
    public static final Parcelable.Creator<ChooserActivityDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f98627c;
    public final Uri d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooserActivityDestination((Uri) parcel.readParcelable(ChooserActivityDestination.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserActivityDestination[i];
        }
    }

    public ChooserActivityDestination(Uri uri2, String action, String str, String title, List categories) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f98625a = action;
        this.f98626b = str;
        this.f98627c = categories;
        this.d = uri2;
        this.e = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF98625a() {
        return this.f98625a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF98627c() {
        return this.f98627c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF98626b() {
        return this.f98626b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Uri getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserActivityDestination)) {
            return false;
        }
        ChooserActivityDestination chooserActivityDestination = (ChooserActivityDestination) obj2;
        return Intrinsics.f(this.f98625a, chooserActivityDestination.f98625a) && Intrinsics.f(this.f98626b, chooserActivityDestination.f98626b) && Intrinsics.f(this.f98627c, chooserActivityDestination.f98627c) && Intrinsics.f(this.d, chooserActivityDestination.d) && Intrinsics.f(this.e, chooserActivityDestination.e);
    }

    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f98625a.hashCode() * 31;
        String str = this.f98626b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98627c);
        Uri uri2 = this.d;
        return this.e.hashCode() + ((iD + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98625a);
        dest.writeString(this.f98626b);
        dest.writeStringList(this.f98627c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }

    public ChooserActivityDestination(String str, Uri uri2, String str2, int i) {
        this((i & 8) != 0 ? null : uri2, str, (i & 2) != 0 ? null : "text/plain", str2, f0.f322471a);
    }
}
