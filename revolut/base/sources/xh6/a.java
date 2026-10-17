package xh6;

import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.model.MandateConstraints;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import qe6.c;
import uh6.j;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f305827a = r0.k(new Pair("ACTIVE", c.ACTIVE), new Pair("UNKNOWN", c.UNKNOWN));

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public static final Mandate a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String id10 = jVar.getId();
        String institutionId = jVar.getInstitutionId();
        uh6.c constraints = jVar.getConstraints();
        MandateConstraints mandateConstraints = new MandateConstraints(mo3.a.o(constraints.getMaximumIndividualLimit()), mo3.a.o(constraints.getMaximumMonthlyLimit()), mo3.a.o(constraints.getUsedMonthlyLimit()));
        c cVar = (c) u1.t(jVar.getState(), c.UNKNOWN, f305827a);
        Boolean replaceable = jVar.getReplaceable();
        return new Mandate(id10, institutionId, mandateConstraints, cVar, replaceable != null ? replaceable.booleanValue() : true);
    }
}
