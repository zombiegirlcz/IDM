package com.revolut.feature.travel.experiences.impl.ui.screen.questions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "VisitorsQuestions", "BookingQuestions", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData$BookingQuestions;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData$VisitorsQuestions;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesQuestionsScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData$BookingQuestions;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingQuestions extends TravelExperiencesQuestionsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<BookingQuestions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f93118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesBookingContactDetails f93119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f93120c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(BookingQuestions.class, parcel, arrayList, iE2, 1);
                }
                TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = (TravelExperiencesBookingContactDetails) parcel.readParcelable(BookingQuestions.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(BookingQuestions.class, parcel, arrayList2, iE, 1);
                }
                return new BookingQuestions(arrayList, travelExperiencesBookingContactDetails, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingQuestions[i];
            }
        }

        public BookingQuestions(ArrayList questions, TravelExperiencesBookingContactDetails contactDetails, ArrayList languages) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
            Intrinsics.checkNotNullParameter(languages, "languages");
            this.f93118a = questions;
            this.f93119b = contactDetails;
            this.f93120c = languages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingQuestions)) {
                return false;
            }
            BookingQuestions bookingQuestions = (BookingQuestions) obj2;
            return this.f93118a.equals(bookingQuestions.f93118a) && Intrinsics.f(this.f93119b, bookingQuestions.f93119b) && this.f93120c.equals(bookingQuestions.f93120c);
        }

        public final int hashCode() {
            return this.f93120c.hashCode() + ((this.f93119b.hashCode() + (this.f93118a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f93118a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f93119b, i);
            Iterator itY2 = j6.a.y(this.f93120c, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData$VisitorsQuestions;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/questions/TravelExperiencesQuestionsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VisitorsQuestions extends TravelExperiencesQuestionsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<VisitorsQuestions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperienceVisitorsSelection f93122b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(VisitorsQuestions.class, parcel, arrayList, iE, 1);
                }
                return new VisitorsQuestions(arrayList, (TravelExperienceVisitorsSelection) parcel.readParcelable(VisitorsQuestions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VisitorsQuestions[i];
            }
        }

        public VisitorsQuestions(List questions, TravelExperienceVisitorsSelection visitorsSelection) {
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
            this.f93121a = questions;
            this.f93122b = visitorsSelection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VisitorsQuestions)) {
                return false;
            }
            VisitorsQuestions visitorsQuestions = (VisitorsQuestions) obj2;
            return Intrinsics.f(this.f93121a, visitorsQuestions.f93121a) && Intrinsics.f(this.f93122b, visitorsQuestions.f93122b);
        }

        public final int hashCode() {
            return this.f93122b.f92916a.hashCode() + (this.f93121a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f93121a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f93122b, i);
        }
    }

    private TravelExperiencesQuestionsScreenContract$InputData() {
    }
}
