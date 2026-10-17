package du0;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f117510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117512c;
    public final float d;
    public final float e;
    public final float f;

    public c(RectF rect, eu0.b data, boolean z, RectF oppositeRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(oppositeRect, "oppositeRect");
        this.f117510a = rect;
        List list = z ? data.f129450a : data.f129451b;
        this.f117511b = list;
        float f = z ? data.f : data.f129454h;
        this.f117512c = f;
        float f4 = z ? data.e : data.f129453g;
        this.d = f4;
        float f5 = data.f129452c;
        float fAbs = BitmapDescriptorFactory.HUE_RED;
        if (f5 <= BitmapDescriptorFactory.HUE_RED || (!z ? data.f129454h < f5 : data.e > f5) || list.size() < 2) {
            this.f = rect.width();
            this.e = rect.left;
            return;
        }
        float f6 = (z ? data.f129453g : data.f) - f5;
        fAbs = f6 != BitmapDescriptorFactory.HUE_RED ? z ? Math.abs((f5 - f4) / f6) : Math.abs((f - f5) / f6) : fAbs;
        this.f = rect.width() + (oppositeRect.width() * fAbs);
        float f32 = rect.left;
        this.e = z ? f32 : f32 - (oppositeRect.width() * fAbs);
    }
}
