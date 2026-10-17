package jr;

import java.lang.annotation.Annotation;
import jr.b0;
import jr.c0;
import jr.d0;
import jr.z;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a0 f177759a = new a0();

    private a0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        return new mlm.f("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationStepDto", p0Var.b(e0.class), new KClass[]{p0Var.b(z.class), p0Var.b(b0.class), p0Var.b(c0.class), p0Var.b(d0.class)}, new KSerializer[]{z.a.f177879a, b0.a.f177763a, c0.a.f177776a, d0.a.f177783a}, new Annotation[0]);
    }
}
