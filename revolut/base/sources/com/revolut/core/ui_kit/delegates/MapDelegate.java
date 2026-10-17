package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.kw;
import ip0.mw;
import ip0.ow;
import ip0.pw;
import ip0.qw;
import ip0.rw;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0007\u0002\u0007\u0003\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MapDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/w8;", "Lip0/pw;", "<init>", "()V", "Companion", "b", "ip0/rw", "ip0/qw", "ip0/mw", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapDelegate extends BaseRecyclerViewDelegate<w8, pw> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52762c;
    public final ihm.f d;
    public ai0.p e;
    public ai0.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ai0.m f52763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ai0.o f52764h;
    public ai0.u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ai0.c f52765j;
    public ai0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0m.c f52766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ai0.k f52767m;

    public static abstract class b {
        private b() {
        }
    }

    public MapDelegate() {
        super(R$layout.internal_delegate_map, new fv(6));
        this.f52762c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.f52766l = new e0m.c(new ip0.ad(this, 22));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        or0.u.h(parent).getClass();
        this.f52766l.a(th0.g.a());
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_map);
        Context applicationContext = parent.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (this.f52764h == null) {
            Intrinsics.r("mapOptionsFactory");
            throw null;
        }
        GoogleMapOptions internal = new GoogleMapOptions();
        Intrinsics.checkNotNullParameter(internal, "internal");
        GoogleMapOptions googleMapOptionsLiteMode = internal.liteMode(true);
        Intrinsics.checkNotNullExpressionValue(googleMapOptionsLiteMode, "liteMode(...)");
        ai0.r rVarA = ai0.s.a(applicationContext, new ai0.n(googleMapOptionsLiteMode));
        int i = R$id.internal_map_view;
        Intrinsics.checkNotNullParameter(rVarA, "<this>");
        rVarA.setId(i);
        ((FrameLayout) viewR.findViewById(R$id.map_viewContainer)).addView(rVarA);
        return new pw(this, viewR);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        ai0.k kVar = this.f52767m;
        if (kVar != null) {
            kVar.f5155a.clear();
            kVar.d(ah0.f.NONE);
            this.f52767m = null;
        }
    }

    public final void p(w8 w8Var, pw pwVar) {
        if (w8Var.f54899j) {
            pwVar.f165890n.setOnClickListener(new kw(this, w8Var, 0));
            pwVar.f165890n.setVisibility(0);
        } else {
            pwVar.f165890n.setOnClickListener(null);
            pwVar.f165890n.setVisibility(8);
        }
    }

    public final void q(w8 w8Var, pw pwVar, ah0.d dVar) {
        AppCompatImageView appCompatImageView = pwVar.k;
        b bVar = w8Var.d;
        appCompatImageView.setVisibility(8);
        FrameLayout frameLayout = pwVar.f165885g;
        b bVar2 = w8Var.d;
        boolean z = bVar2 instanceof x8;
        frameLayout.setVisibility(z ? 0 : 8);
        pwVar.f165889m.setVisibility(8);
        if (!z) {
            if (bVar2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (dVar != null) {
            Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            x8 x8Var = (x8) bVar2;
            double d = x8Var.f55597a;
            double d5 = x8Var.f55598b;
            Bitmap bitmap = pwVar.o;
            mw mwVar = w8Var.k;
            boolean z3 = w8Var.f54898h;
            ah0.a latLng = new ah0.a(d, d5);
            ai0.k kVar = (ai0.k) dVar;
            GoogleMap googleMap = kVar.f5155a;
            googleMap.clear();
            if (mwVar != null) {
                if (this.f52765j == null) {
                    Intrinsics.r("circleOptionsFactory");
                    throw null;
                }
                CircleOptions internal = new CircleOptions();
                Intrinsics.checkNotNullParameter(internal, "internal");
                r39.a circleOptions = new r39.a();
                Intrinsics.checkNotNullParameter(latLng, "position");
                internal.center(jb3.l.M(latLng));
                internal.strokeWidth(BitmapDescriptorFactory.HUE_RED);
                internal.fillColor(kli.a.s(mwVar.f165421a.a(), context));
                internal.radius(mwVar.f165422b);
                Intrinsics.checkNotNullParameter(circleOptions, "circleOptions");
                Intrinsics.checkNotNullParameter(circleOptions, "<this>");
                Circle internal2 = googleMap.addCircle(internal);
                Intrinsics.checkNotNullExpressionValue(internal2, "addCircle(...)");
                Intrinsics.checkNotNullParameter(internal2, "<this>");
                Intrinsics.checkNotNullParameter(internal2, "internal");
            }
            if (z3) {
                if (this.i == null) {
                    Intrinsics.r("markerOptionsFactory");
                    throw null;
                }
                MarkerOptions markerOptions = new MarkerOptions();
                o7.d markerOptions2 = new o7.d(markerOptions);
                Intrinsics.checkNotNullParameter(latLng, "latLng");
                markerOptions.position(jb3.l.M(latLng));
                markerOptions.anchor(0.5f, 0.5f);
                if (bitmap != null) {
                    if (this.k == null) {
                        Intrinsics.r("bitmapDescriptorFactory");
                        throw null;
                    }
                    markerOptions2.l(ai0.b.a(bitmap));
                }
                Intrinsics.checkNotNullParameter(markerOptions2, "markerOptions");
                Intrinsics.checkNotNullParameter(markerOptions2, "<this>");
                Marker internal3 = googleMap.addMarker(markerOptions);
                if (internal3 != null) {
                    Intrinsics.checkNotNullParameter(internal3, "<this>");
                    Intrinsics.checkNotNullParameter(internal3, "internal");
                }
            }
            if (this.f != null) {
                kVar.a(ai0.l.b(latLng, 14.0f));
            } else {
                Intrinsics.r("cameraUpdateFactory");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void r(pw pwVar, ai0.k kVar, w8 w8Var) {
        q(w8Var, pwVar, kVar);
        or0.b.e(this, w8Var.f54895b, pwVar.f165886h, null, 12);
        or0.b.e(this, w8Var.f54896c, pwVar.i, null, 12);
        Image image = w8Var.i;
        ImageView imageView = pwVar.f165888l;
        or0.b.f(this, image, imageView);
        p(w8Var, pwVar);
        imageView.setOnClickListener(new kw(this, w8Var, 1));
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(final pw holder, final w8 data, int i, List list) {
        Integer numValueOf;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        qw qwVar = data.f54897g;
        Integer num = data.e;
        Integer num2 = data.f;
        if (qwVar != null) {
            if (ow.f165733a[qwVar.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = ContextCompat.getDrawable(context, R$drawable.uikit_icn_circle_background);
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            if (drawableMutate != null) {
                drawableMutate.setTint(kli.a.s(R$attr.uikit_colorAccent, context));
            }
            Drawable drawable2 = ContextCompat.getDrawable(context, R$drawable.uikit_icn_24_location_pin);
            Drawable drawableMutate2 = drawable2 != null ? drawable2.mutate() : null;
            if (drawableMutate2 != null) {
                drawableMutate2.setTint(kli.a.s(R$attr.uikit_colorWhite, context));
            }
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) zhm.v.k(drawableMutate, drawableMutate2).toArray(new Drawable[0]));
            layerDrawable.setLayerInset(1, kli.a.k(context, 8.0f), kli.a.k(context, 8.0f), kli.a.k(context, 8.0f), kli.a.k(context, 8.0f));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
            layerDrawable.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
            layerDrawable.draw(canvasE);
            holder.o = bitmapCreateBitmap;
        } else if (num != null) {
            int iIntValue = num.intValue();
            Integer num3 = holder.f165891p;
            if (num3 == null || iIntValue != num3.intValue()) {
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    numValueOf = Integer.valueOf(kli.a.s(iIntValue2, context2));
                } else {
                    numValueOf = null;
                }
                Resources resources = holder.itemView.getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                holder.o = c8g.c.f(resources, num.intValue(), holder.itemView.getContext().getTheme(), numValueOf);
            }
        } else {
            holder.o = null;
        }
        holder.f165891p = num;
        if (this.f52767m == null) {
            ((ai0.r) holder.f).a(new ah0.h() { // from class: ip0.jw
                @Override // ah0.h
                public final void a(ai0.k msMap) {
                    MapDelegate mapDelegate = this.f164908a;
                    pw pwVar = holder;
                    com.revolut.core.ui_kit.delegates.w8 w8Var = data;
                    Intrinsics.checkNotNullParameter(msMap, "msMap");
                    try {
                        mapDelegate.f52767m = msMap;
                        msMap.d(ah0.f.NORMAL);
                        ((UiSettings) msMap.b().f5156a).setMapToolbarEnabled(false);
                        if (mapDelegate.e == null) {
                            Intrinsics.r("mapStyleOptionsFactory");
                            throw null;
                        }
                        Context context3 = i26.l.a(pwVar.f, null).getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        msMap.c(ai0.p.a(R$raw.uikit_common_map_style, context3));
                        mapDelegate.r(pwVar, msMap, w8Var);
                    } catch (Exception unused) {
                        pwVar.f165885g.setVisibility(8);
                    }
                }
            });
        }
        if (payloads.isEmpty()) {
            payloads = null;
        }
        if (payloads == null) {
            r(holder, this.f52767m, data);
            return;
        }
        ArrayList<rw> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof rw) {
                arrayList.add(obj2);
            }
        }
        for (rw rwVar : arrayList) {
            ai0.k kVar = this.f52767m;
            if (kVar != null) {
                if (rwVar.f166250c) {
                    q(data, holder, kVar);
                }
                if (rwVar.f166248a) {
                    or0.b.e(this, data.f54895b, holder.f165886h, null, 12);
                }
                if (rwVar.f166249b) {
                    or0.b.e(this, data.f54896c, holder.i, null, 12);
                }
                if (rwVar.d) {
                    or0.b.f(this, data.i, holder.f165888l);
                }
                if (rwVar.e) {
                    p(data, holder);
                }
            }
        }
    }
}
