package ofa;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import ofa.u;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q f224782a = new q();

    private q() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.post_activation.impl.model.PostActivationStep", p0Var.b(g0.class), new KClass[]{p0Var.b(m.class), p0Var.b(o.class), p0Var.b(p.class), p0Var.b(r.class), p0Var.b(s.class), p0Var.b(u.class), p0Var.b(v.class), p0Var.b(w.class), p0Var.b(x.class), p0Var.b(y.class), p0Var.b(e0.class), p0Var.b(f0.class)}, new KSerializer[]{f.f224769a, new d1("CHECKOUT", o.INSTANCE, new Annotation[]{new t()}), new d1("COBRANDS_ONBOARDING", p.INSTANCE, new Annotation[]{new t()}), new d1("CONTACTS_SYNC", r.INSTANCE, new Annotation[]{new t()}), new d1("CREDIT_ONBOARDING", s.INSTANCE, new Annotation[]{new t()}), u.a.f224786a, new d1("PRO_ONBOARDING", v.INSTANCE, new Annotation[]{new t()}), new d1("PROFILE", w.INSTANCE, new Annotation[]{new t()}), new d1("RETAIL_CREDIT_ONBOARDING", x.INSTANCE, new Annotation[]{new t()}), new d1("RETAIL_CREDIT_ONBOARDING_WAITING", y.INSTANCE, new Annotation[]{new t()}), z.f224793a, new d1("UNKNOWN", f0.INSTANCE, new Annotation[]{new t()})}, new Annotation[]{new t()});
    }
}
