package sz;

import android.content.Context;
import android.graphics.Path;
import cmi.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f266712a;

    public b(Context context, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f266712a = context;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f266712a = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f266712a = context;
                break;
        }
    }

    public n a() {
        emi.a aVar = (emi.a) e.i(e.j(this.f266712a), emi.a.class);
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public Path b() {
        Path path = new Path();
        Context context = this.f266712a;
        path.moveTo(l.g(context, 272.0f), l.g(context, 168.0f));
        path.cubicTo(l.g(context, 272.0f), l.g(context, 283.1f), l.g(context, 227.1f), l.g(context, 400.0f), l.g(context, 136.0f), l.g(context, 400.0f));
        path.cubicTo(l.g(context, 44.9f), l.g(context, 400.0f), l.g(context, BitmapDescriptorFactory.HUE_RED), l.g(context, 291.1f), l.g(context, BitmapDescriptorFactory.HUE_RED), l.g(context, 168.0f));
        path.cubicTo(l.g(context, BitmapDescriptorFactory.HUE_RED), l.g(context, 44.9f), l.g(context, 60.9f), l.g(context, BitmapDescriptorFactory.HUE_RED), l.g(context, 136.0f), l.g(context, BitmapDescriptorFactory.HUE_RED));
        path.cubicTo(l.g(context, 211.1f), l.g(context, BitmapDescriptorFactory.HUE_RED), l.g(context, 272.0f), l.g(context, 44.9f), l.g(context, 272.0f), l.g(context, 168.0f));
        path.close();
        return path;
    }
}
