package j2a;

import j2a.e;
import j2a.g;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f170779a = new d();

    private d() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.payments.transfers.personalisation.impl.data.model.P2pPersonalisationDto", p0Var.b(h.class), new KClass[]{p0Var.b(e.class), p0Var.b(g.class)}, new KSerializer[]{e.a.f170782a, g.a.f170785a}, new Annotation[]{new f()});
    }
}
