package ix7;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b\f\u0010\u001cR\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R\"\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b\u0017\u0010/R\u001a\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b!\u00104¨\u00066"}, d2 = {"Lix7/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "name", "c", "f", "imageLink", "d", "i", "petType", "gender", "Lix7/e;", "Lix7/e;", "()Lix7/e;", "breedDetails", "g", "dateOfBirth", "", "Z", "o", "()Z", "sterilized", "l", "purchasePrice", "Ljo3/a;", "j", "Ljo3/a;", "m", "()Ljo3/a;", "purchasePriceMoney", "k", "editable", "Lix7/d0;", "Lix7/d0;", "n", "()Lix7/d0;", "quoteRequest", "", "Ljava/util/List;", "()Ljava/util/List;", "issues", "policyStatus", "Lix7/x;", "Lix7/x;", "()Lix7/x;", "policy", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageLink")
    private final String imageLink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("petType")
    @NotNull
    private final String petType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("gender")
    @NotNull
    private final String gender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("breedDetails")
    @NotNull
    private final e breedDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("dateOfBirth")
    @NotNull
    private final String dateOfBirth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("sterilized")
    private final boolean sterilized;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("purchasePrice")
    @NotNull
    private final String purchasePrice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchasePriceMoney")
    @NotNull
    private final jo3.a purchasePriceMoney;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("editable")
    private final boolean editable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("quoteRequest")
    private final d0 quoteRequest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("issues")
    private final List<String> issues;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("policyStatus")
    @NotNull
    private final String policyStatus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("policy")
    private final x policy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getBreedDetails() {
        return this.breedDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.name, oVar.name) && Intrinsics.f(this.imageLink, oVar.imageLink) && Intrinsics.f(this.petType, oVar.petType) && Intrinsics.f(this.gender, oVar.gender) && Intrinsics.f(this.breedDetails, oVar.breedDetails) && Intrinsics.f(this.dateOfBirth, oVar.dateOfBirth) && this.sterilized == oVar.sterilized && Intrinsics.f(this.purchasePrice, oVar.purchasePrice) && Intrinsics.f(this.purchasePriceMoney, oVar.purchasePriceMoney) && this.editable == oVar.editable && Intrinsics.f(this.quoteRequest, oVar.quoteRequest) && Intrinsics.f(this.issues, oVar.issues) && Intrinsics.f(this.policyStatus, oVar.policyStatus) && Intrinsics.f(this.policy, oVar.policy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getIssues() {
        return this.issues;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.imageLink;
        int iC2 = j6.a.c(v7.j(this.purchasePriceMoney, p.a.c(j6.a.c(p.a.c((this.breedDetails.hashCode() + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.petType), 31, this.gender)) * 31, 31, this.dateOfBirth), 31, this.sterilized), 31, this.purchasePrice), 31), 31, this.editable);
        d0 d0Var = this.quoteRequest;
        int iHashCode = (iC2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        List<String> list = this.issues;
        int iC3 = p.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.policyStatus);
        x xVar = this.policy;
        return iC3 + (xVar != null ? xVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPetType() {
        return this.petType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final x getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPolicyStatus() {
        return this.policyStatus;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPurchasePrice() {
        return this.purchasePrice;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jo3.a getPurchasePriceMoney() {
        return this.purchasePriceMoney;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final d0 getQuoteRequest() {
        return this.quoteRequest;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getSterilized() {
        return this.sterilized;
    }
}
