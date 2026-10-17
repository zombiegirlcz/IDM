package n38;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h f211951a = new h();

    private h() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.joint.api.models.JointAccountAddNewProductState", p0Var.b(p.class), new KClass[]{p0Var.b(g.class), p0Var.b(k.class), p0Var.b(l.class), p0Var.b(o.class)}, new KSerializer[]{e.f211944a, i.f211952a, new d1("none", l.INSTANCE, new Annotation[0]), m.f211955a}, new Annotation[0]);
    }
}
