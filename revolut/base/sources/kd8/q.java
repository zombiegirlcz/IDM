package kd8;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd8.d f182845a;

    public q(gd8.d juniorConsentPromptRepository) {
        Intrinsics.checkNotNullParameter(juniorConsentPromptRepository, "juniorConsentPromptRepository");
        this.f182845a = juniorConsentPromptRepository;
    }

    public final Object a(String str, wc8.a aVar, gim.c cVar) {
        Object objB = nim.a.b(((gd8.h) this.f182845a).f143087c.k(new gd8.g(str, aVar)), cVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }
}
