package com.revolut.feature.insurance_pet.impl.ui.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/cancellation/CancellationPromptActionHandler$PetParcel", "Landroid/os/Parcelable;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class CancellationPromptActionHandler$PetParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancellationPromptActionHandler$PetParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76241c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(t.valueOf(parcel.readString()));
            }
            return new CancellationPromptActionHandler$PetParcel(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationPromptActionHandler$PetParcel[i];
        }
    }

    public CancellationPromptActionHandler$PetParcel(String petName, String petId, List petIssues) {
        Intrinsics.checkNotNullParameter(petName, "petName");
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petIssues, "petIssues");
        this.f76239a = petName;
        this.f76240b = petId;
        this.f76241c = petIssues;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76239a);
        dest.writeString(this.f76240b);
        Iterator itV = p.a.v(this.f76241c, dest);
        while (itV.hasNext()) {
            dest.writeString(((t) itV.next()).name());
        }
    }
}
