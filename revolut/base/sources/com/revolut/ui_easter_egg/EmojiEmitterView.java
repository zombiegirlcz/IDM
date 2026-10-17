package com.revolut.ui_easter_egg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jq0.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import tim.c;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/revolut/ui_easter_egg/EmojiEmitterView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/ui_easter_egg/EmojiEmitterView$b;", "emojiSet", "", "setEmojiSet", "(Lcom/revolut/ui_easter_egg/EmojiEmitterView$b;)V", "", "g", "Lkotlin/Lazy;", "getYOffset", "()F", "yOffset", "Companion", "vwl/a", "b", "a", "ui_easter_egg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmojiEmitterView extends View {

    @NotNull
    private static final a Companion = new a();
    public static final IntRange i = new IntRange(1200, 1800, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final IntRange f107086j = new IntRange(60, SyslogConstants.LOG_CLOCK, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f107087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.Companion f107088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f107089c;
    public final Paint d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Lazy yOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f107091h;

    public static final class a {
        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f107092a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final List f107093b = v.k("💰", "💸");

            private a() {
            }

            @Override // com.revolut.ui_easter_egg.EmojiEmitterView.b
            public final List a() {
                return f107093b;
            }
        }

        private b() {
        }

        public abstract List a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEmitterView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getYOffset() {
        return ((Number) this.yOffset.getValue()).floatValue();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        if (this.f107087a.isEmpty() || (z = this.f) || z) {
            return;
        }
        this.f = true;
        this.e = 0L;
        Choreographer.getInstance().postFrameCallback(this.f107091h);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (vwl.a aVar : this.f107087a) {
            int i2 = aVar.i;
            Paint paint = this.d;
            paint.setAlpha(i2);
            canvas.save();
            canvas.translate(aVar.f292762a, aVar.f292763b);
            canvas.rotate(aVar.e);
            canvas.drawText(aVar.f292765g, BitmapDescriptorFactory.HUE_RED, -getYOffset(), paint);
            canvas.restore();
        }
    }

    public final void setEmojiSet(@NotNull b emojiSet) {
        Intrinsics.checkNotNullParameter(emojiSet, "emojiSet");
        this.f107089c = emojiSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEmitterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEmitterView(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107087a = new ArrayList();
        this.f107088b = c.INSTANCE;
        this.f107089c = b.a.f107092a;
        Paint paint = new Paint(1);
        paint.setTextSize(kli.a.l(context, 32.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        this.d = paint;
        this.yOffset = j.b(new vt3.a(this, 3));
        this.f107091h = new h(this, 4);
    }

    public /* synthetic */ EmojiEmitterView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
