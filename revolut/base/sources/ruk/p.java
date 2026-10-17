package ruk;

import jel.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f257613a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jel.b bVar;
        jel.c it8 = (jel.c) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        h1 h1Var = it8 instanceof h1 ? (h1) it8 : null;
        if (h1Var == null || (bVar = h1Var.f173464g) == null) {
            return null;
        }
        return bVar.f173410b;
    }
}
