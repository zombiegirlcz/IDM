package kp0;

import android.net.Uri;
import android.view.View;
import com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatVoiceMessageBubbleDelegate f188014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatVoiceMessageBubbleDelegate.Model f188015c;

    public /* synthetic */ h1(ChatVoiceMessageBubbleDelegate chatVoiceMessageBubbleDelegate, ChatVoiceMessageBubbleDelegate.Model model, int i) {
        this.f188013a = i;
        this.f188014b = chatVoiceMessageBubbleDelegate;
        this.f188015c = model;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f188013a) {
            case 0:
                Intrinsics.h(view);
                oo0.d dVar = this.f188014b.k;
                ChatVoiceMessageBubbleDelegate.Model model = this.f188015c;
                Uri uri2 = model.e;
                Uri uri3 = model.e;
                oo0.b bVarD = ((oo0.k) dVar).d(uri2);
                int i = g1.f188009a[bVarD.f226971a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        oo0.k kVar = (oo0.k) dVar;
                        kVar.c().pause();
                        kVar.j();
                        return;
                    } else {
                        if (i != 3 && i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (bVarD.f226972b >= kotlin.time.b.f(model.f53931c)) {
                            ((oo0.k) dVar).h(uri3, 0L);
                        }
                        ((oo0.k) dVar).f(uri3);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.h(view);
                this.f188014b.f53928m.onNext(this.f188015c);
                return;
        }
    }
}
