package com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/structured_note/details/impl/ui/screens/about_note_glossary/AboutNoteGlossaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AboutNoteGlossaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AboutNoteGlossaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AboutNoteGlossaryScreenContract$Category f88887b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AboutNoteGlossaryScreenContract$InputData(parcel.readString(), AboutNoteGlossaryScreenContract$Category.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AboutNoteGlossaryScreenContract$InputData[i];
        }
    }

    public AboutNoteGlossaryScreenContract$InputData(String ref2, AboutNoteGlossaryScreenContract$Category category) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f88886a = ref2;
        this.f88887b = category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AboutNoteGlossaryScreenContract$InputData)) {
            return false;
        }
        AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = (AboutNoteGlossaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88886a, aboutNoteGlossaryScreenContract$InputData.f88886a) && this.f88887b == aboutNoteGlossaryScreenContract$InputData.f88887b;
    }

    public final int hashCode() {
        return this.f88887b.hashCode() + (this.f88886a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88886a);
        this.f88887b.writeToParcel(dest, i);
    }
}
