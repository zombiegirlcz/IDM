package n29;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f211456a = new a();

    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.lifestyle.core.impl.data.model.entity.wrapped.LifestyleWrappedCardAssetEntity", p0Var.b(h.class), new KClass[]{p0Var.b(d.class), p0Var.b(g.class)}, new KSerializer[]{b.f211457a, e.f211464a}, new Annotation[]{new hi9.g(21)});
    }
}
