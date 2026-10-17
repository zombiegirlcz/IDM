package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import grl.k9;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import my8.r;
import org.jetbrains.annotations.NotNull;
import yt8.e;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycConsolidatedFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<KycConsolidatedFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KycFinalCommand f77721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f77722c;
    public final boolean d;
    public final gt8.a e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0.b f77723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77724h;
    public final KycScreenContract$Step i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final KycContract$Requirement f77725j;
    public final AnalyticsProduct k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f77727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f77728n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f77729p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            KycFinalCommand kycFinalCommand = (KycFinalCommand) parcel.readParcelable(KycConsolidatedFlowContract$InputData.class.getClassLoader());
            r rVarValueOf = r.valueOf(parcel.readString());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            gt8.a aVarValueOf = gt8.a.valueOf(parcel.readString());
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            wi0.b bVar2 = (wi0.b) parcel.readSerializable();
            boolean z4 = parcel.readInt() == 0 ? z : true;
            KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) parcel.readParcelable(KycConsolidatedFlowContract$InputData.class.getClassLoader());
            KycContract$Requirement kycContract$Requirement = (KycContract$Requirement) parcel.readParcelable(KycConsolidatedFlowContract$InputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(KycConsolidatedFlowContract$InputData.class.getClassLoader());
            String string2 = parcel.readString();
            e eVarValueOf = parcel.readInt() == 0 ? null : e.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(k.valueOf(parcel.readString()));
            }
            return new KycConsolidatedFlowContract$InputData(string, kycFinalCommand, rVarValueOf, z3, aVarValueOf, bVar, bVar2, z4, kycScreenContract$Step, kycContract$Requirement, analyticsProduct, string2, eVarValueOf, string3, string4, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycConsolidatedFlowContract$InputData[i];
        }
    }

    public KycConsolidatedFlowContract$InputData(String flowName, KycFinalCommand kycFinalCommand, r kycScope, boolean z, gt8.a completionDialog, wi0.b bVar, wi0.b bVar2, boolean z3, KycScreenContract$Step kycScreenContract$Step, KycContract$Requirement requirement, AnalyticsProduct automaticEventProduct, String str, e eVar, String str2, String str3, Set acceptedConsents) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(acceptedConsents, "acceptedConsents");
        this.f77720a = flowName;
        this.f77721b = kycFinalCommand;
        this.f77722c = kycScope;
        this.d = z;
        this.e = completionDialog;
        this.f = bVar;
        this.f77723g = bVar2;
        this.f77724h = z3;
        this.i = kycScreenContract$Step;
        this.f77725j = requirement;
        this.k = automaticEventProduct;
        this.f77726l = str;
        this.f77727m = eVar;
        this.f77728n = str2;
        this.o = str3;
        this.f77729p = acceptedConsents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycConsolidatedFlowContract$InputData)) {
            return false;
        }
        KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = (KycConsolidatedFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77720a, kycConsolidatedFlowContract$InputData.f77720a) && Intrinsics.f(this.f77721b, kycConsolidatedFlowContract$InputData.f77721b) && this.f77722c == kycConsolidatedFlowContract$InputData.f77722c && this.d == kycConsolidatedFlowContract$InputData.d && this.e == kycConsolidatedFlowContract$InputData.e && Intrinsics.f(this.f, kycConsolidatedFlowContract$InputData.f) && Intrinsics.f(this.f77723g, kycConsolidatedFlowContract$InputData.f77723g) && this.f77724h == kycConsolidatedFlowContract$InputData.f77724h && Intrinsics.f(this.i, kycConsolidatedFlowContract$InputData.i) && Intrinsics.f(this.f77725j, kycConsolidatedFlowContract$InputData.f77725j) && Intrinsics.f(this.k, kycConsolidatedFlowContract$InputData.k) && Intrinsics.f(this.f77726l, kycConsolidatedFlowContract$InputData.f77726l) && this.f77727m == kycConsolidatedFlowContract$InputData.f77727m && Intrinsics.f(this.f77728n, kycConsolidatedFlowContract$InputData.f77728n) && Intrinsics.f(this.o, kycConsolidatedFlowContract$InputData.o) && Intrinsics.f(this.f77729p, kycConsolidatedFlowContract$InputData.f77729p);
    }

    public final int hashCode() {
        int iHashCode = this.f77720a.hashCode() * 31;
        KycFinalCommand kycFinalCommand = this.f77721b;
        int iHashCode2 = (this.e.hashCode() + j6.a.c((this.f77722c.hashCode() + ((iHashCode + (kycFinalCommand == null ? 0 : kycFinalCommand.hashCode())) * 31)) * 31, 31, this.d)) * 31;
        wi0.b bVar = this.f;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        wi0.b bVar2 = this.f77723g;
        int iC = j6.a.c((iHashCode3 + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31, 31, this.f77724h);
        KycScreenContract$Step kycScreenContract$Step = this.i;
        int iA = l.a((this.f77725j.hashCode() + ((iC + (kycScreenContract$Step == null ? 0 : kycScreenContract$Step.hashCode())) * 31)) * 31, 31, this.k);
        String str = this.f77726l;
        int iHashCode4 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f77727m;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str2 = this.f77728n;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return this.f77729p.hashCode() + ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77720a);
        dest.writeParcelable(this.f77721b, i);
        dest.writeString(this.f77722c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e.name());
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f77723g);
        dest.writeInt(this.f77724h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f77725j, i);
        dest.writeParcelable(this.k, i);
        dest.writeString(this.f77726l);
        e eVar = this.f77727m;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeString(this.f77728n);
        dest.writeString(this.o);
        Iterator itV = n.v(this.f77729p, dest);
        while (itV.hasNext()) {
            dest.writeString(((k) itV.next()).name());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KycConsolidatedFlowContract$InputData(String str, KycFinalCommand kycFinalCommand, r rVar, boolean z, gt8.a aVar, wi0.b bVar, wi0.b bVar2, boolean z3, KycContract$Requirement kycContract$Requirement, AnalyticsProduct analyticsProduct, String str2, e eVar, String str3, String str4, Set set, int i) {
        AnalyticsProduct analyticsProductG;
        wi0.b bVar3 = (i & 32) != 0 ? null : bVar;
        wi0.b bVar4 = (i & 64) != 0 ? null : bVar2;
        KycScreenContract$Step.RemoteDocs remoteDocs = (i & 256) != 0 ? null : KycScreenContract$Step.RemoteDocs.f77560a;
        KycContract$Requirement kycContract$Requirement2 = (i & 512) != 0 ? new KycContract$Requirement(true) : kycContract$Requirement;
        if ((i & 1024) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = k9.KYC;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(str, kycFinalCommand, rVar, z, aVar, bVar3, bVar4, z3, remoteDocs, kycContract$Requirement2, analyticsProductG, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : eVar, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? h0.f322473a : set);
    }
}
