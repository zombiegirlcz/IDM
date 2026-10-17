package wv0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.revolut.core.ui_kit.keyboard.ui.R$id;
import com.revolut.core.ui_kit.keyboard.ui.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kp0.l;
import org.jetbrains.annotations.NotNull;
import sgm.j1;
import wsg.k;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends wv0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputConnection f300255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f300256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f300257c;
    public final ViewGroup d;
    public final Button e;
    public boolean f;

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f300258a;

        public b() {
            this(true);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f300258a == ((b) obj2).f300258a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f300258a);
        }

        public b(boolean z) {
            this.f300258a = z;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setCircleOutline(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new kx0.a());
    }

    private final void setShowDecimalSeparator(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        int i = z ? 0 : 4;
        Button button = this.e;
        button.setVisibility(i);
        button.setClickable(z);
    }

    public final InputConnection getCurrentInputConnection() {
        return this.f300255a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f300256b.removeCallbacks(this.f300257c);
        this.f300255a = null;
    }

    public final void setCurrentInputConnection(InputConnection inputConnection) {
        this.f300255a = inputConnection;
    }

    @Override // wv0.a
    public void setInputConnection(InputConnection inputConnection) {
        if (Intrinsics.f(this.f300255a, inputConnection)) {
            return;
        }
        this.f300255a = inputConnection;
    }

    public final void setModel(@NotNull b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setShowDecimalSeparator(model.f300258a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f300256b = new Handler(Looper.getMainLooper());
        this.f300257c = new j1(this, 9);
        this.f = true;
        View.inflate(context, R$layout.internal_numeric_keyboard_view, this);
        View viewFindViewById = findViewById(R$id.internalNumericKeyboardView_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.d = viewGroup;
        View viewFindViewById2 = findViewById(R$id.internalNumericKeyboardView_buttonBackspace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = findViewById(R$id.internalNumericKeyboardView_dot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.e = (Button) viewFindViewById3;
        viewGroup.setClickable(true);
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            setCircleOutline(view);
            if (view instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) view;
                if (imageButton.getId() == R$id.internalNumericKeyboardView_buttonBackspace) {
                    f.e(jh.d.f(context).Q(), new ResourceImage(R$drawable.uikit_icn_24_arrow_backspace, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), (ImageView) view, null, null, 12);
                    view.setOnTouchListener(new ar0.a(imageButton, this, 9));
                }
            }
            if (view instanceof Button) {
                Button button = (Button) view;
                if (button.getId() == R$id.internalNumericKeyboardView_dot) {
                    button.setText(String.valueOf(oc.c.k(jh.d.d(context))));
                }
                view.setOnClickListener(new l(this, button, 26));
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new k(this, 12));
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
