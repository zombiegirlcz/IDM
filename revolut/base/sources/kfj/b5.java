package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0016\u0010\u0004R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lkfj/b5;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/e0;", "a", "Lkfj/e0;", "c", "()Lkfj/e0;", "content", "b", "f", "cryptoContent", "commodityContent", "", "d", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "manualConsent", "", "e", "J", "()J", "contractDate", "Ljava/lang/String;", "contractVersion", "", "Lkfj/a5;", "Ljava/util/List;", "()Ljava/util/List;", "consents", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final e0 content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cryptoContent")
    private final e0 cryptoContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("commodityContent")
    private final e0 commodityContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("manualConsent")
    private final Boolean manualConsent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("contractDate")
    private final long contractDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("contractVersion")
    @NotNull
    private final String contractVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final List<a5> consents;

    public b5(e0 content, e0 e0Var, e0 e0Var2, Boolean bool, long j2, String contractVersion, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
        this.content = content;
        this.cryptoContent = e0Var;
        this.commodityContent = e0Var2;
        this.manualConsent = bool;
        this.contractDate = j2;
        this.contractVersion = contractVersion;
        this.consents = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e0 getCommodityContent() {
        return this.commodityContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getContractDate() {
        return this.contractDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getContractVersion() {
        return this.contractVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj2;
        return Intrinsics.f(this.content, b5Var.content) && Intrinsics.f(this.cryptoContent, b5Var.cryptoContent) && Intrinsics.f(this.commodityContent, b5Var.commodityContent) && Intrinsics.f(this.manualConsent, b5Var.manualConsent) && this.contractDate == b5Var.contractDate && Intrinsics.f(this.contractVersion, b5Var.contractVersion) && Intrinsics.f(this.consents, b5Var.consents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e0 getCryptoContent() {
        return this.cryptoContent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getManualConsent() {
        return this.manualConsent;
    }

    public final int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        e0 e0Var = this.cryptoContent;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        e0 e0Var2 = this.commodityContent;
        int iHashCode3 = (iHashCode2 + (e0Var2 == null ? 0 : e0Var2.hashCode())) * 31;
        Boolean bool = this.manualConsent;
        int iC = p.a.c(a0.d.c((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.contractDate), 31, this.contractVersion);
        List<a5> list = this.consents;
        return iC + (list != null ? list.hashCode() : 0);
    }
}
