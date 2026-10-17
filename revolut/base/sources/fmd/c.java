package fmd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f136371a = new c();

    private c() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.spending_analytics.api.ui.rev10.add_new.IncomeSorterAddNewProductCategoryItem.Destination", p0Var.b(e.class), new KClass[]{p0Var.b(d.class)}, new KSerializer[]{new d1("new_is", d.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
