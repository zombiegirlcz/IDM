package yfe;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g2 f313257a = new g2();

    private g2() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSubproduct", p0Var.b(b3.class), new KClass[]{p0Var.b(a2.class), p0Var.b(e2.class), p0Var.b(j2.class), p0Var.b(n2.class), p0Var.b(p2.class), p0Var.b(q2.class), p0Var.b(r2.class), p0Var.b(t2.class), p0Var.b(u2.class), p0Var.b(v2.class), p0Var.b(w2.class), p0Var.b(x2.class), p0Var.b(y2.class), p0Var.b(z2.class)}, new KSerializer[]{y1.f313327a, c2.f313246a, h2.f313265a, l2.f313282a, new qlm.d1("savings", p2.INSTANCE, new Annotation[0]), new qlm.d1("cfd", q2.INSTANCE, new Annotation[0]), new qlm.d1("commodities", r2.INSTANCE, new Annotation[0]), new qlm.d1("gia", t2.INSTANCE, new Annotation[0]), new qlm.d1("isa", u2.INSTANCE, new Annotation[0]), new qlm.d1("jisa", v2.INSTANCE, new Annotation[0]), new qlm.d1("joint_gia", w2.INSTANCE, new Annotation[0]), new qlm.d1("pea", x2.INSTANCE, new Annotation[0]), new qlm.d1("robo", y2.INSTANCE, new Annotation[0]), new qlm.d1("strategies", z2.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
