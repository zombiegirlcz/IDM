package com.revolut.biometric_verification.impl.ui.flow.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$FlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationLauncherFlowContract$FlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationLauncherFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocument f50474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f50476c;
    public final String d;
    public final Integer e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BiometricVerificationDocument biometricVerificationDocument = (BiometricVerificationDocument) j6.a.f(parcel, "parcel", BiometricVerificationLauncherFlowContract$FlowState.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BiometricVerificationLauncherFlowContract$FlowState.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet.add(rr.d.valueOf(parcel.readString()));
            }
            return new BiometricVerificationLauncherFlowContract$FlowState(biometricVerificationDocument, arrayList, linkedHashSet, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationLauncherFlowContract$FlowState[i];
        }
    }

    public BiometricVerificationLauncherFlowContract$FlowState(BiometricVerificationDocument biometricVerificationDocument, List resources, Set jwtTags, String str, Integer num) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(jwtTags, "jwtTags");
        this.f50474a = biometricVerificationDocument;
        this.f50475b = resources;
        this.f50476c = jwtTags;
        this.d = str;
        this.e = num;
    }

    public static BiometricVerificationLauncherFlowContract$FlowState a(BiometricVerificationLauncherFlowContract$FlowState biometricVerificationLauncherFlowContract$FlowState, BiometricVerificationDocument biometricVerificationDocument, List list, Set set, String str, Integer num, int i) {
        if ((i & 1) != 0) {
            biometricVerificationDocument = biometricVerificationLauncherFlowContract$FlowState.f50474a;
        }
        BiometricVerificationDocument biometricVerificationDocument2 = biometricVerificationDocument;
        if ((i & 2) != 0) {
            list = biometricVerificationLauncherFlowContract$FlowState.f50475b;
        }
        List resources = list;
        if ((i & 4) != 0) {
            set = biometricVerificationLauncherFlowContract$FlowState.f50476c;
        }
        Set jwtTags = set;
        if ((i & 8) != 0) {
            str = biometricVerificationLauncherFlowContract$FlowState.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            num = biometricVerificationLauncherFlowContract$FlowState.e;
        }
        biometricVerificationLauncherFlowContract$FlowState.getClass();
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(jwtTags, "jwtTags");
        return new BiometricVerificationLauncherFlowContract$FlowState(biometricVerificationDocument2, resources, jwtTags, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationLauncherFlowContract$FlowState)) {
            return false;
        }
        BiometricVerificationLauncherFlowContract$FlowState biometricVerificationLauncherFlowContract$FlowState = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
        return Intrinsics.f(this.f50474a, biometricVerificationLauncherFlowContract$FlowState.f50474a) && Intrinsics.f(this.f50475b, biometricVerificationLauncherFlowContract$FlowState.f50475b) && Intrinsics.f(this.f50476c, biometricVerificationLauncherFlowContract$FlowState.f50476c) && Intrinsics.f(this.d, biometricVerificationLauncherFlowContract$FlowState.d) && Intrinsics.f(this.e, biometricVerificationLauncherFlowContract$FlowState.e);
    }

    public final int hashCode() {
        BiometricVerificationDocument biometricVerificationDocument = this.f50474a;
        int iF = p.a.f(p.a.d((biometricVerificationDocument == null ? 0 : biometricVerificationDocument.hashCode()) * 31, 31, this.f50475b), 31, this.f50476c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50474a, i);
        Iterator itV = p.a.v(this.f50475b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f50476c, dest);
        while (itV2.hasNext()) {
            dest.writeString(((rr.d) itV2.next()).name());
        }
        dest.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
