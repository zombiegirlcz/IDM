package ybd;

import java.lang.annotation.Annotation;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;
import ybd.k0;
import ybd.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j0 f312246a = new j0();

    private j0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.RowDto.ValueDto", p0Var.b(n0.class), new KClass[]{p0Var.b(k0.class), p0Var.b(l0.class), p0Var.b(m0.class)}, new KSerializer[]{k0.a.f312249a, l0.a.f312251a, new d1("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.RowDto.ValueDto.UnknownValueDto", m0.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
