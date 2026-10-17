package com.revolut.feature.travel.experiences.impl.ui.screen.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRefund;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode", "Landroid/os/Parcelable;", "ExperiencePreview", "BookingCancellation", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode$BookingCancellation;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode$ExperiencePreview;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesCancellationScreenContract$Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode$BookingCancellation;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingCancellation extends TravelExperiencesCancellationScreenContract$Mode implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BookingCancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceCancellationPolicy.Booking f93027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f93028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f93029c;
        public final TravelExperienceCancellationRefund d;
        public final dj0.d e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingCancellation((TravelExperienceCancellationPolicy.Booking) parcel.readParcelable(BookingCancellation.class.getClassLoader()), parcel.readString(), parcel.readString(), (TravelExperienceCancellationRefund) parcel.readParcelable(BookingCancellation.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingCancellation[i];
            }
        }

        public BookingCancellation(TravelExperienceCancellationPolicy.Booking cancellationPolicy, String bookingId, String bookingToken, TravelExperienceCancellationRefund cancellationRefund, dj0.d bookingValue) {
            Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
            Intrinsics.checkNotNullParameter(cancellationRefund, "cancellationRefund");
            Intrinsics.checkNotNullParameter(bookingValue, "bookingValue");
            this.f93027a = cancellationPolicy;
            this.f93028b = bookingId;
            this.f93029c = bookingToken;
            this.d = cancellationRefund;
            this.e = bookingValue;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode
        public final TravelExperienceCancellationPolicy a() {
            return this.f93027a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingCancellation)) {
                return false;
            }
            BookingCancellation bookingCancellation = (BookingCancellation) obj2;
            return Intrinsics.f(this.f93027a, bookingCancellation.f93027a) && Intrinsics.f(this.f93028b, bookingCancellation.f93028b) && Intrinsics.f(this.f93029c, bookingCancellation.f93029c) && Intrinsics.f(this.d, bookingCancellation.d) && Intrinsics.f(this.e, bookingCancellation.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f93027a.hashCode() * 31, 31, this.f93028b), 31, this.f93029c)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93027a, i);
            dest.writeString(this.f93028b);
            dest.writeString(this.f93029c);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode$ExperiencePreview;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$Mode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExperiencePreview extends TravelExperiencesCancellationScreenContract$Mode implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExperiencePreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceCancellationPolicy.Experience f93030a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExperiencePreview((TravelExperienceCancellationPolicy.Experience) parcel.readParcelable(ExperiencePreview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperiencePreview[i];
            }
        }

        public ExperiencePreview(TravelExperienceCancellationPolicy.Experience cancellationPolicy) {
            Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
            this.f93030a = cancellationPolicy;
        }

        @Override // com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode
        public final TravelExperienceCancellationPolicy a() {
            return this.f93030a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExperiencePreview) && Intrinsics.f(this.f93030a, ((ExperiencePreview) obj2).f93030a);
        }

        public final int hashCode() {
            return this.f93030a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93030a, i);
        }
    }

    public abstract TravelExperienceCancellationPolicy a();
}
