package uha;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f280169a = new e();

    private e() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.pro.accounts.api.model.ProAccountAddNewProductState", p0Var.b(k.class), new KClass[]{p0Var.b(d.class), p0Var.b(f.class), p0Var.b(g.class), p0Var.b(j.class)}, new KSerializer[]{new d1("accountClosed", d.INSTANCE, new Annotation[0]), new d1("notOnboarded", f.INSTANCE, new Annotation[0]), new d1("onboarded", g.INSTANCE, new Annotation[0]), h.f280172a}, new Annotation[0]);
    }
}
