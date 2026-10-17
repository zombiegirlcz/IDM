package com.revolut.feature.transactions.impl.ui.kompot.edit_note.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/impl/ui/kompot/edit_note/declaration/EditNoteDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditNoteDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<EditNoteDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92064b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditNoteDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditNoteDestination[i];
        }
    }

    public EditNoteDestination(String transactionGroupId, String initialText) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        this.f92063a = transactionGroupId;
        this.f92064b = initialText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditNoteDestination)) {
            return false;
        }
        EditNoteDestination editNoteDestination = (EditNoteDestination) obj2;
        return Intrinsics.f(this.f92063a, editNoteDestination.f92063a) && Intrinsics.f(this.f92064b, editNoteDestination.f92064b);
    }

    public final int hashCode() {
        return this.f92064b.hashCode() + (this.f92063a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92063a);
        dest.writeString(this.f92064b);
    }
}
