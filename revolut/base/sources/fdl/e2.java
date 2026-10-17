package fdl;

import fdl.d2;
import fdl.g2;
import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e2 f134087a = new e2();

    private e2() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.shared.feature.wealth.domain.impl.data.network.model.IpoInstrumentSectionDto", p0Var.b(h2.class), new KClass[]{p0Var.b(d2.class), p0Var.b(g2.class)}, new KSerializer[]{d2.a.f134074a, g2.a.f134102a}, new Annotation[]{new f2()});
    }
}
