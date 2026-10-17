package com.revolut.feature.payments.send_from_clipboard.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardPaymentOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendFromClipboardPaymentOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SendFromClipboardPaymentOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f79688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f79689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79690c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SendFromClipboardPaymentOption.class, parcel, arrayList, iE, 1);
            }
            return new SendFromClipboardPaymentOption(parcel.readInt(), (Clause) parcel.readParcelable(SendFromClipboardPaymentOption.class.getClassLoader()), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SendFromClipboardPaymentOption[i];
        }
    }

    public SendFromClipboardPaymentOption(int i, Clause title, List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f79688a = types;
        this.f79689b = title;
        this.f79690c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SendFromClipboardPaymentOption)) {
            return false;
        }
        SendFromClipboardPaymentOption sendFromClipboardPaymentOption = (SendFromClipboardPaymentOption) obj2;
        return Intrinsics.f(this.f79688a, sendFromClipboardPaymentOption.f79688a) && Intrinsics.f(this.f79689b, sendFromClipboardPaymentOption.f79689b) && this.f79690c == sendFromClipboardPaymentOption.f79690c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79690c) + p.a.a(this.f79688a.hashCode() * 31, 31, this.f79689b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f79688a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f79689b, i);
        dest.writeInt(this.f79690c);
    }
}
