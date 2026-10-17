package wka;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xka.s;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f298260b;

    public /* synthetic */ b(h hVar, int i) {
        this.f298259a = i;
        this.f298260b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298259a) {
            case 0:
                if (((Throwable) obj2) != null) {
                    oki.h.D2(this.f298260b.f298269s);
                }
                break;
            default:
                s result = (s) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f298260b.C2(h.K2(result));
                break;
        }
        return Unit.f186387a;
    }
}
