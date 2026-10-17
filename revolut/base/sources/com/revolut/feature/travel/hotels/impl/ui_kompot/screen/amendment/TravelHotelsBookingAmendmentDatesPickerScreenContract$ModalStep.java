package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ManageBooking", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "DialogScenario", "DialogAction", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageBooking implements TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ManageBooking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DialogScenario f93800a;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction;", "Landroid/os/Parcelable;", "ChangeRoom", "ChangeDates", "CancelBooking", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$CancelBooking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$ChangeDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$ChangeRoom;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface DialogAction extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$CancelBooking;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class CancelBooking implements DialogAction {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final CancelBooking f93801a = new CancelBooking();

                @NotNull
                public static final Parcelable.Creator<CancelBooking> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return CancelBooking.f93801a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CancelBooking[i];
                    }
                }

                private CancelBooking() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$ChangeDates;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class ChangeDates implements DialogAction {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ChangeDates f93802a = new ChangeDates();

                @NotNull
                public static final Parcelable.Creator<ChangeDates> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return ChangeDates.f93802a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ChangeDates[i];
                    }
                }

                private ChangeDates() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction$ChangeRoom;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogAction;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class ChangeRoom implements DialogAction {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ChangeRoom f93803a = new ChangeRoom();

                @NotNull
                public static final Parcelable.Creator<ChangeRoom> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return ChangeRoom.f93803a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ChangeRoom[i];
                    }
                }

                private ChangeRoom() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario;", "Landroid/os/Parcelable;", "AlternativeRoomsAvailable", "NoRoomsAvailable", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$AlternativeRoomsAvailable;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$NoRoomsAvailable;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class DialogScenario implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextLocalisedClause f93804a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextLocalisedClause f93805b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextLocalisedClause f93806c;
            public final DialogAction d;
            public final DialogAction e;
            public final TextLocalisedClause f;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$AlternativeRoomsAvailable;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class AlternativeRoomsAvailable extends DialogScenario {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final AlternativeRoomsAvailable f93807g = new AlternativeRoomsAvailable();

                @NotNull
                public static final Parcelable.Creator<AlternativeRoomsAvailable> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return AlternativeRoomsAvailable.f93807g;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AlternativeRoomsAvailable[i];
                    }
                }

                private AlternativeRoomsAvailable() {
                    super(new TextLocalisedClause(R$string.hotels_other_room_subtitle, null, null, 14), new TextLocalisedClause(R$string.hotels_other_room_change_room_btn, null, null, 14), new TextLocalisedClause(R$string.hotels_other_room_change_dates_btn, null, null, 14), DialogAction.ChangeRoom.f93803a, DialogAction.ChangeDates.f93802a);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$NoRoomsAvailable;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment/TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class NoRoomsAvailable extends DialogScenario {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final NoRoomsAvailable f93808g = new NoRoomsAvailable();

                @NotNull
                public static final Parcelable.Creator<NoRoomsAvailable> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return NoRoomsAvailable.f93808g;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new NoRoomsAvailable[i];
                    }
                }

                private NoRoomsAvailable() {
                    super(new TextLocalisedClause(R$string.hotels_no_available_room_subtitle, null, null, 14), new TextLocalisedClause(R$string.hotels_other_room_change_dates_btn, null, null, 14), new TextLocalisedClause(R$string.hotels_no_available_room_cancel_btn, null, null, 14), DialogAction.ChangeDates.f93802a, DialogAction.CancelBooking.f93801a);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            public DialogScenario(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, DialogAction dialogAction, DialogAction dialogAction2) {
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.hotels_other_room_title, null, null, 14);
                this.f93804a = textLocalisedClause;
                this.f93805b = textLocalisedClause2;
                this.f93806c = textLocalisedClause3;
                this.d = dialogAction;
                this.e = dialogAction2;
                this.f = textLocalisedClause4;
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageBooking((DialogScenario) parcel.readParcelable(ManageBooking.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageBooking[i];
            }
        }

        public ManageBooking(DialogScenario scenario) {
            Intrinsics.checkNotNullParameter(scenario, "scenario");
            this.f93800a = scenario;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageBooking) && Intrinsics.f(this.f93800a, ((ManageBooking) obj2).f93800a);
        }

        public final int hashCode() {
            return this.f93800a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93800a, i);
        }
    }
}
