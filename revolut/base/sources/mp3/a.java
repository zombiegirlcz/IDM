package mp3;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f207721a = new a();

    private a() {
    }

    @NotNull
    public final KSerializer serializer() {
        p0 p0Var = o0.f186429a;
        return new mlm.f("credit_account_add_new_item", p0Var.b(h.class), new KClass[]{p0Var.b(d.class), p0Var.b(g.class)}, new KSerializer[]{b.f207722a, e.f207729a}, new Annotation[0]);
    }
}
