package com.revolut.retail.feature.balance.picker.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k1j.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import xi0.b;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/balance/picker/api/navigation/DualChooserContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DualChooserContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DualChooserContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f99491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f99492c;
    public final l d;
    public final Clause e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SupportedTargetCurrencies f99493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CurrencyFilteringPolicy f99494h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f99495j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            d dVarValueOf = d.valueOf(parcel.readString());
            l lVarValueOf = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(DualChooserContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(k1j.a.valueOf(parcel.readString()));
            }
            SupportedTargetCurrencies supportedTargetCurrencies = (SupportedTargetCurrencies) parcel.readParcelable(DualChooserContract$InputData.class.getClassLoader());
            CurrencyFilteringPolicy currencyFilteringPolicy = (CurrencyFilteringPolicy) parcel.readParcelable(DualChooserContract$InputData.class.getClassLoader());
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            int iA = 0;
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            while (iE != i5) {
                iE = com.revolut.data.database.models.openbanking.d.e(DualChooserContract$InputData.class, parcel, linkedHashSet3, iE, 1);
            }
            return new DualChooserContract$InputData(string, bVar, dVarValueOf, lVarValueOf, clause, linkedHashSet, supportedTargetCurrencies, currencyFilteringPolicy, linkedHashSet2, linkedHashSet3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DualChooserContract$InputData[i];
        }
    }

    public DualChooserContract$InputData(String selectedFundingSourceId, b selectedCurrency, d walletScope, l lVar, Clause clause, Set allowedGroups, SupportedTargetCurrencies supportedTargetCurrencies, CurrencyFilteringPolicy supportedSourceCurrencies, Set nonExchangeableCurrencies, Set extraConfigurations) {
        Intrinsics.checkNotNullParameter(selectedFundingSourceId, "selectedFundingSourceId");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        Intrinsics.checkNotNullParameter(supportedTargetCurrencies, "supportedTargetCurrencies");
        Intrinsics.checkNotNullParameter(supportedSourceCurrencies, "supportedSourceCurrencies");
        Intrinsics.checkNotNullParameter(nonExchangeableCurrencies, "nonExchangeableCurrencies");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        this.f99490a = selectedFundingSourceId;
        this.f99491b = selectedCurrency;
        this.f99492c = walletScope;
        this.d = lVar;
        this.e = clause;
        this.f = allowedGroups;
        this.f99493g = supportedTargetCurrencies;
        this.f99494h = supportedSourceCurrencies;
        this.i = nonExchangeableCurrencies;
        this.f99495j = extraConfigurations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DualChooserContract$InputData)) {
            return false;
        }
        DualChooserContract$InputData dualChooserContract$InputData = (DualChooserContract$InputData) obj2;
        return Intrinsics.f(this.f99490a, dualChooserContract$InputData.f99490a) && Intrinsics.f(this.f99491b, dualChooserContract$InputData.f99491b) && this.f99492c == dualChooserContract$InputData.f99492c && this.d == dualChooserContract$InputData.d && Intrinsics.f(this.e, dualChooserContract$InputData.e) && Intrinsics.f(this.f, dualChooserContract$InputData.f) && Intrinsics.f(this.f99493g, dualChooserContract$InputData.f99493g) && Intrinsics.f(this.f99494h, dualChooserContract$InputData.f99494h) && Intrinsics.f(this.i, dualChooserContract$InputData.i) && Intrinsics.f(this.f99495j, dualChooserContract$InputData.f99495j);
    }

    public final int hashCode() {
        int iHashCode = (this.f99492c.hashCode() + h30.l.j(this.f99491b, this.f99490a.hashCode() * 31, 31)) * 31;
        l lVar = this.d;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Clause clause = this.e;
        return this.f99495j.hashCode() + p.a.f((this.f99494h.hashCode() + ((this.f99493g.hashCode() + p.a.f((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99490a);
        dest.writeSerializable(this.f99491b);
        dest.writeString(this.f99492c.name());
        l lVar = this.d;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        dest.writeParcelable(this.e, i);
        Iterator itV = n.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeString(((k1j.a) itV.next()).name());
        }
        dest.writeParcelable(this.f99493g, i);
        dest.writeParcelable(this.f99494h, i);
        Iterator itV2 = n.v(this.i, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = n.v(this.f99495j, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
    }

    public DualChooserContract$InputData(String str, b bVar, d dVar, l lVar, Set set, SupportedTargetCurrencies supportedTargetCurrencies, CurrencyFilteringPolicy currencyFilteringPolicy, Set set2, Set set3, int i) {
        this(str, bVar, dVar, lVar, (Clause) null, set, supportedTargetCurrencies, (i & 128) != 0 ? new CurrencyFilteringPolicy.IncludeOnly(d0.i1(supportedTargetCurrencies.a())) : currencyFilteringPolicy, (i & 256) != 0 ? h0.f322473a : set2, (i & 512) != 0 ? h0.f322473a : set3);
    }
}
