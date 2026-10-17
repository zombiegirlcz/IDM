package krk;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import krk.m;
import krk.o;
import krk.p;
import krk.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f188887a = new f();

    private f() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.retail.feature.stockdetails.impl.data.network.model.data_points.AssetSeriesDataDto", p0Var.b(l.class), new KClass[]{p0Var.b(m.class), p0Var.b(o.class), p0Var.b(p.class), p0Var.b(q.class)}, new KSerializer[]{m.a.f188894a, o.a.f188897a, p.a.f188900a, q.a.f188903a}, new Annotation[]{new n()});
    }
}
