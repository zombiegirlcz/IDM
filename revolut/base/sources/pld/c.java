package pld;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f237359a = new c();

    private c() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.slot_manager.impl.ui.screen.checklist.mapper.parser.SlotChecklistErrorCodeParser.ServerError", p0Var.b(g.class), new KClass[]{p0Var.b(f.class)}, new KSerializer[]{d.f237360a}, new Annotation[]{new hi9.g(25)});
    }
}
