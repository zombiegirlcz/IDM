package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfferFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f68063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f68064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f68065c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferFlowContract$State(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? fu3.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferFlowContract$State[i];
        }
    }

    public OfferFlowContract$State(Long l2, Long l3, fu3.a aVar) {
        this.f68063a = l2;
        this.f68064b = l3;
        this.f68065c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OfferFlowContract$State)) {
            return false;
        }
        OfferFlowContract$State offerFlowContract$State = (OfferFlowContract$State) obj2;
        return Intrinsics.f(this.f68063a, offerFlowContract$State.f68063a) && Intrinsics.f(this.f68064b, offerFlowContract$State.f68064b) && this.f68065c == offerFlowContract$State.f68065c;
    }

    public final int hashCode() {
        Long l2 = this.f68063a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f68064b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.f68065c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f68063a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Long l3 = this.f68064b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l3);
        }
        fu3.a aVar = this.f68065c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }

    public OfferFlowContract$State() {
        this(null, null, null);
    }
}
