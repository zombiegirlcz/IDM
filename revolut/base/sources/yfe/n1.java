package yfe;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n1 f313285a = new n1();

    private n1() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSnapshotIcon", p0Var.b(s1.class), new KClass[]{p0Var.b(i1.class), p0Var.b(l1.class), p0Var.b(o1.class), p0Var.b(r1.class)}, new KSerializer[]{g1.f313256a, j1.f313271a, new qlm.d1("product", o1.INSTANCE, new Annotation[0]), p1.f313292a}, new Annotation[0]);
    }
}
