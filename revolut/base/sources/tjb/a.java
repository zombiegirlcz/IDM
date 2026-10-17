package tjb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qib.j;
import ujb.a0;
import ujb.d0;
import ujb.e0;
import ujb.l0;
import ujb.o0;
import ujb.r0;
import ujb.u0;
import ujb.x0;
import ujb.y0;
import ujb.z0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final SavingsChallenge a(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        String str = e0Var.f280552a;
        List list = e0Var.f280553b;
        String str2 = e0Var.f280554c;
        LocalDateTime localDateTimeY = oi0.d.Y(e0Var.d);
        LocalDateTime localDateTimeY2 = oi0.d.Y(e0Var.e);
        LocalDateTime localDateTimeY3 = oi0.d.Y(e0Var.f);
        d0 d0Var = e0Var.f280556h;
        String str3 = e0Var.f280555g;
        long j2 = d0Var.f280548a;
        xi0.b.Companion.getClass();
        dj0.d dVar = new dj0.d(j2, xi0.a.a(str3));
        dj0.d dVar2 = new dj0.d(d0Var.f280549b, xi0.a.a(str3));
        Long l2 = d0Var.f280550c;
        SavingsChallenge.Contribution contribution = new SavingsChallenge.Contribution(dVar, dVar2, l2 != null ? new dj0.d(l2.longValue(), xi0.a.a(str3)) : null);
        List list2 = e0Var.i;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new SavingsChallenge.Document(((a0) it8.next()).f280542a));
        }
        return new SavingsChallenge(str, list, str2, localDateTimeY, localDateTimeY2, localDateTimeY3, contribution, arrayList, e0Var.f280557j);
    }

    public static final SavingsChallengeOnboarding b(z0 z0Var) {
        SavingsChallengeOnboarding.Config.ProductArticle productArticle;
        j jVar;
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        SavingsChallenge savingsChallengeA = a(z0Var.f280603a);
        y0 y0Var = z0Var.f280604b;
        r0 r0Var = y0Var.f280600a;
        if (r0Var != null) {
            String str = r0Var.f280584a;
            List<o0> list = r0Var.f280585b;
            int iB = q0.b(w.t(list, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (o0 o0Var : list) {
                linkedHashMap.put(o0Var.f280575a, o0Var.f280576b);
            }
            Boolean bool = r0Var.f280586c;
            productArticle = new SavingsChallengeOnboarding.Config.ProductArticle(str, linkedHashMap, bool != null ? bool.booleanValue() : false);
        } else {
            productArticle = null;
        }
        l0 l0Var = y0Var.f280601b;
        SavingsChallengeOnboarding.Config.EntryPoint entryPoint = new SavingsChallengeOnboarding.Config.EntryPoint(l0Var.f280568a, l0Var.f280569b);
        x0 x0Var = y0Var.f280602c;
        SavingsChallengeOnboarding.Config.SuccessInfo successInfo = x0Var != null ? new SavingsChallengeOnboarding.Config.SuccessInfo(x0Var.f280597a, x0Var.f280598b) : null;
        List<u0> list2 = y0Var.d;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (u0 u0Var : list2) {
            String str2 = u0Var.f280591a;
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (kotlin.text.a0.z(jVar.name(), str2, true)) {
                    break;
                }
                i++;
            }
            if (jVar == null) {
                jVar = j.UNKNOWN;
            }
            arrayList.add(new SavingsChallengeOnboarding.Config.Reward(jVar, u0Var.f280592b, u0Var.f280593c));
        }
        return new SavingsChallengeOnboarding(savingsChallengeA, new SavingsChallengeOnboarding.Config(productArticle, entryPoint, successInfo, arrayList, y0Var.e));
    }

    public static final e0 c(SavingsChallenge savingsChallenge) {
        Intrinsics.checkNotNullParameter(savingsChallenge, "<this>");
        String str = savingsChallenge.f83087a;
        List list = savingsChallenge.f83088b;
        String str2 = savingsChallenge.f83089c;
        long jR = oi0.d.R(savingsChallenge.d);
        long jR2 = oi0.d.R(savingsChallenge.e);
        long jR3 = oi0.d.R(savingsChallenge.f);
        SavingsChallenge.Contribution contribution = savingsChallenge.f83090g;
        dj0.d dVar = contribution.f83092a;
        String str3 = dVar.f115083b.f306286a;
        long j2 = dVar.f115082a;
        long j3 = contribution.f83093b.f115082a;
        dj0.d dVar2 = contribution.f83094c;
        d0 d0Var = new d0(j2, j3, dVar2 != null ? Long.valueOf(dVar2.f115082a) : null);
        ArrayList arrayList = savingsChallenge.f83091h;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new a0(((SavingsChallenge.Document) it8.next()).f83095a));
        }
        return new e0(str, list, str2, jR, jR2, jR3, str3, d0Var, arrayList2, savingsChallenge.i);
    }
}
