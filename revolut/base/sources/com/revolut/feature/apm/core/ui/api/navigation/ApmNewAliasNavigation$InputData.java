package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmNewAliasNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmNewAliasNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmNewAliasNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f62243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmProduct f62244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmAliasRegistrationMode f62245c;
    public final boolean d;
    public final ApmFooterContent e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmNewAliasNavigation$InputData((Clause) parcel.readParcelable(ApmNewAliasNavigation$InputData.class.getClassLoader()), (ApmProduct) parcel.readParcelable(ApmNewAliasNavigation$InputData.class.getClassLoader()), (ApmAliasRegistrationMode) parcel.readParcelable(ApmNewAliasNavigation$InputData.class.getClassLoader()), parcel.readInt() != 0, (ApmFooterContent) parcel.readParcelable(ApmNewAliasNavigation$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmNewAliasNavigation$InputData[i];
        }
    }

    public ApmNewAliasNavigation$InputData(Clause titleClause, ApmProduct apmProduct, ApmAliasRegistrationMode mode, boolean z, ApmFooterContent apmFooterContent) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f62243a = titleClause;
        this.f62244b = apmProduct;
        this.f62245c = mode;
        this.d = z;
        this.e = apmFooterContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmNewAliasNavigation$InputData)) {
            return false;
        }
        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = (ApmNewAliasNavigation$InputData) obj2;
        return Intrinsics.f(this.f62243a, apmNewAliasNavigation$InputData.f62243a) && Intrinsics.f(this.f62244b, apmNewAliasNavigation$InputData.f62244b) && Intrinsics.f(this.f62245c, apmNewAliasNavigation$InputData.f62245c) && this.d == apmNewAliasNavigation$InputData.d && Intrinsics.f(this.e, apmNewAliasNavigation$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f62245c.hashCode() + ((this.f62244b.hashCode() + (this.f62243a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ApmFooterContent apmFooterContent = this.e;
        return iC + (apmFooterContent == null ? 0 : apmFooterContent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62243a, i);
        dest.writeParcelable(this.f62244b, i);
        dest.writeParcelable(this.f62245c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ ApmNewAliasNavigation$InputData(TextLocalisedClause textLocalisedClause, ApmProduct apmProduct, ApmAliasRegistrationMode apmAliasRegistrationMode, ApmFooterContent.TextOnly textOnly, int i) {
        this(textLocalisedClause, apmProduct, (i & 4) != 0 ? ApmAliasRegistrationMode.Add.f62240b : apmAliasRegistrationMode, (i & 8) != 0, (i & 16) != 0 ? null : textOnly);
    }
}
