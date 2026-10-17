package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import ft3.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/kontomatik/sign_in/KontomatikSignInControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KontomatikSignInControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<KontomatikSignInControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f67820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67821c;
    public final boolean d;
    public final boolean e;
    public final h1 f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            w0 w0Var = ((AnalyticsContext) parcel.readParcelable(KontomatikSignInControllerContract$InputData.class.getClassLoader())).f50296a;
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
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new KontomatikSignInControllerContract$InputData(string, w0Var, z4, z6, z3, (h1) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KontomatikSignInControllerContract$InputData[i];
        }
    }

    public KontomatikSignInControllerContract$InputData(String applicationId, w0 w0Var, boolean z, boolean z3, boolean z4, h1 productPayload) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        this.f67819a = applicationId;
        this.f67820b = w0Var;
        this.f67821c = z;
        this.d = z3;
        this.e = z4;
        this.f = productPayload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KontomatikSignInControllerContract$InputData)) {
            return false;
        }
        KontomatikSignInControllerContract$InputData kontomatikSignInControllerContract$InputData = (KontomatikSignInControllerContract$InputData) obj2;
        return Intrinsics.f(this.f67819a, kontomatikSignInControllerContract$InputData.f67819a) && Intrinsics.f(this.f67820b, kontomatikSignInControllerContract$InputData.f67820b) && this.f67821c == kontomatikSignInControllerContract$InputData.f67821c && this.d == kontomatikSignInControllerContract$InputData.d && this.e == kontomatikSignInControllerContract$InputData.e && Intrinsics.f(this.f, kontomatikSignInControllerContract$InputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c((AnalyticsContext.a(this.f67820b) + (this.f67819a.hashCode() * 31)) * 31, 31, this.f67821c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67819a);
        m.x(this.f67820b, dest, i);
        dest.writeInt(this.f67821c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
    }
}
