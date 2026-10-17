package xge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rfe.j f305745b;

    public /* synthetic */ t(rfe.j jVar, int i) {
        this.f305744a = i;
        this.f305745b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f305744a) {
            case 0:
                pie.s it8 = (pie.s) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(((rfe.i) this.f305745b).f253769a.contains(it8.a()));
            default:
                pie.s it9 = (pie.s) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!((rfe.h) this.f305745b).f253768a.contains(it9.a()));
        }
    }
}
