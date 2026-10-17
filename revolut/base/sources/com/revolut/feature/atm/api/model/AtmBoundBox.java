package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/AtmBoundBox;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmBoundBox implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AtmBoundBox> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtmLocation f63132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtmLocation f63133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtmLocation f63134c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<AtmLocation> creator = AtmLocation.CREATOR;
            return new AtmBoundBox(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmBoundBox[i];
        }
    }

    public AtmBoundBox(AtmLocation rightTop, AtmLocation leftBottom, AtmLocation center) {
        Intrinsics.checkNotNullParameter(rightTop, "rightTop");
        Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
        Intrinsics.checkNotNullParameter(center, "center");
        this.f63132a = rightTop;
        this.f63133b = leftBottom;
        this.f63134c = center;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmBoundBox)) {
            return false;
        }
        AtmBoundBox atmBoundBox = (AtmBoundBox) obj2;
        return Intrinsics.f(this.f63132a, atmBoundBox.f63132a) && Intrinsics.f(this.f63133b, atmBoundBox.f63133b) && Intrinsics.f(this.f63134c, atmBoundBox.f63134c);
    }

    public final int hashCode() {
        return this.f63134c.hashCode() + ((this.f63133b.hashCode() + (this.f63132a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f63132a.writeToParcel(dest, i);
        this.f63133b.writeToParcel(dest, i);
        this.f63134c.writeToParcel(dest, i);
    }
}
