package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms;

import android.os.Parcel;
import android.os.Parcelable;
import dej.h3;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo", "Landroid/os/Parcelable;", "Immediate", "Scheduled", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo$Immediate;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo$Scheduled;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo$Immediate;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Immediate implements EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo {

        @NotNull
        public static final Parcelable.Creator<Immediate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h3 f101127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f101128c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Immediate(parcel.readInt() != 0, h3.valueOf(parcel.readString()), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Immediate[i];
            }
        }

        public Immediate(boolean z, h3 refundStrategy, Instant instant) {
            Intrinsics.checkNotNullParameter(refundStrategy, "refundStrategy");
            this.f101126a = z;
            this.f101127b = refundStrategy;
            this.f101128c = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Immediate)) {
                return false;
            }
            Immediate immediate = (Immediate) obj2;
            return this.f101126a == immediate.f101126a && this.f101127b == immediate.f101127b && Intrinsics.f(this.f101128c, immediate.f101128c);
        }

        public final int hashCode() {
            int iHashCode = (this.f101127b.hashCode() + (Boolean.hashCode(this.f101126a) * 31)) * 31;
            Instant instant = this.f101128c;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101126a ? 1 : 0);
            dest.writeString(this.f101127b.name());
            dest.writeSerializable(this.f101128c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo$Scheduled;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scheduled implements EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo {

        @NotNull
        public static final Parcelable.Creator<Scheduled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f101129a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scheduled((Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scheduled[i];
            }
        }

        public Scheduled(Instant cancellationDate) {
            Intrinsics.checkNotNullParameter(cancellationDate, "cancellationDate");
            this.f101129a = cancellationDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Scheduled) && Intrinsics.f(this.f101129a, ((Scheduled) obj2).f101129a);
        }

        public final int hashCode() {
            return this.f101129a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101129a);
        }
    }
}
