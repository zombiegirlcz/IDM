package com.revolut.ui_kit_artboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import eyl.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000f\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/revolut/ui_kit_artboard/PlainLabelView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Leyl/a;", "model", "", "setModel", "(Leyl/a;)V", "eyl/b", "ui_kit_artboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlainLabelView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f107136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f107137b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlainLabelView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(eyl.a r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            eyl.a r2 = r0.f107137b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r1)
            if (r2 == 0) goto Le
            goto Lba
        Le:
            eyl.a r2 = r0.f107137b
            r0.f107137b = r1
            r3 = 0
            com.revolut.core.ui_kit.internal.views.UIKitTextView r4 = r0.f107136a
            if (r1 != 0) goto L20
            r4.setText(r3)
            r1 = 8
            r0.setVisibility(r1)
            return
        L20:
            java.lang.Object r5 = r1.f130874a
            boolean r6 = r1.f
            int r7 = r1.e
            int r8 = r1.f130876c
            eyl.b r9 = r1.f130875b
            int r1 = r1.d
            r10 = 0
            if (r2 != 0) goto L32
            r0.setVisibility(r10)
        L32:
            r11 = 1
            if (r2 == 0) goto L3c
            eyl.b r12 = r2.f130875b
            if (r12 == r9) goto L3a
            goto L3c
        L3a:
            r12 = r10
            goto L3d
        L3c:
            r12 = r11
        L3d:
            if (r2 == 0) goto L46
            int r13 = r2.f130876c
            if (r13 == r8) goto L44
            goto L46
        L44:
            r13 = r10
            goto L47
        L46:
            r13 = r11
        L47:
            if (r2 == 0) goto L50
            int r14 = r2.d
            if (r14 == r1) goto L4e
            goto L50
        L4e:
            r14 = r10
            goto L51
        L50:
            r14 = r11
        L51:
            if (r2 == 0) goto L5a
            int r15 = r2.e
            if (r15 == r7) goto L58
            goto L5a
        L58:
            r15 = r10
            goto L5b
        L5a:
            r15 = r11
        L5b:
            if (r2 == 0) goto L64
            boolean r3 = r2.f
            if (r3 == r6) goto L62
            goto L64
        L62:
            r3 = r10
            goto L65
        L64:
            r3 = r11
        L65:
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r2.f130874a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r5)
            if (r2 != 0) goto L70
        L6f:
            r10 = r11
        L70:
            if (r12 == 0) goto L79
            int r2 = r9.a()
            jb3.l.e(r4, r2)
        L79:
            if (r13 == 0) goto L8b
            android.content.Context r2 = r0.getContext()
            java.lang.String r9 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            int r2 = kli.a.s(r8, r2)
            r4.setTextColor(r2)
        L8b:
            if (r14 == 0) goto La5
            r4.setTextAlignment(r1)
            r2 = 3
            if (r1 == r2) goto L9d
            r2 = 4
            if (r1 == r2) goto La0
            r2 = 6
            if (r1 == r2) goto L9d
            r11 = 8388611(0x800003, float:1.1754948E-38)
            goto La0
        L9d:
            r11 = 8388613(0x800005, float:1.175495E-38)
        La0:
            r1 = r11 | 48
            r4.setGravity(r1)
        La5:
            if (r15 == 0) goto Laa
            r4.setMaxLines(r7)
        Laa:
            if (r3 == 0) goto Lb5
            if (r6 == 0) goto Lb1
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            goto Lb2
        Lb1:
            r3 = 0
        Lb2:
            r4.setEllipsize(r3)
        Lb5:
            if (r10 == 0) goto Lba
            kli.a.c(r4, r5)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.ui_kit_artboard.PlainLabelView.setModel(eyl.a):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlainLabelView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainLabelView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(uIKitTextView);
        this.f107136a = uIKitTextView;
    }

    public /* synthetic */ PlainLabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
