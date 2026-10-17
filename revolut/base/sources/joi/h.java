package joi;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f177098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f177099c;

    public /* synthetic */ h(m mVar, f fVar, int i) {
        this.f177097a = i;
        this.f177098b = mVar;
        this.f177099c = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f177097a) {
            case 0:
                m mVar = this.f177098b;
                f fVar = mVar.d;
                f fVar2 = this.f177099c;
                if (fVar == fVar2) {
                    int i = k.f177103a[mVar.f.ordinal()];
                    if (i == 1) {
                        mVar.f(fVar2);
                    } else if (i == 2) {
                        mVar.f = i.PRESSED;
                    }
                }
                break;
            default:
                m mVar2 = this.f177098b;
                f fVar3 = mVar2.d;
                f fVar4 = this.f177099c;
                if (fVar3 == fVar4) {
                    fVar4.b();
                    mVar2.b(fVar4);
                }
                break;
        }
        return Unit.f186387a;
    }
}
