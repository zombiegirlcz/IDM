package ybd;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;
import ybd.a0;
import ybd.e0;
import ybd.f0;
import ybd.j;
import ybd.n;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y f312281a = new y();

    private y() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.ItemDto", p0Var.b(z.class), new KClass[]{p0Var.b(j.class), p0Var.b(n.class), p0Var.b(a0.class), p0Var.b(e0.class), p0Var.b(f0.class), p0Var.b(o0.class)}, new KSerializer[]{j.a.f312245a, n.a.f312259a, a0.a.f312219a, e0.a.f312231a, f0.a.f312235a, new d1("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.UnknownItemDto", o0.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
