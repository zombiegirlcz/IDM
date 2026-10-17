package hs3;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z0 f154979a = new z0();

    private z0() {
    }

    @NotNull
    public final KSerializer serializer() {
        Intrinsics.checkNotNullParameter("rejection_button_action", "discriminator");
        return new mlm.f("com.revolut.feature.credit.application.models.metadata.RejectionButtonAction", kotlin.jvm.internal.o0.f186429a.b(i1.class), new KClass[0], new KSerializer[0], new Annotation[]{new hi9.g(1, false)});
    }
}
