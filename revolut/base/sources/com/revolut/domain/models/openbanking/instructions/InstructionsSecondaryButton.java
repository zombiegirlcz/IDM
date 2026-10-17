package com.revolut.domain.models.openbanking.instructions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/instructions/InstructionsSecondaryButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstructionsSecondaryButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstructionsSecondaryButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60413b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstructionsSecondaryButton(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstructionsSecondaryButton[i];
        }
    }

    public InstructionsSecondaryButton(String title, String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f60412a = title;
        this.f60413b = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstructionsSecondaryButton)) {
            return false;
        }
        InstructionsSecondaryButton instructionsSecondaryButton = (InstructionsSecondaryButton) obj2;
        return Intrinsics.f(this.f60412a, instructionsSecondaryButton.f60412a) && Intrinsics.f(this.f60413b, instructionsSecondaryButton.f60413b);
    }

    public final int hashCode() {
        return this.f60413b.hashCode() + (this.f60412a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60412a);
        dest.writeString(this.f60413b);
    }
}
