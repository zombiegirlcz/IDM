package et0;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleButtonModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f129031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmallActionButton f129032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallActionButton f129033c;
    public final int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(SmallActionButton smallActionButton, ChatBubbleButtonModel chatBubbleButtonModel, View.OnClickListener onClickListener) {
        smallActionButton.setVisibility(chatBubbleButtonModel != null ? 0 : 8);
        smallActionButton.setOnClickListener(onClickListener);
        if (chatBubbleButtonModel != null) {
            smallActionButton.setText(chatBubbleButtonModel.f56790a);
            smallActionButton.setIcon(chatBubbleButtonModel.f56792c);
            smallActionButton.i(chatBubbleButtonModel.f56791b);
        }
        b();
    }

    public final void b() {
        int i;
        int i2;
        if (this.f129033c.getVisibility() == 0) {
            int orientation = getOrientation();
            int i3 = this.d;
            SmallActionButton smallActionButton = this.f129032b;
            if (orientation == 0) {
                if (smallActionButton.getVisibility() != 0) {
                    i3 = 0;
                }
                i2 = i3;
                i = 0;
            } else {
                if (smallActionButton.getVisibility() != 0) {
                    i3 = 0;
                }
                i = i3;
                i2 = 0;
            }
            or0.u.z(this.f129033c, i2, i, 0, 0, false, 28);
        }
    }

    public final void c() {
        boolean z = this.f129032b.getVisibility() == 0 || this.f129033c.getVisibility() == 0;
        if (z == (getVisibility() == 0)) {
            return;
        }
        if (!z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setImportantForAccessibility(4);
    }

    public final Parcelable getAnalyticsContext() {
        return this.f129031a;
    }

    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f129032b.setAnalyticsContext(parcelable);
        this.f129033c.setAnalyticsContext(parcelable);
        this.f129031a = parcelable;
    }

    public final void setButtonOrientation(@NotNull gw0.a buttonOrientation) {
        int i;
        Intrinsics.checkNotNullParameter(buttonOrientation, "buttonOrientation");
        int i2 = g.f129027a[buttonOrientation.ordinal()];
        int i3 = 0;
        int i5 = 1;
        if (i2 == 1) {
            i = -2;
            i5 = 0;
            i3 = -2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        getLayoutParams().width = i3;
        setOrientation(i5);
        or0.u.B(i, this.f129032b);
        or0.u.B(i, this.f129033c);
        b();
    }

    public final void setPrimaryButton(ChatBubbleButtonModel chatBubbleButtonModel, View.OnClickListener onClickListener) {
        a(this.f129032b, chatBubbleButtonModel, onClickListener);
        c();
    }

    public final void setSecondaryButton(ChatBubbleButtonModel chatBubbleButtonModel, View.OnClickListener onClickListener) {
        a(this.f129033c, chatBubbleButtonModel, onClickListener);
        c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = kli.a.k(context, 8.0f);
        setVisibility(8);
        SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
        smallActionButton.setId(R$id.chatBubble_primaryButton);
        smallActionButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        smallActionButton.setVisibility(8);
        this.f129032b = smallActionButton;
        SmallActionButton smallActionButton2 = new SmallActionButton(context, null, 6, 0);
        smallActionButton2.setId(R$id.chatBubble_secondaryButton);
        smallActionButton2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        smallActionButton2.setVisibility(8);
        this.f129033c = smallActionButton2;
        addView(smallActionButton);
        addView(smallActionButton2);
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
