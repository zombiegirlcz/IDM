package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionBannerPrompt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionBannerPrompt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionBannerPrompt> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104924c;
    public final List d;
    public final SuspiciousTransactionBannerPromptAction e;
    public final SuspiciousTransactionBannerPromptAction f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionBannerPrompt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : SuspiciousTransactionBannerPromptAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuspiciousTransactionBannerPromptAction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionBannerPrompt[i];
        }
    }

    public SuspiciousTransactionBannerPrompt(String str, String title, String str2, List list, SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction, SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104922a = str;
        this.f104923b = title;
        this.f104924c = str2;
        this.d = list;
        this.e = suspiciousTransactionBannerPromptAction;
        this.f = suspiciousTransactionBannerPromptAction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionBannerPrompt)) {
            return false;
        }
        SuspiciousTransactionBannerPrompt suspiciousTransactionBannerPrompt = (SuspiciousTransactionBannerPrompt) obj2;
        return Intrinsics.f(this.f104922a, suspiciousTransactionBannerPrompt.f104922a) && Intrinsics.f(this.f104923b, suspiciousTransactionBannerPrompt.f104923b) && Intrinsics.f(this.f104924c, suspiciousTransactionBannerPrompt.f104924c) && Intrinsics.f(this.d, suspiciousTransactionBannerPrompt.d) && Intrinsics.f(this.e, suspiciousTransactionBannerPrompt.e) && Intrinsics.f(this.f, suspiciousTransactionBannerPrompt.f);
    }

    public final int hashCode() {
        String str = this.f104922a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f104923b);
        String str2 = this.f104924c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction = this.e;
        int iHashCode3 = (iHashCode2 + (suspiciousTransactionBannerPromptAction == null ? 0 : suspiciousTransactionBannerPromptAction.hashCode())) * 31;
        SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction2 = this.f;
        return iHashCode3 + (suspiciousTransactionBannerPromptAction2 != null ? suspiciousTransactionBannerPromptAction2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104922a);
        dest.writeString(this.f104923b);
        dest.writeString(this.f104924c);
        dest.writeStringList(this.d);
        SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction = this.e;
        if (suspiciousTransactionBannerPromptAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerPromptAction.writeToParcel(dest, i);
        }
        SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction2 = this.f;
        if (suspiciousTransactionBannerPromptAction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            suspiciousTransactionBannerPromptAction2.writeToParcel(dest, i);
        }
    }
}
