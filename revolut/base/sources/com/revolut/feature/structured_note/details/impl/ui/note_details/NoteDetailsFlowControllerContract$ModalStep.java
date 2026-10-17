package com.revolut.feature.structured_note.details.impl.ui.note_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "YearlySellWarning", "Lcom/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$ModalStep$YearlySellWarning;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class NoteDetailsFlowControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$ModalStep$YearlySellWarning;", "Lcom/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$ModalStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YearlySellWarning extends NoteDetailsFlowControllerContract$ModalStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<YearlySellWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88867a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YearlySellWarning(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YearlySellWarning[i];
            }
        }

        public YearlySellWarning(String instrumentName) {
            Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
            this.f88867a = instrumentName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof YearlySellWarning) && Intrinsics.f(this.f88867a, ((YearlySellWarning) obj2).f88867a);
        }

        public final int hashCode() {
            return this.f88867a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88867a);
        }
    }

    private NoteDetailsFlowControllerContract$ModalStep() {
    }
}
