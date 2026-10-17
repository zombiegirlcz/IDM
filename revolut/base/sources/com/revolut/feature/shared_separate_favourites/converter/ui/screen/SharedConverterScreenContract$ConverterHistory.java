package com.revolut.feature.shared_separate_favourites.converter.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/converter/ui/screen/SharedConverterScreenContract$ConverterHistory", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedConverterScreenContract$ConverterHistory implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SharedConverterScreenContract$ConverterHistory> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86856b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iE = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(SharedConverterScreenContract$ConverterHistory.class, parcel, arrayList, iE2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(SharedConverterScreenContract$ConverterHistory.class, parcel, arrayList2, iE, 1);
                }
            }
            return new SharedConverterScreenContract$ConverterHistory(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedConverterScreenContract$ConverterHistory[i];
        }
    }

    public SharedConverterScreenContract$ConverterHistory(List list, List list2) {
        this.f86855a = list;
        this.f86856b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedConverterScreenContract$ConverterHistory)) {
            return false;
        }
        SharedConverterScreenContract$ConverterHistory sharedConverterScreenContract$ConverterHistory = (SharedConverterScreenContract$ConverterHistory) obj2;
        return Intrinsics.f(this.f86855a, sharedConverterScreenContract$ConverterHistory.f86855a) && Intrinsics.f(this.f86856b, sharedConverterScreenContract$ConverterHistory.f86856b);
    }

    public final int hashCode() {
        List list = this.f86855a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f86856b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f86855a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        List list2 = this.f86856b;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            dest.writeParcelable((Parcelable) itQ2.next(), i);
        }
    }

    public SharedConverterScreenContract$ConverterHistory() {
        this(null, null);
    }
}
