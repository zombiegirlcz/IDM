package p7;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpi.g f233464a = cpi.g.G("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233465b = cpi.g.G("k");

    public static void a(l7.b bVar, d7.j jVar) {
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        List list = (List) bVar.f22248b;
        if (list.isEmpty()) {
            list.add(new s7.a(jVar, fValueOf, fValueOf, (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(jVar.f111684m)));
        } else if (((s7.a) list.get(0)).f260482b == null) {
            list.set(0, new s7.a(jVar, fValueOf, fValueOf, (Interpolator) null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(jVar.f111684m)));
        }
    }

    public static boolean b(l7.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((s7.a) ((List) bVar.f22248b).get(0)).f260482b).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l7.f c(q7.e r27, d7.j r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.c.c(q7.e, d7.j):l7.f");
    }
}
