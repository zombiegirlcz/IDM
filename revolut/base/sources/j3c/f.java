package j3c;

import j3c.g;
import j3c.h;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f171054a = new f();

    private f() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.revolut_shop.data.model.GalleryItemDto", p0Var.b(i.class), new KClass[]{p0Var.b(g.class), p0Var.b(h.class)}, new KSerializer[]{g.a.f171061a, h.a.f171065a}, new Annotation[0]);
    }
}
