package w7b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c f295508b;

    public /* synthetic */ o(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar, int i) {
        this.f295507a = i;
        this.f295508b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f295507a) {
            case 0:
                this.f295508b.C2(a.f.f82626a);
                break;
            case 1:
                this.f295508b.C2(new a.b(null));
                break;
            default:
                this.f295508b.C2(a.c.f82623a);
                break;
        }
        return Unit.f186387a;
    }
}
