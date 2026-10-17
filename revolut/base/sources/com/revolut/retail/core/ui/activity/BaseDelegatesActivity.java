package com.revolut.retail.core.ui.activity;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import aw0.y9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import dx0.e;
import fsi.d;
import fsi.f;
import fsi.h;
import ix0.a1;
import ix0.y0;
import ix0.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nq0.a;
import nri.b;
import org.jetbrains.annotations.NotNull;
import rv0.k;
import t70.i;
import te0.w;
import tri.c;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDelegatesActivity extends b implements wy0.a, nsi.a, qy0.a, ry0.a, ksi.a {

    @NotNull
    public static final a Companion = new a();
    public CustomTheme c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CustomTheme f98685d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f98686e0;
    public AnimatedBackgroundType f0;
    public Set g0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f98688k0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ContextWrapper f98684b0 = this;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final c f98687h0 = new c();
    public boolean i0 = true;
    public final boolean j0 = true;
    public final Object l0 = w.y0(new d(this, 0));
    public final Object m0 = w.y0(new d(this, 1));

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f98689n0 = w.y0(new d(this, 2));

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final f f98690o0 = new f(this, new d(this, 3));
    public final mo0.a p0 = new mo0.a(this);
    public final Lazy q0 = j.b(new d(this, 4));

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity$ActivityDelegatesInitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActivityDelegatesInitializationException extends Exception {
        public ActivityDelegatesInitializationException(Throwable th10) {
            super(th10);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public abstract gsi.a L0();

    public final ViewGroup M0() {
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    public boolean N0() {
        return this.j0;
    }

    public void O0() {
        super.onBackPressed();
    }

    public void P0() {
        Intrinsics.checkNotNullParameter(this, "activity");
        Window window = getWindow();
        y9 y9Var = y9.THEME;
        Intrinsics.h(window);
        y9Var.a(window);
        window.setStatusBarColor(0);
        e.c(window, this, dx0.c.DEFAULT);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    }

    @Override // wy0.a
    public final yy0.f Q() {
        return L0().Q();
    }

    public final void R0() {
        ViewGroup viewGroupM0 = M0();
        AttributeSet attributeSet = null;
        int i = 0;
        if (!((Boolean) g.e().getValue()).booleanValue()) {
            View childAt = viewGroupM0 != null ? viewGroupM0.getChildAt(0) : null;
            y0.a aVarA = y0.a(childAt);
            if ((aVarA instanceof a1) && ((a1) aVarA).a() != z0.UNKNOWN_NESTING && N0() && childAt != null) {
                ViewCompat.setOnApplyWindowInsetsListener(childAt, new fsi.e(this));
            }
        }
        CustomTheme customTheme = this.c0;
        if (customTheme != null && viewGroupM0 != null) {
            AnimatedBackgroundType animatedBackgroundType = customTheme.f98692b;
            if (!Intrinsics.f(animatedBackgroundType, this.f0)) {
                this.f0 = animatedBackgroundType;
                ViewGroup viewGroupM02 = M0();
                if (viewGroupM02 != null) {
                    int childCount = viewGroupM02.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        View view = ViewGroupKt.get(viewGroupM02, i2);
                        if (view instanceof StatefulAnimatedBackground) {
                            viewGroupM02.removeView(view);
                            break;
                        }
                        i2++;
                    }
                    if (animatedBackgroundType != null) {
                        Context context = viewGroupM02.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        StatefulAnimatedBackground statefulAnimatedBackground = new StatefulAnimatedBackground(context, attributeSet, 6, i);
                        statefulAnimatedBackground.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        statefulAnimatedBackground.setBackgroundType(animatedBackgroundType);
                        viewGroupM02.addView(statefulAnimatedBackground, 0);
                    }
                }
            }
        }
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).I();
        }
    }

    public final void T0(CustomTheme customTheme, boolean z) {
        this.f98686e0 = true;
        this.f98685d0 = customTheme;
        if (this.f98690o0.f) {
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e() && z) {
                throw new IllegalStateException("theme cannot be set after onCreate() call");
            }
            return;
        }
        if (this instanceof h) {
            this.c0 = customTheme;
            this.f98684b0 = customTheme != null ? new ContextThemeWrapper(this, customTheme.f98691a) : this;
        } else {
            this.c0 = null;
            this.f98684b0 = this;
        }
    }

    public final void U0(int i) {
        if (this.c0 == null) {
            super.setContentView(i);
            return;
        }
        ViewGroup viewGroupM0 = M0();
        if (viewGroupM0 != null) {
            super.setContentView(getLayoutInflater().inflate(i, viewGroupM0, false));
        } else {
            super.setContentView(i);
        }
    }

    @Override // wy0.a
    public final mz0.a V() {
        return L0().V();
    }

    public final void V0(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            super.setContentView(view, layoutParams);
        } else {
            super.setContentView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wy0.a
    public final c01.d W() {
        return (c01.d) this.m0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wy0.a
    public final py0.e X() {
        return (py0.e) this.f98689n0.getValue();
    }

    @Override // wy0.a
    public final xy0.a Y() {
        return L0().Y();
    }

    @Override // wy0.a
    public final h01.g Z() {
        return L0().Z();
    }

    @Override // wy0.a
    public final jz0.d a0() {
        return L0().a0();
    }

    @Override // nri.b, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Object applicationContext = newBase.getApplicationContext();
        l70.e eVar = null;
        e0m.d dVar = applicationContext instanceof e0m.d ? (e0m.d) applicationContext : null;
        if (dVar != null) {
            dVar.init();
        }
        h80.b bVar = h80.c.f149931a;
        Intrinsics.checkNotNullParameter(this, "activity");
        Iterator it8 = h80.c.f149932b.iterator();
        while (it8.hasNext()) {
            ((h80.d) it8.next()).G1(this);
        }
        try {
            eVar = (l70.e) ue0.e.i(ue0.e.j(newBase), l70.e.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
        if (eVar == null) {
            eVar = (l70.e) l70.c.Companion.c();
        }
        Context contextA = ((t70.j) ((i) eVar.L.get())).a(newBase);
        jl0.a aVar = eVar.f;
        if (aVar != null) {
            contextA = aVar.a(contextA);
        }
        if (((Boolean) g.c().getValue()).booleanValue()) {
            sv0.e.a(contextA);
        }
        super.attachBaseContext(contextA);
    }

    @Override // nsi.a
    public final Object b(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return u1.i(clazz, l0());
    }

    @Override // wy0.a
    public final ty0.c b0() {
        return L0().b0();
    }

    @Override // wy0.a
    public final lz0.g c0() {
        return L0().c0();
    }

    @Override // wy0.a
    public final i01.b d0() {
        return L0().d0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mo0.a aVar = this.p0;
        aVar.getClass();
        if (motionEvent != null && motionEvent.getAction() == 0) {
            nq0.a aVarA = aVar.f207535b;
            if (aVarA == null) {
                a.C1216a c1216a = nq0.a.Companion;
                BaseDelegatesActivity baseDelegatesActivity = aVar.f207534a;
                c1216a.getClass();
                aVarA = a.C1216a.a(baseDelegatesActivity);
                aVar.f207535b = aVarA;
            }
            LinkedHashMap linkedHashMap = aVarA.f218340a;
            aVarA.d = true;
            if (aVarA.f218342c <= 0 && !linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (aVarA.f218341b > 0) {
                    Iterator it8 = linkedHashMap.entrySet().iterator();
                    while (it8.hasNext()) {
                        nq0.b bVar = (nq0.b) ((Map.Entry) it8.next()).getValue();
                        if (bVar.b() >= aVarA.e) {
                            arrayList.add(bVar);
                        }
                    }
                } else {
                    Iterator it9 = linkedHashMap.entrySet().iterator();
                    while (it9.hasNext()) {
                        arrayList.add((nq0.b) ((Map.Entry) it9.next()).getValue());
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((nq0.b) arrayList.get(i)).e(0L);
                }
            }
        }
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it10 = set2.iterator();
            while (it10.hasNext()) {
                ((fsi.a) it10.next()).dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // wy0.a
    public final d01.g e0() {
        return (d01.g) this.l0.getValue();
    }

    @Override // nri.b, android.app.Activity
    public void finish() {
        Set set = this.g0;
        if (set != null) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it8 = set2.iterator();
                while (it8.hasNext()) {
                    if (((fsi.a) it8.next()).onFinish()) {
                        return;
                    }
                }
            }
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        if (isTaskRoot()) {
            finish();
        } else {
            super.finishAfterTransition();
        }
    }

    @Override // android.app.Activity
    public final LayoutInflater getLayoutInflater() {
        ContextWrapper contextWrapper = this.f98684b0;
        LayoutInflater layoutInflater = super.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        if (contextWrapper == this) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextWrapper);
        Intrinsics.h(layoutInflaterCloneInContext);
        return layoutInflaterCloneInContext;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.f(name, "revolut_service::keyboard") ? this.q0.getValue() : super.getSystemService(name);
    }

    @Override // nsi.a
    public final Set l0() {
        Set set = this.g0;
        if (set != null) {
            return set;
        }
        Intrinsics.r("delegates");
        throw null;
    }

    @Override // wy0.a
    public final py0.f n0() {
        return L0().m0();
    }

    @Override // nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z = this.f98688k0;
        this.f98688k0 = false;
        Lazy lazy = this.q0;
        if (lazy.isInitialized()) {
            Object value = lazy.getValue();
            k kVar = value instanceof k ? (k) value : null;
            if (kVar != null && ((sv0.c) kVar).l(z)) {
                return;
            }
        }
        if (getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
            super.onBackPressed();
            return;
        }
        c cVar = this.f98687h0;
        ihm.f fVar = cVar.f273801b;
        if (cVar.f273802c) {
            tri.a aVar = (tri.a) cVar.f273800a.poll();
            Function0 function0A = aVar != null ? aVar.a() : null;
            if (function0A != null) {
                function0A.invoke();
                return;
            } else if (fVar.e()) {
                fVar.onNext(Unit.f186387a);
                return;
            }
        }
        O0();
    }

    @Override // nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        new a70.c().a(this);
        if (!this.f98686e0) {
            T0((CustomTheme) getIntent().getParcelableExtra("theme_arg"), true);
        }
        if (this.c0 != null) {
            P0();
            esi.b.Companion.getClass();
            esi.a.a(this);
        }
        Object applicationContext = getApplicationContext();
        e0m.d dVar = applicationContext instanceof e0m.d ? (e0m.d) applicationContext : null;
        if (dVar != null) {
            dVar.init();
        }
        super.onCreate(bundle);
        this.i0 = bundle == null || bundle.getBoolean("STATE_IS_FIRST_START", true);
        try {
            Set<fsi.a> setL0 = L0().l0();
            this.g0 = setL0;
            if (setL0 == null) {
                Intrinsics.r("delegates");
                throw null;
            }
            for (fsi.a aVar : setL0) {
                aVar.onCreate(bundle);
                I0();
                aVar.E(bundle);
            }
            f fVar = this.f98690o0;
            WeakReference weakReference = fVar.f137714b;
            d dVar2 = fVar.f137713a;
            int i = fVar.f137715c;
            if (i == -1 || i == 0) {
                WeakReference weakReference2 = fVar.d;
                View view = weakReference2 != null ? (View) weakReference2.get() : null;
                BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) weakReference.get();
                if (view != null && baseDelegatesActivity != null) {
                    baseDelegatesActivity.V0(view, fVar.e);
                    dVar2.invoke();
                }
                fVar.d = null;
                fVar.e = null;
            } else {
                BaseDelegatesActivity baseDelegatesActivity2 = (BaseDelegatesActivity) weakReference.get();
                if (baseDelegatesActivity2 != null) {
                    baseDelegatesActivity2.U0(fVar.f137715c);
                }
                fVar.f137715c = -1;
                dVar2.invoke();
            }
            fVar.f = true;
            ViewGroup viewGroupM0 = M0();
            if (viewGroupM0 != null) {
                ViewGroupCompat.installCompatInsetsDispatch(viewGroupM0);
            }
        } catch (Throwable th10) {
            this.g0 = h0.f322473a;
            throw new ActivityDelegatesInitializationException(th10);
        }
    }

    @Override // nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onDestroy();
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4) {
            this.f98688k0 = true;
        }
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(event, "event");
        }
        return super.onKeyDown(i, event);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(event, "event");
        }
        return super.onKeyUp(i, event);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).getClass();
            Intrinsics.checkNotNullParameter(intent, "intent");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onPause();
        }
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).x();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).o(i, permissions, grantResults);
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onResume();
        }
    }

    @Override // nri.b, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onSaveInstanceState(outState);
        }
        outState.putBoolean("STATE_IS_FIRST_START", this.i0);
    }

    @Override // nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.i0) {
            this.i0 = false;
            Set set = this.g0;
            if (set == null) {
                Intrinsics.r("delegates");
                throw null;
            }
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                ((fsi.a) it8.next()).u();
            }
        }
        Set set2 = this.g0;
        if (set2 == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            ((fsi.a) it9.next()).onStart();
        }
    }

    @Override // nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((fsi.a) it8.next()).onStop();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Set set = this.g0;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                ((fsi.a) it8.next()).getClass();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        f fVar = this.f98690o0;
        if (!fVar.f) {
            fVar.f137715c = i;
            return;
        }
        BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) fVar.f137714b.get();
        if (baseDelegatesActivity != null) {
            baseDelegatesActivity.U0(i);
        }
        fVar.f137713a.invoke();
    }

    @Override // nri.c
    public final void z0() {
        Set set = this.g0;
        Object obj2 = null;
        if (set == null) {
            Intrinsics.r("delegates");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((fsi.a) next) instanceof nri.c) {
                obj2 = next;
                break;
            }
        }
        fsi.a aVar = (fsi.a) obj2;
        if (aVar == null) {
            throw new IllegalStateException("delegate with ExternalActivityStartListener not found");
        }
        ((nri.c) aVar).z0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.f98690o0.a(view, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f98690o0.a(view, layoutParams);
    }
}
