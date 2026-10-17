package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.d0;
import ix0.w0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.b2;
import ms0.w1;
import ms0.z1;
import mx0.s2;
import mx0.t9;
import org.jetbrains.annotations.NotNull;
import zhm.a1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0005:;<=\u0016B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u001b\u001a\u00020\n2\b\b\u0003\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J5\u0010)\u001a\u00020\u000e2\b\b\u0001\u0010%\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020\n2\b\b\u0001\u0010(\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020!0.¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b5\u00104R\u001a\u00106\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/revolut/core/ui_kit/views/MapView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/LifecycleObserver;", "Lvr0/b;", "Lny0/h;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onCreate", "()V", "onPause", "onResume", "onStart", "onStop", "onDestroy", "Lmx0/t9;", "markers", "setMarkers", "(Lmx0/t9;)V", "drawableRes", "colorAttr", "backgroundColorAttr", "setCenteredIconMarker", "(III)V", "", "enabled", "", "paddingDp", "setClusterClickToZoom", "(ZF)V", "left", "top", "right", "bottom", "setMapPadding", "(IIII)V", "locationIsVisible", "setLocationVisible", "(Z)V", "Lefm/d0;", "getMapRatio", "()Lefm/d0;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "setLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "setLifecycleInternal", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "mx0/q9", "mx0/s9", "mx0/u9", "mx0/r9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapView extends ConstraintLayout implements LifecycleObserver, vr0.b, ny0.h, w0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f58767w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0.b f58768b;
    public final ai0.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ai0.m f58769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ai0.f f58770h;
    public final wt0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vr0.d f58771j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f58772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f58773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.b f58774n;
    public final ihm.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f58775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f58776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Set f58777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Lifecycle f58778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f58779t;
    public Insets u;
    public Insets v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void j0(ai0.k kVar, zjh.j update, boolean z) {
        if (z) {
            kVar.a(update);
            return;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(update, "update");
        GoogleMap googleMap = kVar.f5155a;
        Intrinsics.checkNotNullParameter(update, "<this>");
        googleMap.moveCamera((CameraUpdate) update.f322839a);
    }

    public static /* synthetic */ void setCenteredIconMarker$default(MapView mapView, int i, int i2, int i3, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            i2 = R$attr.uikit_colorAccent;
        }
        if ((i5 & 4) != 0) {
            i3 = R$attr.uikit_colorAccent_10;
        }
        mapView.setCenteredIconMarker(i, i2, i3);
    }

    public static /* synthetic */ void setClusterClickToZoom$default(MapView mapView, boolean z, float f, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = 64.0f;
        }
        mapView.setClusterClickToZoom(z, f);
    }

    private final void setLifecycleInternal(Lifecycle lifecycle) {
        this.f58778s = lifecycle;
        lifecycle.addObserver(this);
    }

    public final void f0() {
        Insets insetsAdd = Insets.add(this.u, this.v);
        Intrinsics.checkNotNullExpressionValue(insetsAdd, "add(...)");
        ai0.k kVar = this.i.f299762a;
        if (kVar != null) {
            kVar.f5155a.setPadding(insetsAdd.left, insetsAdd.top, insetsAdd.right, insetsAdd.bottom);
        }
    }

    public final void g0(ah0.a location, float f, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        ai0.k kVar = this.i.f299762a;
        if (kVar != null) {
            this.f58768b.getClass();
            j0(kVar, ai0.l.b(location, f), z);
        }
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @NotNull
    public final d0<Float> getMapRatio() {
        d0<Float> d0VarFirstOrError = te0.w.l(this.f58774n, this.o).map(new s2(new mul.k(25), 21)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final void h0(ah0.a position, boolean z) {
        Intrinsics.checkNotNullParameter(position, "location");
        ai0.k kVar = this.i.f299762a;
        if (kVar != null) {
            this.f58768b.getClass();
            Intrinsics.checkNotNullParameter(position, "position");
            CameraUpdate cameraUpdateNewLatLng = CameraUpdateFactory.newLatLng(jb3.l.M(position));
            Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLng, "newLatLng(...)");
            j0(kVar, new zjh.j(cameraUpdateNewLatLng), z);
        }
    }

    public final void i0(ah0.b bounds, boolean z) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        ai0.k kVar = this.i.f299762a;
        if (kVar != null) {
            this.f58768b.getClass();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j0(kVar, ai0.l.a(bounds, kli.a.k(context, 16.0f)), z);
        }
    }

    public final pfm.h l0() {
        d0 d0VarFirstOrError = this.f58774n.firstOrError();
        d0VarFirstOrError.getClass();
        pfm.h hVar = new pfm.h(d0VarFirstOrError, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = getInsetsAdjustable() ? WindowInsetsCompat.toWindowInsetsCompat(insets, this).getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()) : Insets.NONE;
        Intrinsics.h(insets2);
        if (!Intrinsics.f(this.v, insets2)) {
            this.v = insets2;
            f0();
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.f.onCreate(null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f58769g.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        MapsInitializer.initialize(context);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.f.onDestroy();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.f.onPause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f.onResume();
        this.f58771j.d();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.f.onStart();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.f.onStop();
    }

    @Override // vr0.b
    public final void p(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ai0.e eVar = this.i.f299763b;
        if (eVar != null) {
            boolean z = false;
            for (yv0.k kVar : this.f58777r) {
                if (!(kVar instanceof yv0.i)) {
                    if (!(kVar instanceof yv0.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (Intrinsics.f(((yv0.i) kVar).f317072b.getImage(), image)) {
                    eVar.d(kVar);
                    eVar.a(kVar);
                    z = true;
                }
            }
            if (z) {
                eVar.c();
            }
        }
    }

    public final void setCenteredIconMarker(int drawableRes, int colorAttr, int backgroundColorAttr) {
        int i = 0;
        if (findViewById(R$id.internal_horizontal_guideline) == null) {
            View guideline = new Guideline(getContext());
            guideline.setId(R$id.internal_horizontal_guideline);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.orientation = 0;
            layoutParams.guidePercent = 0.5f;
            guideline.setLayoutParams(layoutParams);
            addView(guideline);
        }
        b2 b2Var = (b2) findViewById(R$id.internal_centered_marker_view);
        AttributeSet attributeSet = null;
        if (b2Var == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b2Var = new b2(context, attributeSet, 6, i);
            b2Var.setId(R$id.internal_centered_marker_view);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.orientation = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.bottomToTop = R$id.internal_horizontal_guideline;
            b2Var.setLayoutParams(layoutParams2);
        }
        b2Var.setContent(new w1(new yv0.b(new ResourceImage(drawableRes, (Integer) null, (Integer) null, Integer.valueOf(colorAttr), (List) null, (ImageTransformations) null, (Clause) null, 246), true), backgroundColorAttr), null, null, z1.Marker24);
        if (indexOfChild(b2Var) != -1) {
            return;
        }
        addView(b2Var);
    }

    public final void setClusterClickToZoom(boolean enabled, float paddingDp) {
        this.f58775p = enabled;
        this.f58776q = paddingDp;
        ai0.e eVar = this.i.f299763b;
        if (eVar != null) {
            rg.c cVar = eVar.f5147a;
            if (!enabled) {
                cVar.k = null;
                cVar.e.o = null;
            } else {
                aed.f fVar = new aed.f(new s2(this, 22), 27);
                cVar.k = fVar;
                cVar.e.o = fVar;
            }
        }
    }

    public final void setLifecycle(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Lifecycle lifecycle2 = this.f58778s;
        if (!Intrinsics.f(lifecycle2, lifecycle) && lifecycle2 == null) {
            setLifecycleInternal(lifecycle);
        }
    }

    public final void setLocationVisible(boolean locationIsVisible) {
        ai0.k kVar = this.i.f299762a;
        if (kVar != null) {
            kVar.f5155a.setMyLocationEnabled(locationIsVisible);
            ((UiSettings) kVar.b().f5156a).setMyLocationButtonEnabled(false);
        }
    }

    public final void setMapPadding(int left, int top, int right, int bottom) {
        Insets insetsOf = Insets.of(left, top, right, bottom);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        this.u = insetsOf;
        f0();
    }

    public final void setMarkers(@NotNull t9 markers) {
        ai0.e eVar;
        Intrinsics.checkNotNullParameter(markers, "markers");
        vr0.d dVar = this.f58771j;
        boolean z = dVar.f291459m;
        boolean z3 = markers.f210020b;
        boolean z4 = z != z3;
        dVar.f291459m = z3;
        Set setH1 = zhm.d0.h1(markers.f210019a);
        Set setK = a1.k(this.f58777r, setH1);
        Set setK2 = a1.k(setH1, this.f58777r);
        if ((!setK.isEmpty() || !setK2.isEmpty() || z4) && (eVar = this.i.f299763b) != null) {
            Iterator it8 = setK.iterator();
            while (it8.hasNext()) {
                eVar.d((yv0.k) it8.next());
            }
            Iterator it9 = setK2.iterator();
            while (it9.hasNext()) {
                eVar.a((yv0.k) it9.next());
            }
            eVar.c();
        }
        this.f58777r = setH1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = new wt0.c();
        this.k = v0.a.d("create(...)");
        this.f58772l = v0.a.d("create(...)");
        this.f58773m = v0.a.d("create(...)");
        this.f58774n = j6.a.h("create(...)");
        ihm.b bVarH = j6.a.h("create(...)");
        this.o = bVarH;
        this.f58776q = 64.0f;
        this.f58777r = new LinkedHashSet();
        Insets NONE = Insets.NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.u = NONE;
        Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
        this.v = NONE;
        View.inflate(context, R$layout.internal_view_map, this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.uikit_MapView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f58779t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.uikit_MapView_uikit_hasToolbar, false);
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        or0.u.h(this).getClass();
        th0.b bVarA = th0.g.a();
        this.f58768b = bVarA;
        this.f58769g = new ai0.m();
        this.f58770h = new ai0.f();
        GoogleMapOptions internal = new GoogleMapOptions();
        Intrinsics.checkNotNullParameter(internal, "internal");
        GoogleMapOptions googleMapOptionsMapToolbarEnabled = internal.mapToolbarEnabled(false);
        Intrinsics.checkNotNullExpressionValue(googleMapOptionsMapToolbarEnabled, "mapToolbarEnabled(...)");
        ai0.r rVarA = ai0.s.a(context, new ai0.n(googleMapOptionsMapToolbarEnabled));
        this.f = rVarA;
        int i2 = R$id.internal_mapPlain_mapView;
        Intrinsics.checkNotNullParameter(rVarA, "<this>");
        rVarA.setId(i2);
        addView(rVarA);
        this.f58771j = new vr0.d(context, bVarA, this);
        View viewA = i26.l.a(rVarA, null);
        if (viewA.isLaidOut() && !viewA.isLayoutRequested()) {
            bVarH.onNext(Unit.f186387a);
        } else {
            viewA.addOnLayoutChangeListener(new cli.u(this, 10));
        }
        rVarA.a(new ah0.h() { // from class: mx0.p9
            @Override // ah0.h
            public final void a(ai0.k msMap) {
                int i3 = MapView.f58767w;
                Intrinsics.checkNotNullParameter(msMap, "msMap");
                MapView mapView = this.f209934a;
                th0.b bVar = mapView.f58768b;
                int i5 = 0;
                wt0.a listener = new wt0.a(msMap, new v9(1, mapView.k, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, i5), new v9(1, mapView.f58772l, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", i5, 1));
                wt0.c cVar = mapView.i;
                ai0.f fVar = mapView.f58770h;
                Context context2 = mapView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                fVar.getClass();
                ai0.e listener2 = ai0.f.a(context2, msMap);
                boolean z = mapView.f58779t;
                a7 markerClickListener = new a7(mapView, 3);
                cVar.getClass();
                Intrinsics.checkNotNullParameter(msMap, "msMap");
                Intrinsics.checkNotNullParameter(listener2, "clusterManager");
                Intrinsics.checkNotNullParameter(markerClickListener, "markerClickListener");
                Intrinsics.checkNotNullParameter(listener, "boundariesListener");
                cVar.f299762a = msMap;
                cVar.f299763b = listener2;
                com.onfido.android.sdk.capture.internal.service.a listener3 = new com.onfido.android.sdk.capture.internal.service.a(markerClickListener, !z);
                Intrinsics.checkNotNullParameter(listener3, "listener");
                rg.c cVar2 = listener2.f5147a;
                aed.f fVar2 = new aed.f(listener3, 28);
                cVar2.f253994j = fVar2;
                cVar2.e.f271037p = fVar2;
                Intrinsics.checkNotNullParameter(listener, "listener");
                GoogleMap googleMap = msMap.f5155a;
                googleMap.setOnCameraMoveStartedListener(new ai0.j(listener, 0));
                wt0.d listener4 = new wt0.d(zhm.v.k(listener, listener2));
                Intrinsics.checkNotNullParameter(listener4, "listener");
                googleMap.setOnCameraIdleListener(new ai0.i(listener4));
                Intrinsics.checkNotNullParameter(listener2, "listener");
                googleMap.setOnMarkerClickListener(new aed.f(listener2, 29));
                ai0.e eVar = cVar.f299763b;
                if (eVar != null) {
                    eVar.e(mapView.f58771j);
                }
                ai0.e eVar2 = cVar.f299763b;
                if (eVar2 != null) {
                    rg.c cVar3 = eVar2.f5147a;
                    if (mapView.f58775p) {
                        aed.f fVar3 = new aed.f(new s2(mapView, 22), 27);
                        cVar3.k = fVar3;
                        cVar3.e.o = fVar3;
                    } else {
                        cVar3.k = null;
                        cVar3.e.o = null;
                    }
                }
                bVar.getClass();
                Context context3 = mapView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                msMap.c(ai0.p.a(R$raw.uikit_common_map_style, context3));
                msMap.d(ah0.f.NORMAL);
                ((UiSettings) msMap.b().f5156a).setMapToolbarEnabled(z);
                ((UiSettings) msMap.b().f5156a).setMyLocationButtonEnabled(false);
                ((UiSettings) msMap.b().f5156a).setRotateGesturesEnabled(false);
                ((UiSettings) msMap.b().f5156a).setZoomControlsEnabled(false);
                mapView.f0();
                mapView.f58774n.onNext(mapView.f);
            }
        });
        post(new kt0.d(this, 19));
    }

    public /* synthetic */ MapView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
