package com.revolut.feature.home_feed.impl.widgets.scheduled_payments;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;", "Landroid/os/Parcelable;", "CreditCard", "Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint$CreditCard;", "feature_home_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScheduledPaymentsEntryPoint extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint$CreditCard;", "Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCard implements ScheduledPaymentsEntryPoint {

        @NotNull
        public static final Parcelable.Creator<CreditCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCard(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCard[i];
            }
        }

        public CreditCard(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f74731a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditCard) && Intrinsics.f(this.f74731a, ((CreditCard) obj2).f74731a);
        }

        public final int hashCode() {
            return this.f74731a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74731a);
        }
    }
}
