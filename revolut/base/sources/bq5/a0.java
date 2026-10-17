package bq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements cli.j {
    public final wk5.a A;
    public final CryptoAddressRecipientDetails B;
    public final String C;
    public final CryptoAddress D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f17673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f17674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17675c;
    public final String d;
    public final z e;
    public final wk5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kn5.f f17676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f17677h;
    public final l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wk5.a f17678j;
    public final b0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f17679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f17680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f17681n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f17682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j0 f17683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f17684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f17685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f17686t;
    public final boolean u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f17687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f17688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f17689y;
    public final boolean z;

    public a0(xi0.b bVar, xi0.b bVar2, String address, String destinationTagInput, z destinationTag, wk5.a aVar, kn5.f addressValidationResult, Data addressHostingCheckResultData, l0 tab2, wk5.a aVar2, b0 editMode, String firstName, String lastName, String companyName, String businessRegistrationNumber, String label, j0 recipientType, Set prefilledFields, String str, d nameInputsErrors, boolean z, String str2, String str3, boolean z3, boolean z4, boolean z6, wk5.a aVar3, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, String str4, CryptoAddress cryptoAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(destinationTagInput, "destinationTagInput");
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        Intrinsics.checkNotNullParameter(addressValidationResult, "addressValidationResult");
        Intrinsics.checkNotNullParameter(addressHostingCheckResultData, "addressHostingCheckResultData");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(businessRegistrationNumber, "businessRegistrationNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        Intrinsics.checkNotNullParameter(prefilledFields, "prefilledFields");
        Intrinsics.checkNotNullParameter(nameInputsErrors, "nameInputsErrors");
        this.f17673a = bVar;
        this.f17674b = bVar2;
        this.f17675c = address;
        this.d = destinationTagInput;
        this.e = destinationTag;
        this.f = aVar;
        this.f17676g = addressValidationResult;
        this.f17677h = addressHostingCheckResultData;
        this.i = tab2;
        this.f17678j = aVar2;
        this.k = editMode;
        this.f17679l = firstName;
        this.f17680m = lastName;
        this.f17681n = companyName;
        this.o = businessRegistrationNumber;
        this.f17682p = label;
        this.f17683q = recipientType;
        this.f17684r = prefilledFields;
        this.f17685s = str;
        this.f17686t = nameInputsErrors;
        this.u = z;
        this.v = str2;
        this.f17687w = str3;
        this.f17688x = z3;
        this.f17689y = z4;
        this.z = z6;
        this.A = aVar3;
        this.B = cryptoAddressRecipientDetails;
        this.C = str4;
        this.D = cryptoAddress;
    }

    public static a0 a(a0 a0Var, xi0.b bVar, xi0.b bVar2, String str, String str2, z zVar, wk5.a aVar, kn5.f fVar, Data data, l0 l0Var, String str3, String str4, String str5, String str6, String str7, j0 j0Var, String str8, d dVar, boolean z, String str9, String str10, boolean z3, boolean z4, wk5.a aVar2, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, String str11, CryptoAddress cryptoAddress, int i) {
        wk5.a aVar3;
        String str12;
        xi0.b bVar3 = (i & 1) != 0 ? a0Var.f17673a : bVar;
        xi0.b bVar4 = (i & 2) != 0 ? a0Var.f17674b : bVar2;
        String address = (i & 4) != 0 ? a0Var.f17675c : str;
        String destinationTagInput = (i & 8) != 0 ? a0Var.d : str2;
        z destinationTag = (i & 16) != 0 ? a0Var.e : zVar;
        wk5.a aVar4 = (i & 32) != 0 ? a0Var.f : aVar;
        kn5.f addressValidationResult = (i & 64) != 0 ? a0Var.f17676g : fVar;
        Data addressHostingCheckResultData = (i & 128) != 0 ? a0Var.f17677h : data;
        l0 tab2 = (i & 256) != 0 ? a0Var.i : l0Var;
        wk5.a aVar5 = a0Var.f17678j;
        b0 editMode = a0Var.k;
        String firstName = (i & 2048) != 0 ? a0Var.f17679l : str3;
        String lastName = (i & 4096) != 0 ? a0Var.f17680m : str4;
        String companyName = (i & 8192) != 0 ? a0Var.f17681n : str5;
        xi0.b bVar5 = bVar3;
        String businessRegistrationNumber = (i & 16384) != 0 ? a0Var.o : str6;
        String label = (i & 32768) != 0 ? a0Var.f17682p : str7;
        xi0.b bVar6 = bVar4;
        j0 recipientType = (i & 65536) != 0 ? a0Var.f17683q : j0Var;
        wk5.a aVar6 = aVar4;
        Set prefilledFields = a0Var.f17684r;
        if ((i & 262144) != 0) {
            aVar3 = aVar5;
            str12 = a0Var.f17685s;
        } else {
            aVar3 = aVar5;
            str12 = str8;
        }
        d nameInputsErrors = (i & 524288) != 0 ? a0Var.f17686t : dVar;
        boolean z6 = (i & PKIFailureInfo.badCertTemplate) != 0 ? a0Var.u : z;
        String str13 = (i & PKIFailureInfo.badSenderNonce) != 0 ? a0Var.v : str9;
        String str14 = (i & 4194304) != 0 ? a0Var.f17687w : str10;
        boolean z11 = (i & 8388608) != 0 ? a0Var.f17688x : z3;
        boolean z12 = (i & 16777216) != 0 ? a0Var.f17689y : z4;
        boolean z29 = (i & 33554432) != 0 ? a0Var.z : true;
        wk5.a aVar7 = (i & 67108864) != 0 ? a0Var.A : aVar2;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails2 = (i & 134217728) != 0 ? a0Var.B : cryptoAddressRecipientDetails;
        String str15 = (i & 268435456) != 0 ? a0Var.C : str11;
        CryptoAddress cryptoAddress2 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? a0Var.D : cryptoAddress;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(destinationTagInput, "destinationTagInput");
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        Intrinsics.checkNotNullParameter(addressValidationResult, "addressValidationResult");
        Intrinsics.checkNotNullParameter(addressHostingCheckResultData, "addressHostingCheckResultData");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(businessRegistrationNumber, "businessRegistrationNumber");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        Intrinsics.checkNotNullParameter(prefilledFields, "prefilledFields");
        Intrinsics.checkNotNullParameter(nameInputsErrors, "nameInputsErrors");
        return new a0(bVar5, bVar6, address, destinationTagInput, destinationTag, aVar6, addressValidationResult, addressHostingCheckResultData, tab2, aVar3, editMode, firstName, lastName, companyName, businessRegistrationNumber, label, recipientType, prefilledFields, str12, nameInputsErrors, z6, str13, str14, z11, z12, z29, aVar7, cryptoAddressRecipientDetails2, str15, cryptoAddress2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f17673a, a0Var.f17673a) && Intrinsics.f(this.f17674b, a0Var.f17674b) && Intrinsics.f(this.f17675c, a0Var.f17675c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && this.f == a0Var.f && Intrinsics.f(this.f17676g, a0Var.f17676g) && Intrinsics.f(this.f17677h, a0Var.f17677h) && this.i == a0Var.i && this.f17678j == a0Var.f17678j && this.k == a0Var.k && Intrinsics.f(this.f17679l, a0Var.f17679l) && Intrinsics.f(this.f17680m, a0Var.f17680m) && Intrinsics.f(this.f17681n, a0Var.f17681n) && Intrinsics.f(this.o, a0Var.o) && Intrinsics.f(this.f17682p, a0Var.f17682p) && this.f17683q == a0Var.f17683q && Intrinsics.f(this.f17684r, a0Var.f17684r) && Intrinsics.f(this.f17685s, a0Var.f17685s) && Intrinsics.f(this.f17686t, a0Var.f17686t) && this.u == a0Var.u && Intrinsics.f(this.v, a0Var.v) && Intrinsics.f(this.f17687w, a0Var.f17687w) && this.f17688x == a0Var.f17688x && this.f17689y == a0Var.f17689y && this.z == a0Var.z && this.A == a0Var.A && Intrinsics.f(this.B, a0Var.B) && Intrinsics.f(this.C, a0Var.C) && Intrinsics.f(this.D, a0Var.D);
    }

    public final int hashCode() {
        xi0.b bVar = this.f17673a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        xi0.b bVar2 = this.f17674b;
        int iHashCode2 = (this.e.hashCode() + p.a.c(p.a.c((iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f17675c), 31, this.d)) * 31;
        wk5.a aVar = this.f;
        int iHashCode3 = (this.i.hashCode() + kii.e.c(this.f17677h, (this.f17676g.hashCode() + ((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31)) * 31;
        wk5.a aVar2 = this.f17678j;
        int iF = p.a.f((this.f17683q.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((this.k.hashCode() + ((iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31, 31, this.f17679l), 31, this.f17680m), 31, this.f17681n), 31, this.o), 31, this.f17682p)) * 31, 31, this.f17684r);
        String str = this.f17685s;
        int iC = j6.a.c((this.f17686t.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.u);
        String str2 = this.v;
        int iHashCode4 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17687w;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f17688x), 31, this.f17689y), 31, this.z);
        wk5.a aVar3 = this.A;
        int iHashCode5 = (iC2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.B;
        int iHashCode6 = (iHashCode5 + (cryptoAddressRecipientDetails == null ? 0 : cryptoAddressRecipientDetails.hashCode())) * 31;
        String str4 = this.C;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CryptoAddress cryptoAddress = this.D;
        return iHashCode7 + (cryptoAddress != null ? cryptoAddress.hashCode() : 0);
    }
}
