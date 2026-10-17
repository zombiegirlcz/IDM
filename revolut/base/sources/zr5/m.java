package zr5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.CryptoTokensChatWidgetParcel$SeeAll;
import com.revolut.feature.crypto_feed.impl.chat_widgets.crypto_tokens.list.CryptoTokensListDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f324599a;

    public m(n nVar) {
        this.f324599a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        r rVar = this.f324599a.f324600a;
        if (!Intrinsics.f(str, rVar.c3().f310974a)) {
            return Unit.f186387a;
        }
        if (((LargeActionButtonDelegate.Model) i3Var.f54274b).i instanceof CryptoTokensChatWidgetParcel$SeeAll) {
            j jVar = (j) rVar.c3().f310975b;
            String str2 = jVar.f324593a;
            String str3 = jVar.f324594b;
            List list = jVar.f324595c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                i iVar = (i) list.get(i);
                String str4 = iVar.f324590a;
                String str5 = iVar.f324591b;
                f fVar = iVar.f324592c;
                arrayList.add(new CryptoTokensListDestination.InputData.Item(str4, str5, new CryptoTokensListDestination.InputData.Price(fVar.f324587a, fVar.f324588b), iVar.d));
            }
            rVar.A2(new CryptoTokensListDestination(new CryptoTokensListDestination.InputData(str2, str3, arrayList)));
        }
        return Unit.f186387a;
    }
}
