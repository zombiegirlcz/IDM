package kp0;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends com.revolut.core.ui_kit.delegates.chat.a {
    public final ShapeableImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ShapeableImageView f187998p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ChatSwipeToReplyLayout itemView, ShapeableImageView attachmentImage) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(attachmentImage, "attachmentImage");
        this.o = attachmentImage;
        this.f53956m = true;
        H();
        this.f187998p = attachmentImage;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.a
    public final View I() {
        return this.f187998p;
    }
}
