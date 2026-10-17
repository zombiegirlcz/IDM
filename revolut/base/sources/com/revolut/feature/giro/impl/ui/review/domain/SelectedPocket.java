package com.revolut.feature.giro.impl.ui.review.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/review/domain/SelectedPocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedPocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectedPocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f74563b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectedPocket(parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedPocket[i];
        }
    }

    public SelectedPocket(String id10, b currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f74562a = id10;
        this.f74563b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedPocket)) {
            return false;
        }
        SelectedPocket selectedPocket = (SelectedPocket) obj2;
        return Intrinsics.f(this.f74562a, selectedPocket.f74562a) && Intrinsics.f(this.f74563b, selectedPocket.f74563b);
    }

    public final int hashCode() {
        return this.f74563b.hashCode() + (this.f74562a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74562a);
        dest.writeSerializable(this.f74563b);
    }
}
