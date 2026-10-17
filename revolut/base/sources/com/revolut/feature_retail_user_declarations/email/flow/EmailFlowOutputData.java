package com.revolut.feature_retail_user_declarations.email.flow;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData;", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "EmailData", "Close", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData$Close;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData$EmailData;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EmailFlowOutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData$Close;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Close extends EmailFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Close f97564a = new Close();

        @NotNull
        public static final Parcelable.Creator<Close> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Close.f97564a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Close[i];
            }
        }

        private Close() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Close);
        }

        public final int hashCode() {
            return -303576183;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData$EmailData;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowOutputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailData extends EmailFlowOutputData {

        @NotNull
        public static final Parcelable.Creator<EmailData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97567c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailData[i];
            }
        }

        public EmailData(String email, String buttonLoadingTag, String str, boolean z) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(buttonLoadingTag, "buttonLoadingTag");
            this.f97565a = email;
            this.f97566b = buttonLoadingTag;
            this.f97567c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailData)) {
                return false;
            }
            EmailData emailData = (EmailData) obj2;
            return Intrinsics.f(this.f97565a, emailData.f97565a) && Intrinsics.f(this.f97566b, emailData.f97566b) && this.f97567c == emailData.f97567c && Intrinsics.f(this.d, emailData.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(this.f97565a.hashCode() * 31, 31, this.f97566b), 31, this.f97567c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97565a);
            dest.writeString(this.f97566b);
            dest.writeInt(this.f97567c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    private EmailFlowOutputData() {
    }
}
