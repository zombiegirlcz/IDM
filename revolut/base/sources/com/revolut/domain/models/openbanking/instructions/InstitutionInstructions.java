package com.revolut.domain.models.openbanking.instructions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/openbanking/instructions/InstitutionInstructions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionInstructions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstitutionInstructions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstructionsSecondaryButton f60411c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            InstructionsSecondaryButton instructionsSecondaryButtonCreateFromParcel = parcel.readInt() == 0 ? null : InstructionsSecondaryButton.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(InstructionsSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new InstitutionInstructions(string, string2, instructionsSecondaryButtonCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstitutionInstructions[i];
        }
    }

    public InstitutionInstructions(String title, String str, InstructionsSecondaryButton instructionsSecondaryButton, ArrayList sections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f60409a = title;
        this.f60410b = str;
        this.f60411c = instructionsSecondaryButton;
        this.d = sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstitutionInstructions)) {
            return false;
        }
        InstitutionInstructions institutionInstructions = (InstitutionInstructions) obj2;
        return Intrinsics.f(this.f60409a, institutionInstructions.f60409a) && Intrinsics.f(this.f60410b, institutionInstructions.f60410b) && Intrinsics.f(this.f60411c, institutionInstructions.f60411c) && this.d.equals(institutionInstructions.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60409a.hashCode() * 31;
        String str = this.f60410b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InstructionsSecondaryButton instructionsSecondaryButton = this.f60411c;
        return this.d.hashCode() + ((iHashCode2 + (instructionsSecondaryButton != null ? instructionsSecondaryButton.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60409a);
        dest.writeString(this.f60410b);
        InstructionsSecondaryButton instructionsSecondaryButton = this.f60411c;
        if (instructionsSecondaryButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            instructionsSecondaryButton.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((InstructionsSection) itY.next()).writeToParcel(dest, i);
        }
    }
}
