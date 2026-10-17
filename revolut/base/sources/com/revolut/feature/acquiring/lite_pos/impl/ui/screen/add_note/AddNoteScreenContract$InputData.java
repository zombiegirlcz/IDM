package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/add_note/AddNoteScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddNoteScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddNoteScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f60769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60771c;
    public final Clause d;
    public final int e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddNoteScreenContract$InputData((Clause) parcel.readParcelable(AddNoteScreenContract$InputData.class.getClassLoader()), parcel.readString(), (Clause) parcel.readParcelable(AddNoteScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(AddNoteScreenContract$InputData.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddNoteScreenContract$InputData[i];
        }
    }

    public AddNoteScreenContract$InputData(Clause title, String text, Clause label, Clause buttonText, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f60769a = title;
        this.f60770b = text;
        this.f60771c = label;
        this.d = buttonText;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddNoteScreenContract$InputData)) {
            return false;
        }
        AddNoteScreenContract$InputData addNoteScreenContract$InputData = (AddNoteScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60769a, addNoteScreenContract$InputData.f60769a) && Intrinsics.f(this.f60770b, addNoteScreenContract$InputData.f60770b) && Intrinsics.f(this.f60771c, addNoteScreenContract$InputData.f60771c) && Intrinsics.f(this.d, addNoteScreenContract$InputData.d) && this.e == addNoteScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + p.a.a(p.a.a(p.a.c(this.f60769a.hashCode() * 31, 31, this.f60770b), 31, this.f60771c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60769a, i);
        dest.writeString(this.f60770b);
        dest.writeParcelable(this.f60771c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e);
    }

    public /* synthetic */ AddNoteScreenContract$InputData(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, String str) {
        this(textLocalisedClause, str, textLocalisedClause2, textLocalisedClause3, 100);
    }
}
