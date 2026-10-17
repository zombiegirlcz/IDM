package q2e;

import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevPoints f241581b;

    public /* synthetic */ f0(int i, RevPoints revPoints) {
        this.f241580a = i;
        this.f241581b = revPoints;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f241580a) {
            case 0:
                return h.a((h) obj2, null, null, null, null, this.f241581b, null, null, false, false, false, false, null, null, null, null, 65519);
            default:
                return v2e.l.a((v2e.l) obj2, null, null, this.f241581b, false, false, false, false, null, null, null, null, 2043);
        }
    }
}
