package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import dx4.t;
import dx4.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAmountInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAmountInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f67038c;
    public final int d;
    public final Clause e;
    public final x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f67039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f67040h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CreditAmountInputScreenContract$Configuration f67041j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f67042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dx4.a f67043m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            Clause clause = (Clause) parcel.readParcelable(CreditAmountInputScreenContract$InputData.class.getClassLoader());
            x xVar = (x) parcel.readSerializable();
            Clause clause2 = (Clause) parcel.readParcelable(CreditAmountInputScreenContract$InputData.class.getClassLoader());
            t tVar = (t) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CreditAmountInputScreenContract$InputData(j2, j3, lValueOf, i, clause, xVar, clause2, tVar, arrayList, (CreditAmountInputScreenContract$Configuration) parcel.readParcelable(CreditAmountInputScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (dx4.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAmountInputScreenContract$InputData[i];
        }
    }

    public CreditAmountInputScreenContract$InputData(long j2, long j3, Long l2, int i, Clause title, x xVar, Clause button, t amountType, List infoRanges, CreditAmountInputScreenContract$Configuration configuration, String parameterKey, boolean z, dx4.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(infoRanges, "infoRanges");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f67036a = j2;
        this.f67037b = j3;
        this.f67038c = l2;
        this.d = i;
        this.e = title;
        this.f = xVar;
        this.f67039g = button;
        this.f67040h = amountType;
        this.i = infoRanges;
        this.f67041j = configuration;
        this.k = parameterKey;
        this.f67042l = z;
        this.f67043m = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAmountInputScreenContract$InputData)) {
            return false;
        }
        CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = (CreditAmountInputScreenContract$InputData) obj2;
        return this.f67036a == creditAmountInputScreenContract$InputData.f67036a && this.f67037b == creditAmountInputScreenContract$InputData.f67037b && Intrinsics.f(this.f67038c, creditAmountInputScreenContract$InputData.f67038c) && this.d == creditAmountInputScreenContract$InputData.d && Intrinsics.f(this.e, creditAmountInputScreenContract$InputData.e) && Intrinsics.f(this.f, creditAmountInputScreenContract$InputData.f) && Intrinsics.f(this.f67039g, creditAmountInputScreenContract$InputData.f67039g) && Intrinsics.f(this.f67040h, creditAmountInputScreenContract$InputData.f67040h) && Intrinsics.f(this.i, creditAmountInputScreenContract$InputData.i) && Intrinsics.f(this.f67041j, creditAmountInputScreenContract$InputData.f67041j) && Intrinsics.f(this.k, creditAmountInputScreenContract$InputData.k) && this.f67042l == creditAmountInputScreenContract$InputData.f67042l && Intrinsics.f(this.f67043m, creditAmountInputScreenContract$InputData.f67043m);
    }

    public final int hashCode() {
        int iC = d.c(Long.hashCode(this.f67036a) * 31, 31, this.f67037b);
        Long l2 = this.f67038c;
        int iA = p.a.a(j6.a.b(this.d, (iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31, this.e);
        x xVar = this.f;
        int iC2 = j6.a.c(p.a.c((this.f67041j.hashCode() + p.a.d((this.f67040h.hashCode() + p.a.a((iA + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.f67039g)) * 31, 31, this.i)) * 31, 31, this.k), 31, this.f67042l);
        dx4.a aVar = this.f67043m;
        return iC2 + (aVar != null ? aVar.f120542a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f67036a);
        dest.writeLong(this.f67037b);
        Long l2 = this.f67038c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeInt(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f67039g, i);
        dest.writeSerializable(this.f67040h);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeParcelable(this.f67041j, i);
        dest.writeString(this.k);
        dest.writeInt(this.f67042l ? 1 : 0);
        dest.writeSerializable(this.f67043m);
    }
}
