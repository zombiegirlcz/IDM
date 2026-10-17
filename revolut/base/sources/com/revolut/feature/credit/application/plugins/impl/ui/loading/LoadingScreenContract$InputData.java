package com.revolut.feature.credit.application.plugins.impl.ui.loading;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/loading/LoadingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LoadingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LoadingItems f67881c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoadingScreenContract$InputData(parcel.readInt() != 0, parcel.readInt() != 0, (LoadingItems) parcel.readParcelable(LoadingScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoadingScreenContract$InputData[i];
        }
    }

    public LoadingScreenContract$InputData() {
        this(false, (LoadingItems) null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoadingScreenContract$InputData)) {
            return false;
        }
        LoadingScreenContract$InputData loadingScreenContract$InputData = (LoadingScreenContract$InputData) obj2;
        return this.f67879a == loadingScreenContract$InputData.f67879a && this.f67880b == loadingScreenContract$InputData.f67880b && Intrinsics.f(this.f67881c, loadingScreenContract$InputData.f67881c);
    }

    public final int hashCode() {
        return this.f67881c.hashCode() + j6.a.c(Boolean.hashCode(this.f67879a) * 31, 31, this.f67880b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67879a ? 1 : 0);
        dest.writeInt(this.f67880b ? 1 : 0);
        dest.writeParcelable(this.f67881c, i);
    }

    public LoadingScreenContract$InputData(boolean z, boolean z3, LoadingItems customItems) {
        Intrinsics.checkNotNullParameter(customItems, "customItems");
        this.f67879a = z;
        this.f67880b = z3;
        this.f67881c = customItems;
    }

    public LoadingScreenContract$InputData(boolean z, LoadingItems loadingItems, int i) {
        this(true, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new DefaultLoadingItems() : loadingItems);
    }
}
