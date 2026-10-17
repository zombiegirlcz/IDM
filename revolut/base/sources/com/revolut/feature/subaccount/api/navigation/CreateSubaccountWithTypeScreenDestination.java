package com.revolut.feature.subaccount.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountWithTypeScreenDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateSubaccountWithTypeScreenDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreateSubaccountWithTypeScreenDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f88981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateSubaccountProductArticleConfig f88982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88983c;
    public final CreateSubaccountFlowProvider$CurrencySelectionMode d;
    public final boolean e;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(CreateSubaccountWithTypeScreenDestination.class, parcel, linkedHashSet, iE, 1);
            }
            return new CreateSubaccountWithTypeScreenDestination(linkedHashSet, (CreateSubaccountProductArticleConfig) parcel.readParcelable(CreateSubaccountWithTypeScreenDestination.class.getClassLoader()), parcel.readString(), (CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(CreateSubaccountWithTypeScreenDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateSubaccountWithTypeScreenDestination[i];
        }
    }

    public CreateSubaccountWithTypeScreenDestination(Set subaccountTypes, CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig, String str, CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode, boolean z) {
        Intrinsics.checkNotNullParameter(subaccountTypes, "subaccountTypes");
        Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
        this.f88981a = subaccountTypes;
        this.f88982b = createSubaccountProductArticleConfig;
        this.f88983c = str;
        this.d = currencySelectionMode;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateSubaccountWithTypeScreenDestination)) {
            return false;
        }
        CreateSubaccountWithTypeScreenDestination createSubaccountWithTypeScreenDestination = (CreateSubaccountWithTypeScreenDestination) obj2;
        return Intrinsics.f(this.f88981a, createSubaccountWithTypeScreenDestination.f88981a) && Intrinsics.f(this.f88982b, createSubaccountWithTypeScreenDestination.f88982b) && Intrinsics.f(this.f88983c, createSubaccountWithTypeScreenDestination.f88983c) && Intrinsics.f(this.d, createSubaccountWithTypeScreenDestination.d) && this.e == createSubaccountWithTypeScreenDestination.e;
    }

    public final int hashCode() {
        int iHashCode = this.f88981a.hashCode() * 31;
        CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig = this.f88982b;
        int iHashCode2 = (iHashCode + (createSubaccountProductArticleConfig == null ? 0 : createSubaccountProductArticleConfig.hashCode())) * 31;
        String str = this.f88983c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF82025c() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f88981a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f88982b, i);
        dest.writeString(this.f88983c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ CreateSubaccountWithTypeScreenDestination(Set set, CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig, String str, CreateSubaccountFlowProvider$CurrencySelectionMode.Specific specific, boolean z, int i) {
        this(set, (i & 2) != 0 ? null : createSubaccountProductArticleConfig, (i & 4) != 0 ? null : str, (i & 8) != 0 ? CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a : specific, (i & 16) != 0 ? true : z);
    }
}
