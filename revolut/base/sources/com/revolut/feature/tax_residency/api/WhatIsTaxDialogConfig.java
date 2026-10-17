package com.revolut.feature.tax_residency.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/WhatIsTaxDialogConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhatIsTaxDialogConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WhatIsTaxDialogConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f89965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89966b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WhatIsTaxDialogConfig((Clause) parcel.readParcelable(WhatIsTaxDialogConfig.class.getClassLoader()), (Clause) parcel.readParcelable(WhatIsTaxDialogConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WhatIsTaxDialogConfig[i];
        }
    }

    public WhatIsTaxDialogConfig(Clause title, Clause message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f89965a = title;
        this.f89966b = message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WhatIsTaxDialogConfig)) {
            return false;
        }
        WhatIsTaxDialogConfig whatIsTaxDialogConfig = (WhatIsTaxDialogConfig) obj2;
        return Intrinsics.f(this.f89965a, whatIsTaxDialogConfig.f89965a) && Intrinsics.f(this.f89966b, whatIsTaxDialogConfig.f89966b);
    }

    public final int hashCode() {
        return this.f89966b.hashCode() + (this.f89965a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89965a, i);
        dest.writeParcelable(this.f89966b, i);
    }
}
