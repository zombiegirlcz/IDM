package a83;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a f2037b;

    public /* synthetic */ b0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, int i) {
        this.f2036a = i;
        this.f2037b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2036a) {
            case 0:
                this.f2037b.C2(p.f2075a);
                return Unit.f186387a;
            default:
                return Boolean.valueOf(((jte.d) this.f2037b.K).c(CardsCoreApi$Toggles.PhysicalCardReissue.f65567c));
        }
    }
}
