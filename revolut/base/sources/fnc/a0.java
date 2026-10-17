package fnc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ alc.n f136622b;

    public /* synthetic */ a0(alc.n nVar, int i) {
        this.f136621a = i;
        this.f136622b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136621a) {
            case 0:
                return new jlc.m(((Template) obj2).f95706a, this.f136622b.f6215n, null, null);
            case 1:
                vdh.b assetAllocations = (vdh.b) obj2;
                Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
                return new a6f.g(assetAllocations.f287930a, assetAllocations.f287931b, assetAllocations.f287932c, assetAllocations.d, this.f136622b);
            default:
                return new m1h.h(this.f136622b.i, (xi0.b) obj2, true, 24);
        }
    }
}
