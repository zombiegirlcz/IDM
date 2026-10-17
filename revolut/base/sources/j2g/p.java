package j2g;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f170882b;

    public /* synthetic */ p(y yVar, int i) {
        this.f170881a = i;
        this.f170882b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f170881a) {
            case 0:
                y yVar = this.f170882b;
                yVar.H2(yVar.f170892x, new j1.e(14));
                break;
            default:
                o3g.g gVar = (o3g.g) obj2;
                y yVar2 = this.f170882b;
                yVar2.H2(yVar2.f170892x, new q(gVar, 0));
                yVar2.C2(new i(gVar.f221810a));
                break;
        }
        return Unit.f186387a;
    }
}
