package fjd;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jid.t f135568b;

    public /* synthetic */ d0(jid.t tVar, int i) {
        this.f135567a = i;
        this.f135568b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f135567a) {
            case 0:
                return o.a((o) obj2, null, this.f135568b, null, null, null, null, null, null, null, false, null, null, null, 0L, 16381);
            default:
                return com.revolut.feature.shops.impl.ui.map_view.b.a((com.revolut.feature.shops.impl.ui.map_view.b) obj2, this.f135568b, false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, 1022);
        }
    }
}
