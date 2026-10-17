package lt0;

import android.content.Context;
import android.graphics.DashPathEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199743c;
    public final int d;
    public final int e;
    public final DashPathEffect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f199744g;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f199741a = kli.a.k(context, 4.0f);
        this.f199742b = kli.a.k(context, 13.5f);
        this.f199743c = kli.a.k(context, 3.0f);
        this.d = kli.a.k(context, 3.5f);
        this.e = kli.a.k(context, 8.0f);
        Float fValueOf = Float.valueOf(2.0f);
        List listK = zhm.v.k(fValueOf, fValueOf);
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(kli.a.k(context, ((Number) it8.next()).floatValue())));
        }
        this.f = new DashPathEffect(d0.a1(arrayList), BitmapDescriptorFactory.HUE_RED);
        this.f199744g = 1000L;
    }
}
