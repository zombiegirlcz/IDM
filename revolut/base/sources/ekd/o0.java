package ekd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o0 f127018a = new o0();

    private o0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        KClass kClassB = p0Var.b(q0.class);
        KClass[] kClassArr = {p0Var.b(z.class), p0Var.b(n0.class)};
        KSerializer[] kSerializerArr = {j.f127007a, a0.f126987a};
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        return new mlm.f("com.revolut.feature.slot_manager.api.model.suggestion.SlotSuggestion", kClassB, kClassArr, kSerializerArr, new Annotation[]{new bka.b(12, false)});
    }
}
