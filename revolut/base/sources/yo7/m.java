package yo7;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yo7.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f315623b;

    public /* synthetic */ m(s sVar, int i) {
        this.f315622a = i;
        this.f315623b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f315622a) {
            case 0:
                s sVar = this.f315623b;
                sVar.f315635s = false;
                sVar.u2();
                break;
            default:
                this.f315623b.v2(i.a.f315617a);
                break;
        }
        return Unit.f186387a;
    }
}
