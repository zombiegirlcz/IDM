package dv5;

import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;
import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import dwi.f0;
import dwi.j0;
import dwi.o0;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements kfm.g, kfm.o, SurfaceRequest.TransformationInfoListener, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118050b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f118049a = i;
        this.f118050b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f118049a) {
            case 0:
                ((m) this.f118050b).invoke(obj2);
                break;
            case 8:
                ((dwi.e) this.f118050b).invoke(obj2);
                break;
            case 9:
                ((dwi.f) this.f118050b).invoke(obj2);
                break;
            case 19:
                ((o0) this.f118050b).invoke(obj2);
                break;
            default:
                ((doe.c) this.f118050b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f118049a) {
            case 1:
                ds4.b bVar = (ds4.b) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) bVar.invoke(p0);
            case 2:
            case 3:
            case 4:
            case 8:
            case 9:
            case 19:
            default:
                dz7.k kVar = (dz7.k) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Iterable) kVar.invoke(p0);
            case 5:
                dwi.f fVar = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) fVar.invoke(p0);
            case 6:
                dwi.e eVar = (dwi.e) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar.invoke(p0);
            case 7:
                dwi.e eVar2 = (dwi.e) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) eVar2.invoke(p0);
            case 10:
                dwi.e eVar3 = (dwi.e) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) eVar3.invoke(p0);
            case 11:
                dug.a aVar = (dug.a) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 12:
                dwi.f fVar2 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar2.invoke(p0);
            case 13:
                dwi.f fVar3 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) fVar3.invoke(p0);
            case 14:
                f0 f0Var = (f0) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) f0Var.invoke(p0);
            case 15:
                j0 j0Var = (j0) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) j0Var.invoke(p0);
            case 16:
                dwi.f fVar4 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) fVar4.invoke(p0);
            case 17:
                o0 o0Var = (o0) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) o0Var.invoke(p0);
            case 18:
                o0 o0Var2 = (o0) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) o0Var2.invoke(p0);
            case 20:
                cia.d dVar = (cia.d) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 21:
                doe.c cVar = (doe.c) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar.invoke(p0);
            case 22:
                dwi.f fVar5 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                fVar5.invoke(p0);
                return Boolean.TRUE;
            case 23:
                dy7.a aVar2 = (dy7.a) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 24:
                dwi.f fVar6 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) fVar6.invoke(p0);
            case 25:
                dwi.f fVar7 = (dwi.f) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar7.invoke(p0);
            case 26:
                dy7.a aVar3 = (dy7.a) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar3.invoke(p0);
            case 27:
                dug.a aVar4 = (dug.a) this.f118050b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dz7.c) aVar4.invoke(p0);
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo info) {
        dw.b bVar = (dw.b) this.f118050b;
        Intrinsics.checkNotNullParameter(info, "info");
        bVar.f = info.isMirroring();
        dw.j jVar = bVar.f118163a;
        Integer[] elements = {1, 3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (kotlin.collections.d.y0(elements).contains(Integer.valueOf((info.getRotationDegrees() % 360) / 90))) {
            jVar.d(new Rect(0, 0, info.getCropRect().height(), info.getCropRect().width()));
            return;
        }
        Rect cropRect = info.getCropRect();
        Intrinsics.checkNotNullExpressionValue(cropRect, "getCropRect(...)");
        jVar.d(cropRect);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f118049a;
        ds4.b bVar = (ds4.b) this.f118050b;
        switch (i) {
            case 3:
                KProperty[] kPropertyArr = TicketDetailsScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr2 = TicketDetailsScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) bVar.invoke(p0)).booleanValue();
    }
}
