package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionBanner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionBanner> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104917c;
    public final String d;
    public final SuspiciousTransactionBannerAction e;
    public final SuspiciousTransactionBannerAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f104918g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            SuspiciousTransactionBannerAction suspiciousTransactionBannerActionCreateFromParcel = parcel.readInt() == 0 ? null : SuspiciousTransactionBannerAction.CREATOR.createFromParcel(parcel);
            SuspiciousTransactionBannerAction suspiciousTransactionBannerActionCreateFromParcel2 = parcel.readInt() != 0 ? SuspiciousTransactionBannerAction.CREATOR.createFromParcel(parcel) : null;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SuspiciousTransactionBannerPrompt.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SuspiciousTransactionBanner(string, string2, string3, string4, suspiciousTransactionBannerActionCreateFromParcel, suspiciousTransactionBannerActionCreateFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionBanner[i];
        }
    }

    public SuspiciousTransactionBanner(String title, String description, String actionTitle, String str, SuspiciousTransactionBannerAction suspiciousTransactionBannerAction, SuspiciousTransactionBannerAction suspiciousTransactionBannerAction2, ArrayList prompts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        Intrinsics.checkNotNullParameter(prompts, "prompts");
        this.f104915a = title;
        this.f104916b = description;
        this.f104917c = actionTitle;
        this.d = str;
        this.e = suspiciousTransactionBannerAction;
        this.f = suspiciousTransactionBannerAction2;
        this.f104918g = prompts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionBanner)) {
            return false;
        }
        SuspiciousTransactionBanner suspiciousTransactionBanner = (SuspiciousTransactionBanner) obj2;
        return Intrinsics.f(this.f104915a, suspiciousTransactionBanner.f104915a) && Intrinsics.f(this.f104916b, suspiciousTransactionBanner.f104916b) && Intrinsics.f(this.f104917c, suspiciousTransactionBanner.f104917c) && Intrinsics.f(this.d, suspiciousTransactionBanner.d) && Intrinsics.f(this.e, suspiciousTransactionBanner.e) && Intrinsics.f(this.f, suspiciousTransactionBanner.f) && this.f104918g.equals(suspiciousTransactionBanner.f104918g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f104915a.hashCode() * 31, 31, this.f104916b), 31, this.f104917c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction = this.e;
        int iHashCode2 = (iHashCode + (suspiciousTransactionBannerAction == null ? 0 : suspiciousTransactionBannerAction.hashCode())) * 31;
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction2 = this.f;
        return this.f104918g.hashCode() + ((iHashCode2 + (suspiciousTransactionBannerAction2 != null ? suspiciousTransactionBannerAction2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104915a);
        dest.writeString(this.f104916b);
        dest.writeString(this.f104917c);
        dest.writeString(this.d);
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction = this.e;
        if (suspiciousTransactionBannerAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerAction.writeToParcel(dest, i);
        }
        SuspiciousTransactionBannerAction suspiciousTransactionBannerAction2 = this.f;
        if (suspiciousTransactionBannerAction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerAction2.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f104918g, dest);
        while (itY.hasNext()) {
            ((SuspiciousTransactionBannerPrompt) itY.next()).writeToParcel(dest, i);
        }
    }
}
