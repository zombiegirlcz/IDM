package mx0;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardPersonalisationView f210008b;

    public /* synthetic */ t2(CardPersonalisationView cardPersonalisationView, int i) {
        this.f210007a = i;
        this.f210008b = cardPersonalisationView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f210007a;
        CardPersonalisationView cardPersonalisationView = this.f210008b;
        switch (i) {
            case 0:
                return CardPersonalisationView.h0(cardPersonalisationView, (Boolean) obj2);
            case 1:
                return CardPersonalisationView.i0(cardPersonalisationView, (Boolean) obj2);
            case 2:
                return CardPersonalisationView.m0(cardPersonalisationView, (Integer) obj2);
            case 3:
                CardPersonalisationView.Companion companion = CardPersonalisationView.INSTANCE;
                cardPersonalisationView.A0(((IconSelectorDelegate.SelectableIconModel) obj2).f52499a);
                return Unit.f186387a;
            case 4:
                return CardPersonalisationView.j0(cardPersonalisationView, (Float) obj2);
            case 5:
                CardPersonalisationView.Companion companion2 = CardPersonalisationView.INSTANCE;
                cardPersonalisationView.A0(((CircleActionButtonsBarDelegate.CircleActionButton) obj2).f52088a);
                return Unit.f186387a;
            case 6:
                return CardPersonalisationView.l0(cardPersonalisationView);
            default:
                return CardPersonalisationView.n0(cardPersonalisationView);
        }
    }
}
