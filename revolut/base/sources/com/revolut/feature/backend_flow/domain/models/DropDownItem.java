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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DropDownItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropDownItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<DropDownItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63399c;
    public final String d;
    public final List e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iE = 0;
            if (parcel.readInt() != 0) {
                i = 1;
                z = true;
            } else {
                z = false;
                i = 1;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(DropDownItem.class, parcel, arrayList, iE, i);
            }
            return new DropDownItem(string, string2, arrayList, string3, parcel.readString(), z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropDownItem[i];
        }
    }

    public DropDownItem(String id10, String hint, List options, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f63397a = id10;
        this.f63398b = z;
        this.f63399c = hint;
        this.d = str;
        this.e = options;
        this.f = str2;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63397a() {
        return this.f63397a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63398b() {
        return this.f63398b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropDownItem)) {
            return false;
        }
        DropDownItem dropDownItem = (DropDownItem) obj2;
        return Intrinsics.f(this.f63397a, dropDownItem.f63397a) && this.f63398b == dropDownItem.f63398b && Intrinsics.f(this.f63399c, dropDownItem.f63399c) && Intrinsics.f(this.d, dropDownItem.d) && Intrinsics.f(this.e, dropDownItem.e) && Intrinsics.f(this.f, dropDownItem.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63397a;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.f63397a.hashCode() * 31, 31, this.f63398b), 31, this.f63399c);
        String str = this.d;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63397a);
        dest.writeInt(this.f63398b ? 1 : 0);
        dest.writeString(this.f63399c);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f);
    }
}
