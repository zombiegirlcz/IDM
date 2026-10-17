package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/WhereToFindTinHint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhereToFindTinHint implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WhereToFindTinHint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90191c;
    public final List d;

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
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Checkmark.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new WhereToFindTinHint(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WhereToFindTinHint[i];
        }
    }

    public WhereToFindTinHint(String title, String subtitle, String linkText, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        this.f90189a = title;
        this.f90190b = subtitle;
        this.f90191c = linkText;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WhereToFindTinHint)) {
            return false;
        }
        WhereToFindTinHint whereToFindTinHint = (WhereToFindTinHint) obj2;
        return Intrinsics.f(this.f90189a, whereToFindTinHint.f90189a) && Intrinsics.f(this.f90190b, whereToFindTinHint.f90190b) && Intrinsics.f(this.f90191c, whereToFindTinHint.f90191c) && Intrinsics.f(this.d, whereToFindTinHint.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f90189a.hashCode() * 31, 31, this.f90190b), 31, this.f90191c);
        List list = this.d;
        return iC + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90189a);
        dest.writeString(this.f90190b);
        dest.writeString(this.f90191c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((Checkmark) itQ.next()).writeToParcel(dest, i);
        }
    }
}
