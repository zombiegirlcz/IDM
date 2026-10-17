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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/ChooserItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class ChooserItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<ChooserItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63364c;
    public final String d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63365g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                if (iA == i) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChooserOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ChooserItem(string, string2, arrayList, string3, string4, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooserItem[i];
        }
    }

    public ChooserItem(String id10, String hint, List options, String searchHint, String searchTitle, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(searchTitle, "searchTitle");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f63362a = id10;
        this.f63363b = hint;
        this.f63364c = searchHint;
        this.d = searchTitle;
        this.e = options;
        this.f = str;
        this.f63365g = z;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63362a() {
        return this.f63362a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63365g() {
        return this.f63365g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooserItem)) {
            return false;
        }
        ChooserItem chooserItem = (ChooserItem) obj2;
        return Intrinsics.f(this.f63362a, chooserItem.f63362a) && Intrinsics.f(this.f63363b, chooserItem.f63363b) && Intrinsics.f(this.f63364c, chooserItem.f63364c) && Intrinsics.f(this.d, chooserItem.d) && Intrinsics.f(this.e, chooserItem.e) && Intrinsics.f(this.f, chooserItem.f) && this.f63365g == chooserItem.f63365g;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63362a;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.c(this.f63362a.hashCode() * 31, 31, this.f63363b), 31, this.f63364c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.f63365g) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63362a);
        dest.writeString(this.f63363b);
        dest.writeString(this.f63364c);
        dest.writeString(this.d);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((ChooserOption) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        dest.writeInt(this.f63365g ? 1 : 0);
    }
}
