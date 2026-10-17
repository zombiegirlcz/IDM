package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70155c;
    public final long d;
    public final int e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanDocument(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanDocument[i];
        }
    }

    public LoanDocument(long j2, int i, String documentId, String documentName, String str, String url2) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f70153a = documentId;
        this.f70154b = documentName;
        this.f70155c = str;
        this.d = j2;
        this.e = i;
        this.f = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanDocument)) {
            return false;
        }
        LoanDocument loanDocument = (LoanDocument) obj2;
        return Intrinsics.f(this.f70153a, loanDocument.f70153a) && Intrinsics.f(this.f70154b, loanDocument.f70154b) && Intrinsics.f(this.f70155c, loanDocument.f70155c) && this.d == loanDocument.d && this.e == loanDocument.e && Intrinsics.f(this.f, loanDocument.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f70153a.hashCode() * 31, 31, this.f70154b);
        String str = this.f70155c;
        return this.f.hashCode() + j6.a.b(this.e, a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70153a);
        dest.writeString(this.f70154b);
        dest.writeString(this.f70155c);
        dest.writeLong(this.d);
        dest.writeInt(this.e);
        dest.writeString(this.f);
    }
}
