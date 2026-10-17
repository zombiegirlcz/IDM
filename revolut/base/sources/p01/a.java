package p01;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f231405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f231406c;

    public /* synthetic */ a(b bVar, int i, int i2) {
        this.f231404a = i2;
        this.f231405b = bVar;
        this.f231406c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f231404a;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                this.f231405b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f231406c | 1));
                break;
            default:
                f.a(this.f231405b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f231406c | 1));
                break;
        }
        return Unit.f186387a;
    }
}
