package xei;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lxei/g;", "", "", "toString", "()Ljava/lang/String;", "Lxei/f;", "a", "Lxei/f;", "()Lxei/f;", "basePrice", "b", "d", "inclusivePrice", "c", "e", "strikethroughPrice", "", "Lxei/j;", "Ljava/util/List;", "()Ljava/util/List;", "fees", "cardOnFile", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("basePrice")
    @NotNull
    private final f basePrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inclusivePrice")
    @NotNull
    private final f inclusivePrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("strikethroughPrice")
    private final f strikethroughPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<j> fees;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardOnFile")
    private final f cardOnFile;

    public g(f basePrice, f inclusivePrice, f fVar, ArrayList fees, f fVar2) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        Intrinsics.checkNotNullParameter(inclusivePrice, "inclusivePrice");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.basePrice = basePrice;
        this.inclusivePrice = inclusivePrice;
        this.strikethroughPrice = fVar;
        this.fees = fees;
        this.cardOnFile = fVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCardOnFile() {
        return this.cardOnFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getInclusivePrice() {
        return this.inclusivePrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.basePrice, gVar.basePrice) && Intrinsics.f(this.inclusivePrice, gVar.inclusivePrice) && Intrinsics.f(this.strikethroughPrice, gVar.strikethroughPrice) && Intrinsics.f(this.fees, gVar.fees) && Intrinsics.f(this.cardOnFile, gVar.cardOnFile);
    }

    public final int hashCode() {
        int iHashCode = (this.inclusivePrice.hashCode() + (this.basePrice.hashCode() * 31)) * 31;
        f fVar = this.strikethroughPrice;
        int iD = p.a.d((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.fees);
        f fVar2 = this.cardOnFile;
        return iD + (fVar2 != null ? fVar2.hashCode() : 0);
    }
}
