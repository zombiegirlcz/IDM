package ve7;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f288136a = new d();

    private d() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.incentive_experiment.impl.model.IncentiveExperiment", p0Var.b(k.class), new KClass[]{p0Var.b(c.class), p0Var.b(g.class), p0Var.b(h.class), p0Var.b(j.class)}, new KSerializer[]{a.f288134a, e.f288137a, new d1("PAYMENTS_MIGRATION", h.INSTANCE, new Annotation[]{new hi9.g(26)}), new d1("com.revolut.feature.incentive_experiment.impl.model.IncentiveExperiment.Unknown", j.INSTANCE, new Annotation[]{new hi9.g(26)})}, new Annotation[]{new hi9.g(26)});
    }
}
