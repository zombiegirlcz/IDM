package m11;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.crypto.challenge.impl.model.ChallengeTier;
import com.revolut.crypto.challenge.impl.model.PlanReward;
import ip0.o50;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.n {

    @NotNull
    public static final i Companion = new i();

    public static final o50 a(ChallengeTier challengeTier, k kVar) {
        return new o50(e11.d.a(challengeTier.f60111a), new MoneyClause(challengeTier.f60112b, new MoneyClause.Format.Shorts(false, 63), null, null, 12), challengeTier.f60113c.k());
    }

    public static boolean b(f fVar) {
        PlanReward planReward;
        f11.c f60118a;
        f11.b bVar = (f11.b) fVar.f201175a.getContent();
        if (bVar == null || (planReward = bVar.f131163c) == null || (f60118a = planReward.getF60118a()) == null) {
            return false;
        }
        f11.c cVar = fVar.f201176b;
        return cVar == null || f60118a.compareTo(cVar) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036e  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r35) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.k.c(cli.j):cli.o");
    }
}
