package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$EsimProfilesParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionsScreenContract$EsimProfilesParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionsScreenContract$EsimProfilesParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f101028a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimSubscriptionsScreenContract$EsimProfilesParcel.class, parcel, arrayList, iE, 1);
            }
            return new EsimSubscriptionsScreenContract$EsimProfilesParcel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionsScreenContract$EsimProfilesParcel[i];
        }
    }

    public EsimSubscriptionsScreenContract$EsimProfilesParcel(ArrayList esimProfiles) {
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f101028a = esimProfiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EsimSubscriptionsScreenContract$EsimProfilesParcel) && this.f101028a.equals(((EsimSubscriptionsScreenContract$EsimProfilesParcel) obj2).f101028a);
    }

    public final int hashCode() {
        return this.f101028a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f101028a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
