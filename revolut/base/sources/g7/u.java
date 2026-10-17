package g7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e {
    public final Object i;

    public u(Object obj2, s7.c cVar) {
        super(Collections.EMPTY_LIST);
        k(cVar);
        this.i = obj2;
    }

    @Override // g7.e
    public final float c() {
        return 1.0f;
    }

    @Override // g7.e
    public final Object f() {
        s7.c cVar = this.e;
        Object obj2 = this.i;
        float f = this.d;
        return cVar.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, obj2, obj2, f, f, f);
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        return f();
    }

    @Override // g7.e
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // g7.e
    public final void j(float f) {
        this.d = f;
    }
}
