package kka;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nka.q;
import ska.k;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f184554b;

    public /* synthetic */ b(h hVar, int i) {
        this.f184553a = i;
        this.f184554b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        q params = (q) obj2;
        switch (this.f184553a) {
            case 0:
                Intrinsics.checkNotNullParameter(params, "requestParams");
                k kVar = this.f184554b.f184563a;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return kVar.f263799g.b(params, loadingStrategy);
            default:
                Intrinsics.checkNotNullParameter(params, "requestParams");
                k kVar2 = this.f184554b.f184563a;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                w4l.i loadingStrategy2 = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return kVar2.f.b(params, loadingStrategy2);
        }
    }
}
