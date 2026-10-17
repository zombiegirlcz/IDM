package gkg;

import android.app.Activity;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.material.color.ColorResourcesLoaderCreatorAccessor;
import com.revolut.core.ui_kit.R$attr;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.uipersonalisation.api.Toning;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import do3.q;
import java.util.Map;
import jo0.g;
import jo0.m;
import kotlin.jvm.internal.Intrinsics;
import xjg.j;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements h80.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f144393b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f144394c;
    public static boolean d;
    public static Toning e;
    public static vjg.b f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144392a = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0835a f144395g = new C0835a();

    /* JADX INFO: renamed from: gkg.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class C0835a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r01.c f144396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f144397b = r0.g();

        /* JADX WARN: Removed duplicated region for block: B:34:0x049e A[PHI: r38
          0x049e: PHI (r38v2 float) = (r38v0 float), (r38v0 float), (r38v1 float), (r38v1 float), (r38v1 float) binds: [B:33:0x049c, B:36:0x04a4, B:51:0x04cb, B:57:0x04d7, B:63:0x04e3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x04d2  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0501  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x050d  */
        /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Map] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map a(com.revolut.feature.uipersonalisation.api.Toning r40, boolean r41) {
            /*
                Method dump skipped, instruction units count: 2206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gkg.a.C0835a.a(com.revolut.feature.uipersonalisation.api.Toning, boolean):java.util.Map");
        }
    }

    private a() {
    }

    public static boolean a() {
        return (((Boolean) g.l().getValue()).booleanValue() || ((Boolean) g.m().getValue()).booleanValue()) ? false : true;
    }

    @Override // h80.d
    public final void G1(BaseDelegatesActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppCompatDelegate delegate = activity.getDelegate();
        if (delegate != null) {
            delegate.setLocalNightMode(f144393b);
        }
    }

    @Override // h80.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Integer numU;
        int iY;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!a() && !jh.d.g(activity) && (iY = kli.a.y(activity, R$attr.uikit_equivalentTransparentTheme, -1)) != -1) {
            activity.getTheme().applyStyle(iY, true);
        }
        j jVar = f144394c;
        if (jVar != null) {
            int iC = jVar.c(activity);
            if (!((Boolean) g.l().getValue()).booleanValue()) {
                activity.getTheme().applyStyle(iC, true);
            }
            q.a(activity, iC, d);
        }
        vjg.b bVar = f;
        if (bVar != null && (numU = pu7.a.u(bVar)) != null) {
            activity.getTheme().applyStyle(numU.intValue(), true);
        }
        if (a()) {
            activity.getTheme().applyStyle(R$style.UiKitColorsThemeOverlay_AccentNeutral_TransparentDayNight, true);
        }
        if (((Boolean) m.f176849c.f314188a).booleanValue()) {
            activity.getTheme().applyStyle(com.revolut.core.ui_kit_resources.R$style.UiKitThemeOverlay_TextAppearanceMarketing_New, true);
        }
    }

    @Override // h80.d, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        ResourcesLoader resourcesLoaderCreate;
        int iY;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!a() && Build.VERSION.SDK_INT >= 30 && (iY = kli.a.y(activity, R$attr.uikit_equivalentTransparentTheme, -1)) != -1) {
            activity.getTheme().applyStyle(iY, true);
        }
        if (((Boolean) g.l().getValue()).booleanValue() && Build.VERSION.SDK_INT >= 30 && jh.d.g(activity)) {
            Map<Integer, Integer> mapA = f144395g.a(e, kli.a.q(activity));
            if (mapA.isEmpty() || (resourcesLoaderCreate = ColorResourcesLoaderCreatorAccessor.INSTANCE.create(activity, mapA)) == null) {
                return;
            }
            activity.getResources().addLoaders(resourcesLoaderCreate);
        }
    }
}
