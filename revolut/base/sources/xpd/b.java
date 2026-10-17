package xpd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import end.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import otd.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307930a;

    public b(d incomeSorterDestinationUIMapper) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationUIMapper, "incomeSorterDestinationUIMapper");
        this.f307930a = incomeSorterDestinationUIMapper;
    }

    public static RowDelegate.Model.c.b a(dj0.d dVar, dj0.d dVar2) {
        return new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), !Intrinsics.f(dVar, dVar2) ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124);
    }

    public static RowDelegate.Model.c.b b(dj0.d dVar, List list, xi0.b bVar) {
        dj0.d dVarB;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        MoneyClause moneyClause2 = null;
        if (!Intrinsics.f(bVar, dVar.f115083b) && (dVarB = f.b(dVar, list, bVar)) != null) {
            moneyClause2 = new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        return new RowDelegate.Model.c.b(moneyClause, moneyClause2, null, false, 124);
    }
}
