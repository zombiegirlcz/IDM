package drg;

import com.revolut.data.model.Data;
import do2.o;
import do8.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f117130b;

    public /* synthetic */ k(l lVar, int i) {
        this.f117129a = i;
        this.f117130b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f117129a) {
            case 0:
                List ids = (List) obj2;
                Intrinsics.checkNotNullParameter(ids, "ids");
                this.f117130b.x2(new o(ids, 1));
                return Unit.f186387a;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((dqg.e) this.f117130b.u.f315868a).d.f(Unit.f186387a, true);
            default:
                this.f117130b.x2(new t((Data) obj2, 4));
                return Unit.f186387a;
        }
    }
}
