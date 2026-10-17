package fs0;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.Magnifier;
import androidx.appcompat.view.ContextThemeWrapper;
import com.revolut.core.ui_kit.R$style;
import et0.w0;
import et0.y0;
import et0.z0;
import ix0.i2;
import ix0.j2;
import ix0.l2;
import ix0.o2;
import java.text.BreakIterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements l2 {

    @NotNull
    private static final l Companion = new l();
    public final Rect A;
    public int B;
    public Rect C;
    public o2 D;
    public final f E;
    public final f F;
    public final int[] G;
    public boolean H;
    public List I;
    public Function3 J;
    public final k K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f137536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.c f137537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w0 f137538c;
    public ActionMode d;
    public j2 e;
    public h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f137539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f137540h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f137541j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f137542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f137543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f137544n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f137545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f137546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Path f137547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f137548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BreakIterator f137549t;
    public Drawable u;
    public Drawable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Magnifier f137550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f137551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f137552y;
    public final int[] z;

    public p(z0 host, ty0.c clauseDisplayer) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f137536a = host;
        this.f137537b = clauseDisplayer;
        this.f137539g = n.IDLE;
        this.f137540h = m.NONE;
        this.k = -1;
        this.f137542l = -1;
        this.o = ViewConfiguration.get(host.getView().getContext()).getScaledTouchSlop();
        Context context = host.getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f137545p = kli.a.k(context, 32.0f);
        Context context2 = host.getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f137546q = kli.a.l(context2, 40.0f);
        this.f137547r = new Path();
        this.z = new int[2];
        this.A = new Rect();
        this.B = Integer.MIN_VALUE;
        this.E = new f(0);
        this.F = new f(0);
        this.G = new int[2];
        this.I = f0.f322471a;
        int iS = kli.a.s(R.attr.colorControlActivated, new ContextThemeWrapper(host.getView().getContext(), R$style.UiKitThemeOverlay_AccentActivatedControl));
        Paint paint = new Paint(1);
        paint.setColor(io0.a.d(0.3f, iS));
        paint.setStyle(Paint.Style.FILL);
        this.f137548s = paint;
        this.K = new k(this, 0);
    }

    public static void b(p pVar) {
        w0 w0Var;
        z0 z0Var = pVar.f137536a;
        if (pVar.f137539g != n.AWAITING_LONG_PRESS) {
            return;
        }
        if (pVar.j()) {
            pVar.g();
        }
        float f = pVar.i;
        float f4 = pVar.f137541j;
        float paddingTop = z0Var.getPaddingTop();
        int length = z0Var.u.length;
        int i = 0;
        while (true) {
            w0Var = null;
            if (i >= length) {
                break;
            }
            int i2 = z0Var.u[i];
            if (f4 >= paddingTop && f4 < i2 + paddingTop) {
                float paddingStart = z0Var.getPaddingStart();
                int size = z0Var.f129176s.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    int i5 = z0Var.f129177t[i3];
                    if (f < paddingStart || f >= i5 + paddingStart) {
                        paddingStart += i5;
                        i3++;
                    } else {
                        Layout layout = (Layout) kotlin.collections.d.W(i, ((y0) z0Var.f129176s.get(i3)).f129149a);
                        if (layout != null) {
                            CharSequence text = layout.getText();
                            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                            if (spannable != null) {
                                w0Var = new w0(layout, spannable, (int) paddingStart, (int) paddingTop, z0Var.e, (i2 - layout.getHeight()) / 2);
                            }
                        }
                    }
                }
            } else {
                paddingTop += i2;
                i++;
            }
        }
        if (w0Var == null) {
            pVar.f137539g = n.IDLE;
            return;
        }
        pVar.g();
        pVar.f137538c = w0Var;
        l lVar = Companion;
        float f5 = pVar.i;
        float f6 = pVar.f137541j;
        lVar.getClass();
        int iA = l.a(w0Var, f5, f6);
        int[] iArr = pVar.G;
        Spannable spannable2 = w0Var.f129139b;
        int iG = kotlin.ranges.f.g(iA, 0, spannable2.length());
        BreakIterator wordInstance = pVar.f137549t;
        if (wordInstance == null) {
            wordInstance = BreakIterator.getWordInstance(z0Var.getView().getResources().getConfiguration().getLocales().get(0));
            pVar.f137549t = wordInstance;
        }
        wordInstance.setText(new a(spannable2, spannable2.length()));
        int i6 = iG + 1;
        int iMin = Math.min(i6, spannable2.length());
        int iPreceding = iMin > 0 ? wordInstance.preceding(iMin) : -1;
        if (iPreceding == -1) {
            iPreceding = 0;
        }
        int iFollowing = wordInstance.following(iG);
        if (iFollowing == -1) {
            iFollowing = spannable2.length();
        }
        if (iPreceding >= iFollowing) {
            iPreceding = Math.max(0, iG);
            iFollowing = Math.min(spannable2.length(), i6);
        }
        if (iFollowing - iPreceding < 1) {
            iPreceding = Math.max(0, iG);
            iFollowing = Math.min(spannable2.length(), i6);
        }
        iArr[0] = iPreceding;
        iArr[1] = iFollowing;
        int iB = i.b(spannable2, iPreceding);
        int iB2 = i.b(spannable2, iArr[1]);
        pVar.k = Math.min(iB, iB2);
        pVar.f137542l = Math.max(iB, iB2);
        pVar.f137539g = n.SELECTION_ANCHORED;
        h hVar = new h();
        pVar.f = hVar;
        spannable2.setSpan(hVar, 0, spannable2.length(), 18);
        i.a(spannable2);
        c(w0Var, pVar.k, pVar.f137542l);
        ViewParent parent = z0Var.getView().getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (pVar.e == null) {
            i2 i2Var = j2.Companion;
            View view = z0Var.getView();
            k kVar = new k(pVar, 1);
            i2Var.getClass();
            pVar.e = i2.a(view, kVar);
        }
        if (pVar.D == null) {
            o2 o2Var = new o2(z0Var.getView(), pVar);
            o2Var.c();
            pVar.D = o2Var;
        }
        z0Var.getView().postInvalidateOnAnimation();
    }

    public static void c(w0 w0Var, int i, int i2) {
        Spannable spannable = w0Var.f129139b;
        int iG = kotlin.ranges.f.g(i, 0, spannable.length());
        int iG2 = kotlin.ranges.f.g(i2, 0, spannable.length());
        Selection.setSelection(spannable, Math.min(iG, iG2), Math.max(iG, iG2));
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        w0Var.f129141g = selectionStart;
        w0Var.f129142h = selectionEnd;
    }

    public static void n(w0 block, float f, float f4, boolean z) {
        Layout layout = block.f129138a;
        Spannable spannable = block.f129139b;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        float f5 = f - (block.f129140c + block.e);
        Intrinsics.checkNotNullParameter(block, "block");
        int iB = i.b(spannable, layout.getOffsetForHorizontal(layout.getLineForVertical((int) (f4 - (block.d + block.f))), f5));
        if (z) {
            int i = block.f129142h;
            if (iB >= i) {
                iB = Math.min(i.b(spannable, layout.getOffsetForHorizontal(layout.getLineForOffset(i), f5)), block.f129142h - 1);
            }
            c(block, iB, block.f129142h);
            return;
        }
        int i2 = block.f129141g;
        if (iB <= i2) {
            iB = Math.max(i.b(spannable, layout.getOffsetForHorizontal(layout.getLineForOffset(i2), f5)), block.f129141g + 1);
        }
        c(block, block.f129141g, iB);
    }

    @Override // ix0.l2
    public final void a(boolean z) {
        if (z) {
            return;
        }
        e eVar = this.f137551x;
        if (eVar != null) {
            ObjectAnimator objectAnimator = eVar.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            eVar.d = null;
            eVar.b();
        }
        e eVar2 = this.f137552y;
        if (eVar2 != null) {
            ObjectAnimator objectAnimator2 = eVar2.d;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            eVar2.d = null;
            eVar2.b();
        }
        this.f137540h = m.NONE;
        g();
    }

    public final void d(w0 w0Var) {
        int i;
        Layout layout = w0Var.f129138a;
        z0 z0Var = this.f137536a;
        int scrollX = z0Var.getView().getScrollX();
        if (this.f137539g == n.DRAG_EXPANDING) {
            i = w0Var.f129142h;
            if (i <= this.f137542l && (i = w0Var.f129141g) >= this.k) {
                return;
            }
        } else {
            m mVar = this.f137540h;
            if (mVar == m.LEFT) {
                i = w0Var.f129141g;
            } else if (mVar != m.RIGHT) {
                return;
            } else {
                i = w0Var.f129142h;
            }
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        float primaryHorizontal = ((w0Var.f129140c + w0Var.e) + layout.getPrimaryHorizontal(i)) - scrollX;
        float f = w0Var.d + w0Var.f;
        float f4 = 2;
        int i2 = (int) (f + lineBottom);
        Rect rect = this.A;
        rect.set((int) (primaryHorizontal - f4), (int) (lineTop + f), (int) (f4 + primaryHorizontal), i2);
        z0Var.getView().requestRectangleOnScreen(rect, false);
        float paddingStart = z0Var.getView().getPaddingStart();
        float width = z0Var.getView().getWidth() - z0Var.getView().getPaddingEnd();
        float f5 = this.f137545p;
        if (primaryHorizontal < paddingStart + f5) {
            z0Var.getView().scrollBy((int) ((primaryHorizontal - paddingStart) - f5), 0);
        } else if (primaryHorizontal > width - f5) {
            z0Var.getView().scrollBy((int) ((primaryHorizontal - width) + f5), 0);
        }
    }

    public final void e() {
        this.f137536a.getView().removeCallbacks(this.K);
    }

    public final boolean f(w0 w0Var) {
        int iMin = Math.min(w0Var.f129141g, w0Var.f129142h);
        int iMax = Math.max(w0Var.f129141g, w0Var.f129142h);
        if (iMin == iMax) {
            return false;
        }
        Layout layout = w0Var.f129138a;
        int lineForOffset = layout.getLineForOffset(iMin);
        int lineForOffset2 = layout.getLineForOffset(iMax);
        boolean z = layout.getParagraphDirection(lineForOffset) == -1;
        float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
        f fVar = this.E;
        fVar.f137522a = primaryHorizontal;
        fVar.f137523b = layout.getLineBottom(lineForOffset);
        fVar.f137524c = z;
        float primaryHorizontal2 = layout.getPrimaryHorizontal(iMax);
        f fVar2 = this.F;
        fVar2.f137522a = primaryHorizontal2;
        fVar2.f137523b = layout.getLineBottom(lineForOffset2);
        fVar2.f137524c = z;
        return true;
    }

    public final void g() {
        h hVar;
        m mVar = this.f137540h;
        m mVar2 = m.NONE;
        if (mVar != mVar2) {
            return;
        }
        e();
        Magnifier magnifier = this.f137550w;
        if (magnifier != null) {
            magnifier.dismiss();
        }
        e eVar = this.f137551x;
        if (eVar != null) {
            eVar.a();
        }
        e eVar2 = this.f137552y;
        if (eVar2 != null) {
            eVar2.a();
        }
        j2 j2Var = this.e;
        if (j2Var != null) {
            j2Var.cancel();
        }
        this.e = null;
        o2 o2Var = this.D;
        if (o2Var != null) {
            o2Var.f();
        }
        this.D = null;
        this.f137539g = n.IDLE;
        w0 w0Var = this.f137538c;
        if (w0Var != null && (hVar = this.f) != null) {
            w0Var.f129139b.removeSpan(hVar);
        }
        this.f137538c = null;
        this.f = null;
        this.f137540h = mVar2;
        this.k = -1;
        this.f137542l = -1;
        this.B = Integer.MIN_VALUE;
        this.C = null;
        ActionMode actionMode = this.d;
        this.d = null;
        if (actionMode != null) {
            actionMode.finish();
        }
        z0 z0Var = this.f137536a;
        ViewParent parent = z0Var.getView().getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        z0Var.getView().postInvalidateOnAnimation();
    }

    public final void h() {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        if (this.u == null || this.v == null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f137536a.getView().getContext(), R$style.UiKitThemeOverlay_AccentActivatedControl);
            TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{R.attr.textSelectHandleLeft, R.attr.textSelectHandleRight});
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                    int iK = kli.a.k(contextThemeWrapper, 24.0f);
                    int iS = kli.a.s(R.attr.colorControlActivated, contextThemeWrapper);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(iS);
                    gradientDrawable.setSize(iK, iK);
                    drawableMutate = gradientDrawable;
                }
                this.u = drawableMutate;
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
                if (drawable2 == null || (drawableMutate2 = drawable2.mutate()) == null) {
                    int iK2 = kli.a.k(contextThemeWrapper, 24.0f);
                    int iS2 = kli.a.s(R.attr.colorControlActivated, contextThemeWrapper);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(1);
                    gradientDrawable2.setColor(iS2);
                    gradientDrawable2.setSize(iK2, iK2);
                    drawableMutate2 = gradientDrawable2;
                }
                this.v = drawableMutate2;
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th10) {
                typedArrayObtainStyledAttributes.recycle();
                throw th10;
            }
        }
    }

    public final boolean i(float f, float f4, float f5, float f6, float f32, float f35) {
        float f36 = this.f137546q;
        float fMax = Math.max(f5 - f, f36) / 2.0f;
        float fMax2 = Math.max(f6 - f4, f36) / 2.0f;
        float f37 = (f + f5) / 2.0f;
        float f41 = (f4 + f6) / 2.0f;
        return f32 >= f37 - fMax && f32 <= f37 + fMax && f35 >= f41 - fMax2 && f35 <= f41 + fMax2;
    }

    public final boolean j() {
        return this.f137538c != null;
    }

    public final boolean k(MotionEvent event) {
        Drawable drawable;
        m mVar;
        int iMin;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        z0 z0Var = this.f137536a;
        boolean z = true;
        if (actionMasked == 0) {
            if (this.H) {
                n nVar = this.f137539g;
                if (nVar == n.SELECTION_ANCHORED || nVar == n.DRAG_EXPANDING) {
                    e();
                    g();
                    return false;
                }
                if (j()) {
                    w0 block = this.f137538c;
                    if (block == null) {
                        mVar = m.NONE;
                    } else {
                        h();
                        Drawable drawable2 = this.u;
                        if (drawable2 == null || (drawable = this.v) == null) {
                            mVar = m.NONE;
                        } else {
                            float x3 = event.getX() + z0Var.getView().getScrollX();
                            float y2 = event.getY();
                            Companion.getClass();
                            Intrinsics.checkNotNullParameter(block, "block");
                            float f = x3 - (block.f129140c + block.e);
                            Intrinsics.checkNotNullParameter(block, "block");
                            float f4 = y2 - (block.d + block.f);
                            if (f(block)) {
                                f fVar = this.E;
                                boolean z3 = fVar.f137524c;
                                Drawable drawable3 = z3 ? drawable : drawable2;
                                Drawable drawable4 = z3 ? drawable2 : drawable;
                                float intrinsicWidth = fVar.f137522a - ((z3 ? drawable3.getIntrinsicWidth() : drawable3.getIntrinsicWidth() * 3.0f) / 4.0f);
                                float intrinsicWidth2 = intrinsicWidth + drawable3.getIntrinsicWidth();
                                float f5 = fVar.f137523b;
                                if (i(intrinsicWidth, f5, intrinsicWidth2, drawable3.getIntrinsicHeight() + f5, f, f4)) {
                                    mVar = m.LEFT;
                                } else {
                                    float intrinsicWidth3 = (fVar.f137524c ? drawable4.getIntrinsicWidth() * 3.0f : drawable4.getIntrinsicWidth()) / 4.0f;
                                    f fVar2 = this.F;
                                    float f6 = fVar2.f137522a - intrinsicWidth3;
                                    float intrinsicWidth4 = drawable4.getIntrinsicWidth() + f6;
                                    float f32 = fVar2.f137523b;
                                    mVar = i(f6, f32, intrinsicWidth4, ((float) drawable4.getIntrinsicHeight()) + f32, f, f4) ? m.RIGHT : m.NONE;
                                }
                            } else {
                                mVar = m.NONE;
                            }
                        }
                    }
                    if (mVar != m.NONE) {
                        ViewParent parent = z0Var.getView().getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f137539g = n.HANDLE_DRAGGING;
                        this.f137540h = mVar;
                        this.f137543m = event.getX();
                        this.f137544n = event.getY();
                        ActionMode actionMode = this.d;
                        if (actionMode != null) {
                            actionMode.hide(-1L);
                        }
                        return true;
                    }
                }
                this.i = event.getX() + z0Var.getView().getScrollX();
                this.f137541j = event.getY();
                this.f137539g = n.AWAITING_LONG_PRESS;
                View view = z0Var.getView();
                k kVar = this.K;
                view.removeCallbacks(kVar);
                z0Var.getView().postDelayed(kVar, ViewConfiguration.getLongPressTimeout());
                return false;
            }
            return false;
        }
        if (actionMasked == 1) {
            int i = o.f137535b[this.f137539g.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    this.f137539g = n.IDLE;
                    Magnifier magnifier = this.f137550w;
                    if (magnifier != null) {
                        magnifier.dismiss();
                    }
                    l();
                    z0Var.getView().postInvalidateOnAnimation();
                    ViewParent parent2 = z0Var.getView().getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                } else if (i == 4) {
                    this.f137539g = n.IDLE;
                    this.f137540h = m.NONE;
                    Magnifier magnifier2 = this.f137550w;
                    if (magnifier2 != null) {
                        magnifier2.dismiss();
                    }
                    l();
                    z0Var.getView().postInvalidateOnAnimation();
                    ViewParent parent3 = z0Var.getView().getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return true;
            }
            e();
            this.f137539g = n.IDLE;
            if (j()) {
                g();
                return false;
            }
            return false;
        }
        if (actionMasked == 2) {
            int i2 = o.f137535b[this.f137539g.ordinal()];
            int i3 = this.o;
            if (i2 == 1) {
                float x5 = event.getX() + z0Var.getView().getScrollX();
                float y5 = event.getY();
                float f35 = x5 - this.i;
                float f36 = y5 - this.f137541j;
                if ((f36 * f36) + (f35 * f35) >= i3 * i3) {
                    e();
                    this.f137539g = n.IDLE;
                }
                return false;
            }
            if (i2 == 2 || i2 == 3) {
                float x7 = event.getX() + z0Var.getView().getScrollX();
                float y9 = event.getY();
                this.f137543m = event.getX();
                this.f137544n = event.getY();
                if (this.f137539g == n.SELECTION_ANCHORED) {
                    float f37 = x7 - this.i;
                    float f41 = y9 - this.f137541j;
                    if ((f41 * f41) + (f37 * f37) < i3 * i3) {
                        return true;
                    }
                }
                this.f137539g = n.DRAG_EXPANDING;
                w0 w0Var = this.f137538c;
                if (w0Var != null) {
                    Companion.getClass();
                    int iA = l.a(w0Var, x7, y9);
                    Spannable spannable = w0Var.f129139b;
                    int iB = i.b(spannable, iA);
                    int iMax = this.f137542l;
                    int[] iArr = this.G;
                    if (iB >= iMax) {
                        i.c(spannable, this.k, iB, iArr);
                        iMin = Math.min(iArr[0], this.k);
                        iMax = Math.max(iArr[1], iB);
                    } else {
                        int i5 = this.k;
                        if (iB < i5) {
                            i.c(spannable, iB, iMax, iArr);
                            iMin = Math.min(iArr[0], iB);
                            iMax = Math.max(iArr[1], this.f137542l);
                        } else {
                            iMin = i5;
                        }
                    }
                    c(w0Var, iMin, iMax);
                    d(w0Var);
                    m(w0Var);
                    z0Var.getView().postInvalidateOnAnimation();
                    ActionMode actionMode2 = this.d;
                    if (actionMode2 != null) {
                        actionMode2.invalidate();
                        return true;
                    }
                }
            } else if (i2 == 4) {
                float x20 = event.getX() + z0Var.getView().getScrollX();
                float y11 = event.getY();
                this.f137543m = event.getX();
                this.f137544n = event.getY();
                w0 w0Var2 = this.f137538c;
                if (w0Var2 != null) {
                    int i6 = o.f137534a[this.f137540h.ordinal()];
                    if (i6 == 1) {
                        n(w0Var2, x20, y11, true);
                    } else if (i6 == 2) {
                        n(w0Var2, x20, y11, false);
                    } else if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionMode actionMode3 = this.d;
                    if (actionMode3 != null) {
                        actionMode3.hide(-1L);
                    }
                    d(w0Var2);
                    m(w0Var2);
                    z0Var.getView().postInvalidateOnAnimation();
                    ActionMode actionMode4 = this.d;
                    if (actionMode4 != null) {
                        actionMode4.invalidate();
                        return true;
                    }
                }
            } else if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        if (actionMasked == 3) {
            if (this.f137539g == n.AWAITING_LONG_PRESS && !j()) {
                z = false;
            }
            e();
            this.f137539g = n.IDLE;
            this.f137540h = m.NONE;
            Magnifier magnifier3 = this.f137550w;
            if (magnifier3 != null) {
                magnifier3.dismiss();
            }
            ViewParent parent4 = z0Var.getView().getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            if (j() && this.H) {
                l();
                z0Var.getView().postInvalidateOnAnimation();
            }
            return z;
        }
        return false;
    }

    public final void l() {
        ActionMode actionMode = this.d;
        if (actionMode != null) {
            actionMode.hide(0L);
            ActionMode actionMode2 = this.d;
            if (actionMode2 != null) {
                actionMode2.invalidate();
                return;
            }
            return;
        }
        j jVar = new j(this, this.f137537b, new fnk.o(this, 3), this.I);
        z0 z0Var = this.f137536a;
        jVar.e = z0Var.getView().getContext();
        ActionMode actionModeStartActionMode = z0Var.getView().startActionMode(jVar, 1);
        this.d = actionModeStartActionMode;
        if (actionModeStartActionMode != null) {
            actionModeStartActionMode.invalidate();
        }
    }

    public final void m(w0 w0Var) {
        int iA;
        n nVar = this.f137539g;
        n nVar2 = n.DRAG_EXPANDING;
        z0 z0Var = this.f137536a;
        if (nVar == nVar2) {
            l lVar = Companion;
            float scrollX = this.f137543m + z0Var.getView().getScrollX();
            float f = this.f137544n;
            lVar.getClass();
            iA = l.a(w0Var, scrollX, f);
        } else {
            m mVar = this.f137540h;
            if (mVar == m.LEFT) {
                iA = w0Var.f129141g;
            } else if (mVar != m.RIGHT) {
                return;
            } else {
                iA = w0Var.f129142h;
            }
        }
        Layout layout = w0Var.f129138a;
        int i = w0Var.e;
        int i2 = w0Var.f129140c;
        int lineForOffset = layout.getLineForOffset(iA);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        float f4 = kotlin.ranges.f.f(this.f137543m, (i2 + i) - z0Var.getView().getScrollX(), layout.getWidth() + r6);
        float f5 = ((lineTop + lineBottom) / 2.0f) + w0Var.d + w0Var.f;
        Magnifier magnifier = this.f137550w;
        if (magnifier == null) {
            magnifier = new Magnifier(z0Var.getView());
            this.f137550w = magnifier;
        }
        float f6 = i2;
        float f32 = i;
        float primaryHorizontal = ((layout.getPrimaryHorizontal(w0Var.f129141g) + f6) + f32) - z0Var.getView().getScrollX();
        float primaryHorizontal2 = ((layout.getPrimaryHorizontal(w0Var.f129142h) + f6) + f32) - z0Var.getView().getScrollX();
        if (Math.max(f4, primaryHorizontal) - Math.min(f4, primaryHorizontal) > Math.max(f4, primaryHorizontal2) - Math.min(f4, primaryHorizontal2)) {
            primaryHorizontal = primaryHorizontal2;
        }
        if (Math.max(f4, primaryHorizontal) - Math.min(f4, primaryHorizontal) > magnifier.getWidth() / 2.0f) {
            magnifier.dismiss();
        } else if (Build.VERSION.SDK_INT >= 29) {
            magnifier.show(f4, f5, magnifier.getDefaultHorizontalSourceToMagnifierOffset() + f4, magnifier.getDefaultVerticalSourceToMagnifierOffset() + f5);
        } else {
            magnifier.show(f4, f5);
        }
    }
}
