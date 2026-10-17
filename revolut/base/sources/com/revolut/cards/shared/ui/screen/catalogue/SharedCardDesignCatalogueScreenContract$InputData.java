package com.revolut.cards.shared.ui.screen.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n10.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/cards/shared/ui/screen/catalogue/SharedCardDesignCatalogueScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "cards_shared_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedCardDesignCatalogueScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedCardDesignCatalogueScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f50950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50952c;
    public final boolean d;
    public final boolean e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CatalogueToolbarButton f50953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f50954h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function0 f50955j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Function0 function0 = (Function0) parcel.readSerializable();
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            boolean z4 = parcel.readInt() != 0 ? z : false;
            boolean z6 = parcel.readInt() != 0 ? z : false;
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(SharedCardDesignCatalogueScreenContract$InputData.class.getClassLoader());
            CatalogueToolbarButton catalogueToolbarButton = (CatalogueToolbarButton) parcel.readParcelable(SharedCardDesignCatalogueScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(b.valueOf(parcel.readString()));
                }
                linkedHashSet = linkedHashSet2;
            }
            return new SharedCardDesignCatalogueScreenContract$InputData(function0, bVarValueOf, z3, z4, z6, analyticsProduct, catalogueToolbarButton, linkedHashSet, parcel.readInt() != 0 ? z : false, (Function0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedCardDesignCatalogueScreenContract$InputData[i];
        }
    }

    public SharedCardDesignCatalogueScreenContract$InputData(Function0 observeCardDesignCatalogueInfo, b cardType, boolean z, boolean z3, boolean z4, AnalyticsProduct automaticEventProduct, CatalogueToolbarButton catalogueToolbarButton, LinkedHashSet linkedHashSet, boolean z6, Function0 observeCountryCode) {
        Intrinsics.checkNotNullParameter(observeCardDesignCatalogueInfo, "observeCardDesignCatalogueInfo");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(observeCountryCode, "observeCountryCode");
        this.f50950a = observeCardDesignCatalogueInfo;
        this.f50951b = cardType;
        this.f50952c = z;
        this.d = z3;
        this.e = z4;
        this.f = automaticEventProduct;
        this.f50953g = catalogueToolbarButton;
        this.f50954h = linkedHashSet;
        this.i = z6;
        this.f50955j = observeCountryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedCardDesignCatalogueScreenContract$InputData)) {
            return false;
        }
        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = (SharedCardDesignCatalogueScreenContract$InputData) obj2;
        return Intrinsics.f(this.f50950a, sharedCardDesignCatalogueScreenContract$InputData.f50950a) && this.f50951b == sharedCardDesignCatalogueScreenContract$InputData.f50951b && this.f50952c == sharedCardDesignCatalogueScreenContract$InputData.f50952c && this.d == sharedCardDesignCatalogueScreenContract$InputData.d && this.e == sharedCardDesignCatalogueScreenContract$InputData.e && Intrinsics.f(this.f, sharedCardDesignCatalogueScreenContract$InputData.f) && Intrinsics.f(this.f50953g, sharedCardDesignCatalogueScreenContract$InputData.f50953g) && Intrinsics.f(this.f50954h, sharedCardDesignCatalogueScreenContract$InputData.f50954h) && this.i == sharedCardDesignCatalogueScreenContract$InputData.i && Intrinsics.f(this.f50955j, sharedCardDesignCatalogueScreenContract$InputData.f50955j);
    }

    public final int hashCode() {
        int iA = l.a(j6.a.c(j6.a.c(j6.a.c((this.f50951b.hashCode() + (this.f50950a.hashCode() * 31)) * 31, 31, this.f50952c), 31, this.d), 31, this.e), 31, this.f);
        CatalogueToolbarButton catalogueToolbarButton = this.f50953g;
        int iHashCode = (iA + (catalogueToolbarButton == null ? 0 : catalogueToolbarButton.hashCode())) * 31;
        Set set = this.f50954h;
        return this.f50955j.hashCode() + j6.a.c((iHashCode + (set != null ? set.hashCode() : 0)) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable((Serializable) this.f50950a);
        dest.writeString(this.f50951b.name());
        dest.writeInt(this.f50952c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f50953g, i);
        Set set = this.f50954h;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((b) itQ.next()).name());
            }
        }
        dest.writeInt(this.i ? 1 : 0);
        dest.writeSerializable((Serializable) this.f50955j);
    }
}
