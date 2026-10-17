package yfe;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k2 f313278a = new k2();

    private k2() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSubproduct.Logo", p0Var.b(o2.class), new KClass[]{p0Var.b(j2.class), p0Var.b(n2.class)}, new KSerializer[]{h2.f313265a, l2.f313282a}, new Annotation[0]);
    }
}
