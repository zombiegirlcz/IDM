package kx7;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.internal.views.HorizontalProgressView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.TwoTextSwitcherView;
import com.revolut.core.ui_kit.views.TwoViewsSwitcherView;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import fa1.q;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ms0.d1;
import mx0.dd;
import mx0.i4;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements kfm.o, efm.x, me.a, dd, Function, RingBuffer.OnRemoveCallback, DoubleFunction, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190480a;

    public /* synthetic */ o0(int i) {
        this.f190480a = i;
    }

    @Override // efm.x
    public efm.w apply(efm.r it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8;
    }

    @Override // me.a
    public Object c(JsonReader jsonReader) throws IOException {
        switch (this.f190480a) {
            case 9:
                jt0.b bVar = new jt0.b(false);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            bVar.F0(jsonReader.nextString());
                            break;
                        case "arch":
                            bVar.D0(jsonReader.nextString());
                            break;
                        case "buildId":
                            bVar.E0(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return bVar.M();
            default:
                jsonReader.beginObject();
                String strNextString = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && bArrDecode != null) {
                    return new le.i0(strNextString, bArrDecode);
                }
                StringBuilder sb6 = new StringBuilder();
                if (strNextString == null) {
                    sb6.append(" filename");
                }
                if (bArrDecode == null) {
                    sb6.append(" contents");
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
        }
    }

    @Override // mx0.dd
    public Animator d(View view) {
        switch (this.f190480a) {
            case 14:
                o0 o0Var = TwoTextSwitcherView.k;
                Intrinsics.checkNotNullParameter(view, "view");
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, view.getAlpha(), BitmapDescriptorFactory.HUE_RED), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, view.getScaleX(), BitmapDescriptorFactory.HUE_RED), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, view.getScaleY(), BitmapDescriptorFactory.HUE_RED));
                objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfPropertyValuesHolder, "apply(...)");
                return objectAnimatorOfPropertyValuesHolder;
            case 15:
                o0 o0Var2 = TwoTextSwitcherView.k;
                Intrinsics.checkNotNullParameter(view, "view");
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, view.getAlpha(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, view.getScaleX(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, view.getScaleY(), 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(200L);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfPropertyValuesHolder2, "apply(...)");
                return objectAnimatorOfPropertyValuesHolder2;
            default:
                int i = TwoViewsSwitcherView.f58925g;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(0L);
                return valueAnimator;
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.f190480a) {
            case 20:
                return ColorSpaces.ExtendedSrgb$lambda$0(d);
            case 21:
                return ColorSpaces.ExtendedSrgb$lambda$1(d);
            case 22:
                return ColorSpaces.Bt2020Hlg$lambda$0(d);
            case 23:
                return ColorSpaces.Bt2020Hlg$lambda$1(d);
            case 24:
                return ColorSpaces.Bt2020Pq$lambda$0(d);
            case 25:
                return ColorSpaces.Bt2020Pq$lambda$1(d);
            default:
                return Rgb.DoubleIdentity$lambda$0(d);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        MoveMoneyTopupScreen.a aVar = MoveMoneyTopupScreen.Companion;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<unused var>");
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) throws Throwable {
        switch (this.f190480a) {
            case 0:
                t0 t0Var = t0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) t0Var.invoke(p0);
            case 1:
                return (wi0.b) l25.t.f.invoke(p0);
            case 2:
                l7h.d dVar = l7h.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xzg.s) dVar.invoke(p0);
            case 3:
                Throwable error = (Throwable) p0;
                Intrinsics.checkNotNullParameter(error, "error");
                if (!(error instanceof HttpException) || ((HttpException) error).code() != 404) {
                    throw error;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 4:
                lb0.h hVar = lb0.h.f;
                int i = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar.invoke(p0);
            case 5:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            default:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                return Boolean.FALSE;
            case 6:
                lsj.c cVar = lsj.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uzi.b) cVar.invoke(p0);
            case 7:
                m1i.e eVar = m1i.e.f;
                MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) eVar.invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "it");
                return efm.r.just(q.c.f133210a).doOnSubscribe(new m78.e(new m9l.d(8), 19));
            case 11:
                mjf.r rVar = mjf.r.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) rVar.invoke(p0);
            case 12:
                d1 d1Var = d1.f;
                int i2 = HorizontalProgressView.f56188c;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) d1Var.invoke(p0);
            case 13:
                i4 i4Var = i4.f;
                int i3 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) i4Var.invoke(p0);
            case 17:
                myj.d dVar2 = myj.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yoj.d) dVar2.invoke(p0);
            case 18:
                return CoroutineAdaptersKt.asVoidListenableFuture$lambda$0(p0);
        }
    }
}
