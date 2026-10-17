package pka;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import pka.b;
import pka.h0;
import pka.k;
import pka.m0;
import pka.p;
import pka.x;
import qlm.d1;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0 f236961a = new e0();

    private e0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.product_article.impl.model.item.ProductArticleItemDto", p0Var.b(f0.class), new KClass[]{p0Var.b(b.class), p0Var.b(k.class), p0Var.b(p.class), p0Var.b(x.class), p0Var.b(h0.class), p0Var.b(m0.class), p0Var.b(t0.class)}, new KSerializer[]{b.a.f236956a, k.a.f236972a, p.a.f236982a, x.a.f236998a, h0.a.f236966a, m0.a.f236976a, new d1("com.revolut.feature.product_article.impl.model.item.ProductArticleUnknownItemDto", t0.INSTANCE, new Annotation[]{new hi9.g(23)})}, new Annotation[]{new hi9.g(23)});
    }
}
