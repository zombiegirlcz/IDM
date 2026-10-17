package po9;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyLoadingDelegate;
import com.revolut.core.ui_kit.delegates.l3;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f237919b;

    public /* synthetic */ l(com.revolut.feature.payments.air.widget.impl.ui.chat.a aVar, t tVar) {
        this.f237918a = 1;
        this.f237919b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237918a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                String str = this.f237919b.f237934a;
                gw0.i iVar = new gw0.i(gw0.t.SINGLE);
                ChatBubbleDelegate.c.a aVar = ChatBubbleDelegate.c.a.f53833a;
                int i = R$attr.uikit_dp0;
                return new ChatSmartTileSendMoneyLoadingDelegate.Model(str, iVar, aVar, null, null, i, i);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return com.revolut.feature.payments.air.widget.impl.ui.chat.a.a(this.f237919b.f237934a, new l3(1), null);
            default:
                return this.f237919b;
        }
    }

    public /* synthetic */ l(t tVar, int i) {
        this.f237918a = i;
        this.f237919b = tVar;
    }
}
