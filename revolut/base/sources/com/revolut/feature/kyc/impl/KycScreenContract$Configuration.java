package com.revolut.feature.kyc.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
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
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/KycScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KycFinalCommand f77542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f77543c;
    public final wi0.b d;
    public final boolean e;
    public final KycScreenContract$Step f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final KycContract$Requirement f77544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f77545h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AnalyticsProduct f77546j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gt8.a f77547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yt8.e f77548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f77549n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f77550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f77551q;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            KycScreenContract$Step kycScreenContract$Step;
            KycContract$Requirement kycContract$Requirement;
            r rVar;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            KycFinalCommand kycFinalCommand = (KycFinalCommand) parcel.readParcelable(KycScreenContract$Configuration.class.getClassLoader());
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            wi0.b bVar2 = (wi0.b) parcel.readSerializable();
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            KycScreenContract$Step kycScreenContract$Step2 = (KycScreenContract$Step) parcel.readParcelable(KycScreenContract$Configuration.class.getClassLoader());
            KycContract$Requirement kycContract$Requirement2 = (KycContract$Requirement) parcel.readParcelable(KycScreenContract$Configuration.class.getClassLoader());
            r rVarValueOf = r.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z3 = true;
                kycScreenContract$Step = kycScreenContract$Step2;
                kycContract$Requirement = kycContract$Requirement2;
                rVar = rVarValueOf;
                z4 = true;
            } else {
                z3 = true;
                kycScreenContract$Step = kycScreenContract$Step2;
                kycContract$Requirement = kycContract$Requirement2;
                rVar = rVarValueOf;
                z4 = z;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(KycScreenContract$Configuration.class.getClassLoader());
            String string2 = parcel.readString();
            gt8.a aVarValueOf = gt8.a.valueOf(parcel.readString());
            yt8.e eVarValueOf = parcel.readInt() == 0 ? null : yt8.e.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z11 = parcel.readInt() != 0 ? z3 : z;
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(k.valueOf(parcel.readString()));
            }
            return new KycScreenContract$Configuration(string, kycFinalCommand, bVar, bVar2, z6, kycScreenContract$Step, kycContract$Requirement, rVar, z4, analyticsProduct, string2, aVarValueOf, eVarValueOf, string3, string4, z11, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycScreenContract$Configuration[i];
        }
    }

    public KycScreenContract$Configuration(String flowName, KycFinalCommand kycFinalCommand, wi0.b bVar, wi0.b bVar2, boolean z, KycScreenContract$Step kycScreenContract$Step, KycContract$Requirement requirement, r kycScope, boolean z3, AnalyticsProduct automaticEventProduct, String str, gt8.a completionDialog, yt8.e eVar, String str2, String str3, boolean z4, Set acceptedConsents) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        Intrinsics.checkNotNullParameter(acceptedConsents, "acceptedConsents");
        this.f77541a = flowName;
        this.f77542b = kycFinalCommand;
        this.f77543c = bVar;
        this.d = bVar2;
        this.e = z;
        this.f = kycScreenContract$Step;
        this.f77544g = requirement;
        this.f77545h = kycScope;
        this.i = z3;
        this.f77546j = automaticEventProduct;
        this.k = str;
        this.f77547l = completionDialog;
        this.f77548m = eVar;
        this.f77549n = str2;
        this.o = str3;
        this.f77550p = z4;
        this.f77551q = acceptedConsents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycScreenContract$Configuration)) {
            return false;
        }
        KycScreenContract$Configuration kycScreenContract$Configuration = (KycScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f77541a, kycScreenContract$Configuration.f77541a) && Intrinsics.f(this.f77542b, kycScreenContract$Configuration.f77542b) && Intrinsics.f(this.f77543c, kycScreenContract$Configuration.f77543c) && Intrinsics.f(this.d, kycScreenContract$Configuration.d) && this.e == kycScreenContract$Configuration.e && Intrinsics.f(this.f, kycScreenContract$Configuration.f) && Intrinsics.f(this.f77544g, kycScreenContract$Configuration.f77544g) && this.f77545h == kycScreenContract$Configuration.f77545h && this.i == kycScreenContract$Configuration.i && Intrinsics.f(this.f77546j, kycScreenContract$Configuration.f77546j) && Intrinsics.f(this.k, kycScreenContract$Configuration.k) && this.f77547l == kycScreenContract$Configuration.f77547l && this.f77548m == kycScreenContract$Configuration.f77548m && Intrinsics.f(this.f77549n, kycScreenContract$Configuration.f77549n) && Intrinsics.f(this.o, kycScreenContract$Configuration.o) && this.f77550p == kycScreenContract$Configuration.f77550p && Intrinsics.f(this.f77551q, kycScreenContract$Configuration.f77551q);
    }

    public final int hashCode() {
        int iHashCode = this.f77541a.hashCode() * 31;
        KycFinalCommand kycFinalCommand = this.f77542b;
        int iHashCode2 = (iHashCode + (kycFinalCommand == null ? 0 : kycFinalCommand.hashCode())) * 31;
        wi0.b bVar = this.f77543c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        wi0.b bVar2 = this.d;
        int iC = j6.a.c((iHashCode3 + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31, 31, this.e);
        KycScreenContract$Step kycScreenContract$Step = this.f;
        int iA = l.a(j6.a.c((this.f77545h.hashCode() + ((this.f77544g.hashCode() + ((iC + (kycScreenContract$Step == null ? 0 : kycScreenContract$Step.hashCode())) * 31)) * 31)) * 31, 31, this.i), 31, this.f77546j);
        String str = this.k;
        int iHashCode4 = (this.f77547l.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        yt8.e eVar = this.f77548m;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str2 = this.f77549n;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return this.f77551q.hashCode() + j6.a.c((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f77550p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77541a);
        dest.writeParcelable(this.f77542b, i);
        dest.writeSerializable(this.f77543c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f77544g, i);
        dest.writeString(this.f77545h.name());
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f77546j, i);
        dest.writeString(this.k);
        dest.writeString(this.f77547l.name());
        yt8.e eVar = this.f77548m;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        dest.writeString(this.f77549n);
        dest.writeString(this.o);
        dest.writeInt(this.f77550p ? 1 : 0);
        Iterator itV = n.v(this.f77551q, dest);
        while (itV.hasNext()) {
            dest.writeString(((k) itV.next()).name());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KycScreenContract$Configuration(String str, KycFinalCommand kycFinalCommand, wi0.b bVar, wi0.b bVar2, boolean z, KycContract$Requirement kycContract$Requirement, r rVar, boolean z3, AnalyticsProduct analyticsProduct, String str2, gt8.a aVar, yt8.e eVar, String str3, String str4, boolean z4, Set set, int i) {
        AnalyticsProduct analyticsProductG;
        wi0.b bVar3 = (i & 4) != 0 ? null : bVar;
        wi0.b bVar4 = (i & 8) != 0 ? null : bVar2;
        KycScreenContract$Step.RemoteDocs remoteDocs = (i & 32) != 0 ? null : KycScreenContract$Step.RemoteDocs.f77560a;
        KycContract$Requirement kycContract$Requirement2 = (i & 64) != 0 ? new KycContract$Requirement(true) : kycContract$Requirement;
        if ((i & 512) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = k9.KYC;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(str, kycFinalCommand, bVar3, bVar4, z, remoteDocs, kycContract$Requirement2, rVar, z3, analyticsProductG, (i & 1024) != 0 ? null : str2, aVar, (i & 4096) != 0 ? null : eVar, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : str4, (32768 & i) != 0 ? false : z4, (i & 65536) != 0 ? h0.f322473a : set);
    }
}
