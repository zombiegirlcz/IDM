package ap5;

import an4.g;
import anf.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8093b;

    public /* synthetic */ a(b bVar, int i) {
        this.f8092a = i;
        this.f8093b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8092a) {
            case 0:
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    return this.f8093b.d.a(Unit.f186387a);
                }
                zk5.c.Companion.getClass();
                return w.h(zk5.b.a());
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return m70.a.g(nim.a.w(no5.b.a(this.f8093b.f8094a, false, ho5.a.NONE, true, 8), new p(22)), null, new g(23), 1);
        }
    }
}
