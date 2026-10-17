package gzl;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableString;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.os.HandlerCompat;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.FragmentActivity;
import bx0.q;
import cli.y;
import com.hcaptcha.sdk.HCaptchaDialogFragment;
import com.onfido.android.sdk.capture.databinding.OnfidoLoadingErrorBinding;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.error.LoadingErrorState;
import com.revolut.core.ui_kit.delegates.fg;
import com.revolut.core.ui_kit.delegates.ja;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.VerticalProgressStepView;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import com.revolut.ui_easter_egg.EmojiEmitterView;
import com.revolut.uicomponent.card.ExternalCardView;
import ihm.f;
import ip0.gc0;
import ix0.c0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import jul.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kp0.s0;
import kp0.u;
import qyl.i;
import qyl.j;
import tim.c;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148161b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f148160a = i;
        this.f148161b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        Drawable drawable;
        i listener;
        i listener2;
        FragmentActivity activity;
        int i = this.f148160a;
        int i2 = 0;
        Object obj2 = this.f148161b;
        switch (i) {
            case 0:
                c cVar = (c) obj2;
                int i3 = c.e;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(event, "event");
                View.OnTouchListener onTouchListener = cVar.f148163b;
                if (onTouchListener != null) {
                    onTouchListener.onTouch(view, event);
                }
                if (event.getAction() != 1 || (drawable = cVar.getCompoundDrawables()[a.RIGHT.ordinal()]) == null || event.getRawX() < cVar.getRight() - drawable.getBounds().width()) {
                    return false;
                }
                for (qyl.a aVar : cVar.f148164c) {
                    a side = a.RIGHT;
                    int iD = cVar.d(drawable, event);
                    switch (aVar.f250298a) {
                        case 0:
                            o oVar = (o) aVar.f250299b;
                            Intrinsics.checkNotNullParameter(side, "side");
                            if (side == a.RIGHT && iD == 0 && oVar.i()) {
                                ((c) oVar.f178695b).setText("");
                            }
                            break;
                        default:
                            ExternalCardView externalCardView = (ExternalCardView) aVar.f250299b;
                            o oVar2 = externalCardView.O;
                            Intrinsics.checkNotNullParameter(side, "side");
                            if (j.f250309a[side.ordinal()] == 1) {
                                if (iD != 0) {
                                    if (iD == 1 && !oVar2.i() && externalCardView.getShowNfcIcon() && (listener = externalCardView.getListener()) != null) {
                                        ((f) ((com.revolut.uicomponent.products.d) listener).f107223a.f107177h.getValue()).onNext(new Object());
                                    }
                                } else if (!oVar2.i() && externalCardView.getShowCameraIcon() && (listener2 = externalCardView.getListener()) != null) {
                                    com.revolut.uicomponent.products.d dVar = (com.revolut.uicomponent.products.d) listener2;
                                    ((f) dVar.f107223a.f107176g.getValue()).onNext(dVar.f107224b.f107182a);
                                }
                            }
                            break;
                    }
                }
                return true;
            case 1:
                HCaptchaDialogFragment hCaptchaDialogFragment = (HCaptchaDialogFragment) obj2;
                if (hCaptchaDialogFragment.f49848e0 || !hCaptchaDialogFragment.isAdded() || (activity = hCaptchaDialogFragment.getActivity()) == null) {
                    return view.performClick();
                }
                activity.dispatchTouchEvent(event);
                return true;
            case 2:
                ja jaVar = (ja) obj2;
                jaVar.f54328j = event.getAction() == 5 && jaVar.i == 0;
                view.getParent().requestDisallowInterceptTouchEvent(event.getAction() == 0 || jaVar.f54328j || ((double) jaVar.k) > 1.0d);
                jaVar.i = event.getAction();
                jaVar.f54326g.dispatchTouchEvent(event);
                return true;
            case 3:
                fg fgVar = (fg) obj2;
                int action = event.getAction();
                if (action == 1 || action == 3) {
                    fgVar.f.getHandler().removeCallbacksAndMessages(Long.valueOf(fgVar.getItemId()));
                    Handler handler = fgVar.f.getHandler();
                    Intrinsics.checkNotNullExpressionValue(handler, "getHandler(...)");
                    HandlerCompat.postDelayed(handler, new gc0(fgVar, 1), Long.valueOf(fgVar.getItemId()), 600L);
                }
                return false;
            case 4:
                ZoomableFullScreenVideoView zoomableFullScreenVideoView = (ZoomableFullScreenVideoView) obj2;
                int i5 = ZoomableFullScreenVideoView.C;
                int action2 = event.getAction();
                if (action2 == 0) {
                    zoomableFullScreenVideoView.d(2);
                    return true;
                }
                if (action2 != 1 && action2 != 3) {
                    return true;
                }
                zoomableFullScreenVideoView.g(2);
                return true;
            case 5:
                RaffleScreen raffleScreen = (RaffleScreen) obj2;
                KProperty[] kPropertyArr = RaffleScreen.S;
                if (event.getAction() == 0 && ((Rect) raffleScreen.P.getValue()).contains((int) event.getX(), (int) event.getY())) {
                    EmojiEmitterView raffleScreenEmojiEmitter = raffleScreen.d3().f129396b;
                    Intrinsics.checkNotNullExpressionValue(raffleScreenEmojiEmitter, "raffleScreenEmojiEmitter");
                    float x3 = event.getX();
                    float y2 = event.getY();
                    IntRange initialVelocityRange = EmojiEmitterView.i;
                    c.Companion random = raffleScreenEmojiEmitter.f107088b;
                    Intrinsics.checkNotNullParameter(initialVelocityRange, "initialVelocityRange");
                    ArrayList arrayList = raffleScreenEmojiEmitter.f107087a;
                    int iMin = Math.min(10, 50 - arrayList.size());
                    if (iMin > 0) {
                        int i6 = 0;
                        while (i6 < iMin) {
                            Intrinsics.checkNotNullParameter(EmojiEmitterView.f107086j, "<this>");
                            Intrinsics.checkNotNullParameter(random, "random");
                            try {
                                double radians = Math.toRadians(-czi.c.H(random, r11));
                                Intrinsics.checkNotNullParameter(initialVelocityRange, "<this>");
                                Intrinsics.checkNotNullParameter(random, "random");
                                try {
                                    float fH = czi.c.H(random, initialVelocityRange);
                                    tim.a aVar2 = tim.c.f271589b;
                                    double d = fH;
                                    arrayList.add(new vwl.a(x3, y2, (float) (Math.cos(radians) * d), (float) (Math.sin(radians) * d), aVar2.d(360), aVar2.e(-360, 360), (String) d0.H0(raffleScreenEmojiEmitter.f107089c.a(), random)));
                                    i6++;
                                    i2 = i2;
                                } catch (IllegalArgumentException e) {
                                    throw new NoSuchElementException(e.getMessage());
                                }
                            } catch (IllegalArgumentException e2) {
                                throw new NoSuchElementException(e2.getMessage());
                            }
                        }
                        boolean z = i2;
                        boolean z3 = raffleScreenEmojiEmitter.f;
                        if (z3 || z3) {
                            return z;
                        }
                        raffleScreenEmojiEmitter.f = true;
                        raffleScreenEmojiEmitter.e = 0L;
                        Choreographer.getInstance().postFrameCallback(raffleScreenEmojiEmitter.f107091h);
                        return z;
                    }
                }
                return false;
            case 6:
                u uVar = (u) obj2;
                GestureDetectorCompat gestureDetectorCompat = uVar.o;
                if (gestureDetectorCompat == null) {
                    gestureDetectorCompat = new GestureDetectorCompat(uVar.itemView.getContext(), new q(uVar, 4));
                    uVar.o = gestureDetectorCompat;
                }
                return gestureDetectorCompat.onTouchEvent(event);
            case 7:
                return ((s0) obj2).f188092n.onTouchEvent(event);
            case 8:
                VerticalProgressStepView verticalProgressStepView = (VerticalProgressStepView) obj2;
                VerticalProgressStepView.a aVar3 = VerticalProgressStepView.Companion;
                c0 c0Var = c0.f169220a;
                UIKitTextView uIKitTextView = verticalProgressStepView.f56480h;
                SpannableString spannableString = new SpannableString(verticalProgressStepView.f56480h.getText());
                Intrinsics.h(event);
                return c0Var.onTouchEvent(uIKitTextView, spannableString, event);
            case 9:
                com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar4 = (com.revolut.core.ui_kit.internal.views.floatingbottombar.a) obj2;
                if (event.getAction() == 0) {
                    float rawX = event.getRawX();
                    float rawY = event.getRawY();
                    int[] iArr = new int[2];
                    aVar4.f57048a.getLocationOnScreen(iArr);
                    if (rawX >= iArr[0] && rawX <= r4.getWidth() + r5) {
                        if (rawY >= iArr[1] && rawY <= r4.getHeight() + r0) {
                            return false;
                        }
                    }
                    aVar4.d(false);
                }
                return true;
            case 10:
                CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = (CombinedAuthenticationUnifiedScreen) obj2;
                KProperty[] kPropertyArr2 = CombinedAuthenticationUnifiedScreen.Y;
                if (event.getAction() == 1) {
                    com.revolut.sso.impl.ui.combined_authentication.unified.a aVar5 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.e3();
                    y yVar = aVar5.D;
                    if (((qll.q) ((j2) yVar.f22677a).getValue()).f247595a.a()) {
                        aVar5.H2(yVar, new qll.d0(aVar5, i2));
                    }
                }
                return false;
            case 11:
                return LoadingErrorState.lambda$2$lambda$1((OnfidoLoadingErrorBinding) obj2, view, event);
            default:
                return ReactionsKeyboardView.s((ReactionsKeyboardView) obj2);
        }
    }
}
