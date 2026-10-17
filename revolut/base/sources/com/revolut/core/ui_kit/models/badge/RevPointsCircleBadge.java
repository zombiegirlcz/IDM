package com.revolut.core.ui_kit.models.badge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/badge/RevPointsCircleBadge;", "Lcom/revolut/core/ui_kit/models/badge/CircleIconBadge;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsCircleBadge implements CircleIconBadge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RevPointsCircleBadge f58067a = new RevPointsCircleBadge();

    @NotNull
    public static final Parcelable.Creator<RevPointsCircleBadge> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return RevPointsCircleBadge.f58067a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsCircleBadge[i];
        }
    }

    private RevPointsCircleBadge() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.core.ui_kit.models.badge.CircleIconBadge
    /* JADX INFO: renamed from: getIcon */
    public final dw0.a getF58071a() {
        return dw0.a.RevPoints;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
