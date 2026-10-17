package a01;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.view.animation.AnimationUtils;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revolut.core.ui_kit.R$anim;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.internal.views.pincode.DotsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.utils.ui.glide.CustomGlideModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import rp0.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f101b;

    public /* synthetic */ c(Context context, int i) {
        this.f100a = i;
        this.f101b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f100a;
        Context context = this.f101b;
        switch (i) {
            case 0:
                return context.getSharedPreferences("av-int-str.pre", 0);
            case 1:
                return (OkHttpClient) ((c21.b) CustomGlideModule.I(context)).Q.get();
            case 2:
                return CustomGlideModule.H(context).s();
            case 3:
                return new xz0.e(CustomGlideModule.J(context).b(), CustomGlideModule.H(context).h());
            case 4:
                phm.a aVar = (phm.a) j6.a.i(context, nj0.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return ((nj0.d) ((nj0.a) aVar2.b())).e();
                }
                throw new IllegalStateException(a0.d.q("Api ", nj0.a.class, " is not found"));
            case 5:
                return CustomGlideModule.H(context).l();
            case 6:
                return CustomGlideModule.J(context).a();
            case 7:
                return (OkHttpClient) ((c21.b) CustomGlideModule.I(context)).T.get();
            case 8:
                return ModuleInstall.getClient(context);
            case 9:
                Intrinsics.h(context);
                return context;
            case 10:
                return context.getSharedPreferences("PROXY_SETTINGS", 0);
            case 11:
                int i2 = DotsView.d;
                return AnimationUtils.loadAnimation(context, R$anim.internal_shake_animation);
            case 12:
                int i3 = UiKitPlayerView.z;
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    return (AudioManager) systemService;
                }
                return null;
            case 13:
                Object systemService2 = context.getSystemService("notification");
                Intrinsics.i(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                return (NotificationManager) systemService2;
            case 14:
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
                return firebaseAnalytics;
            case 15:
                FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(firebaseAnalytics2, "getInstance(...)");
                return firebaseAnalytics2;
            case 16:
                int i5 = BasicNavBar.H;
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R$dimen.internal_basic_nav_bar_height));
            case 17:
                int i6 = BasicNavBar.H;
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R$dimen.internal_basic_nav_bar_title_content_horizontal_margin));
            case 18:
                Intrinsics.h(context);
                return context;
            default:
                PinCodeView.Companion bVar = PinCodeView.INSTANCE;
                Activity activityI = z92.f.i(context);
                if (activityI != null) {
                    return new z1(activityI);
                }
                return null;
        }
    }

    public /* synthetic */ c(CustomGlideModule customGlideModule, Context context, int i) {
        this.f100a = i;
        this.f101b = context;
    }
}
