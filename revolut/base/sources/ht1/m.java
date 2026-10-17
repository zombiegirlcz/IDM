package ht1;

import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ht1.a domainState = (ht1.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f155206a, new hqk.a(13), new l(0), new gzb.d(this, 18)));
    }
}
