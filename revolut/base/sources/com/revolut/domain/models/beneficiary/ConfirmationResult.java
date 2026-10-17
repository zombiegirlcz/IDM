package com.revolut.domain.models.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/beneficiary/ConfirmationResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ResultCode", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmationResult implements Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f60301h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultCode f60304c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60305g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ConfirmationResult> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/domain/models/beneficiary/ConfirmationResult$ResultCode;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_NEEDED", "MATCHED", "JOINT_MATCH", "CLOSE_MATCH", "BUSINESS_ACCOUNT_CLOSE_MATCH", "PERSONAL_ACCOUNT_CLOSE_MATCH", "JOINT_CLOSE_MATCH", "BUSINESS_ACCOUNT_NAME_MATCHED", "PERSONAL_ACCOUNT_NAME_MATCHED", "NOT_MATCHED", "ACCOUNT_SWITCHED", "ACCOUNT_DOES_NOT_EXIST", "NO_RESPONSE", "CANNOT_BE_CHECKED", "NOT_FOUND", "ACCOUNT_CLOSED", "OPTED_OUT", "NOT_SUPPORTED", "ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED", "NOT_ENROLLED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ResultCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultCode[] $VALUES;
        public static final ResultCode NOT_NEEDED = new ResultCode("NOT_NEEDED", 0);
        public static final ResultCode MATCHED = new ResultCode("MATCHED", 1);
        public static final ResultCode JOINT_MATCH = new ResultCode("JOINT_MATCH", 2);
        public static final ResultCode CLOSE_MATCH = new ResultCode("CLOSE_MATCH", 3);
        public static final ResultCode BUSINESS_ACCOUNT_CLOSE_MATCH = new ResultCode("BUSINESS_ACCOUNT_CLOSE_MATCH", 4);
        public static final ResultCode PERSONAL_ACCOUNT_CLOSE_MATCH = new ResultCode("PERSONAL_ACCOUNT_CLOSE_MATCH", 5);
        public static final ResultCode JOINT_CLOSE_MATCH = new ResultCode("JOINT_CLOSE_MATCH", 6);
        public static final ResultCode BUSINESS_ACCOUNT_NAME_MATCHED = new ResultCode("BUSINESS_ACCOUNT_NAME_MATCHED", 7);
        public static final ResultCode PERSONAL_ACCOUNT_NAME_MATCHED = new ResultCode("PERSONAL_ACCOUNT_NAME_MATCHED", 8);
        public static final ResultCode NOT_MATCHED = new ResultCode("NOT_MATCHED", 9);
        public static final ResultCode ACCOUNT_SWITCHED = new ResultCode("ACCOUNT_SWITCHED", 10);
        public static final ResultCode ACCOUNT_DOES_NOT_EXIST = new ResultCode("ACCOUNT_DOES_NOT_EXIST", 11);
        public static final ResultCode NO_RESPONSE = new ResultCode("NO_RESPONSE", 12);
        public static final ResultCode CANNOT_BE_CHECKED = new ResultCode("CANNOT_BE_CHECKED", 13);
        public static final ResultCode NOT_FOUND = new ResultCode("NOT_FOUND", 14);
        public static final ResultCode ACCOUNT_CLOSED = new ResultCode("ACCOUNT_CLOSED", 15);
        public static final ResultCode OPTED_OUT = new ResultCode("OPTED_OUT", 16);
        public static final ResultCode NOT_SUPPORTED = new ResultCode("NOT_SUPPORTED", 17);
        public static final ResultCode ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED = new ResultCode("ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED", 18);
        public static final ResultCode NOT_ENROLLED = new ResultCode("NOT_ENROLLED", 19);

        private static final /* synthetic */ ResultCode[] $values() {
            return new ResultCode[]{NOT_NEEDED, MATCHED, JOINT_MATCH, CLOSE_MATCH, BUSINESS_ACCOUNT_CLOSE_MATCH, PERSONAL_ACCOUNT_CLOSE_MATCH, JOINT_CLOSE_MATCH, BUSINESS_ACCOUNT_NAME_MATCHED, PERSONAL_ACCOUNT_NAME_MATCHED, NOT_MATCHED, ACCOUNT_SWITCHED, ACCOUNT_DOES_NOT_EXIST, NO_RESPONSE, CANNOT_BE_CHECKED, NOT_FOUND, ACCOUNT_CLOSED, OPTED_OUT, NOT_SUPPORTED, ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED, NOT_ENROLLED};
        }

        static {
            ResultCode[] resultCodeArr$values = $values();
            $VALUES = resultCodeArr$values;
            $ENTRIES = s.n(resultCodeArr$values);
        }

        private ResultCode(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ResultCode valueOf(String str) {
            return (ResultCode) Enum.valueOf(ResultCode.class, str);
        }

        public static ResultCode[] values() {
            return (ResultCode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: com.revolut.domain.models.beneficiary.ConfirmationResult$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmationResult(parcel.readString(), parcel.readString(), ResultCode.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmationResult[i];
        }
    }

    static {
        ResultCode[] elements = {ResultCode.CLOSE_MATCH, ResultCode.NOT_MATCHED, ResultCode.CANNOT_BE_CHECKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f60301h = d.y0(elements);
        ResultCode[] elements2 = {ResultCode.ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED, ResultCode.NOT_ENROLLED};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        d.y0(elements2);
    }

    public ConfirmationResult(String str, String str2, ResultCode resultCode, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.f60302a = str;
        this.f60303b = str2;
        this.f60304c = resultCode;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f60305g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmationResult)) {
            return false;
        }
        ConfirmationResult confirmationResult = (ConfirmationResult) obj2;
        return Intrinsics.f(this.f60302a, confirmationResult.f60302a) && Intrinsics.f(this.f60303b, confirmationResult.f60303b) && this.f60304c == confirmationResult.f60304c && Intrinsics.f(this.d, confirmationResult.d) && Intrinsics.f(this.e, confirmationResult.e) && Intrinsics.f(this.f, confirmationResult.f) && Intrinsics.f(this.f60305g, confirmationResult.f60305g);
    }

    public final int hashCode() {
        String str = this.f60302a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60303b;
        int iHashCode2 = (this.f60304c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f60305g;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60302a);
        dest.writeString(this.f60303b);
        dest.writeString(this.f60304c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f60305g);
    }
}
