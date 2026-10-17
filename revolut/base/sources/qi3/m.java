package qi3;

import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.retail.core.navigation.FinishCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f246648b;

    public /* synthetic */ m(n nVar, int i) {
        this.f246647a = i;
        this.f246648b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f246647a) {
            case 0:
                this.f246648b.f246650b.onNext(new FinishCommand(-1, q0.c(new Pair("DATA", (ChooserScreenContract$Model) obj2)), null, 4));
                break;
            default:
                this.f246648b.f246650b.onNext(new FinishCommand(-1, q0.c(new Pair("DATA", (List) obj2)), null, 4));
                break;
        }
        return Unit.f186387a;
    }
}
