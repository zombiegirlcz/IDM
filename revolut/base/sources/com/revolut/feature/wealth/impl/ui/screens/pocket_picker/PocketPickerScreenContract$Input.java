package com.revolut.feature.wealth.impl.ui.screens.pocket_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/pocket_picker/PocketPickerScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketPickerScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PocketPickerScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f95625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f95626c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iD = 0;
            LinkedHashSet linkedHashSet2 = null;
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i2);
                while (iD != i2) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
            }
            return new PocketPickerScreenContract$Input(string, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketPickerScreenContract$Input[i];
        }
    }

    public PocketPickerScreenContract$Input(String selectedPocketId, Set set, Set set2) {
        Intrinsics.checkNotNullParameter(selectedPocketId, "selectedPocketId");
        this.f95624a = selectedPocketId;
        this.f95625b = set;
        this.f95626c = set2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketPickerScreenContract$Input)) {
            return false;
        }
        PocketPickerScreenContract$Input pocketPickerScreenContract$Input = (PocketPickerScreenContract$Input) obj2;
        return Intrinsics.f(this.f95624a, pocketPickerScreenContract$Input.f95624a) && Intrinsics.f(this.f95625b, pocketPickerScreenContract$Input.f95625b) && Intrinsics.f(this.f95626c, pocketPickerScreenContract$Input.f95626c);
    }

    public final int hashCode() {
        int iHashCode = this.f95624a.hashCode() * 31;
        Set set = this.f95625b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f95626c;
        return iHashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95624a);
        Set set = this.f95625b;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        Set set2 = this.f95626c;
        if (set2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = e.q(dest, 1, set2);
        while (itQ2.hasNext()) {
            dest.writeSerializable((Serializable) itQ2.next());
        }
    }
}
