package fkd;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ s0 f135794a = new s0();

    private s0() {
    }

    @NotNull
    public final KSerializer serializer() {
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        KClass kClassB = p0Var.b(w0.class);
        KClass[] kClassArr = {p0Var.b(f.class), p0Var.b(r.class), p0Var.b(x.class), p0Var.b(f0.class), p0Var.b(r0.class)};
        KSerializer[] kSerializerArr = {a.f135747a, g.f135764a, s.f135793a, y.f135804a, g0.f135765a};
        Intrinsics.checkNotNullParameter("contentType", "discriminator");
        return new mlm.f("com.revolut.feature.slot_manager.api.model.todo.SlotTodoTile", kClassB, kClassArr, kSerializerArr, new Annotation[]{new bka.b(18, false)});
    }
}
