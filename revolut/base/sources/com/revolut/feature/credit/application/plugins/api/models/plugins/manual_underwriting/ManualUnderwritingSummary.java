package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/ManualUnderwritingSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingIntroScreenContent f66480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f66481b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContentCreateFromParcel = parcel.readInt() == 0 ? null : ManualUnderwritingIntroScreenContent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ManualUnderwritingReferralFlag.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ManualUnderwritingSummary(manualUnderwritingIntroScreenContentCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingSummary[i];
        }
    }

    public ManualUnderwritingSummary(ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent, ArrayList referralFlags) {
        Intrinsics.checkNotNullParameter(referralFlags, "referralFlags");
        this.f66480a = manualUnderwritingIntroScreenContent;
        this.f66481b = referralFlags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingSummary)) {
            return false;
        }
        ManualUnderwritingSummary manualUnderwritingSummary = (ManualUnderwritingSummary) obj2;
        return Intrinsics.f(this.f66480a, manualUnderwritingSummary.f66480a) && this.f66481b.equals(manualUnderwritingSummary.f66481b);
    }

    public final int hashCode() {
        ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = this.f66480a;
        return this.f66481b.hashCode() + ((manualUnderwritingIntroScreenContent == null ? 0 : manualUnderwritingIntroScreenContent.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = this.f66480a;
        if (manualUnderwritingIntroScreenContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualUnderwritingIntroScreenContent.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f66481b, dest);
        while (itY.hasNext()) {
            ((ManualUnderwritingReferralFlag) itY.next()).writeToParcel(dest, i);
        }
    }
}
