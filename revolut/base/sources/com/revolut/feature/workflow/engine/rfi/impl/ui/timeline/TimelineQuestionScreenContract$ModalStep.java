package com.revolut.feature.workflow.engine.rfi.impl.ui.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "StartDatePicker", "EndDatePicker", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep$EndDatePicker;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep$StartDatePicker;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TimelineQuestionScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep$EndDatePicker;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndDatePicker extends TimelineQuestionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EndDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.shared.feature.workflow.engine.api.models.workflow.a f96565c;
        public final Long d;
        public final Long e;
        public final Long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Long f96566g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EndDatePicker(parcel.readInt(), parcel.readString(), com.revolut.shared.feature.workflow.engine.api.models.workflow.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EndDatePicker[i];
            }
        }

        public EndDatePicker(int i, String title, com.revolut.shared.feature.workflow.engine.api.models.workflow.a datePrecision, Long l2, Long l3, Long l4, Long l5) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(datePrecision, "datePrecision");
            this.f96563a = i;
            this.f96564b = title;
            this.f96565c = datePrecision;
            this.d = l2;
            this.e = l3;
            this.f = l4;
            this.f96566g = l5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EndDatePicker)) {
                return false;
            }
            EndDatePicker endDatePicker = (EndDatePicker) obj2;
            return this.f96563a == endDatePicker.f96563a && Intrinsics.f(this.f96564b, endDatePicker.f96564b) && this.f96565c == endDatePicker.f96565c && Intrinsics.f(this.d, endDatePicker.d) && Intrinsics.f(this.e, endDatePicker.e) && Intrinsics.f(this.f, endDatePicker.f) && Intrinsics.f(this.f96566g, endDatePicker.f96566g);
        }

        public final int hashCode() {
            int iHashCode = (this.f96565c.hashCode() + p.a.c(Integer.hashCode(this.f96563a) * 31, 31, this.f96564b)) * 31;
            Long l2 = this.d;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.e;
            int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.f;
            int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.f96566g;
            return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f96563a);
            dest.writeString(this.f96564b);
            dest.writeString(this.f96565c.name());
            Long l2 = this.d;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            Long l3 = this.e;
            if (l3 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l3);
            }
            Long l4 = this.f;
            if (l4 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l4);
            }
            Long l5 = this.f96566g;
            if (l5 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l5);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep$StartDatePicker;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartDatePicker extends TimelineQuestionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StartDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.shared.feature.workflow.engine.api.models.workflow.a f96569c;
        public final Long d;
        public final Long e;
        public final Long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Long f96570g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartDatePicker(parcel.readInt(), parcel.readString(), com.revolut.shared.feature.workflow.engine.api.models.workflow.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartDatePicker[i];
            }
        }

        public StartDatePicker(int i, String title, com.revolut.shared.feature.workflow.engine.api.models.workflow.a datePrecision, Long l2, Long l3, Long l4, Long l5) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(datePrecision, "datePrecision");
            this.f96567a = i;
            this.f96568b = title;
            this.f96569c = datePrecision;
            this.d = l2;
            this.e = l3;
            this.f = l4;
            this.f96570g = l5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StartDatePicker)) {
                return false;
            }
            StartDatePicker startDatePicker = (StartDatePicker) obj2;
            return this.f96567a == startDatePicker.f96567a && Intrinsics.f(this.f96568b, startDatePicker.f96568b) && this.f96569c == startDatePicker.f96569c && Intrinsics.f(this.d, startDatePicker.d) && Intrinsics.f(this.e, startDatePicker.e) && Intrinsics.f(this.f, startDatePicker.f) && Intrinsics.f(this.f96570g, startDatePicker.f96570g);
        }

        public final int hashCode() {
            int iHashCode = (this.f96569c.hashCode() + p.a.c(Integer.hashCode(this.f96567a) * 31, 31, this.f96568b)) * 31;
            Long l2 = this.d;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.e;
            int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Long l4 = this.f;
            int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.f96570g;
            return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f96567a);
            dest.writeString(this.f96568b);
            dest.writeString(this.f96569c.name());
            Long l2 = this.d;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            Long l3 = this.e;
            if (l3 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l3);
            }
            Long l4 = this.f;
            if (l4 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l4);
            }
            Long l5 = this.f96570g;
            if (l5 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l5);
            }
        }
    }

    private TimelineQuestionScreenContract$ModalStep() {
    }
}
