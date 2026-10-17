package igb;

import igb.g0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h0 f161134a = new h0();

    private h0() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.retail.salary_account.impl.salary_hub.data.dto.SalaryHubResponseDto", p0Var.b(j0.class), new KClass[]{p0Var.b(g0.class), p0Var.b(i0.class)}, new KSerializer[]{g0.a.f161131a, new d1("com.revolut.feature.retail.salary_account.impl.salary_hub.data.dto.SalaryHubResponseDto.NotAvailable", i0.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
