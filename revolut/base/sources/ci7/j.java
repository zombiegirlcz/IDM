package ci7;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f24411a = new j();

    private j() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.instruments.trend.collections.impl.network.InstrumentsTrendCollectionDto.InstrumentDto.CustomAttributes", p0Var.b(t.class), new KClass[]{p0Var.b(f.class), p0Var.b(i.class), p0Var.b(m.class), p0Var.b(p.class), p0Var.b(s.class)}, new KSerializer[]{d.f24404a, g.f24407a, k.f24412a, n.f24414a, q.f24417a}, new Annotation[0]);
    }
}
