package g7;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes16.dex */
public final class p extends e {
    public final PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f141047j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f141048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s7.c f141049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s7.c f141050n;

    public p(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f141047j = new PointF();
        this.k = iVar;
        this.f141048l = iVar2;
        j(this.d);
    }

    @Override // g7.e
    public final Object f() {
        return m();
    }

    @Override // g7.e
    public final /* bridge */ /* synthetic */ Object g(s7.a aVar, float f) {
        return m();
    }

    @Override // g7.e
    public final void j(float f) {
        i iVar = this.k;
        iVar.j(f);
        i iVar2 = this.f141048l;
        iVar2.j(f);
        this.i.set(((Float) iVar.f()).floatValue(), ((Float) iVar2.f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f141027a;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).d();
            i++;
        }
    }

    public final PointF m() {
        Float f;
        i iVar;
        s7.a aVarB;
        i iVar2;
        s7.a aVarB2;
        Float f4 = null;
        if (this.f141049m == null || (aVarB2 = (iVar2 = this.k).b()) == null) {
            f = null;
        } else {
            Float f5 = aVarB2.f260485h;
            s7.c cVar = this.f141049m;
            float f6 = aVarB2.f260484g;
            f = (Float) cVar.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) aVarB2.f260482b, (Float) aVarB2.f260483c, iVar2.d(), iVar2.e(), iVar2.d);
        }
        if (this.f141050n != null && (aVarB = (iVar = this.f141048l).b()) != null) {
            Float f32 = aVarB.f260485h;
            s7.c cVar2 = this.f141050n;
            float f35 = aVarB.f260484g;
            f4 = (Float) cVar2.b(f35, f32 == null ? f35 : f32.floatValue(), (Float) aVarB.f260482b, (Float) aVarB.f260483c, iVar.d(), iVar.e(), iVar.d);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.f141047j;
        if (f == null) {
            pointF2.set(pointF.x, BitmapDescriptorFactory.HUE_RED);
        } else {
            pointF2.set(f.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        if (f4 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f4.floatValue());
        return pointF2;
    }

    public final void n(s7.c cVar) {
        s7.c cVar2 = this.f141049m;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f141049m = cVar;
    }

    public final void o(s7.c cVar) {
        s7.c cVar2 = this.f141050n;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f141050n = cVar;
    }
}
