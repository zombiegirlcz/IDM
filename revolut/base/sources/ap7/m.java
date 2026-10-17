package ap7;

import a2f.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(domainState.f8102a.isEmpty() ? new TextLocalisedClause(R$string.car_insurance_common_skip, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14), (List) iii.c.f(domainState.f8103b, new anf.p(23), new an4.g(26), new q(this, domainState, 18)));
    }
}
