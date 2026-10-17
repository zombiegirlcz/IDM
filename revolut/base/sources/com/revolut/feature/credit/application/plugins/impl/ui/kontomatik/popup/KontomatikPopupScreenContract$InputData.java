package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/kontomatik/popup/KontomatikPopupScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KontomatikPopupScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<KontomatikPopupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KontomatikPopupScreenConfig f67816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f67817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67818c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KontomatikPopupScreenContract$InputData((KontomatikPopupScreenConfig) parcel.readParcelable(KontomatikPopupScreenContract$InputData.class.getClassLoader()), g.valueOf(parcel.readString()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(KontomatikPopupScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KontomatikPopupScreenContract$InputData[i];
        }
    }

    public KontomatikPopupScreenContract$InputData(KontomatikPopupScreenConfig screenConfig, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67816a = screenConfig;
        this.f67817b = popupType;
        this.f67818c = pluginConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KontomatikPopupScreenContract$InputData)) {
            return false;
        }
        KontomatikPopupScreenContract$InputData kontomatikPopupScreenContract$InputData = (KontomatikPopupScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67816a, kontomatikPopupScreenContract$InputData.f67816a) && this.f67817b == kontomatikPopupScreenContract$InputData.f67817b && Intrinsics.f(this.f67818c, kontomatikPopupScreenContract$InputData.f67818c);
    }

    public final int hashCode() {
        return this.f67818c.hashCode() + ((this.f67817b.hashCode() + (this.f67816a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67816a, i);
        dest.writeString(this.f67817b.name());
        dest.writeParcelable(this.f67818c, i);
    }
}
