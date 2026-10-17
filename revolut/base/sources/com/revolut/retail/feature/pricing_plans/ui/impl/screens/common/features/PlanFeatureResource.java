package com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import hha.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/features/PlanFeatureResource;", "", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanFeatureResource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanFeatureResource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f103381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f103383c;
    public final Clause d;
    public final int e;
    public final FeatureTagData f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanFeatureResource((u) parcel.readSerializable(), parcel.readString(), (Clause) parcel.readParcelable(PlanFeatureResource.class.getClassLoader()), (Clause) parcel.readParcelable(PlanFeatureResource.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : FeatureTagData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanFeatureResource[i];
        }
    }

    public PlanFeatureResource(u uVar, Clause clause, Clause clause2, int i, FeatureTagData featureTagData, int i2) {
        this(uVar, uVar.f152366a, clause, clause2, i, (i2 & 32) != 0 ? null : featureTagData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanFeatureResource)) {
            return false;
        }
        PlanFeatureResource planFeatureResource = (PlanFeatureResource) obj2;
        return Intrinsics.f(this.f103381a, planFeatureResource.f103381a) && Intrinsics.f(this.f103382b, planFeatureResource.f103382b) && Intrinsics.f(this.f103383c, planFeatureResource.f103383c) && Intrinsics.f(this.d, planFeatureResource.d) && this.e == planFeatureResource.e && Intrinsics.f(this.f, planFeatureResource.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, p.a.a(p.a.a(p.a.c(this.f103381a.f152366a.hashCode() * 31, 31, this.f103382b), 31, this.f103383c), 31, this.d), 31);
        FeatureTagData featureTagData = this.f;
        return iB + (featureTagData == null ? 0 : featureTagData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103381a);
        dest.writeString(this.f103382b);
        dest.writeParcelable(this.f103383c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e);
        FeatureTagData featureTagData = this.f;
        if (featureTagData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            featureTagData.writeToParcel(dest, i);
        }
    }

    public PlanFeatureResource(u feature, String id10, Clause cellTitle, Clause cellSubtitle, int i, FeatureTagData featureTagData) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(cellSubtitle, "cellSubtitle");
        this.f103381a = feature;
        this.f103382b = id10;
        this.f103383c = cellTitle;
        this.d = cellSubtitle;
        this.e = i;
        this.f = featureTagData;
    }
}
