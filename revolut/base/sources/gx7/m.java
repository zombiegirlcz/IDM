package gx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0004R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u00100\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0012\u0010/R\u001c\u00105\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b3\u00104R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0002068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b\u001e\u00108R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\b(\u0010=¨\u0006?"}, d2 = {"Lgx7/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "j", "name", "c", "h", "imageLink", "d", "k", "petType", "e", "f", "gender", "getBreedType$annotations", "()V", "breedType", "getBreed$annotations", "breed", "Lgx7/e;", "Lgx7/e;", "()Lgx7/e;", "breedDetails", "i", "dateOfBirth", "", "Z", "q", "()Z", "sterilized", "n", "purchasePrice", "Ljo3/b;", "l", "Ljo3/b;", "o", "()Ljo3/b;", "purchasePriceMoney", "m", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "editable", "Lgx7/x;", "Lgx7/x;", "p", "()Lgx7/x;", "quoteRequest", "", "Ljava/util/List;", "()Ljava/util/List;", "issues", "policyStatus", "Lgx7/s;", "Lgx7/s;", "()Lgx7/s;", "policy", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

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
    @lg.b("breedType")
    @NotNull
    private final String breedType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("breed")
    @NotNull
    private final String breed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("breedDetails")
    private final e breedDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("dateOfBirth")
    @NotNull
    private final String dateOfBirth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("sterilized")
    private final boolean sterilized;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("purchasePrice")
    @NotNull
    private final String purchasePrice;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchasePriceMoney")
    private final jo3.b purchasePriceMoney;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("editable")
    private final Boolean editable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("quoteRequest")
    private final x quoteRequest;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("issues")
    @NotNull
    private final List<String> issues;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("policyStatus")
    private final String policyStatus;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("policy")
    private final s policy;

    public m(String id10, String name, String str, String petType, String gender, String breedType, String breed, e eVar, String dateOfBirth, boolean z, String purchasePrice, jo3.b bVar, Boolean bool, x xVar, ArrayList issues, String str2, s sVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.id = id10;
        this.name = name;
        this.imageLink = str;
        this.petType = petType;
        this.gender = gender;
        this.breedType = breedType;
        this.breed = breed;
        this.breedDetails = eVar;
        this.dateOfBirth = dateOfBirth;
        this.sterilized = z;
        this.purchasePrice = purchasePrice;
        this.purchasePriceMoney = bVar;
        this.editable = bool;
        this.quoteRequest = xVar;
        this.issues = issues;
        this.policyStatus = str2;
        this.policy = sVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBreed() {
        return this.breed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getBreedDetails() {
        return this.breedDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBreedType() {
        return this.breedType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.name, mVar.name) && Intrinsics.f(this.imageLink, mVar.imageLink) && Intrinsics.f(this.petType, mVar.petType) && Intrinsics.f(this.gender, mVar.gender) && Intrinsics.f(this.breedType, mVar.breedType) && Intrinsics.f(this.breed, mVar.breed) && Intrinsics.f(this.breedDetails, mVar.breedDetails) && Intrinsics.f(this.dateOfBirth, mVar.dateOfBirth) && this.sterilized == mVar.sterilized && Intrinsics.f(this.purchasePrice, mVar.purchasePrice) && Intrinsics.f(this.purchasePriceMoney, mVar.purchasePriceMoney) && Intrinsics.f(this.editable, mVar.editable) && Intrinsics.f(this.quoteRequest, mVar.quoteRequest) && Intrinsics.f(this.issues, mVar.issues) && Intrinsics.f(this.policyStatus, mVar.policyStatus) && Intrinsics.f(this.policy, mVar.policy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.imageLink;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.petType), 31, this.gender), 31, this.breedType), 31, this.breed);
        e eVar = this.breedDetails;
        int iC3 = p.a.c(j6.a.c(p.a.c((iC2 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.dateOfBirth), 31, this.sterilized), 31, this.purchasePrice);
        jo3.b bVar = this.purchasePriceMoney;
        int iHashCode = (iC3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.editable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        x xVar = this.quoteRequest;
        int iD = p.a.d((iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.issues);
        String str2 = this.policyStatus;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.policy;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getIssues() {
        return this.issues;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPetType() {
        return this.petType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final s getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPolicyStatus() {
        return this.policyStatus;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPurchasePrice() {
        return this.purchasePrice;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final jo3.b getPurchasePriceMoney() {
        return this.purchasePriceMoney;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final x getQuoteRequest() {
        return this.quoteRequest;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getSterilized() {
        return this.sterilized;
    }
}
