package tg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.ui.RotationLayout;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import smd.s;

/* JADX INFO: loaded from: classes17.dex */
public class m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f271026q = {10, 20, 50, 100, 200, 500, 1000};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final DecelerateInterpolator f271027r = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleMap f271028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.d f271029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rg.c f271030c;
    public final ShapeDrawable f;
    public Set k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f271035m;
    public aed.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public aed.f f271037p;
    public final ExecutorService e = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f271031g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f271032h = new SparseArray();
    public final s i = new s();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f271033j = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f271034l = new s();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f271036n = new l(this);
    public final boolean d = true;

    public m(Context context, GoogleMap googleMap, rg.c cVar) {
        this.f271028a = googleMap;
        float f = context.getResources().getDisplayMetrics().density;
        uc.d dVar = new uc.d(context);
        this.f271029b = dVar;
        yg.b bVar = new yg.b(context);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        bVar.setId(R.id.amu_text);
        int i = (int) (12.0f * f);
        bVar.setPadding(i, i, i, i);
        RotationLayout rotationLayout = (RotationLayout) dVar.f278953b;
        rotationLayout.removeAllViews();
        rotationLayout.addView(bVar);
        View viewFindViewById = rotationLayout.findViewById(R.id.amu_text);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        dVar.f278954c = textView;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_ClusterIcon_TextAppearance);
        }
        this.f = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f});
        int i2 = (int) (f * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        dVar.n(layerDrawable);
        this.f271030c = cVar;
    }

    public static wg.a a(m mVar, ArrayList arrayList, wg.a aVar) {
        wg.a aVar2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = mVar.f271030c.d.f262571b.f262569b.f262567b;
            double d = i * i;
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                wg.a aVar3 = (wg.a) it8.next();
                double d5 = aVar3.f297214a - aVar.f297214a;
                double d6 = aVar3.f297215b - aVar.f297215b;
                double d10 = (d6 * d6) + (d5 * d5);
                if (d10 < d) {
                    aVar2 = aVar3;
                    d = d10;
                }
            }
        }
        return aVar2;
    }

    public final BitmapDescriptor b(rg.a aVar) {
        int size = aVar.getSize();
        int[] iArr = f271026q;
        if (size > iArr[0]) {
            int i = 0;
            while (true) {
                if (i >= 6) {
                    size = iArr[6];
                    break;
                }
                int i2 = i + 1;
                if (size < iArr[i2]) {
                    size = iArr[i];
                    break;
                }
                i = i2;
            }
        }
        SparseArray sparseArray = this.f271032h;
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) sparseArray.get(size);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        Paint paint = this.f.getPaint();
        float fMin = 300.0f - Math.min(size, 300.0f);
        paint.setColor(Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
        String strValueOf = size < iArr[0] ? String.valueOf(size) : a0.d.h(size, "+");
        uc.d dVar = this.f271029b;
        TextView textView = (TextView) dVar.f278954c;
        if (textView != null) {
            textView.setText(strValueOf);
        }
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(dVar.j());
        sparseArray.put(size, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    public final void c() {
        rg.c cVar = this.f271030c;
        ug.b bVar = cVar.f253990b;
        bVar.e = new a(this);
        bVar.f279913c = new b(this);
        bVar.d = new c(this);
        ug.b bVar2 = cVar.f253991c;
        bVar2.e = new d(this);
        bVar2.f279913c = new e(this);
        bVar2.d = new f(this);
    }

    public void d(ai0.d dVar, MarkerOptions markerOptions) {
        yv0.k kVar = dVar.f5146a;
        kVar.getClass();
        kVar.getClass();
    }

    public void e(rg.a aVar, MarkerOptions markerOptions) {
        markerOptions.icon(b(aVar));
    }

    public void f(ai0.d dVar, Marker marker) {
        yv0.k kVar = dVar.f5146a;
        kVar.getClass();
        kVar.getClass();
        if (marker.getPosition().equals(dVar.a())) {
            return;
        }
        marker.setPosition(dVar.a());
        if (marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    public void g(rg.a aVar, Marker marker) {
        marker.setIcon(b(aVar));
    }

    public boolean h(rg.a aVar) {
        return aVar.getSize() >= this.f271033j;
    }
}
