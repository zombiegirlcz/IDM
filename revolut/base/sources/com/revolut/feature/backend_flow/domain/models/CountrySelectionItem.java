package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.n;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CountrySelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "xl2/n", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountrySelectionItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<CountrySelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63370c;
    public final List d;
    public final wi0.b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f63371g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                if (iA == i) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CountrySelectionOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CountrySelectionItem(string, string2, string3, arrayList, (wi0.b) parcel.readSerializable(), parcel.readInt() != 0, n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountrySelectionItem[i];
        }
    }

    public CountrySelectionItem(String id10, String str, String searchHint, List countries, wi0.b bVar, boolean z, n style) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f63368a = id10;
        this.f63369b = str;
        this.f63370c = searchHint;
        this.d = countries;
        this.e = bVar;
        this.f = z;
        this.f63371g = style;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63368a() {
        return this.f63368a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountrySelectionItem)) {
            return false;
        }
        CountrySelectionItem countrySelectionItem = (CountrySelectionItem) obj2;
        return Intrinsics.f(this.f63368a, countrySelectionItem.f63368a) && Intrinsics.f(this.f63369b, countrySelectionItem.f63369b) && Intrinsics.f(this.f63370c, countrySelectionItem.f63370c) && Intrinsics.f(this.d, countrySelectionItem.d) && Intrinsics.f(this.e, countrySelectionItem.e) && this.f == countrySelectionItem.f && this.f63371g == countrySelectionItem.f63371g;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63368a;
    }

    public final int hashCode() {
        int iHashCode = this.f63368a.hashCode() * 31;
        String str = this.f63369b;
        int iD = p.a.d(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f63370c), 31, this.d);
        wi0.b bVar = this.e;
        return this.f63371g.hashCode() + j6.a.c((iD + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63368a);
        dest.writeString(this.f63369b);
        dest.writeString(this.f63370c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((CountrySelectionOption) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f63371g.name());
    }
}
