package a9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"La9g/b2;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "basePrice", "b", "d", "inclusivePrice", "c", "e", "strikethroughPrice", "", "La9g/e2;", "Ljava/util/List;", "()Ljava/util/List;", "fees", "cardOnFile", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("basePrice")
    @NotNull
    private final jo3.b basePrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inclusivePrice")
    @NotNull
    private final jo3.b inclusivePrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("strikethroughPrice")
    private final jo3.b strikethroughPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<e2> fees;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardOnFile")
    private final jo3.b cardOnFile;

    public b2(jo3.b basePrice, jo3.b inclusivePrice, jo3.b bVar, ArrayList fees, jo3.b bVar2) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        Intrinsics.checkNotNullParameter(inclusivePrice, "inclusivePrice");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.basePrice = basePrice;
        this.inclusivePrice = inclusivePrice;
        this.strikethroughPrice = bVar;
        this.fees = fees;
        this.cardOnFile = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCardOnFile() {
        return this.cardOnFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getInclusivePrice() {
        return this.inclusivePrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.basePrice, b2Var.basePrice) && Intrinsics.f(this.inclusivePrice, b2Var.inclusivePrice) && Intrinsics.f(this.strikethroughPrice, b2Var.strikethroughPrice) && Intrinsics.f(this.fees, b2Var.fees) && Intrinsics.f(this.cardOnFile, b2Var.cardOnFile);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.inclusivePrice, this.basePrice.hashCode() * 31, 31);
        jo3.b bVar = this.strikethroughPrice;
        int iD = p.a.d((iE + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.fees);
        jo3.b bVar2 = this.cardOnFile;
        return iD + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
