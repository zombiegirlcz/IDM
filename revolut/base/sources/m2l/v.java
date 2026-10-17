package m2l;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import m2l.w;
import m2l.x;
import m2l.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ v f202230a = new v();

    private v() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.retail.feature.wealth.data.core.insights.SentimentAnnotationDto", p0Var.b(z.class), new KClass[]{p0Var.b(w.class), p0Var.b(x.class), p0Var.b(y.class)}, new KSerializer[]{w.a.f202234a, x.a.f202238a, y.a.f202242a}, new Annotation[0]);
    }
}
