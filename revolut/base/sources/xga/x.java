package xga;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;
import xga.y;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x f305666a = new x();

    private x() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.dto.PricingPlanContextualParametrizedTextDto.ParamDto", p0Var.b(a0.class), new KClass[]{p0Var.b(y.class), p0Var.b(z.class)}, new KSerializer[]{y.a.f305668a, new d1("com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.dto.PricingPlanContextualParametrizedTextDto.ParamDto.Unknown", z.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
