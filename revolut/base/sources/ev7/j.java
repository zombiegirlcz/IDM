package ev7;

import com.google.crypto.tink.shaded.protobuf.t1;
import ec8.q;
import eu4.b0;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(t1.t(domainState.f129750a, domainState.f129751b), new eul.d(17), new b0(19), new q(this, domainState, 17));
    }
}
