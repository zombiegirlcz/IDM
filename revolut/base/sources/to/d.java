package to;

import ecm.c0;
import ecm.g1;
import ecm.h;
import ecm.i;
import ecm.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ecm.d f272483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ecm.d dVar, i iVar) {
        super(iVar);
        this.f272483b = dVar;
    }

    @Override // ecm.i
    public final void e(h responseListener, m1 headers) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(headers, "headers");
        c.Companion.getClass();
        g1 g1Var = c.f272479g;
        ecm.c cVar = c.f272476a;
        ecm.d dVar = this.f272483b;
        headers.d(g1Var, dVar.a(cVar));
        headers.d(c.f272480h, dVar.a(c.f272477b));
        headers.d(c.i, dVar.a(c.f272478c));
        headers.d(c.f272481j, dVar.a(c.d));
        headers.d(c.k, dVar.a(c.e));
        headers.d(c.f272482l, dVar.a(c.f));
        this.f124783a.e(responseListener, headers);
    }
}
