package uha;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q f280179a = new q();

    private q() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.pro.accounts.api.model.ProSubaccountAddNewProductCategoryItem.ProductArticleReference", p0Var.b(x.class), new KClass[]{p0Var.b(t.class), p0Var.b(w.class)}, new KSerializer[]{r.f280180a, u.f280182a}, new Annotation[0]);
    }
}
