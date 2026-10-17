package hjb;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j f152686a = new j();

    private j() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.retail.savings.api.home.domain.SavingsAccountAddNewProductCategoryItem.EntryPointType", p0Var.b(t.class), new KClass[]{p0Var.b(m.class), p0Var.b(p.class), p0Var.b(s.class)}, new KSerializer[]{k.f152687a, n.f152691a, q.f152693a}, new Annotation[0]);
    }
}
