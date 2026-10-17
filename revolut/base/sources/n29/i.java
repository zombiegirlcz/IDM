package n29;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i f211473a = new i();

    private i() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.lifestyle.core.impl.data.model.entity.wrapped.LifestyleWrappedCardContentEntity", p0Var.b(s.class), new KClass[]{p0Var.b(l.class), p0Var.b(o.class), p0Var.b(r.class)}, new KSerializer[]{j.f211475a, m.f211482a, p.f211488a}, new Annotation[]{new hi9.g(22)});
    }
}
