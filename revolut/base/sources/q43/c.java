package q43;

import com.google.android.material.appbar.AppBarLayout;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectorScreen f242007b;

    public /* synthetic */ c(SelectorScreen selectorScreen, int i) {
        this.f242006a = i;
        this.f242007b = selectorScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f242006a;
        SelectorScreen selectorScreen = this.f242007b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                selectorScreen.h3().f1189c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) selectorScreen.l0);
                break;
            default:
                KProperty[] kPropertyArr2 = SelectorScreen.f65290n0;
                selectorScreen.h3().e.setVisibility(8);
                selectorScreen.h3().f.setVisibility(8);
                selectorScreen.h3().f1189c.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) selectorScreen.l0);
                break;
        }
    }
}
