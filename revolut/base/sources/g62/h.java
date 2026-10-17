package g62;

import aii.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f140822b;

    public /* synthetic */ h(l lVar, int i) {
        this.f140821a = i;
        this.f140822b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140821a) {
            case 0:
                q it8 = (q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f140822b.C2(q.f5292a);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                l lVar = this.f140822b;
                lVar.l2(new a2g.q(23, null, lVar, zBooleanValue), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
