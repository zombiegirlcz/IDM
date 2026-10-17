package com.revolut.feature.statements.impl.ui.consolidated.screen.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/screen/model/SelectableProductType;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectableProductType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectableProductType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsolidatedStatementProductType f88324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88325b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectableProductType(ConsolidatedStatementProductType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectableProductType[i];
        }
    }

    public SelectableProductType(ConsolidatedStatementProductType productType, boolean z) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f88324a = productType;
        this.f88325b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectableProductType)) {
            return false;
        }
        SelectableProductType selectableProductType = (SelectableProductType) obj2;
        return this.f88324a == selectableProductType.f88324a && this.f88325b == selectableProductType.f88325b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88325b) + (this.f88324a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88324a.name());
        dest.writeInt(this.f88325b ? 1 : 0);
    }
}
