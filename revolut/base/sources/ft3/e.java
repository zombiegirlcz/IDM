package ft3;

import ft3.e0;
import ft3.f0;
import ft3.g;
import ft3.n;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f137813a = new e();

    private e() {
    }

    public static q0 a(d1 productClassification, String str) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        return g1.d(productClassification, str, null, 2);
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.credit.application.models.products.CreditApplicationProduct", p0Var.b(q0.class), new KClass[]{p0Var.b(c.class), p0Var.b(d.class), p0Var.b(g.class), p0Var.b(j.class), p0Var.b(m.class), p0Var.b(n.class), p0Var.b(r.class), p0Var.b(s.class), p0Var.b(u.class), p0Var.b(w.class), p0Var.b(z.class), p0Var.b(a0.class), p0Var.b(d0.class), p0Var.b(e0.class), p0Var.b(f0.class), p0Var.b(g0.class), p0Var.b(k0.class), p0Var.b(n0.class), p0Var.b(o0.class), p0Var.b(p0.class)}, new KSerializer[]{a.f137794a, new qlm.d1("buyNowPayLater", d.INSTANCE, new Annotation[]{new v("application_type")}), g.a.f137829a, h.f137833a, k.f137842a, n.a.f137853a, p.f137861a, new qlm.d1("familyCreditCardInvitee", s.INSTANCE, new Annotation[]{new v("type")}), new qlm.d1("homeImprovementLoan", u.INSTANCE, new Annotation[]{new v("application_type")}), new qlm.d1("loan", w.INSTANCE, new Annotation[]{new v("application_type")}), x.f137889a, new qlm.d1("mortgage", a0.INSTANCE, new Annotation[]{new v("application_type")}), b0.f137800a, e0.a.f137817a, f0.a.f137824a, new qlm.d1("overdraft", g0.INSTANCE, new Annotation[]{new v("application_type")}), i0.f137838a, l0.f137846a, new qlm.d1("refinancingLoan", o0.INSTANCE, new Annotation[]{new v("application_type")}), new qlm.d1("refinancingMortgage", p0.INSTANCE, new Annotation[]{new v("application_type")})}, new Annotation[]{new v("application_type")});
    }
}
