package com.revolut.feature.kyc.impl.incode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/incode/IncodeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncodeFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<IncodeFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f77805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f77806h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f77807j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f77808l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(b0.valueOf(parcel.readString()));
            }
            String string = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            while (iE != i3) {
                iE = j6.a.e(IncodeFeatureConfig.class, parcel, arrayList, iE, 1);
            }
            return new IncodeFeatureConfig(bVar, linkedHashSet, string, arrayList, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncodeFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeFeatureConfig(b countryCode, Set kycVerificationSteps, String token, ArrayList docPages, String str, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new IncodeDestination(countryCode, kycVerificationSteps, token, docPages, str), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(kycVerificationSteps, "kycVerificationSteps");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(docPages, "docPages");
        this.f77805g = countryCode;
        this.f77806h = kycVerificationSteps;
        this.i = token;
        this.f77807j = docPages;
        this.k = str;
        this.f77808l = i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF89980g() {
        return Integer.valueOf(this.f77808l);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncodeFeatureConfig)) {
            return false;
        }
        IncodeFeatureConfig incodeFeatureConfig = (IncodeFeatureConfig) obj2;
        return Intrinsics.f(this.f77805g, incodeFeatureConfig.f77805g) && Intrinsics.f(this.f77806h, incodeFeatureConfig.f77806h) && Intrinsics.f(this.i, incodeFeatureConfig.i) && Intrinsics.f(this.f77807j, incodeFeatureConfig.f77807j) && Intrinsics.f(this.k, incodeFeatureConfig.k) && this.f77808l == incodeFeatureConfig.f77808l;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f77807j, p.a.c(p.a.f(this.f77805g.f297794a.hashCode() * 31, 31, this.f77806h), 31, this.i), 31);
        String str = this.k;
        return Integer.hashCode(this.f77808l) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77805g);
        Iterator itV = n.v(this.f77806h, dest);
        while (itV.hasNext()) {
            dest.writeString(((b0) itV.next()).name());
        }
        dest.writeString(this.i);
        Iterator itY = j6.a.y(this.f77807j, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.k);
        dest.writeInt(this.f77808l);
    }
}
