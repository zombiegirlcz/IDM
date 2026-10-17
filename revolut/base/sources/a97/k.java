package a97;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o97.y;
import vkm.j2;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f2376a = q.c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oji.j f2377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f2378c;

    public k() {
        new AtomicBoolean(false);
        this.f2377b = new oji.j();
        this.f2378c = new v1(new a1a.a(this, null, 24));
    }

    public abstract koi.j a();

    public abstract Object b(y yVar, Continuation continuation);

    public abstract koi.j c(Object obj2, y yVar);

    public abstract Object d(j jVar);

    public abstract Object e(List list, Continuation continuation);

    public final void f(Function1 update) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(update, "update");
        do {
            j2Var = this.f2376a;
            value = j2Var.getValue();
        } while (!j2Var.h(value, value == null ? value : update.invoke(value)));
    }
}
