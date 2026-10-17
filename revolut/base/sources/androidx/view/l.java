package androidx.view;

import androidx.navigationevent.OnBackCompletedFallback;
import androidx.view.OnBackPressedDispatcher;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class l implements OnBackCompletedFallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f6797a;

    public /* synthetic */ l(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f6797a = onBackPressedDispatcher;
    }

    public final void a() {
        OnBackPressedDispatcher.OnBackPressedEventInput.dispatcher$lambda$0(this.f6797a);
    }
}
