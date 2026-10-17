package mx0;

import android.net.Uri;
import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h4 implements oo0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f209729a;

    public h4(ChatInputView chatInputView) {
        this.f209729a = chatInputView;
    }

    @Override // oo0.c
    public final void A(Uri uri2, oo0.a status, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(status, "status");
        ChatInputView chatInputView = this.f209729a;
        oo0.g gVar = chatInputView.f58461o0;
        if (Intrinsics.f(uri2, gVar != null ? gVar.d : null)) {
            chatInputView.g0(status);
            if (chatInputView.getWaveformSeekBar().f56866l) {
                return;
            }
            chatInputView.getWaveformSeekBar().setProgress(j2);
            chatInputView.d0(chatInputView.getWaveformSeekBarTimer(), j2);
        }
    }
}
