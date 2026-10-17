package k50;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z1 implements mx0.r3, View.OnLayoutChangeListener, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Space f181303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatInputLayoutView f181304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f181305c;
    public final ChatPromptView d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f181306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181307h;

    public z1(MessagesScreen messagesScreen, Space fabAnchor, ChatInputLayoutView inputLayout, FrameLayout bottomContainer, ChatPromptView promptView) {
        Intrinsics.checkNotNullParameter(fabAnchor, "fabAnchor");
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        Intrinsics.checkNotNullParameter(bottomContainer, "bottomContainer");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        this.f181307h = messagesScreen;
        this.f181303a = fabAnchor;
        this.f181304b = inputLayout;
        this.f181305c = bottomContainer;
        this.d = promptView;
    }

    @Override // mx0.r3
    public final void a(int i, int i2) {
        boolean z;
        boolean z3 = true;
        if (i != this.e) {
            this.e = i;
            MessagesScreen.Companion aVar = MessagesScreen.INSTANCE;
            MessagesScreen messagesScreen = this.f181307h;
            ScreenContentRecyclerView recyclerView = messagesScreen.f3().f1528l;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            boolean z4 = !recyclerView.canScrollVertically(1);
            goi.h hVar = messagesScreen.A0;
            if (hVar == null) {
                Intrinsics.r("actionsPaddingController");
                throw null;
            }
            hVar.d = i;
            if (!hVar.f145169b) {
                hVar.a(i, z4);
            }
            z = true;
        } else {
            z = false;
        }
        if (i2 != this.f) {
            this.f = i2;
            b();
        } else {
            z3 = z;
        }
        if (z3) {
            this.d.setBottomOffset(this.e + this.f);
            c();
        }
    }

    public final void b() {
        int iK;
        int visibility = this.f181304b.getVisibility();
        MessagesScreen messagesScreen = this.f181307h;
        if (visibility == 0) {
            iK = this.f;
        } else {
            FrameLayout frameLayout = this.f181305c;
            if (frameLayout.getVisibility() == 0) {
                iK = frameLayout.getHeight();
            } else {
                int i = this.f181306g;
                Context context = messagesScreen.D2().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = i + kli.a.k(context, 24.0f);
            }
        }
        goi.h hVar = messagesScreen.z0;
        if (hVar == null) {
            Intrinsics.r("bottomPaddingController");
            throw null;
        }
        hVar.d = iK;
        if (hVar.f145169b) {
            return;
        }
        hVar.a(iK, true);
    }

    public final void c() {
        Space space = this.f181303a;
        if (space.getVisibility() == 0) {
            space.setTranslationY(this.f181304b.getVisibility() == 0 ? (r1.getHeight() - this.e) - this.f : this.f181305c.getVisibility() == 0 ? 0 : -this.f181306g);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(insets, "<this>");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.bottom;
        this.f181306g = i;
        FrameLayout frameLayout = this.f181305c;
        int childCount = frameLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = frameLayout.getChildAt(i2);
            childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i);
        }
        return insets;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        int id10;
        Intrinsics.checkNotNullParameter(v, "v");
        Space space = this.f181303a;
        int visibility = space.getVisibility();
        ChatInputLayoutView chatInputLayoutView = this.f181304b;
        if (visibility == 0) {
            if (chatInputLayoutView.getVisibility() == 0) {
                id10 = chatInputLayoutView.getId();
            } else {
                FrameLayout frameLayout = this.f181305c;
                id10 = frameLayout.getVisibility() == 0 ? frameLayout.getId() : chatInputLayoutView.getId();
            }
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            if (id10 != layoutParams2.getAnchorId()) {
                layoutParams2.setAnchorId(id10);
            }
        }
        if (chatInputLayoutView.getVisibility() != 0) {
            b();
        }
        c();
        this.d.setBottomOffset(this.e + this.f);
    }
}
