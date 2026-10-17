package com.revolut.chat.ui.chat_profile.profile_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FeedbackFlowStep", "TranscriptPeriodSelectionStep", "TranscriptPeriodCalendarStep", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$FeedbackFlowStep;", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$TranscriptPeriodCalendarStep;", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$TranscriptPeriodSelectionStep;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatProfileScreenContract$ModelStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$FeedbackFlowStep;", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeedbackFlowStep implements ChatProfileScreenContract$ModelStep {

        @NotNull
        public static final Parcelable.Creator<FeedbackFlowStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackendFlowInput f51126a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeedbackFlowStep((BackendFlowInput) parcel.readParcelable(FeedbackFlowStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeedbackFlowStep[i];
            }
        }

        public FeedbackFlowStep(BackendFlowInput backendFlowInput) {
            Intrinsics.checkNotNullParameter(backendFlowInput, "backendFlowInput");
            this.f51126a = backendFlowInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeedbackFlowStep) && Intrinsics.f(this.f51126a, ((FeedbackFlowStep) obj2).f51126a);
        }

        public final int hashCode() {
            return this.f51126a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51126a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$TranscriptPeriodCalendarStep;", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TranscriptPeriodCalendarStep implements ChatProfileScreenContract$ModelStep {

        @NotNull
        public static final Parcelable.Creator<TranscriptPeriodCalendarStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f51127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f51128b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TranscriptPeriodCalendarStep.class, parcel, arrayList, iE, 1);
                }
                return new TranscriptPeriodCalendarStep((LocalDate) parcel.readSerializable(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TranscriptPeriodCalendarStep[i];
            }
        }

        public TranscriptPeriodCalendarStep(LocalDate currentDate, List availableDateRanges) {
            Intrinsics.checkNotNullParameter(availableDateRanges, "availableDateRanges");
            Intrinsics.checkNotNullParameter(currentDate, "currentDate");
            this.f51127a = availableDateRanges;
            this.f51128b = currentDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TranscriptPeriodCalendarStep)) {
                return false;
            }
            TranscriptPeriodCalendarStep transcriptPeriodCalendarStep = (TranscriptPeriodCalendarStep) obj2;
            return Intrinsics.f(this.f51127a, transcriptPeriodCalendarStep.f51127a) && Intrinsics.f(this.f51128b, transcriptPeriodCalendarStep.f51128b);
        }

        public final int hashCode() {
            return this.f51128b.hashCode() + (this.f51127a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f51127a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f51128b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep$TranscriptPeriodSelectionStep;", "Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenContract$ModelStep;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TranscriptPeriodSelectionStep implements ChatProfileScreenContract$ModelStep {

        @NotNull
        public static final Parcelable.Creator<TranscriptPeriodSelectionStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f51129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f51130b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TranscriptPeriodSelectionStep.class, parcel, arrayList, iE, 1);
                }
                return new TranscriptPeriodSelectionStep((LocalDate) parcel.readSerializable(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TranscriptPeriodSelectionStep[i];
            }
        }

        public TranscriptPeriodSelectionStep(LocalDate currentDate, List availableDateRanges) {
            Intrinsics.checkNotNullParameter(availableDateRanges, "availableDateRanges");
            Intrinsics.checkNotNullParameter(currentDate, "currentDate");
            this.f51129a = availableDateRanges;
            this.f51130b = currentDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TranscriptPeriodSelectionStep)) {
                return false;
            }
            TranscriptPeriodSelectionStep transcriptPeriodSelectionStep = (TranscriptPeriodSelectionStep) obj2;
            return Intrinsics.f(this.f51129a, transcriptPeriodSelectionStep.f51129a) && Intrinsics.f(this.f51130b, transcriptPeriodSelectionStep.f51130b);
        }

        public final int hashCode() {
            return this.f51130b.hashCode() + (this.f51129a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f51129a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f51130b);
        }
    }
}
