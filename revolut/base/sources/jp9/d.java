package jp9;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f177237a = new d();

    private d() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.feature.payments.bills_chooser.impl.model.ItemizationScanBillResult", p0Var.b(k.class), new KClass[]{p0Var.b(g.class), p0Var.b(j.class)}, new KSerializer[]{e.f177238a, h.f177241a}, new Annotation[]{new hi9.g(16)});
    }
}
