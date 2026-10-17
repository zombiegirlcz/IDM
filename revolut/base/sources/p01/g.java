package p01;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f231429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f231430c;

    public /* synthetic */ g(h hVar, int i, int i2) {
        this.f231428a = i2;
        this.f231429b = hVar;
        this.f231430c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f231428a;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                this.f231429b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f231430c | 1));
                break;
            default:
                k.a(this.f231429b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f231430c | 1));
                break;
        }
        return Unit.f186387a;
    }
}
