package be4;

import c84.t;
import com.revolut.kompot.common.ExternalDestination;
import dii.e;
import dii.g;
import jli.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f14675c;
    public final /* synthetic */ d d;

    public /* synthetic */ b(boolean z, t tVar, d dVar, int i) {
        this.f14673a = i;
        this.f14674b = z;
        this.f14675c = tVar;
        this.d = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f14673a;
        d dVar = this.d;
        t tVar = this.f14675c;
        boolean z = this.f14674b;
        g it8 = (g) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof e)) {
                    int i2 = h.f175850a;
                } else if (z) {
                    tVar.K2(null);
                } else {
                    tVar.C1(new ExternalDestination.ByIntent(((s70.b) dVar.f14677b).b(), null));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof e)) {
                    int i3 = h.f175850a;
                } else if (z) {
                    tVar.K2(null);
                } else {
                    tVar.C1(new ExternalDestination.ByIntent(((s70.b) dVar.f14677b).b(), null));
                    tVar.K2(null);
                }
                break;
        }
        return Unit.f186387a;
    }
}
