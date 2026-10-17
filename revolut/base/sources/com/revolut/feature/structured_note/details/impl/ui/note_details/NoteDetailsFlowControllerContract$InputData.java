package com.revolut.feature.structured_note.details.impl.ui.note_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/note_details/NoteDetailsFlowControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NoteDetailsFlowControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NoteDetailsFlowControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88866b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NoteDetailsFlowControllerContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NoteDetailsFlowControllerContract$InputData[i];
        }
    }

    public NoteDetailsFlowControllerContract$InputData(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f88865a = ref2;
        this.f88866b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NoteDetailsFlowControllerContract$InputData)) {
            return false;
        }
        NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = (NoteDetailsFlowControllerContract$InputData) obj2;
        return Intrinsics.f(this.f88865a, noteDetailsFlowControllerContract$InputData.f88865a) && this.f88866b == noteDetailsFlowControllerContract$InputData.f88866b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88866b) + (this.f88865a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88865a);
        dest.writeInt(this.f88866b ? 1 : 0);
    }
}
