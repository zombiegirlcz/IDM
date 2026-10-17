package aj0;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m f5364a = new m();

    private m() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.core.model.faq.PigeonNodeDetails.Content", p0Var.b(l0.class), new KClass[]{p0Var.b(l.class), p0Var.b(e0.class), p0Var.b(k0.class)}, new KSerializer[]{new d1("com.revolut.core.model.faq.PigeonNodeDetails.Content.Branch", l.INSTANCE, new Annotation[0]), n.f5369a, f0.f5350a}, new Annotation[0]);
    }
}
