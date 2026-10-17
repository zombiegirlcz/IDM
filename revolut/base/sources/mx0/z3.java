package mx0;

import android.net.Uri;
import android.view.View;
import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f210137b;

    public /* synthetic */ z3(ChatInputView chatInputView, int i) {
        this.f210136a = i;
        this.f210137b = chatInputView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f210136a;
        ChatInputView chatInputView = this.f210137b;
        switch (i) {
            case 0:
                oo0.g gVar = chatInputView.f58461o0;
                Uri uri2 = gVar != null ? gVar.d : null;
                oo0.d dVar = chatInputView.f58460n0;
                if (uri2 == null || dVar == null) {
                    return;
                }
                oo0.k kVar = (oo0.k) dVar;
                oo0.b bVarD = kVar.d(uri2);
                int i2 = f4.e[bVarD.f226971a.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        kVar.c().pause();
                        kVar.j();
                        return;
                    } else {
                        if (i2 != 3 && i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        long j2 = bVarD.f226972b;
                        long j3 = bVarD.f226973c;
                        if (j2 >= j3 && j3 > 0) {
                            kVar.h(uri2, 0L);
                        }
                        kVar.f(uri2);
                        return;
                    }
                }
                return;
            case 1:
                int i3 = ChatInputView.I0;
                chatInputView.Z(d4.CANCELLED, false);
                oo0.g gVar2 = chatInputView.f58461o0;
                if (gVar2 != null) {
                    urg.a aVar = chatInputView.m0;
                    if (aVar == null) {
                        Intrinsics.r("recordAudioViewModel");
                        throw null;
                    }
                    aVar.c3(gVar2);
                }
                chatInputView.f58461o0 = null;
                ihm.b bVar = chatInputView.f58450d0;
                od0.i.Companion.getClass();
                bVar.onNext(od0.i.f224256b);
                return;
            case 2:
                chatInputView.K.onNext(Unit.f186387a);
                return;
            case 3:
                int i5 = f4.f209696b[chatInputView.f58448b0.ordinal()];
                if (i5 == 2 || i5 == 4) {
                    chatInputView.Z(d4.IDLE, true);
                    chatInputView.c0();
                    return;
                }
                return;
            case 4:
                ChatInputView.m(chatInputView);
                return;
            case 5:
                int i6 = ChatInputView.I0;
                chatInputView.performHapticFeedback(1);
                urg.a aVar2 = chatInputView.m0;
                if (aVar2 != null) {
                    aVar2.i3();
                    return;
                } else {
                    Intrinsics.r("recordAudioViewModel");
                    throw null;
                }
            default:
                if (chatInputView.g0) {
                    e4 e4Var = (e4) chatInputView.S.f();
                    int i21 = e4Var == null ? -1 : f4.f209695a[e4Var.ordinal()];
                    if (i21 == 1) {
                        ChatInputView.setState$default(chatInputView, e4.TEXT_AND_START_BUTTON_ACTIVATED, false, 2, null);
                    } else if (i21 == 2) {
                        ChatInputView.setState$default(chatInputView, e4.TEXT_AND_START_BUTTON, false, 2, null);
                    }
                }
                chatInputView.L.onNext(Unit.f186387a);
                return;
        }
    }
}
