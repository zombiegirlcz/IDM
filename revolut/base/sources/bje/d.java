package bje;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f15600a = new d();

    private d() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.tab.crypto.api.add_new.ProductItem", p0Var.b(n.class), new KClass[]{p0Var.b(g.class), p0Var.b(h.class), p0Var.b(i.class), p0Var.b(j.class), p0Var.b(k.class), p0Var.b(l.class), p0Var.b(m.class)}, new KSerializer[]{e.f15601a, new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.EarnFallback", h.INSTANCE, new Annotation[0]), new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Learn", i.INSTANCE, new Annotation[0]), new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.LearnWithReward", j.INSTANCE, new Annotation[0]), new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.RevolutX", k.INSTANCE, new Annotation[0]), new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Strategies", l.INSTANCE, new Annotation[0]), new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Trading", m.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
