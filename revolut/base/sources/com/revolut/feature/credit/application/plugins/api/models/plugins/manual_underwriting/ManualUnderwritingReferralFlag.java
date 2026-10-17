package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/ManualUnderwritingReferralFlag;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualUnderwritingReferralFlag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManualUnderwritingReferralFlag> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66477c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DocumentGroups f66478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f66479h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            DocumentGroups documentGroupsCreateFromParcel = DocumentGroups.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RequiredCheck.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ManualUnderwritingReferralFlag(string, string2, string3, string4, string5, string6, documentGroupsCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualUnderwritingReferralFlag[i];
        }
    }

    public ManualUnderwritingReferralFlag(String referralId, String str, String title, String subtitle, String buttonText, String buttonHint, DocumentGroups documentGroups, List requiredChecks) {
        Intrinsics.checkNotNullParameter(referralId, "referralId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonHint, "buttonHint");
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        Intrinsics.checkNotNullParameter(requiredChecks, "requiredChecks");
        this.f66475a = referralId;
        this.f66476b = str;
        this.f66477c = title;
        this.d = subtitle;
        this.e = buttonText;
        this.f = buttonHint;
        this.f66478g = documentGroups;
        this.f66479h = requiredChecks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualUnderwritingReferralFlag)) {
            return false;
        }
        ManualUnderwritingReferralFlag manualUnderwritingReferralFlag = (ManualUnderwritingReferralFlag) obj2;
        return Intrinsics.f(this.f66475a, manualUnderwritingReferralFlag.f66475a) && Intrinsics.f(this.f66476b, manualUnderwritingReferralFlag.f66476b) && Intrinsics.f(this.f66477c, manualUnderwritingReferralFlag.f66477c) && Intrinsics.f(this.d, manualUnderwritingReferralFlag.d) && Intrinsics.f(this.e, manualUnderwritingReferralFlag.e) && Intrinsics.f(this.f, manualUnderwritingReferralFlag.f) && Intrinsics.f(this.f66478g, manualUnderwritingReferralFlag.f66478g) && Intrinsics.f(this.f66479h, manualUnderwritingReferralFlag.f66479h);
    }

    public final int hashCode() {
        int iHashCode = this.f66475a.hashCode() * 31;
        String str = this.f66476b;
        return this.f66479h.hashCode() + ((this.f66478g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66477c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66475a);
        dest.writeString(this.f66476b);
        dest.writeString(this.f66477c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        this.f66478g.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f66479h, dest);
        while (itV.hasNext()) {
            ((RequiredCheck) itV.next()).writeToParcel(dest, i);
        }
    }
}
