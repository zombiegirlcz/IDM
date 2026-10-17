package com.revolut.feature.subaccount.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountWithTypeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateSubaccountWithTypeFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CreateSubaccountWithTypeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f88978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreateSubaccountProductArticleConfig f88979h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f88980j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(CreateSubaccountWithTypeFeatureConfig.class, parcel, linkedHashSet, iE, 1);
            }
            return new CreateSubaccountWithTypeFeatureConfig((CreateSubaccountProductArticleConfig) parcel.readParcelable(CreateSubaccountWithTypeFeatureConfig.class.getClassLoader()), parcel.readString(), linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateSubaccountWithTypeFeatureConfig[i];
        }
    }

    public /* synthetic */ CreateSubaccountWithTypeFeatureConfig(Set set, CreateSubaccountProductArticleConfig.ResolveBySubaccountType resolveBySubaccountType, String str, int i) {
        this((CreateSubaccountProductArticleConfig) ((i & 2) != 0 ? null : resolveBySubaccountType), (i & 4) != 0 ? null : str, set, true);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateSubaccountWithTypeFeatureConfig)) {
            return false;
        }
        CreateSubaccountWithTypeFeatureConfig createSubaccountWithTypeFeatureConfig = (CreateSubaccountWithTypeFeatureConfig) obj2;
        return Intrinsics.f(this.f88978g, createSubaccountWithTypeFeatureConfig.f88978g) && Intrinsics.f(this.f88979h, createSubaccountWithTypeFeatureConfig.f88979h) && Intrinsics.f(this.i, createSubaccountWithTypeFeatureConfig.i) && this.f88980j == createSubaccountWithTypeFeatureConfig.f88980j;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f88978g.hashCode() * 31;
        CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig = this.f88979h;
        int iHashCode2 = (iHashCode + (createSubaccountProductArticleConfig == null ? 0 : createSubaccountProductArticleConfig.hashCode())) * 31;
        String str = this.i;
        return Boolean.hashCode(this.f88980j) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f88978g, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f88979h, i);
        dest.writeString(this.i);
        dest.writeInt(this.f88980j ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSubaccountWithTypeFeatureConfig(CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig, String str, Set subaccountTypes, boolean z) {
        super((ActivityAnimation) null, (ParcelableDestination) new CreateSubaccountWithTypeScreenDestination(subaccountTypes, createSubaccountProductArticleConfig, str, null, z, 8), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(subaccountTypes, "subaccountTypes");
        this.f88978g = subaccountTypes;
        this.f88979h = createSubaccountProductArticleConfig;
        this.i = str;
        this.f88980j = z;
    }
}
