package cem;

import aem.f1;
import gim.i;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements bem.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23508a = new b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bem.a
    public final void c(vdm.b client, i iVar) {
        Function3 handler = (Function3) iVar;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.f288081g.f(hem.b.f151726h, new f1(handler, null, 3));
    }
}
