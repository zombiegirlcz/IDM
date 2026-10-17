package com.revolut.feature.kyc.impl.incode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/incode/IncodeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncodeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<IncodeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f77803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77804c;
    public final ArrayList d;
    public final String e;

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
                iE = j6.a.e(IncodeDestination.class, parcel, arrayList, iE, 1);
            }
            return new IncodeDestination(bVar, linkedHashSet, string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncodeDestination[i];
        }
    }

    public IncodeDestination(b countryCode, Set kycVerificationSteps, String token, ArrayList docPages, String str) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(kycVerificationSteps, "kycVerificationSteps");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(docPages, "docPages");
        this.f77802a = countryCode;
        this.f77803b = kycVerificationSteps;
        this.f77804c = token;
        this.d = docPages;
        this.e = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getF77802a() {
        return this.f77802a;
    }

    public final List c() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Set getF77803b() {
        return this.f77803b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF77804c() {
        return this.f77804c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncodeDestination)) {
            return false;
        }
        IncodeDestination incodeDestination = (IncodeDestination) obj2;
        return Intrinsics.f(this.f77802a, incodeDestination.f77802a) && Intrinsics.f(this.f77803b, incodeDestination.f77803b) && Intrinsics.f(this.f77804c, incodeDestination.f77804c) && this.d.equals(incodeDestination.d) && Intrinsics.f(this.e, incodeDestination.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.f(this.f77802a.f297794a.hashCode() * 31, 31, this.f77803b), 31, this.f77804c), 31);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77802a);
        Iterator itV = n.v(this.f77803b, dest);
        while (itV.hasNext()) {
            dest.writeString(((b0) itV.next()).name());
        }
        dest.writeString(this.f77804c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.e);
    }
}
