package com.revolut.feature.credit.autopay.models;

import android.os.Parcel;
import android.os.Parcelable;
import bk4.h;
import bk4.i;
import ehe.n;
import io3.l;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/CreditAutopaySourceConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "bk4/i", "bk4/h", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAutopaySourceConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditAutopaySourceConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f68545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f68546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f68547c;
    public final Set d;
    public final Set e;
    public final Set f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            i iVarValueOf = i.valueOf(parcel.readString());
            l lVarValueOf = l.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(h.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            int iD = 0;
            while (iD != i3) {
                iD = v7.d(parcel, linkedHashSet2, iD, 1);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            int iA2 = 0;
            while (iA2 != i5) {
                iA2 = o.a(parcel, linkedHashSet3, iA2, 1);
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i6);
            while (iA != i6) {
                iA = o.a(parcel, linkedHashSet4, iA, 1);
            }
            return new CreditAutopaySourceConfig(iVarValueOf, lVarValueOf, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAutopaySourceConfig[i];
        }
    }

    public CreditAutopaySourceConfig(i walletScope, l pocketType, Set allowedSourceTypes, Set supportedCurrencies, Set excludedCurrencies, Set excludedPockets) {
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(allowedSourceTypes, "allowedSourceTypes");
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        Intrinsics.checkNotNullParameter(excludedCurrencies, "excludedCurrencies");
        Intrinsics.checkNotNullParameter(excludedPockets, "excludedPockets");
        this.f68545a = walletScope;
        this.f68546b = pocketType;
        this.f68547c = allowedSourceTypes;
        this.d = supportedCurrencies;
        this.e = excludedCurrencies;
        this.f = excludedPockets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAutopaySourceConfig)) {
            return false;
        }
        CreditAutopaySourceConfig creditAutopaySourceConfig = (CreditAutopaySourceConfig) obj2;
        return this.f68545a == creditAutopaySourceConfig.f68545a && this.f68546b == creditAutopaySourceConfig.f68546b && Intrinsics.f(this.f68547c, creditAutopaySourceConfig.f68547c) && Intrinsics.f(this.d, creditAutopaySourceConfig.d) && Intrinsics.f(this.e, creditAutopaySourceConfig.e) && Intrinsics.f(this.f, creditAutopaySourceConfig.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.f(p.a.f(p.a.f(t61.a.c(this.f68546b, this.f68545a.hashCode() * 31, 31), 31, this.f68547c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68545a.name());
        dest.writeString(this.f68546b.name());
        Iterator itV = n.v(this.f68547c, dest);
        while (itV.hasNext()) {
            dest.writeString(((h) itV.next()).name());
        }
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itV3 = n.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        Iterator itV4 = n.v(this.f, dest);
        while (itV4.hasNext()) {
            dest.writeString((String) itV4.next());
        }
    }
}
