package ap0;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends dq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatPromptView f8021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChatPromptView view) {
        super(WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f8021a = view;
    }

    @Override // dq0.b
    public final void a() {
        ChatPromptView chatPromptView = this.f8021a;
        chatPromptView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        chatPromptView.setImeTranslation(BitmapDescriptorFactory.HUE_RED);
        chatPromptView.f51539j = false;
    }

    @Override // dq0.b
    public final void c(Insets diff, float f) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        int i = diff.top - diff.bottom;
        float f4 = diff.left - diff.right;
        ChatPromptView chatPromptView = this.f8021a;
        chatPromptView.setTranslationX(f4);
        chatPromptView.setImeTranslation(i);
        chatPromptView.setImeVisibilityFraction(AnimationUtils.lerp(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0.9f, f));
    }

    @Override // dq0.b
    public final void d() {
        ChatPromptView chatPromptView = this.f8021a;
        chatPromptView.f51539j = true;
        if (chatPromptView.getV3Mode()) {
            chatPromptView.f51544q.e();
        }
    }
}
