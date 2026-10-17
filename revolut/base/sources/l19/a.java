package l19;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f191492a = new a();

    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.bottom_sheet.BottomSheetAction", p0Var.b(b.class), new KClass[]{p0Var.b(k.class), p0Var.b(l.class)}, new KSerializer[]{f.f191495a, new d1("com.revolut.feature.lifestyle.content_gateway.api.model.slot.atoms.bottom_sheet.UnknownBottomSheetAction", l.INSTANCE, new Annotation[]{new hi9.g(17)})}, new Annotation[]{new hi9.g(17)});
    }
}
