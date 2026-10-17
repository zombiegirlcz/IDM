package hjb;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f152681a = new b();

    private b() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.retail.savings.api.home.domain.SavingsAccountAddNewProductCategoryItem.AccountType", p0Var.b(h.class), new KClass[]{p0Var.b(e.class), p0Var.b(f.class), p0Var.b(g.class)}, new KSerializer[]{c.f152682a, new d1("junior_savings_account_type", f.INSTANCE, new Annotation[0]), new d1("personal_savings_account_type", g.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
