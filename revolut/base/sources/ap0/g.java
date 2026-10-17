package ap0;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends koi.b {
    public final AppCompatImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f8029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8030h;
    public ChatPromptSuggestion i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinearLayout itemView, AppCompatImageView iconView, UIKitTextView textView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = iconView;
        this.f8029g = textView;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        fp0.m.a(itemView, gVar);
    }
}
