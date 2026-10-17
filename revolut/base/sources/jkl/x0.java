package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u001e"}, d2 = {"Ljkl/x0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "number", "Ljkl/x0$b;", "b", "Ljkl/x0$b;", "j", "()Ljkl/x0$b;", "type", "c", "g", "legalName", "d", "fullName", "e", "dateOfBirth", "f", "h", "nationality", "expiryDate", "issueDate", "issuerCountry", "issuer", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final b type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("legalName")
    private final String legalName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dateOfBirth")
    private final String dateOfBirth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nationality")
    private final String nationality;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final String expiryDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("issueDate")
    private final String issueDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("issuerCountry")
    @NotNull
    private final String issuerCountry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuer")
    private final String issuer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ljkl/x0$b;", "", "PASSPORT", "NATIONAL_IDENTITY_CARD", "DRIVING_LICENCE", "RESIDENCE_PERMIT", "TAX_ID", "UNKNOWN", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @lg.b("DRIVING_LICENCE")
        public static final b DRIVING_LICENCE;

        @lg.b("NATIONAL_IDENTITY_CARD")
        public static final b NATIONAL_IDENTITY_CARD;

        @lg.b("PASSPORT")
        public static final b PASSPORT;

        @lg.b("RESIDENCE_PERMIT")
        public static final b RESIDENCE_PERMIT;

        @lg.b("TAX_ID")
        public static final b TAX_ID;

        @he0.b
        public static final b UNKNOWN;

        static {
            b bVar = new b("PASSPORT", 0);
            PASSPORT = bVar;
            b bVar2 = new b("NATIONAL_IDENTITY_CARD", 1);
            NATIONAL_IDENTITY_CARD = bVar2;
            b bVar3 = new b("DRIVING_LICENCE", 2);
            DRIVING_LICENCE = bVar3;
            b bVar4 = new b("RESIDENCE_PERMIT", 3);
            RESIDENCE_PERMIT = bVar4;
            b bVar5 = new b("TAX_ID", 4);
            TAX_ID = bVar5;
            b bVar6 = new b("UNKNOWN", 5);
            UNKNOWN = bVar6;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
            $VALUES = bVarArr;
            $ENTRIES = vc.s.n(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.number, x0Var.number) && this.type == x0Var.type && Intrinsics.f(this.legalName, x0Var.legalName) && Intrinsics.f(this.fullName, x0Var.fullName) && Intrinsics.f(this.dateOfBirth, x0Var.dateOfBirth) && Intrinsics.f(this.nationality, x0Var.nationality) && Intrinsics.f(this.expiryDate, x0Var.expiryDate) && Intrinsics.f(this.issueDate, x0Var.issueDate) && Intrinsics.f(this.issuerCountry, x0Var.issuerCountry) && Intrinsics.f(this.issuer, x0Var.issuer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.number.hashCode() * 31)) * 31;
        String str = this.legalName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateOfBirth;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expiryDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issueDate;
        int iC = p.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.issuerCountry);
        String str7 = this.issuer;
        return iC + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getType() {
        return this.type;
    }
}
