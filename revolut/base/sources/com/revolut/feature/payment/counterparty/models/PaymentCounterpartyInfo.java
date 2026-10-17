package com.revolut.feature.payment.counterparty.models;

import android.os.Parcel;
import android.os.Parcelable;
import ho9.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/payment/counterparty/models/PaymentCounterpartyInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "ho9/c", "ho9/b", "a", "feature_payment_counterparty_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCounterpartyInfo implements Parcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f79059j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho9.b f79061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f79062c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f79063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PaymentCounterpartySettings f79064h;
    public final PaymentCounterpartyAttributes i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PaymentCounterpartyInfo> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ho9.b bVarValueOf = ho9.b.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = a.a(PaymentCounterpartyReferenceItem.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new PaymentCounterpartyInfo(string, bVarValueOf, cVarValueOf, string2, string3, string4, arrayList, parcel.readInt() == 0 ? null : PaymentCounterpartySettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentCounterpartyAttributes.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCounterpartyInfo[i];
        }
    }

    static {
        ho9.b[] elements = {ho9.b.BPAY_BILLER, ho9.b.TAPI_BILLER, ho9.b.NZ_BILLS_BILLER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f79059j = d.y0(elements);
    }

    public PaymentCounterpartyInfo(String id10, ho9.b type, c state, String str, String str2, String str3, List list, PaymentCounterpartySettings paymentCounterpartySettings, PaymentCounterpartyAttributes paymentCounterpartyAttributes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f79060a = id10;
        this.f79061b = type;
        this.f79062c = state;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f79063g = list;
        this.f79064h = paymentCounterpartySettings;
        this.i = paymentCounterpartyAttributes;
    }

    public final String a(String str) {
        Object next;
        List list = this.f79063g;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((PaymentCounterpartyReferenceItem) next).f79065a, str)) {
                    break;
                }
            }
            PaymentCounterpartyReferenceItem paymentCounterpartyReferenceItem = (PaymentCounterpartyReferenceItem) next;
            if (paymentCounterpartyReferenceItem != null) {
                return paymentCounterpartyReferenceItem.f79067c;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentCounterpartyInfo)) {
            return false;
        }
        PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj2;
        return Intrinsics.f(this.f79060a, paymentCounterpartyInfo.f79060a) && this.f79061b == paymentCounterpartyInfo.f79061b && this.f79062c == paymentCounterpartyInfo.f79062c && Intrinsics.f(this.d, paymentCounterpartyInfo.d) && Intrinsics.f(this.e, paymentCounterpartyInfo.e) && Intrinsics.f(this.f, paymentCounterpartyInfo.f) && Intrinsics.f(this.f79063g, paymentCounterpartyInfo.f79063g) && Intrinsics.f(this.f79064h, paymentCounterpartyInfo.f79064h) && Intrinsics.f(this.i, paymentCounterpartyInfo.i);
    }

    public final String getDisplayName() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String str2 = this.e;
        return str2 == null ? "" : str2;
    }

    public final int hashCode() {
        int iHashCode = (this.f79062c.hashCode() + ((this.f79061b.hashCode() + (this.f79060a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f79063g;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentCounterpartySettings paymentCounterpartySettings = this.f79064h;
        int iHashCode6 = (iHashCode5 + (paymentCounterpartySettings == null ? 0 : paymentCounterpartySettings.hashCode())) * 31;
        PaymentCounterpartyAttributes paymentCounterpartyAttributes = this.i;
        return iHashCode6 + (paymentCounterpartyAttributes != null ? paymentCounterpartyAttributes.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79060a);
        dest.writeString(this.f79061b.name());
        dest.writeString(this.f79062c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        List list = this.f79063g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((PaymentCounterpartyReferenceItem) itQ.next()).writeToParcel(dest, i);
            }
        }
        PaymentCounterpartySettings paymentCounterpartySettings = this.f79064h;
        if (paymentCounterpartySettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentCounterpartySettings.writeToParcel(dest, i);
        }
        PaymentCounterpartyAttributes paymentCounterpartyAttributes = this.i;
        if (paymentCounterpartyAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentCounterpartyAttributes.writeToParcel(dest, i);
        }
    }
}
