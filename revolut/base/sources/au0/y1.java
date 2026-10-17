package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.internal.views.chat.ChatPaymentView;
import com.revolut.core.ui_kit.internal.views.navbar.ImageAutoSizeTextView;
import com.revolut.core.ui_kit.views.SingleLineAutoSizeTextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9439b;

    public /* synthetic */ y1(int i, Function1 function1) {
        this.f9438a = i;
        this.f9439b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9438a;
        Function1 function1 = this.f9439b;
        switch (i) {
            case 0:
                ImageAutoSizeTextView.a aVar = ImageAutoSizeTextView.Companion;
                Intrinsics.h(view);
                function1.invoke(view);
                break;
            case 1:
                ChatBubbleView.a aVar2 = ChatBubbleView.Companion;
                function1.invoke(view);
                break;
            case 2:
                ChatBubbleView.a aVar3 = ChatBubbleView.Companion;
                function1.invoke(view);
                break;
            case 3:
                int i2 = ChatPaymentView.H;
                function1.invoke(view);
                break;
            case 4:
                int i3 = ChatPaymentView.H;
                function1.invoke(view);
                break;
            default:
                SingleLineAutoSizeTextView.a aVar4 = SingleLineAutoSizeTextView.Companion;
                Intrinsics.h(view);
                function1.invoke(view);
                break;
        }
    }
}
