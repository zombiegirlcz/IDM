package egb;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f125596a = new j();

    private j() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionBlock", p0Var.b(g0.class), new KClass[]{p0Var.b(i.class), p0Var.b(s.class), p0Var.b(y.class), p0Var.b(b0.class), p0Var.b(e0.class), p0Var.b(f0.class)}, new KSerializer[]{g.f125592a, k.f125600a, t.f125619a, z.f125626a, c0.f125585a, new d1("com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionBlock.Unknown", f0.INSTANCE, new Annotation[]{new bka.b(9)})}, new Annotation[]{new bka.b(9)});
    }
}
