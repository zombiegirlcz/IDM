package ec6;

import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j(i2b.a.o((List) iii.c.f(domainState.f124447a, new ebi.i(this, 4), new e6e.a(19), new dob.a(this, 18)), (List) iii.c.f(domainState.f124448b, new ebi.i(this, 5), new e6e.a(this, 20), new dbg.b(this, domainState, 29))));
    }
}
