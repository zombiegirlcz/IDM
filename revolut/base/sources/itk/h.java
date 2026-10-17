package itk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f168423b;

    public /* synthetic */ h(i iVar, int i) {
        this.f168422a = i;
        this.f168423b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f168422a) {
            case 0:
                this.f168423b.f168425b.b3();
                break;
            default:
                b bVar = (b) obj2;
                this.f168423b.f168425b.Z2(bVar.f168414a, bVar.f168415b);
                break;
        }
        return Unit.f186387a;
    }
}
