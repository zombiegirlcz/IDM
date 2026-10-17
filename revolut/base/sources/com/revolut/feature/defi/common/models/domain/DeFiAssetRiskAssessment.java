package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiAssetRiskAssessment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAssetRiskAssessment implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetRiskLevel f71685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f71686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71687c;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetRiskAssessment> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DeFiAssetRiskLevel deFiAssetRiskLevelCreateFromParcel = DeFiAssetRiskLevel.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeFiAssetRiskType.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DeFiAssetRiskAssessment(deFiAssetRiskLevelCreateFromParcel, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetRiskAssessment[i];
        }
    }

    public DeFiAssetRiskAssessment(DeFiAssetRiskLevel level, ArrayList risks, boolean z) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(risks, "risks");
        this.f71685a = level;
        this.f71686b = risks;
        this.f71687c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAssetRiskAssessment)) {
            return false;
        }
        DeFiAssetRiskAssessment deFiAssetRiskAssessment = (DeFiAssetRiskAssessment) obj2;
        return this.f71685a == deFiAssetRiskAssessment.f71685a && this.f71686b.equals(deFiAssetRiskAssessment.f71686b) && this.f71687c == deFiAssetRiskAssessment.f71687c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71687c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f71686b, this.f71685a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71685a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f71686b, dest);
        while (itY.hasNext()) {
            ((DeFiAssetRiskType) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f71687c ? 1 : 0);
    }
}
