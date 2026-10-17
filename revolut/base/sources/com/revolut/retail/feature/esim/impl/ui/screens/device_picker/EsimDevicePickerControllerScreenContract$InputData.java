package com.revolut.retail.feature.esim.impl.ui.screens.device_picker;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/device_picker/EsimDevicePickerControllerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimDevicePickerControllerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimDevicePickerControllerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f100963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f100964c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimDevicePickerControllerScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimDevicePickerControllerScreenContract$GiftRecipientData.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new EsimDevicePickerControllerScreenContract$InputData(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimDevicePickerControllerScreenContract$InputData[i];
        }
    }

    public EsimDevicePickerControllerScreenContract$InputData(String selectedOptionId, ArrayList devices, List giftRecipients) {
        Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(giftRecipients, "giftRecipients");
        this.f100962a = selectedOptionId;
        this.f100963b = devices;
        this.f100964c = giftRecipients;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimDevicePickerControllerScreenContract$InputData)) {
            return false;
        }
        EsimDevicePickerControllerScreenContract$InputData esimDevicePickerControllerScreenContract$InputData = (EsimDevicePickerControllerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f100962a, esimDevicePickerControllerScreenContract$InputData.f100962a) && this.f100963b.equals(esimDevicePickerControllerScreenContract$InputData.f100963b) && this.f100964c.equals(esimDevicePickerControllerScreenContract$InputData.f100964c);
    }

    public final int hashCode() {
        return this.f100964c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f100963b, this.f100962a.hashCode() * 31, 31);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100962a);
        Iterator itY = j6.a.y(this.f100963b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        ?? r06 = this.f100964c;
        dest.writeInt(r06.size());
        Iterator it8 = r06.iterator();
        while (it8.hasNext()) {
            ((EsimDevicePickerControllerScreenContract$GiftRecipientData) it8.next()).writeToParcel(dest, i);
        }
    }
}
