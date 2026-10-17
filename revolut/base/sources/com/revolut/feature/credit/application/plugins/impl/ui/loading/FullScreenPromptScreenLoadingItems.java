package com.revolut.feature.credit.application.plugins.impl.ui.loading;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.q60;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/loading/FullScreenPromptScreenLoadingItems;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/loading/LoadingItems;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class FullScreenPromptScreenLoadingItems implements LoadingItems {

    @NotNull
    public static final Parcelable.Creator<FullScreenPromptScreenLoadingItems> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new FullScreenPromptScreenLoadingItems();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullScreenPromptScreenLoadingItems[i];
        }
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingItems
    public final List B5() {
        return u.c(new q60("prompt-content-loading-item"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
