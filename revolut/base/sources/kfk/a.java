package kfk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u0010"}, d2 = {"Lkfk/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "terminatedCards", "", "Z", "()Z", "cardActivationRequiredForPlan", "Companion", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminatedCards")
    @NotNull
    private final List<String> terminatedCards;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardActivationRequiredForPlan")
    private final boolean cardActivationRequiredForPlan;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCardActivationRequiredForPlan() {
        return this.cardActivationRequiredForPlan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getTerminatedCards() {
        return this.terminatedCards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.terminatedCards, aVar.terminatedCards) && this.cardActivationRequiredForPlan == aVar.cardActivationRequiredForPlan;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.cardActivationRequiredForPlan) + (this.terminatedCards.hashCode() * 31);
    }
}
