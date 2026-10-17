package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenHeaderAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FincrimeHomeScreenHeaderAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FincrimeHomeScreenHeaderAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aal.b f64153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FincrimeHomeScreenAction f64154c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FincrimeHomeScreenHeaderAction(parcel.readString(), parcel.readInt() == 0 ? null : aal.b.valueOf(parcel.readString()), (FincrimeHomeScreenAction) parcel.readParcelable(FincrimeHomeScreenHeaderAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FincrimeHomeScreenHeaderAction[i];
        }
    }

    public FincrimeHomeScreenHeaderAction(String str, aal.b bVar, FincrimeHomeScreenAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f64152a = str;
        this.f64153b = bVar;
        this.f64154c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FincrimeHomeScreenHeaderAction)) {
            return false;
        }
        FincrimeHomeScreenHeaderAction fincrimeHomeScreenHeaderAction = (FincrimeHomeScreenHeaderAction) obj2;
        return Intrinsics.f(this.f64152a, fincrimeHomeScreenHeaderAction.f64152a) && this.f64153b == fincrimeHomeScreenHeaderAction.f64153b && Intrinsics.f(this.f64154c, fincrimeHomeScreenHeaderAction.f64154c);
    }

    public final int hashCode() {
        String str = this.f64152a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        aal.b bVar = this.f64153b;
        return this.f64154c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64152a);
        aal.b bVar = this.f64153b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeParcelable(this.f64154c, i);
    }
}
