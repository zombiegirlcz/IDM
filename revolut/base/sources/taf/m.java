package taf;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f269325a = w.y0(new t73.h(20));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(t1.t(domainState.f269314b, domainState.f269315c), new t5e.m(this, 24), new t5e.j(20), new sa5.b(this, domainState, 29)));
    }
}
