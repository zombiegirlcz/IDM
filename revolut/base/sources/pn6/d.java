package pn6;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.screens.accounts_to_link.AccountsToLinkScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pig.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputChecklistDelegate.Model item = (InputChecklistDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = AccountsToLinkScreen.R;
        l lVar = (l) hVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        lVar.H2(lVar.f237677s, new y(item.f52519a, 6));
        return Unit.f186387a;
    }
}
