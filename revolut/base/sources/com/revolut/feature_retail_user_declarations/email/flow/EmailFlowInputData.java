package com.revolut.feature_retail_user_declarations.email.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "EmailScreenItemData", "PrefillEmailData", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailFlowInputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<EmailFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f97554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97556c;
    public final AnalyticsProduct d;
    public final EmailScreenItemData e;
    public final PrefillEmailData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97557g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowInputData$EmailScreenItemData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailScreenItemData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EmailScreenItemData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f97558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f97559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f97560c;
        public final Clause d;
        public final Clause e;
        public final rbl.a f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailScreenItemData((Clause) parcel.readParcelable(EmailScreenItemData.class.getClassLoader()), (Clause) parcel.readParcelable(EmailScreenItemData.class.getClassLoader()), (Clause) parcel.readParcelable(EmailScreenItemData.class.getClassLoader()), (Clause) parcel.readParcelable(EmailScreenItemData.class.getClassLoader()), (Clause) parcel.readParcelable(EmailScreenItemData.class.getClassLoader()), rbl.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailScreenItemData[i];
            }
        }

        public EmailScreenItemData(Clause title, Clause inputTextLabel, Clause inputTextHelperError, Clause largeButtonLabel, Clause clause, rbl.a backNavigationType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputTextLabel, "inputTextLabel");
            Intrinsics.checkNotNullParameter(inputTextHelperError, "inputTextHelperError");
            Intrinsics.checkNotNullParameter(largeButtonLabel, "largeButtonLabel");
            Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
            this.f97558a = title;
            this.f97559b = inputTextLabel;
            this.f97560c = inputTextHelperError;
            this.d = largeButtonLabel;
            this.e = clause;
            this.f = backNavigationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailScreenItemData)) {
                return false;
            }
            EmailScreenItemData emailScreenItemData = (EmailScreenItemData) obj2;
            return Intrinsics.f(this.f97558a, emailScreenItemData.f97558a) && Intrinsics.f(this.f97559b, emailScreenItemData.f97559b) && Intrinsics.f(this.f97560c, emailScreenItemData.f97560c) && Intrinsics.f(this.d, emailScreenItemData.d) && Intrinsics.f(this.e, emailScreenItemData.e) && this.f == emailScreenItemData.f;
        }

        public final int hashCode() {
            int iA = p.a.a(p.a.a(p.a.a(this.f97558a.hashCode() * 31, 31, this.f97559b), 31, this.f97560c), 31, this.d);
            Clause clause = this.e;
            return this.f.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97558a, i);
            dest.writeParcelable(this.f97559b, i);
            dest.writeParcelable(this.f97560c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowInputData$PrefillEmailData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrefillEmailData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PrefillEmailData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97563c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrefillEmailData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrefillEmailData[i];
            }
        }

        public PrefillEmailData(String prefilledEmail, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(prefilledEmail, "prefilledEmail");
            this.f97561a = prefilledEmail;
            this.f97562b = z;
            this.f97563c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrefillEmailData)) {
                return false;
            }
            PrefillEmailData prefillEmailData = (PrefillEmailData) obj2;
            return Intrinsics.f(this.f97561a, prefillEmailData.f97561a) && this.f97562b == prefillEmailData.f97562b && this.f97563c == prefillEmailData.f97563c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97563c) + j6.a.c(this.f97561a.hashCode() * 31, 31, this.f97562b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97561a);
            dest.writeInt(this.f97562b ? 1 : 0);
            dest.writeInt(this.f97563c ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            EmailScreenItemData emailScreenItemData;
            PrefillEmailData prefillEmailData;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(EmailFlowInputData.class.getClassLoader());
            EmailScreenItemData emailScreenItemDataCreateFromParcel = EmailScreenItemData.CREATOR.createFromParcel(parcel);
            PrefillEmailData prefillEmailDataCreateFromParcel = parcel.readInt() == 0 ? null : PrefillEmailData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
                emailScreenItemData = emailScreenItemDataCreateFromParcel;
                prefillEmailData = prefillEmailDataCreateFromParcel;
            } else {
                emailScreenItemData = emailScreenItemDataCreateFromParcel;
                prefillEmailData = prefillEmailDataCreateFromParcel;
                z = false;
            }
            return new EmailFlowInputData(analyticsProduct, emailScreenItemData, prefillEmailData, bVar, z3, z4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailFlowInputData[i];
        }
    }

    public EmailFlowInputData(AnalyticsProduct analyticsProduct, EmailScreenItemData emailScreenItemData, PrefillEmailData prefillEmailData, wi0.b country, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(emailScreenItemData, "emailScreenItemData");
        this.f97554a = country;
        this.f97555b = z;
        this.f97556c = z3;
        this.d = analyticsProduct;
        this.e = emailScreenItemData;
        this.f = prefillEmailData;
        this.f97557g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailFlowInputData)) {
            return false;
        }
        EmailFlowInputData emailFlowInputData = (EmailFlowInputData) obj2;
        return Intrinsics.f(this.f97554a, emailFlowInputData.f97554a) && this.f97555b == emailFlowInputData.f97555b && this.f97556c == emailFlowInputData.f97556c && Intrinsics.f(this.d, emailFlowInputData.d) && Intrinsics.f(this.e, emailFlowInputData.e) && Intrinsics.f(this.f, emailFlowInputData.f) && this.f97557g == emailFlowInputData.f97557g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + l.a(j6.a.c(j6.a.c(this.f97554a.f297794a.hashCode() * 31, 31, this.f97555b), 31, this.f97556c), 31, this.d)) * 31;
        PrefillEmailData prefillEmailData = this.f;
        return Boolean.hashCode(this.f97557g) + ((iHashCode + (prefillEmailData == null ? 0 : prefillEmailData.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97554a);
        dest.writeInt(this.f97555b ? 1 : 0);
        dest.writeInt(this.f97556c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        this.e.writeToParcel(dest, i);
        PrefillEmailData prefillEmailData = this.f;
        if (prefillEmailData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            prefillEmailData.writeToParcel(dest, i);
        }
        dest.writeInt(this.f97557g ? 1 : 0);
    }
}
