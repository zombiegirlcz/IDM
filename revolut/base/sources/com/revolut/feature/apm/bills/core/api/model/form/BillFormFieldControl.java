package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldControl;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFormFieldControl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillFormFieldControl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f61358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f61359b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            LinkedHashSet linkedHashSet2 = null;
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = o.a(parcel, linkedHashSet, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i2);
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet2, iA, 1);
                }
            }
            return new BillFormFieldControl(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillFormFieldControl[i];
        }
    }

    public BillFormFieldControl(Set set, Set set2) {
        this.f61358a = set;
        this.f61359b = set2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillFormFieldControl)) {
            return false;
        }
        BillFormFieldControl billFormFieldControl = (BillFormFieldControl) obj2;
        return Intrinsics.f(this.f61358a, billFormFieldControl.f61358a) && Intrinsics.f(this.f61359b, billFormFieldControl.f61359b);
    }

    public final int hashCode() {
        Set set = this.f61358a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set set2 = this.f61359b;
        return iHashCode + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Set set = this.f61358a;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString((String) itQ.next());
            }
        }
        Set set2 = this.f61359b;
        if (set2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = e.q(dest, 1, set2);
        while (itQ2.hasNext()) {
            dest.writeString((String) itQ2.next());
        }
    }

    public BillFormFieldControl() {
        this(null, null);
    }
}
