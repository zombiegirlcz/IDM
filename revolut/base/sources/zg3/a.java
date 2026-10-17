package zg3;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f322053a = new a();

    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.checklist_challenges_ui.impl.model.checklist_step_details.blocks.ChecklistStepDetailsBlock", p0Var.b(b.class), new KClass[]{p0Var.b(k.class), p0Var.b(r.class), p0Var.b(s.class)}, new KSerializer[]{c.f322054a, m.f322066a, new d1("com.revolut.feature.checklist_challenges_ui.impl.model.checklist_step_details.blocks.ChecklistStepDetailsBlockUnknown", s.INSTANCE, new Annotation[]{new hi9.g(28)})}, new Annotation[]{new hi9.g(28)});
    }
}
