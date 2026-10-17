package y4g;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.api.R$string;
import ip0.lr;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l7g.q;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rul.e f310933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f310934b;

    public m(rul.e validator, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f310933a = validator;
        this.f310934b = phoneToolsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r23v3 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        Clause clause;
        ?? r132;
        int i;
        TextClause textClause;
        j jVar2;
        f fVar;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = domainState.f310926b;
        String str = gVar.f310921a;
        g gVar2 = domainState.f310925a;
        boolean zF = Intrinsics.f(str, gVar2.f310921a);
        Clause clause2 = domainState.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passenger_details_email, null, null, 14);
        if (d0.W(str)) {
            z = zF;
            clause = clause2;
            r132 = 0;
            i = 14;
            textClause = null;
        } else {
            z = zF;
            clause = clause2;
            r132 = 0;
            i = 14;
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("BOOKING_CONTACT_EMAIL", textClause, textLocalisedClause, null, false, null, false, (clause == null || z) ? r132 : clause, null, null, null, null, null, false, null, null, (clause == null || z) ? false : true, false, false, false, new lr(33), 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -539099272, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        j jVar3 = gVar.f310922b;
        boolean zF2 = Intrinsics.f(jVar3, gVar2.f310922b);
        ?? r182 = jVar3 != null ? jVar3.f310930c : r132;
        if (jVar3 == null) {
            z80.b bVar = this.f310934b;
            wi0.b bVarF = bVar.f();
            if (bVarF == null) {
                wi0.b.Companion.getClass();
                bVarF = wi0.b.p0;
            }
            fj0.a aVar = fj0.b.Companion;
            String strJ = bVar.j(bVarF);
            aVar.getClass();
            Serializable serializableB = fj0.a.b(strJ);
            yhm.o.b(serializableB);
            jVar2 = new j(((fj0.b) serializableB).f135518a, "", bVarF);
        } else {
            jVar2 = jVar3;
        }
        ka kaVar = new ka("BOOKING_CONTACT_PHONE", r182, new Pair(new fj0.b(jVar2.f310929b), jVar2.f310928a), null, jVar3 == null ? new TextLocalisedClause(R$string.travel_flights_passenger_details_phone_number_error, r132, r132, i) : !zF2 ? clause : r132, new TextLocalisedClause(R$string.travel_flights_passenger_details_phone_number, r132, r132, i), false, false, 8088);
        int i2 = R$attr.uikit_dp0;
        yp0.b.l(kaVar, 0, 0, i2, i2, null, false, 51);
        List listK = v.k(model, kaVar);
        if (domainState.d) {
            fVar = f.LOADING;
        } else {
            q qVar = domainState.f310927c;
            fVar = ((qVar == null || qVar == q.CONFIRMED) && !gVar.equals(gVar2) && this.f310933a.f(gVar)) ? f.ENABLED : f.DISABLED;
        }
        return new l(listK, fVar);
    }
}
