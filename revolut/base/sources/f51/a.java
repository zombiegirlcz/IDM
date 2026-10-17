package f51;

import f2i.o;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e79.a f132254a;

    public a(e79.a aVar) {
        this.f132254a = aVar;
    }

    public final o a() {
        r69.a aVarA = this.f132254a.a();
        s.j(aVarA);
        Set handlers = Collections.singleton(new c(aVarA));
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        return new o(handlers, 10);
    }
}
