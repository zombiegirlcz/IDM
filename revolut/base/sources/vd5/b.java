package vd5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud5.g;
import ud5.h;
import ud5.i;
import ud5.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 52\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u000b\u0010\u001dR,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b\u0016\u0010#R\u001a\u0010,\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0006\u0010+R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b)\u0010\u0013R\"\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b \u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b&\u00103¨\u00066"}, d2 = {"Lvd5/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "k", "()Z", "testnetAddressesAllowed", "b", "Ljava/lang/String;", "j", "sentimentIndicatorFaqsLink", "", "Lvd5/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "currencies", "", "d", "I", "e", "()I", "maximumAddresses", "Lvd5/a;", "Lvd5/a;", "()Lvd5/a;", "cryptoCashbackConfig", "", "f", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "riskDisclaimers", "Lud5/g;", "g", "explorers", "Lud5/d;", "h", "Lud5/d;", "()Lud5/d;", "compliance", "Lud5/j;", "promotions", "Lud5/h;", "peggedPairs", "Lud5/i;", "Lud5/i;", "()Lud5/i;", "personalExchangeFeesResources", "Companion", "feature_crypto_config_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("testnetAddressesAllowed")
    private final boolean testnetAddressesAllowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sentimentIndicatorFaqsLink")
    @NotNull
    private final String sentimentIndicatorFaqsLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final List<c> currencies;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maximumAddresses")
    private final int maximumAddresses;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cryptoCashbackConfig")
    private final a cryptoCashbackConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("riskDisclaimers")
    @NotNull
    private final Map<String, List<String>> riskDisclaimers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("explorers")
    @NotNull
    private final Map<String, g> explorers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("compliance")
    @NotNull
    private final ud5.d compliance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("promotions")
    private final List<j> promotions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("peggedPairs")
    private final List<h> peggedPairs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("personalExchangeFeesResources")
    private final i personalExchangeFeesResources;

    public b(boolean z, String sentimentIndicatorFaqsLink, ArrayList currencies, int i, a aVar, LinkedHashMap riskDisclaimers, LinkedHashMap explorers, ud5.d compliance, ArrayList arrayList, ArrayList arrayList2, i iVar) {
        Intrinsics.checkNotNullParameter(sentimentIndicatorFaqsLink, "sentimentIndicatorFaqsLink");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(riskDisclaimers, "riskDisclaimers");
        Intrinsics.checkNotNullParameter(explorers, "explorers");
        Intrinsics.checkNotNullParameter(compliance, "compliance");
        this.testnetAddressesAllowed = z;
        this.sentimentIndicatorFaqsLink = sentimentIndicatorFaqsLink;
        this.currencies = currencies;
        this.maximumAddresses = i;
        this.cryptoCashbackConfig = aVar;
        this.riskDisclaimers = riskDisclaimers;
        this.explorers = explorers;
        this.compliance = compliance;
        this.promotions = arrayList;
        this.peggedPairs = arrayList2;
        this.personalExchangeFeesResources = iVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ud5.d getCompliance() {
        return this.compliance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCryptoCashbackConfig() {
        return this.cryptoCashbackConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCurrencies() {
        return this.currencies;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getExplorers() {
        return this.explorers;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaximumAddresses() {
        return this.maximumAddresses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.testnetAddressesAllowed == bVar.testnetAddressesAllowed && Intrinsics.f(this.sentimentIndicatorFaqsLink, bVar.sentimentIndicatorFaqsLink) && Intrinsics.f(this.currencies, bVar.currencies) && this.maximumAddresses == bVar.maximumAddresses && Intrinsics.f(this.cryptoCashbackConfig, bVar.cryptoCashbackConfig) && Intrinsics.f(this.riskDisclaimers, bVar.riskDisclaimers) && Intrinsics.f(this.explorers, bVar.explorers) && Intrinsics.f(this.compliance, bVar.compliance) && Intrinsics.f(this.promotions, bVar.promotions) && Intrinsics.f(this.peggedPairs, bVar.peggedPairs) && Intrinsics.f(this.personalExchangeFeesResources, bVar.personalExchangeFeesResources);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getPeggedPairs() {
        return this.peggedPairs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getPersonalExchangeFeesResources() {
        return this.personalExchangeFeesResources;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPromotions() {
        return this.promotions;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.maximumAddresses, p.a.d(p.a.c(Boolean.hashCode(this.testnetAddressesAllowed) * 31, 31, this.sentimentIndicatorFaqsLink), 31, this.currencies), 31);
        a aVar = this.cryptoCashbackConfig;
        int iHashCode = (this.compliance.hashCode() + p.a.e(p.a.e((iB + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.riskDisclaimers), 31, this.explorers)) * 31;
        List<j> list = this.promotions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<h> list2 = this.peggedPairs;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        i iVar = this.personalExchangeFeesResources;
        return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Map getRiskDisclaimers() {
        return this.riskDisclaimers;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSentimentIndicatorFaqsLink() {
        return this.sentimentIndicatorFaqsLink;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getTestnetAddressesAllowed() {
        return this.testnetAddressesAllowed;
    }
}
