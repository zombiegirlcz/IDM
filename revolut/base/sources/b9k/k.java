package b9k;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ skm.l f13828b;

    public /* synthetic */ k(skm.l lVar, int i) {
        this.f13827a = i;
        this.f13828b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13827a;
        skm.l lVar = this.f13828b;
        switch (i) {
            case 0:
                if (lVar.d()) {
                    m.Companion companion = yhm.m.INSTANCE;
                    lVar.resumeWith(Boolean.FALSE);
                }
                break;
            case 1:
                if (lVar.d()) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    lVar.resumeWith(Unit.f186387a);
                }
                break;
            case 2:
                if (lVar.d()) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    lVar.resumeWith(bsf.g.f18201a);
                }
                break;
            case 3:
                t1.H(lVar, Boolean.FALSE);
                break;
            case 4:
                t1.H(lVar, Boolean.FALSE);
                break;
            default:
                if (lVar.d()) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    lVar.resumeWith(yhm.o.a(new RuntimeException("Unable to load image")));
                }
                break;
        }
        return Unit.f186387a;
    }
}
