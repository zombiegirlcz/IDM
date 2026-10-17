package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SecondaryDescription;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecondaryDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SecondaryDescription> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63602c;
    public final String d;
    public final HtmlStringItem e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63603g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            HtmlStringItem htmlStringItemCreateFromParcel = parcel.readInt() == 0 ? null : HtmlStringItem.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InfoListItemSubitem.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new SecondaryDescription(string, string2, string3, string4, htmlStringItemCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecondaryDescription[i];
        }
    }

    public SecondaryDescription(String id10, String label, String str, String str2, HtmlStringItem htmlStringItem, ArrayList arrayList, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f63600a = id10;
        this.f63601b = label;
        this.f63602c = str;
        this.d = str2;
        this.e = htmlStringItem;
        this.f = arrayList;
        this.f63603g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SecondaryDescription)) {
            return false;
        }
        SecondaryDescription secondaryDescription = (SecondaryDescription) obj2;
        return Intrinsics.f(this.f63600a, secondaryDescription.f63600a) && Intrinsics.f(this.f63601b, secondaryDescription.f63601b) && Intrinsics.f(this.f63602c, secondaryDescription.f63602c) && Intrinsics.f(this.d, secondaryDescription.d) && Intrinsics.f(this.e, secondaryDescription.e) && Intrinsics.f(this.f, secondaryDescription.f) && Intrinsics.f(this.f63603g, secondaryDescription.f63603g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f63600a.hashCode() * 31, 31, this.f63601b);
        String str = this.f63602c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HtmlStringItem htmlStringItem = this.e;
        int iHashCode3 = (iHashCode2 + (htmlStringItem == null ? 0 : htmlStringItem.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f63603g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63600a);
        dest.writeString(this.f63601b);
        dest.writeString(this.f63602c);
        dest.writeString(this.d);
        HtmlStringItem htmlStringItem = this.e;
        if (htmlStringItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            htmlStringItem.writeToParcel(dest, i);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((InfoListItemSubitem) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f63603g);
    }
}
