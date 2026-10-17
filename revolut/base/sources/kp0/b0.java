package kp0;

import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatMessageActionsPanelDelegate f187971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatMessageActionsPanelDelegate.Model f187972c;

    public /* synthetic */ b0(ChatMessageActionsPanelDelegate chatMessageActionsPanelDelegate, ChatMessageActionsPanelDelegate.Model model, int i) {
        this.f187970a = i;
        this.f187971b = chatMessageActionsPanelDelegate;
        this.f187972c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f187970a) {
            case 0:
                com.revolut.core.ui_kit.delegates.chat.h model = (com.revolut.core.ui_kit.delegates.chat.h) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                ihm.f fVar = this.f187971b.f53852c;
                ChatMessageActionsPanelDelegate.Model model2 = this.f187972c;
                fVar.onNext(new d0(model2.f53853a, model.f53971b, model2.d, false));
                break;
            default:
                com.revolut.core.ui_kit.delegates.chat.i model3 = (com.revolut.core.ui_kit.delegates.chat.i) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                boolean z = !model3.e;
                ihm.f fVar2 = this.f187971b.f53852c;
                ChatMessageActionsPanelDelegate.Model model4 = this.f187972c;
                fVar2.onNext(new d0(model4.f53853a, model3.f53974b, model4.d, z));
                break;
        }
        return Unit.f186387a;
    }
}
