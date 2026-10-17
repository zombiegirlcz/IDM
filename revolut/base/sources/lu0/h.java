package lu0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends sim.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, int i) {
        super(obj2);
        this.f199992b = i;
    }

    @Override // sim.c
    public final void a(Object obj2, KProperty property, Object obj3) {
        switch (this.f199992b) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                ifm.c cVar = (ifm.c) obj2;
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                ifm.c cVar2 = (ifm.c) obj2;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                ifm.c cVar3 = (ifm.c) obj2;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                break;
        }
    }
}
