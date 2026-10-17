package nxg;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hw0.u;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements nxg.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f220574a = v.k(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(0.33f), Float.valueOf(0.66f), Float.valueOf(1.0f));

    public static final class a {
        private a() {
        }
    }

    public final ArrayList a() {
        List list = f220574a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new u(((Number) obj2).floatValue(), (i == 0 || i == v.j(list)) ? hw0.v.STRAIGHT : hw0.v.DASHED));
            i = i2;
        }
        return arrayList;
    }
}
