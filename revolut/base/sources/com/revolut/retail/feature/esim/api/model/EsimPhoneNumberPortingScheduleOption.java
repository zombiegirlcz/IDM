package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.z0;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingScheduleOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingScheduleOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingScheduleOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f100394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100396c;
    public final LocalDate d;
    public final Long e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            z0 z0VarValueOf = z0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
            }
            return new EsimPhoneNumberPortingScheduleOption(z0VarValueOf, string, string2, localDate, lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingScheduleOption[i];
        }
    }

    public EsimPhoneNumberPortingScheduleOption(z0 type, String text, String str, LocalDate localDate, Long l2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f100394a = type;
        this.f100395b = text;
        this.f100396c = str;
        this.d = localDate;
        this.e = l2;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingScheduleOption)) {
            return false;
        }
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = (EsimPhoneNumberPortingScheduleOption) obj2;
        return this.f100394a == esimPhoneNumberPortingScheduleOption.f100394a && Intrinsics.f(this.f100395b, esimPhoneNumberPortingScheduleOption.f100395b) && Intrinsics.f(this.f100396c, esimPhoneNumberPortingScheduleOption.f100396c) && Intrinsics.f(this.d, esimPhoneNumberPortingScheduleOption.d) && Intrinsics.f(this.e, esimPhoneNumberPortingScheduleOption.e) && Intrinsics.f(this.f, esimPhoneNumberPortingScheduleOption.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100394a.hashCode() * 31, 31, this.f100395b);
        String str = this.f100396c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.f;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100394a.name());
        dest.writeString(this.f100395b);
        dest.writeString(this.f100396c);
        dest.writeSerializable(this.d);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeSerializable((Serializable) itQ.next());
        }
    }
}
