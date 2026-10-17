package ft0;

import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Toggle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionalAmountDelegate$ConditionalAmountItem$Toggle f137765a;

    public l(ConditionalAmountDelegate$ConditionalAmountItem$Toggle model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f137765a = model;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return this.f137765a.f52120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f137765a, ((l) obj2).f137765a);
    }

    public final int hashCode() {
        return this.f137765a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        l lVar = oldItem instanceof l ? (l) oldItem : null;
        if (lVar == null) {
            return null;
        }
        ConditionalAmountDelegate$ConditionalAmountItem$Toggle conditionalAmountDelegate$ConditionalAmountItem$Toggle = lVar.f137765a;
        TextLocalisedClause textLocalisedClause = conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52121b;
        return new k(!textLocalisedClause.equals(r2.f52121b), !Intrinsics.f(conditionalAmountDelegate$ConditionalAmountItem$Toggle.f52122c, r2.f52122c), conditionalAmountDelegate$ConditionalAmountItem$Toggle.d != this.f137765a.d);
    }
}
