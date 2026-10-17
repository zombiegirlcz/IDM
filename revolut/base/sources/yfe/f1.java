package yfe;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f1 f313254a = new f1();

    private f1() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthSnapshotIcon.Avatar", p0Var.b(m1.class), new KClass[]{p0Var.b(i1.class), p0Var.b(l1.class)}, new KSerializer[]{g1.f313256a, j1.f313271a}, new Annotation[0]);
    }
}
