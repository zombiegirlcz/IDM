package oy0;

import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.revolut.core.ui_kit.models.Clause;
import com.youTransactor.uCube.rpc.Constants;
import ix0.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends ExploreByTouchHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f230871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextView textView) {
        super(textView);
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f230871a = textView;
    }

    public final List a(int i, int i2) {
        CharSequence text = this.f230871a.getText();
        if (!(text instanceof Spanned)) {
            return f0.f322471a;
        }
        Object[] spans = ((Spanned) text).getSpans(i, i2, b0.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        return d.v0(spans);
    }

    public final CharSequence b(b0 b0Var) {
        Clause clause = b0Var.e;
        TextView textView = this.f230871a;
        if (clause != null) {
            Context context = textView.getContext();
            Intrinsics.h(context);
            return ty0.c.a(jh.d.f(context).b0(), clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(b0Var), spanned.getSpanEnd(b0Var));
        }
        Intrinsics.h(text);
        return text;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f4) {
        TextView textView = this.f230871a;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return -1;
        }
        int offsetForPosition = textView.getOffsetForPosition(f, f4);
        b0 b0Var = (b0) d0.d0(a(offsetForPosition, offsetForPosition));
        if (b0Var != null) {
            return ((Spanned) text).getSpanStart(b0Var);
        }
        return -1;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        CharSequence text = this.f230871a.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            Iterator it8 = a(0, spanned.length()).iterator();
            while (it8.hasNext()) {
                virtualViewIds.add(Integer.valueOf(spanned.getSpanStart((b0) it8.next())));
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        CharSequence text = this.f230871a.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            List listA = a(0, spanned.length());
            if (listA.size() == 1 && spanned.getSpanStart(d0.b0(listA)) == 0 && spanned.getSpanEnd(d0.b0(listA)) == spanned.length()) {
                info.setClickable(false);
                info.setFocusable(false);
                info.setImportantForAccessibility(false);
                info.setText(null);
                info.setContentDescription(null);
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        b0 b0Var;
        TextView textView;
        CharSequence text;
        if (i2 != 16 || (b0Var = (b0) d0.d0(a(i, i))) == null || (text = (textView = this.f230871a).getText()) == null) {
            return false;
        }
        int i3 = b0.o;
        b0Var.b(1, textView, text, false);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b0 b0Var = (b0) d0.d0(a(i, i));
        if (b0Var != null) {
            event.setContentDescription(b(b0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    @Override // androidx.customview.widget.ExploreByTouchHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPopulateNodeForVirtualView(int r11, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r12) {
        /*
            r10 = this;
            java.lang.String r0 = "accessibilityNodeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r11 = r10.a(r11, r11)
            java.lang.Object r11 = zhm.d0.d0(r11)
            ix0.b0 r11 = (ix0.b0) r11
            if (r11 == 0) goto Lbc
            java.lang.CharSequence r0 = r10.b(r11)
            r12.setContentDescription(r0)
            r0 = 1
            r12.setClickable(r0)
            r12.setFocusable(r0)
            r1 = 16
            r12.addAction(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.widget.TextView r2 = r10.f230871a
            android.text.Layout r3 = r2.getLayout()
            if (r3 == 0) goto L36
            java.lang.CharSequence r4 = r3.getText()
            goto L37
        L36:
            r4 = 0
        L37:
            boolean r5 = r4 instanceof android.text.Spanned
            r6 = 0
            if (r5 != 0) goto L41
            r1.set(r6, r6, r0, r0)
            goto Lb9
        L41:
            android.text.Spanned r4 = (android.text.Spanned) r4
            int r5 = r4.getSpanStart(r11)
            int r11 = r4.getSpanEnd(r11)
            if (r5 < 0) goto Lb6
            int r7 = r4.length()
            if (r5 > r7) goto Lb6
            if (r11 < 0) goto Lb6
            int r4 = r4.length()
            if (r11 <= r4) goto L5c
            goto Lb6
        L5c:
            int r4 = r3.getLineForOffset(r5)
            int r7 = r3.getLineForOffset(r11)
            int r8 = r3.getLineStart(r4)
            int r9 = r3.getLineEnd(r4)
            if (r8 > r5) goto Lb2
            if (r5 > r9) goto Lb2
            int r8 = r3.getLineStart(r7)
            int r9 = r3.getLineEnd(r7)
            if (r8 > r11) goto Lb2
            if (r11 > r9) goto Lb2
            float r0 = r3.getPrimaryHorizontal(r5)
            float r11 = r3.getPrimaryHorizontal(r11)
            r3.getLineBounds(r4, r1)
            if (r4 != r7) goto L98
            float r3 = java.lang.Math.min(r0, r11)
            int r3 = (int) r3
            r1.left = r3
            float r11 = java.lang.Math.max(r0, r11)
            int r11 = (int) r11
            r1.right = r11
            goto La6
        L98:
            int r11 = r3.getParagraphDirection(r4)
            r3 = -1
            if (r11 != r3) goto La3
            int r11 = (int) r0
            r1.right = r11
            goto La6
        La3:
            int r11 = (int) r0
            r1.left = r11
        La6:
            int r11 = r2.getTotalPaddingLeft()
            int r0 = r2.getTotalPaddingTop()
            r1.offset(r11, r0)
            goto Lb9
        Lb2:
            r1.set(r6, r6, r0, r0)
            goto Lb9
        Lb6:
            r1.set(r6, r6, r0, r0)
        Lb9:
            r12.setBoundsInParent(r1)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oy0.c.onPopulateNodeForVirtualView(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
