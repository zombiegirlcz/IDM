package bka;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ m0 f16326a = new m0();

    private m0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.product_article.api.models.item.ProductArticleItem", p0Var.b(n0.class), new KClass[]{p0Var.b(k.class), p0Var.b(r.class), p0Var.b(b0.class), p0Var.b(l0.class), p0Var.b(t0.class), p0Var.b(c1.class), p0Var.b(e1.class)}, new KSerializer[]{c.f16302a, l.f16324a, t.f16338a, c0.f16303a, o0.f16328a, u0.f16340a, new qlm.d1("com.revolut.feature.product_article.api.models.item.ProductArticleUnknownItem", e1.INSTANCE, new Annotation[]{new b(4)})}, new Annotation[]{new b(4)});
    }
}
