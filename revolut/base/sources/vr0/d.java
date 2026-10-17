package vr0;

import ai0.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.collection.LruCache;
import aw0.o9;
import com.google.maps.android.ui.RotationLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.BubbleTooltipView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.revolut.feature_fourthline_impl.R;
import i4b.f;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.b2;
import ms0.c2;
import ms0.d2;
import ms0.x1;
import ms0.z1;
import yhm.j;
import yv0.g;
import yv0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f291452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0.b f291453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f291454c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f291455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f291456h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LruCache f291457j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f291458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f291459m;

    public d(Context context, th0.b mapServices, b callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapServices, "mapServices");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f291452a = context;
        this.f291453b = mapServices;
        this.f291454c = callback;
        mapServices.getClass();
        final int i = 0;
        this.d = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        final int i2 = 1;
        this.e = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        final int i3 = 2;
        this.f = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        final int i5 = 3;
        this.f291455g = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        final int i6 = 4;
        this.f291456h = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        final int i21 = 5;
        this.i = j.b(new Function0(this) { // from class: vr0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f291448b;

            {
                this.f291448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return new b2(this.f291448b.f291452a, null, 6, 0);
                    case 1:
                        return new c2(this.f291448b.f291452a, null, 6, 0);
                    case 2:
                        return new BubbleTooltipView(this.f291448b.f291452a, null, 6, 0);
                    case 3:
                        d dVar = this.f291448b;
                        dVar.f291453b.getClass();
                        Context context2 = dVar.f291452a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        uc.d dVar2 = new uc.d(context2);
                        h hVar = new h(dVar2);
                        b2 view = (b2) dVar.d.getValue();
                        Intrinsics.checkNotNullParameter(view, "view");
                        RotationLayout rotationLayout = (RotationLayout) dVar2.f278953b;
                        rotationLayout.removeAllViews();
                        rotationLayout.addView(view);
                        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
                        dVar2.f278954c = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                        return hVar;
                    case 4:
                        d dVar3 = this.f291448b;
                        dVar3.f291453b.getClass();
                        Context context3 = dVar3.f291452a;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        uc.d dVar4 = new uc.d(context3);
                        h hVar2 = new h(dVar4);
                        c2 view2 = (c2) dVar3.e.getValue();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        RotationLayout rotationLayout2 = (RotationLayout) dVar4.f278953b;
                        rotationLayout2.removeAllViews();
                        rotationLayout2.addView(view2);
                        View viewFindViewById2 = rotationLayout2.findViewById(R.id.amu_text);
                        dVar4.f278954c = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
                        return hVar2;
                    default:
                        d dVar5 = this.f291448b;
                        dVar5.f291453b.getClass();
                        Context context4 = dVar5.f291452a;
                        Intrinsics.checkNotNullParameter(context4, "context");
                        uc.d dVar6 = new uc.d(context4);
                        h hVar3 = new h(dVar6);
                        BubbleTooltipView view3 = (BubbleTooltipView) dVar5.f.getValue();
                        Intrinsics.checkNotNullParameter(view3, "view");
                        RotationLayout rotationLayout3 = (RotationLayout) dVar6.f278953b;
                        rotationLayout3.removeAllViews();
                        rotationLayout3.addView(view3);
                        View viewFindViewById3 = rotationLayout3.findViewById(R.id.amu_text);
                        dVar6.f278954c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
                        return hVar3;
                }
            }
        });
        this.f291457j = new LruCache(30);
        this.k = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f291458l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f291459m = true;
    }

    public final c a(f fVar) {
        Lazy lazy = this.d;
        ((b2) lazy.getValue()).setContent(new x1(new TextClause(String.valueOf(((rg.a) fVar.f158330b).getSize()), (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), R$attr.uikit_colorAccent_20), null, null, z1.Marker40);
        Bitmap bitmapJ = ((h) this.f291455g.getValue()).f5151a.j();
        Intrinsics.checkNotNullExpressionValue(bitmapJ, "makeIcon(...)");
        Intrinsics.checkNotNullExpressionValue(((b2) lazy.getValue()).getContext(), "getContext(...)");
        return new c(ai0.b.a(bitmapJ), (kli.a.k(r0, r2.c()) / 2) / bitmapJ.getWidth(), 1.0f);
    }

    public final c b(i iVar) {
        yv0.f fVar;
        yv0.d aVar = iVar.f317072b;
        yv0.f fVar2 = iVar.e;
        boolean z = aVar instanceof yv0.c;
        LruCache lruCache = this.f291457j;
        if (z) {
            BitmapImage bitmapImage = (BitmapImage) lruCache.get(((yv0.c) aVar).f317065a);
            if (bitmapImage == null) {
                c(((yv0.c) aVar).f317065a);
            }
            if (bitmapImage != null) {
                aVar = new yv0.a(bitmapImage);
            }
        }
        yv0.d aVar2 = fVar2 != null ? fVar2.d : null;
        if (aVar2 instanceof yv0.c) {
            UrlImage urlImage = ((yv0.c) aVar2).f317065a;
            BitmapImage bitmapImage2 = (BitmapImage) lruCache.get(urlImage);
            if (bitmapImage2 == null) {
                c(urlImage);
            }
            if (bitmapImage2 != null) {
                aVar2 = new yv0.a(bitmapImage2);
            }
        }
        Lazy lazy = this.e;
        c2 c2Var = (c2) lazy.getValue();
        Image image = aVar.getImage();
        Color.Solid solid = iVar.f;
        Color color = iVar.f317074g;
        TextClause textClause = iVar.f317073c;
        if (fVar2 != null) {
            Clause value = fVar2.f317066a;
            g backgroundColor = fVar2.f317067b;
            Color foregroundColor = fVar2.f317068c;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
            fVar = new yv0.f(value, backgroundColor, foregroundColor, aVar2);
        } else {
            fVar = null;
        }
        c2Var.setContent(new d2(image, solid, color, textClause, fVar, iVar.d));
        Bitmap bitmapJ = ((h) this.f291456h.getValue()).f5151a.j();
        Intrinsics.checkNotNullExpressionValue(bitmapJ, "makeIcon(...)");
        return new c(ai0.b.a(bitmapJ), ((c2) lazy.getValue()).getAnchorU(), ((c2) lazy.getValue()).getAnchorV());
    }

    public final void c(Image image) {
        Set set = this.k;
        if (set.contains(image)) {
            return;
        }
        Context context = this.f291452a;
        int iK = kli.a.k(context, 40.0f);
        set.add(image);
        jh.d.f(context).Q().c(image, this.f291452a, iK, iK, new vgk.f(this, image, 25), new vqd.b(this, image, 2));
    }

    public final void d() {
        Set<Image> failedRequests = this.f291458l;
        Intrinsics.checkNotNullExpressionValue(failedRequests, "failedRequests");
        for (Image image : failedRequests) {
            Intrinsics.h(image);
            c(image);
        }
    }
}
