package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0012"}, d2 = {"Lnx4/z;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "cardDesignCode", "cardBrand", "c", "f", "holderName", "d", "e", "footer", "cardLabel", "cardTypeLabel", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDesignCode")
    @NotNull
    private final String cardDesignCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardBrand")
    @NotNull
    private final String cardBrand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholderName")
    @NotNull
    private final String holderName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("footer")
    @NotNull
    private final String footer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardLabel")
    @NotNull
    private final String cardLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardTypeLabel")
    @NotNull
    private final String cardTypeLabel;

    public z(String cardDesignCode, String cardBrand, String holderName, String footer, String cardLabel, String cardTypeLabel) {
        Intrinsics.checkNotNullParameter(cardDesignCode, "cardDesignCode");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cardLabel, "cardLabel");
        Intrinsics.checkNotNullParameter(cardTypeLabel, "cardTypeLabel");
        this.cardDesignCode = cardDesignCode;
        this.cardBrand = cardBrand;
        this.holderName = holderName;
        this.footer = footer;
        this.cardLabel = cardLabel;
        this.cardTypeLabel = cardTypeLabel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardDesignCode() {
        return this.cardDesignCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardLabel() {
        return this.cardLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardTypeLabel() {
        return this.cardTypeLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.cardDesignCode, zVar.cardDesignCode) && Intrinsics.f(this.cardBrand, zVar.cardBrand) && Intrinsics.f(this.holderName, zVar.holderName) && Intrinsics.f(this.footer, zVar.footer) && Intrinsics.f(this.cardLabel, zVar.cardLabel) && Intrinsics.f(this.cardTypeLabel, zVar.cardTypeLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    public final int hashCode() {
        return this.cardTypeLabel.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.cardDesignCode.hashCode() * 31, 31, this.cardBrand), 31, this.holderName), 31, this.footer), 31, this.cardLabel);
    }
}
