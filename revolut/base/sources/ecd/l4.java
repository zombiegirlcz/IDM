package ecd;

import ecd.m4;
import ecd.o4;
import ecd.p4;
import ecd.q4;
import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l4 f124612a = new l4();

    private l4() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto.LimitDto", p0Var.b(s4.class), new KClass[]{p0Var.b(m4.class), p0Var.b(o4.class), p0Var.b(p4.class), p0Var.b(q4.class), p0Var.b(r4.class)}, new KSerializer[]{m4.a.f124620a, o4.a.f124638a, p4.a.f124648a, q4.a.f124654a, new qlm.d1("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto.LimitDto.UnknownLimitDto", r4.INSTANCE, new Annotation[]{new n4()})}, new Annotation[]{new n4()});
    }
}
