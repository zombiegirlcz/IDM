package com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/features/FeatureTagData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureTagData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeatureTagData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f103379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f103380b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeatureTagData((Clause) parcel.readParcelable(FeatureTagData.class.getClassLoader()), (Image) parcel.readParcelable(FeatureTagData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeatureTagData[i];
        }
    }

    public FeatureTagData(Clause text, Image image) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f103379a = image;
        this.f103380b = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeatureTagData)) {
            return false;
        }
        FeatureTagData featureTagData = (FeatureTagData) obj2;
        return Intrinsics.f(this.f103379a, featureTagData.f103379a) && Intrinsics.f(this.f103380b, featureTagData.f103380b);
    }

    public final int hashCode() {
        Image image = this.f103379a;
        return this.f103380b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103379a, i);
        dest.writeParcelable(this.f103380b, i);
    }
}
