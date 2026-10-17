package com.revolut.feature.kyc.impl.idnow.video_ident.flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/idnow/video_ident/flow/IdnowVideoIdentFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdnowVideoIdentFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IdnowVideoIdentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77784b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(IdnowVideoIdentFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new IdnowVideoIdentFlowContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdnowVideoIdentFlowContract$InputData[i];
        }
    }

    public IdnowVideoIdentFlowContract$InputData(String portalUrl, List redirects) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f77783a = portalUrl;
        this.f77784b = redirects;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IdnowVideoIdentFlowContract$InputData)) {
            return false;
        }
        IdnowVideoIdentFlowContract$InputData idnowVideoIdentFlowContract$InputData = (IdnowVideoIdentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77783a, idnowVideoIdentFlowContract$InputData.f77783a) && Intrinsics.f(this.f77784b, idnowVideoIdentFlowContract$InputData.f77784b);
    }

    public final int hashCode() {
        return this.f77784b.hashCode() + (this.f77783a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77783a);
        Iterator itV = p.a.v(this.f77784b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
