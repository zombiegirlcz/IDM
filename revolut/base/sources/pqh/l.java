package pqh;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238787a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zel.g f238788b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zel.i iVar;
        switch (this.f238787a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                zel.g gVar = update.f238780a;
                zel.g gVar2 = this.f238788b;
                if (gVar2 != gVar) {
                    return f.a(update, gVar2, null, 2);
                }
                int i = m.f238789a[update.f238781b.ordinal()];
                if (i == 1) {
                    iVar = zel.i.DESC;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = zel.i.ASC;
                }
                return f.a(update, null, iVar, 1);
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                soh.e eVar = (soh.e) d0.d0(it8);
                if (eVar != null) {
                    return eVar;
                }
                throw new IllegalStateException("No filter definition for " + this.f238788b);
        }
    }

    public /* synthetic */ l(zel.g gVar, n nVar) {
        this.f238788b = gVar;
    }
}
