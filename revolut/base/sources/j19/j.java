package j19;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f170214a = new j();

    private j() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        KClass kClassB = p0Var.b(k.class);
        KClass[] kClassArr = {p0Var.b(i.class), p0Var.b(t.class), p0Var.b(f0.class), p0Var.b(l0.class), p0Var.b(u0.class), p0Var.b(b1.class), p0Var.b(r1.class), p0Var.b(x1.class), p0Var.b(d2.class), p0Var.b(g2.class)};
        KSerializer[] kSerializerArr = {d.f170183a, l.f170220a, u.f170263a, g0.f170202a, m0.f170228a, v0.f170269a, c1.f170176a, s1.f170255a, y1.f170283a, e2.f170195a};
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        return new mlm.f("com.revolut.feature.lifestyle.content_gateway.api.model.slot.LifestyleContentGatewaySlot", kClassB, kClassArr, kSerializerArr, new Annotation[]{new hi9.g(5, false)});
    }
}
