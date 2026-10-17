package gzl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatEditText;
import au0.m4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class c extends AppCompatEditText implements yz0.a {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnFocusChangeListener f148162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnTouchListener f148163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f148164c;
    public final ArrayList d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // yz0.a
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d.add(listener);
    }

    @Override // yz0.a
    public final void b(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d.remove(listener);
    }

    public int d(Drawable drawable, MotionEvent event) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(event, "event");
        return 0;
    }

    public final void e(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(listener);
        requestFocus();
        a(listener);
    }

    @Override // android.view.View
    @yhm.d
    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        View.OnFocusChangeListener onFocusChangeListener2 = this.f148162a;
        if (onFocusChangeListener2 != null) {
            b(onFocusChangeListener2);
        }
        this.f148162a = onFocusChangeListener;
        if (onFocusChangeListener != null) {
            a(onFocusChangeListener);
        }
    }

    @Override // android.view.View
    @yhm.d
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f148163b = onTouchListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b(this, 0);
        m4 m4Var = new m4(this, 3);
        this.f148164c = new ArrayList();
        this.d = new ArrayList();
        super.setOnTouchListener(bVar);
        super.setOnFocusChangeListener(m4Var);
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.editTextStyle);
    }
}
