package or0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes19.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f228030a = new AtomicInteger(-1);

    public static final Rect a(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        if (z && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!pd.b.k(viewGroup2 != null ? Boolean.valueOf(viewGroup2.getClipChildren()) : null)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        int translationX = (int) (childAt.getTranslationX() + childAt.getLeft());
                        int translationY = (int) (childAt.getTranslationY() + childAt.getTop());
                        rect.union(translationX, translationY, childAt.getWidth() + translationX, childAt.getHeight() + translationY);
                    }
                }
            }
        }
        return rect;
    }

    public static final Bitmap b(View view, Outline viewOutline, boolean z, boolean z3) {
        p pVar = p.f228029a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(viewOutline, "viewOutline");
        try {
            u.e(view, o.f228028a);
            Rect rectA = a(view, z);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rim.d.c(rectA.width() * view.getScaleX()), rim.d.c(rectA.height() * view.getScaleY()), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(view.getScaleX(), view.getScaleY());
            canvas.translate(-rectA.left, -rectA.top);
            View viewD = d(view, viewOutline);
            if (viewD != null && z3) {
                Rect rect = new Rect();
                Path path = new Path();
                viewOutline.getRect(rect);
                RectF rectF = new RectF(rect);
                if (!viewD.equals(view)) {
                    rectF.offsetTo(knm.b.f(viewD, (ViewGroup) view), knm.b.h(viewD, (ViewGroup) view));
                }
                path.addRoundRect(rectF, viewOutline.getRadius(), viewOutline.getRadius(), Path.Direction.CW);
                canvas.clipPath(path);
            }
            view.draw(canvas);
            u.e(view, pVar);
            return bitmapCreateBitmap;
        } catch (Throwable th10) {
            u.e(view, pVar);
            throw th10;
        }
    }

    public static /* synthetic */ Bitmap c(View view) {
        return b(view, new Outline(), false, true);
    }

    public static final View d(View view, Outline outline) {
        View viewD;
        if (view.getVisibility() != 8 && view.getAlpha() != BitmapDescriptorFactory.HUE_RED) {
            if (view.getClipToOutline() || view.getBackground() != null) {
                ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                if (outlineProvider != null) {
                    outlineProvider.getOutline(view, outline);
                }
                if (outline.getRadius() > BitmapDescriptorFactory.HUE_RED) {
                    return view;
                }
                outline.setEmpty();
            }
            ViewGroup viewGroup = (ViewGroup) (!(view instanceof ViewGroup) ? null : view);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getWidth() / view.getWidth() >= 0.8d && childAt.getHeight() / view.getHeight() >= 0.8d && (viewD = d(childAt, outline)) != null) {
                        return viewD;
                    }
                }
            }
        }
        return null;
    }

    public static final Bitmap e(View view, Integer num) {
        Bitmap bitmapC;
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        HandlerThread handlerThread = new HandlerThread(a0.d.n("PixelCopy #", f228030a.incrementAndGet()));
        try {
            handlerThread.start();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler handler = new Handler(handlerThread.getLooper());
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.f186408a = 2;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityM = kli.a.m(context);
            Intrinsics.h(activityM);
            Window window = activityM.getWindow();
            View rootView = window.peekDecorView().getRootView();
            Rect rect = new Rect(0, 0, rootView.getWidth(), rootView.getHeight());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = (int) (view.getWidth() * view.getScaleX());
            int height = (int) (view.getHeight() * view.getScaleY());
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect2 = new Rect(i, i2, width + i, height + i2);
            final ood.k kVar = new ood.k(ref$IntRef, countDownLatch, 19);
            if (rect.contains(rect2)) {
                int iWidth = rect2.width();
                int iHeight = rect2.height();
                if (num != null && Math.min(iWidth, iHeight) > num.intValue()) {
                    float fIntValue = num.intValue() / Math.min(iWidth, iHeight);
                    iWidth = rim.d.c(iWidth * fIntValue);
                    iHeight = rim.d.c(iHeight * fIntValue);
                }
                bitmapC = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                final int i3 = 0;
                PixelCopy.request(window, rect2, bitmapC, new PixelCopy.OnPixelCopyFinishedListener() { // from class: or0.n
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i5) {
                        switch (i3) {
                            case 0:
                                kVar.invoke(Integer.valueOf(i5));
                                break;
                            default:
                                kVar.invoke(Integer.valueOf(i5));
                                break;
                        }
                    }
                }, handler);
                z = countDownLatch.await(300L, TimeUnit.MILLISECONDS) && ref$IntRef.f186408a == 0;
            } else {
                bitmapC = c(view);
                Rect rect3 = new Rect();
                rect3.setIntersect(rect, rect2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect3.width(), rect3.height(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                final int i5 = 1;
                PixelCopy.request(window, rect3, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: or0.n
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i59) {
                        switch (i5) {
                            case 0:
                                kVar.invoke(Integer.valueOf(i59));
                                break;
                            default:
                                kVar.invoke(Integer.valueOf(i59));
                                break;
                        }
                    }
                }, handler);
                z = countDownLatch.await(300L, TimeUnit.MILLISECONDS) && ref$IntRef.f186408a == 0;
                if (z) {
                    new Canvas(bitmapC).drawBitmap(bitmapCreateBitmap, rect3.left - rect2.left, rect3.top - rect2.top, (Paint) null);
                }
            }
            if (z) {
                return f(bitmapC, num);
            }
            throw new RuntimeException("Failed to copy pixels, copyResult=" + ref$IntRef.f186408a);
        } catch (Throwable th10) {
            try {
                hx7.e.n(th10);
                handlerThread.quit();
                return f(c(view), num);
            } finally {
                handlerThread.quit();
            }
        }
    }

    public static final Bitmap f(Bitmap bitmap, Integer num) {
        if (num == null || Math.min(bitmap.getWidth(), bitmap.getHeight()) <= num.intValue()) {
            return bitmap;
        }
        float fIntValue = num.intValue() / Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, rim.d.c(bitmap.getWidth() * fIntValue), rim.d.c(bitmap.getHeight() * fIntValue), true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
