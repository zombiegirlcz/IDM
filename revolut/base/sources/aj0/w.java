package aj0;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w f5377a = new w();

    private w() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.core.model.faq.PigeonNodeDetails.Content.Informational.Element", p0Var.b(d0.class), new KClass[]{p0Var.b(v.class), p0Var.b(z.class), p0Var.b(c0.class)}, new KSerializer[]{t.f5374a, x.f5378a, a0.f5339a}, new Annotation[0]);
    }
}
