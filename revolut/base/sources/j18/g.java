package j18;

import j18.p;
import j18.v;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qlm.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f170143a = new g();

    private g() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.invest.smart_notifications.impl.data.network.models.InvestSmartNotificationFeedElementDto", p0Var.b(h.class), new KClass[]{p0Var.b(k.class), p0Var.b(p.class), p0Var.b(v.class)}, new KSerializer[]{new d1("com.revolut.feature.invest.smart_notifications.impl.data.network.models.InvestSmartNotificationFeedElementUnknownDto", k.INSTANCE, new Annotation[0]), p.a.f170155a, v.a.f170163a}, new Annotation[0]);
    }
}
