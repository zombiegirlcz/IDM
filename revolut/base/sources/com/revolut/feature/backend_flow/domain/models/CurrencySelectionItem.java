package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.b0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CurrencySelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/b0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencySelectionItem implements InputItem, b0 {

    @NotNull
    public static final Parcelable.Creator<CurrencySelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63376c;
    public final CurrencySelectionOption d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                if (iA == i) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CurrencySelectionOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CurrencySelectionItem(string, string2, arrayList, parcel.readInt() == 0 ? null : CurrencySelectionOption.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencySelectionItem[i];
        }
    }

    public CurrencySelectionItem(String id10, String searchHint, List currencies, CurrencySelectionOption currencySelectionOption, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f63374a = id10;
        this.f63375b = searchHint;
        this.f63376c = currencies;
        this.d = currencySelectionOption;
        this.e = z;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63374a() {
        return this.f63374a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencySelectionItem)) {
            return false;
        }
        CurrencySelectionItem currencySelectionItem = (CurrencySelectionItem) obj2;
        return Intrinsics.f(this.f63374a, currencySelectionItem.f63374a) && Intrinsics.f(this.f63375b, currencySelectionItem.f63375b) && Intrinsics.f(this.f63376c, currencySelectionItem.f63376c) && Intrinsics.f(this.d, currencySelectionItem.d) && this.e == currencySelectionItem.e;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63374a;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f63374a.hashCode() * 31, 31, this.f63375b), 31, this.f63376c);
        CurrencySelectionOption currencySelectionOption = this.d;
        return Boolean.hashCode(this.e) + ((iD + (currencySelectionOption == null ? 0 : currencySelectionOption.hashCode())) * 31);
    }

    @Override // xl2.b0
    public final int j() {
        return this.f63376c.size();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63374a);
        dest.writeString(this.f63375b);
        Iterator itV = p.a.v(this.f63376c, dest);
        while (itV.hasNext()) {
            ((CurrencySelectionOption) itV.next()).writeToParcel(dest, i);
        }
        CurrencySelectionOption currencySelectionOption = this.d;
        if (currencySelectionOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currencySelectionOption.writeToParcel(dest, i);
        }
        dest.writeInt(this.e ? 1 : 0);
    }
}
