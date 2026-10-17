package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/NotificationSetting;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationSetting implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationSetting> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f62024a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationSetting(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationSetting[i];
        }
    }

    public NotificationSetting(boolean z) {
        this.f62024a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NotificationSetting) && this.f62024a == ((NotificationSetting) obj2).f62024a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62024a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f62024a ? 1 : 0);
    }
}
