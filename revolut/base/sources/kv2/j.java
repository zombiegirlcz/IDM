package kv2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t61.g f189945b;

    public /* synthetic */ j(t61.g gVar, int i) {
        this.f189944a = i;
        this.f189945b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f189944a) {
            case 0:
                t61.g gVar = this.f189945b;
                Intrinsics.h(gVar);
                return new d(gVar);
            default:
                return mv2.c.a((mv2.c) obj2, null, this.f189945b, 1);
        }
    }
}
