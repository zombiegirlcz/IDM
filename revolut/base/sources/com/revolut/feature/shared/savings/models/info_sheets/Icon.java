package com.revolut.feature.shared.savings.models.info_sheets;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mcd.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Icon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Icon> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f86468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mcd.a f86469b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Icon(b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : mcd.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Icon[i];
        }
    }

    public Icon(b type, mcd.a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86468a = type;
        this.f86469b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj2;
        return this.f86468a == icon.f86468a && this.f86469b == icon.f86469b;
    }

    public final int hashCode() {
        int iHashCode = this.f86468a.hashCode() * 31;
        mcd.a aVar = this.f86469b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86468a.name());
        mcd.a aVar = this.f86469b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
