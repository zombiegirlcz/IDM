package com.revolut.feature.kyc.impl.incode.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/incode/flow/IncodeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncodeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncodeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77811c;
    public final List d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b0.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            while (iE != i3) {
                iE = j6.a.e(IncodeFlowContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new IncodeFlowContract$InputData(bVar, string, arrayList, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncodeFlowContract$InputData[i];
        }
    }

    public IncodeFlowContract$InputData(b countryCode, String token, List steps, List docPages, String str, String str2) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(docPages, "docPages");
        this.f77809a = countryCode;
        this.f77810b = token;
        this.f77811c = steps;
        this.d = docPages;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncodeFlowContract$InputData)) {
            return false;
        }
        IncodeFlowContract$InputData incodeFlowContract$InputData = (IncodeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77809a, incodeFlowContract$InputData.f77809a) && Intrinsics.f(this.f77810b, incodeFlowContract$InputData.f77810b) && Intrinsics.f(this.f77811c, incodeFlowContract$InputData.f77811c) && Intrinsics.f(this.d, incodeFlowContract$InputData.d) && Intrinsics.f(this.e, incodeFlowContract$InputData.e) && Intrinsics.f(this.f, incodeFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.c(this.f77809a.f297794a.hashCode() * 31, 31, this.f77810b), 31, this.f77811c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77809a);
        dest.writeString(this.f77810b);
        Iterator itV = p.a.v(this.f77811c, dest);
        while (itV.hasNext()) {
            dest.writeString(((b0) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
    }

    public /* synthetic */ IncodeFlowContract$InputData(b bVar, String str, List list, List list2, String str2) {
        this(bVar, str, list, list2, str2, null);
    }
}
