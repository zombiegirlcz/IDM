package cjl;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x f24722a = new x();

    private x() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("com.revolut.sso.api.models.UserExtraAttributes", p0Var.b(b0.class), new KClass[]{p0Var.b(a0.class)}, new KSerializer[]{y.f24723a}, new Annotation[]{new bka.b(8)});
    }
}
