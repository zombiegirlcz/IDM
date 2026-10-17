package bx0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.stories.StoryPagesView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends koi.b {
    public final StoryPagesView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (StoryPagesView) itemView;
        this.f19471g = -1;
        this.f19472h = -1;
    }

    public final void F(int i, int i2) {
        if (this.f19471g == i && this.f19472h == i2) {
            return;
        }
        this.f19471g = i;
        this.f19472h = i2;
        this.f.p0(i, i2);
    }
}
