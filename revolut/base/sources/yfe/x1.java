package yfe;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x1 f313322a = new x1();

    private x1() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSubproduct.Account", p0Var.b(f2.class), new KClass[]{p0Var.b(a2.class), p0Var.b(e2.class)}, new KSerializer[]{y1.f313327a, c2.f313246a}, new Annotation[0]);
    }
}
