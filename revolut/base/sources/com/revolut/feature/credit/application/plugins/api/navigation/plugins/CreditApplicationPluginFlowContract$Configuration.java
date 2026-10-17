package com.revolut.feature.credit.application.plugins.api.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import ft3.j1;
import grl.r2;
import gt3.f;
import it3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ks3.c;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/api/navigation/plugins/CreditApplicationPluginFlowContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationPluginFlowContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationPluginFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f66893c;
    public final j1 d;
    public final f e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ks3.b f66894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f66895h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f66896j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f66897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f66898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f66899n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f66900p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            r2 r2VarValueOf = r2.valueOf(parcel.readString());
            j1 j1VarValueOf = j1.valueOf(parcel.readString());
            f fVar = (f) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            ks3.b bVarValueOf = ks3.b.valueOf(parcel.readString());
            c cVar = (c) parcel.readSerializable();
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new CreditApplicationPluginFlowContract$Configuration(string, string2, r2VarValueOf, j1VarValueOf, fVar, bVar, bVarValueOf, cVar, z4, z6, string3, z, parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationPluginFlowContract$Configuration[i];
        }
    }

    public CreditApplicationPluginFlowContract$Configuration(String flowName, String applicationId, r2 entryPointType, j1 productType, f fVar, b countryCode, ks3.b pluginName, c cVar, boolean z, boolean z3, String str, boolean z4, k kVar, String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.f66891a = flowName;
        this.f66892b = applicationId;
        this.f66893c = entryPointType;
        this.d = productType;
        this.e = fVar;
        this.f = countryCode;
        this.f66894g = pluginName;
        this.f66895h = cVar;
        this.i = z;
        this.f66896j = z3;
        this.k = str;
        this.f66897l = z4;
        this.f66898m = kVar;
        this.f66899n = str2;
        this.o = str3;
        this.f66900p = num;
    }

    public static CreditApplicationPluginFlowContract$Configuration a(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, String flowName) {
        String applicationId = creditApplicationPluginFlowContract$Configuration.f66892b;
        r2 entryPointType = creditApplicationPluginFlowContract$Configuration.f66893c;
        j1 productType = creditApplicationPluginFlowContract$Configuration.d;
        f fVar = creditApplicationPluginFlowContract$Configuration.e;
        b countryCode = creditApplicationPluginFlowContract$Configuration.f;
        ks3.b pluginName = creditApplicationPluginFlowContract$Configuration.f66894g;
        c cVar = creditApplicationPluginFlowContract$Configuration.f66895h;
        boolean z = creditApplicationPluginFlowContract$Configuration.i;
        boolean z3 = creditApplicationPluginFlowContract$Configuration.f66896j;
        String str = creditApplicationPluginFlowContract$Configuration.k;
        boolean z4 = creditApplicationPluginFlowContract$Configuration.f66897l;
        k kVar = creditApplicationPluginFlowContract$Configuration.f66898m;
        String str2 = creditApplicationPluginFlowContract$Configuration.f66899n;
        String str3 = creditApplicationPluginFlowContract$Configuration.o;
        Integer num = creditApplicationPluginFlowContract$Configuration.f66900p;
        creditApplicationPluginFlowContract$Configuration.getClass();
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return new CreditApplicationPluginFlowContract$Configuration(flowName, applicationId, entryPointType, productType, fVar, countryCode, pluginName, cVar, z, z3, str, z4, kVar, str2, str3, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationPluginFlowContract$Configuration)) {
            return false;
        }
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = (CreditApplicationPluginFlowContract$Configuration) obj2;
        return Intrinsics.f(this.f66891a, creditApplicationPluginFlowContract$Configuration.f66891a) && Intrinsics.f(this.f66892b, creditApplicationPluginFlowContract$Configuration.f66892b) && this.f66893c == creditApplicationPluginFlowContract$Configuration.f66893c && this.d == creditApplicationPluginFlowContract$Configuration.d && Intrinsics.f(this.e, creditApplicationPluginFlowContract$Configuration.e) && Intrinsics.f(this.f, creditApplicationPluginFlowContract$Configuration.f) && this.f66894g == creditApplicationPluginFlowContract$Configuration.f66894g && Intrinsics.f(this.f66895h, creditApplicationPluginFlowContract$Configuration.f66895h) && this.i == creditApplicationPluginFlowContract$Configuration.i && this.f66896j == creditApplicationPluginFlowContract$Configuration.f66896j && Intrinsics.f(this.k, creditApplicationPluginFlowContract$Configuration.k) && this.f66897l == creditApplicationPluginFlowContract$Configuration.f66897l && this.f66898m == creditApplicationPluginFlowContract$Configuration.f66898m && Intrinsics.f(this.f66899n, creditApplicationPluginFlowContract$Configuration.f66899n) && Intrinsics.f(this.o, creditApplicationPluginFlowContract$Configuration.o) && Intrinsics.f(this.f66900p, creditApplicationPluginFlowContract$Configuration.f66900p);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f66893c.hashCode() + p.a.c(this.f66891a.hashCode() * 31, 31, this.f66892b)) * 31)) * 31;
        f fVar = this.e;
        int iHashCode2 = (this.f66894g.hashCode() + p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f.f297794a)) * 31;
        c cVar = this.f66895h;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.i), 31, this.f66896j);
        String str = this.k;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66897l);
        k kVar = this.f66898m;
        int iHashCode3 = (iC2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str2 = this.f66899n;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f66900p;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66891a);
        dest.writeString(this.f66892b);
        dest.writeString(this.f66893c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f66894g.name());
        dest.writeSerializable(this.f66895h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f66896j ? 1 : 0);
        dest.writeString(this.k);
        dest.writeInt(this.f66897l ? 1 : 0);
        k kVar = this.f66898m;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
        dest.writeString(this.f66899n);
        dest.writeString(this.o);
        Integer num = this.f66900p;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
