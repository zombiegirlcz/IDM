package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.h0;
import xl2.w;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MoneyInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/h0;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyInputItem implements InputItem, h0 {

    @NotNull
    public static final Parcelable.Creator<MoneyInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f63530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f63531c;
    public final xi0.b d;
    public final w e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f63533h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ValidationResult f63534j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            w wVarValueOf = w.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(MoneyInputItem.class, parcel, arrayList2, iE, 1);
            }
            return new MoneyInputItem(string, arrayList, lValueOf, bVar, wVarValueOf, string2, string3, z, arrayList2, (ValidationResult) parcel.readParcelable(MoneyInputItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyInputItem[i];
        }
    }

    public MoneyInputItem(String id10, ArrayList currencies, Long l2, xi0.b currency, w style, String str, String str2, boolean z, List amountValidations, ValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(amountValidations, "amountValidations");
        this.f63529a = id10;
        this.f63530b = currencies;
        this.f63531c = l2;
        this.d = currency;
        this.e = style;
        this.f = str;
        this.f63532g = str2;
        this.f63533h = z;
        this.i = amountValidations;
        this.f63534j = validationResult;
    }

    public static MoneyInputItem d(MoneyInputItem moneyInputItem, Long l2, xi0.b bVar, ValidationResult validationResult, int i) {
        String id10 = moneyInputItem.f63529a;
        ArrayList currencies = moneyInputItem.f63530b;
        if ((i & 4) != 0) {
            l2 = moneyInputItem.f63531c;
        }
        Long l3 = l2;
        if ((i & 8) != 0) {
            bVar = moneyInputItem.d;
        }
        xi0.b currency = bVar;
        w style = moneyInputItem.e;
        String str = moneyInputItem.f;
        String str2 = moneyInputItem.f63532g;
        boolean z = moneyInputItem.f63533h;
        List amountValidations = moneyInputItem.i;
        if ((i & 512) != 0) {
            validationResult = moneyInputItem.f63534j;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(amountValidations, "amountValidations");
        return new MoneyInputItem(id10, currencies, l3, currency, style, str, str2, z, amountValidations, validationResult);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ValidationResult getF63534j() {
        return this.f63534j;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63529a() {
        return this.f63529a;
    }

    @Override // xl2.h0
    public final Object c() {
        return new Pair(getD(), this.d.f306286a);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63533h() {
        return this.f63533h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyInputItem)) {
            return false;
        }
        MoneyInputItem moneyInputItem = (MoneyInputItem) obj2;
        return Intrinsics.f(this.f63529a, moneyInputItem.f63529a) && this.f63530b.equals(moneyInputItem.f63530b) && Intrinsics.f(this.f63531c, moneyInputItem.f63531c) && Intrinsics.f(this.d, moneyInputItem.d) && this.e == moneyInputItem.e && Intrinsics.f(this.f, moneyInputItem.f) && Intrinsics.f(this.f63532g, moneyInputItem.f63532g) && this.f63533h == moneyInputItem.f63533h && Intrinsics.f(this.i, moneyInputItem.i) && Intrinsics.f(this.f63534j, moneyInputItem.f63534j);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63529a;
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: getValue */
    public final String getD() {
        Long l2 = this.f63531c;
        if (l2 != null) {
            return String.valueOf(l2.longValue());
        }
        return null;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f63530b, this.f63529a.hashCode() * 31, 31);
        Long l2 = this.f63531c;
        int iHashCode = (this.e.hashCode() + l.j(this.d, (iB + (l2 == null ? 0 : l2.hashCode())) * 31, 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63532g;
        int iD = p.a.d(j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f63533h), 31, this.i);
        ValidationResult validationResult = this.f63534j;
        return iD + (validationResult != null ? validationResult.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63529a);
        Iterator itY = j6.a.y(this.f63530b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Long l2 = this.f63531c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeString(this.f63532g);
        dest.writeInt(this.f63533h ? 1 : 0);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f63534j, i);
    }

    @Override // xl2.h0
    /* JADX INFO: renamed from: z */
    public final List getE() {
        List list = this.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.f(((MoneyValidation) obj2).getF63524a(), this.d.f306286a)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
