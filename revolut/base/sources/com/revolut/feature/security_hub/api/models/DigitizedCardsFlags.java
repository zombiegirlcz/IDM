package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/DigitizedCardsFlags;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DigitizedCardsFlags implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitizedCardsFlags> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f85407a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DigitizedCardsFlags(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DigitizedCardsFlags[i];
        }
    }

    public DigitizedCardsFlags(Boolean bool) {
        this.f85407a = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DigitizedCardsFlags) && Intrinsics.f(this.f85407a, ((DigitizedCardsFlags) obj2).f85407a);
    }

    public final int hashCode() {
        Boolean bool = this.f85407a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.f85407a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
