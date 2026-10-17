package ufc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Lufc/d;", "", "", "toString", "()Ljava/lang/String;", "Lufc/a;", "a", "Lufc/a;", "()Lufc/a;", "cardPresent", "", "b", "Z", "c", "()Z", "modularKymEnabled", "Lufc/c;", "Lufc/c;", "()Lufc/c;", "ecommerce", "Companion", "feature_revpro_pro_merchant_toggles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardPresent")
    @NotNull
    private final a cardPresent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("modularKymEnabled")
    private final boolean modularKymEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ecommerce")
    private final c ecommerce;

    public d(a cardPresent, boolean z, c cVar) {
        Intrinsics.checkNotNullParameter(cardPresent, "cardPresent");
        this.cardPresent = cardPresent;
        this.modularKymEnabled = z;
        this.ecommerce = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCardPresent() {
        return this.cardPresent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getEcommerce() {
        return this.ecommerce;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getModularKymEnabled() {
        return this.modularKymEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.cardPresent, dVar.cardPresent) && this.modularKymEnabled == dVar.modularKymEnabled && Intrinsics.f(this.ecommerce, dVar.ecommerce);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.cardPresent.hashCode() * 31, 31, this.modularKymEnabled);
        c cVar = this.ecommerce;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
