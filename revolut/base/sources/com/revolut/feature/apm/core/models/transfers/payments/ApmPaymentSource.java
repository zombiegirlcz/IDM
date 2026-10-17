package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t02.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "t02/c", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f62208b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentSource(parcel.readString(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentSource[i];
        }
    }

    public ApmPaymentSource(String id10, c entity) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.f62207a = id10;
        this.f62208b = entity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentSource)) {
            return false;
        }
        ApmPaymentSource apmPaymentSource = (ApmPaymentSource) obj2;
        return Intrinsics.f(this.f62207a, apmPaymentSource.f62207a) && this.f62208b == apmPaymentSource.f62208b;
    }

    public final int hashCode() {
        return this.f62208b.hashCode() + (this.f62207a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62207a);
        dest.writeString(this.f62208b.name());
    }
}
