package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/payment/CardReaderPaymentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReaderPaymentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardReaderPaymentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f60655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f60656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f60657c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CardReaderPaymentScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CardReaderPaymentScreenContract$InputData(dVar, dVar2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderPaymentScreenContract$InputData[i];
        }
    }

    public CardReaderPaymentScreenContract$InputData(d cartAmount, d dVar, ArrayList lineItems, String str) {
        Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        this.f60655a = cartAmount;
        this.f60656b = dVar;
        this.f60657c = lineItems;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardReaderPaymentScreenContract$InputData)) {
            return false;
        }
        CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData = (CardReaderPaymentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60655a, cardReaderPaymentScreenContract$InputData.f60655a) && Intrinsics.f(this.f60656b, cardReaderPaymentScreenContract$InputData.f60656b) && this.f60657c.equals(cardReaderPaymentScreenContract$InputData.f60657c) && Intrinsics.f(this.d, cardReaderPaymentScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60655a.hashCode() * 31;
        d dVar = this.f60656b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f60657c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str = this.d;
        return iB + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f60655a);
        dest.writeSerializable(this.f60656b);
        Iterator itY = j6.a.y(this.f60657c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.d);
    }
}
