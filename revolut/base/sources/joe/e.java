package joe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.feature.cash_topup.impl.ui.guide.CashTopUpGuideScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kx7.a0;
import kx7.g0;
import kx7.j0;
import kx7.s;
import kx7.s0;
import kx7.t;
import kx7.u;
import kx7.u0;
import kx7.v0;
import kx7.w0;
import kx7.x0;
import zw7.b1;
import zw7.k0;
import zw7.r;
import zw7.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements kfm.o, Function, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176935a;

    public /* synthetic */ e(int i) {
        this.f176935a = i;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f176935a) {
            case 0:
                k kVar = k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) kVar.invoke(p0);
            case 1:
                n nVar = n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar.invoke(p0);
            case 2:
                l lVar = l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) lVar.invoke(p0);
            case 3:
                j jVar = j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) jVar.invoke(p0);
            case 4:
                jra.b bVar = jra.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kqa.a) bVar.invoke(p0);
            case 5:
                jra.c cVar = jra.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar.invoke(p0);
            case 6:
                return (BridgeDestination) jsg.h.f.invoke(p0);
            case 7:
                jyj.e eVar = jyj.e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (byte[]) eVar.invoke(p0);
            case 8:
                return new DefaultSurfaceProcessor((DynamicRange) p0);
            case 9:
                k09.c cVar2 = k09.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar2.invoke(p0);
            case 10:
            case 11:
            case 13:
            default:
                s0 s0Var = s0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) s0Var.invoke(p0);
            case 12:
                kc3.d dVar = kc3.d.f;
                KProperty[] kPropertyArr = CashTopUpGuideScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) dVar.invoke(p0);
            case 14:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.FALSE;
            case 15:
                kj7.n nVar2 = kj7.n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ti7.f) nVar2.invoke(p0);
            case 16:
                kx7.e eVar2 = kx7.e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar2.invoke(p0);
            case 17:
                kx7.l lVar2 = kx7.l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) lVar2.invoke(p0);
            case 18:
                t tVar = t.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zw7.c) tVar.invoke(p0);
            case 19:
                u uVar = u.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (v) uVar.invoke(p0);
            case 20:
                s sVar = s.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zw7.a) sVar.invoke(p0);
            case 21:
                kx7.v vVar = kx7.v.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) vVar.invoke(p0);
            case 22:
                a0 a0Var = a0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) a0Var.invoke(p0);
            case 23:
                g0 g0Var = g0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r) g0Var.invoke(p0);
            case 24:
                j0 j0Var = j0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b1) j0Var.invoke(p0);
            case 25:
                v0 v0Var = v0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k0) v0Var.invoke(p0);
            case 26:
                u0 u0Var = u0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) u0Var.invoke(p0);
            case 27:
                x0 x0Var = x0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) x0Var.invoke(p0);
            case 28:
                w0 w0Var = w0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) w0Var.invoke(p0);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        switch (this.f176935a) {
            case 10:
                MessagesScreen.a aVar = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(v, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "<unused var>");
                return WindowInsetsCompat.CONSUMED;
            default:
                RevolutFeedScreen.Companion aVar2 = RevolutFeedScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
                Insets insets2 = insets.getInsets(iSystemBars);
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                int i = insets2.bottom;
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context = v.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, 16.0f) + i;
                if (iK != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iK;
                    v.setLayoutParams(marginLayoutParams);
                }
                Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, 0);
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
                WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, insetsOf).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
                return windowInsetsCompatBuild;
        }
    }
}
