package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingIntroScreenContent;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/intro/ManualUnderwritingIntroScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingIntroScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingIntroScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingIntroScreenContent f67956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f67957b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = (ManualUnderwritingIntroScreenContent) j6.a.f(parcel, "parcel", ManualUnderwritingIntroScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ManualUnderwritingIntroScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ManualUnderwritingIntroScreenContract$InputData(manualUnderwritingIntroScreenContent, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingIntroScreenContract$InputData[i];
        }
    }

    public ManualUnderwritingIntroScreenContract$InputData(ManualUnderwritingIntroScreenContent introScreen, ArrayList referralFlags) {
        Intrinsics.checkNotNullParameter(introScreen, "introScreen");
        Intrinsics.checkNotNullParameter(referralFlags, "referralFlags");
        this.f67956a = introScreen;
        this.f67957b = referralFlags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingIntroScreenContract$InputData)) {
            return false;
        }
        ManualUnderwritingIntroScreenContract$InputData manualUnderwritingIntroScreenContract$InputData = (ManualUnderwritingIntroScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67956a, manualUnderwritingIntroScreenContract$InputData.f67956a) && this.f67957b.equals(manualUnderwritingIntroScreenContract$InputData.f67957b);
    }

    public final int hashCode() {
        return this.f67957b.hashCode() + (this.f67956a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67956a, i);
        Iterator itY = j6.a.y(this.f67957b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
