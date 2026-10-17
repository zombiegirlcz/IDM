package com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Install", "Transfer", "Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData$Install;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData$Transfer;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSetupOptionsScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData$Install;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Install implements EsimSetupOptionsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Install> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f100967a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Install.class, parcel, arrayList, iE, 1);
                }
                return new Install(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Install[i];
            }
        }

        public Install(ArrayList esimProfiles) {
            Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
            this.f100967a = esimProfiles;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData
        public final List Z8() {
            return this.f100967a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Install) && this.f100967a.equals(((Install) obj2).f100967a);
        }

        public final int hashCode() {
            return this.f100967a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f100967a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData$Transfer;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/esim_setup_options/EsimSetupOptionsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements EsimSetupOptionsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f100968a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Transfer.class, parcel, arrayList, iE, 1);
                }
                return new Transfer(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(ArrayList esimProfiles) {
            Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
            this.f100968a = esimProfiles;
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData
        public final List Z8() {
            return this.f100968a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && this.f100968a.equals(((Transfer) obj2).f100968a);
        }

        public final int hashCode() {
            return this.f100968a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f100968a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    List Z8();
}
