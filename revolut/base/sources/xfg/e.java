package xfg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u001f\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001c\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020'0#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b\f\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b)\u0010\u0004¨\u0006,"}, d2 = {"Lxfg/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "ref", "b", "f", "name", "c", "g", "programmeName", "d", "description", "e", "logoUrl", "learnMoreUrl", "n", "websiteUrl", "", "h", "Z", "l", "()Z", "suggested", "i", "backgroundUrl", "Lxfg/t;", "j", "Lxfg/t;", "()Lxfg/t;", "provider", "", "Ljava/util/List;", "()Ljava/util/List;", "redeemTypes", "Lxfg/z;", "redeemOptions", "m", "extraRedeemOptions", "voucherProductGroupId", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("programmeName")
    @NotNull
    private final String programmeName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("logoUrl")
    @NotNull
    private final String logoUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("learnMoreUrl")
    @NotNull
    private final String learnMoreUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("websiteUrl")
    private final String websiteUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggested")
    private final boolean suggested;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("backgroundUrl")
    @NotNull
    private final String backgroundUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final t provider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("redeemTypes")
    private final List<String> redeemTypes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("redeemOptions")
    @NotNull
    private final List<z> redeemOptions;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("extraRedeemOptions")
    @NotNull
    private final List<z> extraRedeemOptions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("voucherProductGroupId")
    private final String voucherProductGroupId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getExtraRedeemOptions() {
        return this.extraRedeemOptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.ref, eVar.ref) && Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.programmeName, eVar.programmeName) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.logoUrl, eVar.logoUrl) && Intrinsics.f(this.learnMoreUrl, eVar.learnMoreUrl) && Intrinsics.f(this.websiteUrl, eVar.websiteUrl) && this.suggested == eVar.suggested && Intrinsics.f(this.backgroundUrl, eVar.backgroundUrl) && Intrinsics.f(this.provider, eVar.provider) && Intrinsics.f(this.redeemTypes, eVar.redeemTypes) && Intrinsics.f(this.redeemOptions, eVar.redeemOptions) && Intrinsics.f(this.extraRedeemOptions, eVar.extraRedeemOptions) && Intrinsics.f(this.voucherProductGroupId, eVar.voucherProductGroupId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getProgrammeName() {
        return this.programmeName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final t getProvider() {
        return this.provider;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.ref.hashCode() * 31, 31, this.name), 31, this.programmeName), 31, this.description), 31, this.logoUrl), 31, this.learnMoreUrl);
        String str = this.websiteUrl;
        int iHashCode = (this.provider.hashCode() + p.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.suggested), 31, this.backgroundUrl)) * 31;
        List<String> list = this.redeemTypes;
        int iD = p.a.d(p.a.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.redeemOptions), 31, this.extraRedeemOptions);
        String str2 = this.voucherProductGroupId;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getRedeemOptions() {
        return this.redeemOptions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getRedeemTypes() {
        return this.redeemTypes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSuggested() {
        return this.suggested;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getVoucherProductGroupId() {
        return this.voucherProductGroupId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }
}
