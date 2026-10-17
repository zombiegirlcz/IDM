package b80;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import c49.d;
import com.google.android.gms.location.FusedLocationProviderClient;
import dqi.e;
import dqi.g;
import kfm.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13079c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f13077a = i;
        this.f13078b = obj2;
        this.f13079c = obj3;
    }

    @Override // kfm.f
    public final void cancel() {
        switch (this.f13077a) {
            case 0:
                c cVar = (c) this.f13078b;
                cVar.f13082a.unregisterNetworkCallback((b) this.f13079c);
                break;
            case 1:
                d dVar = (d) this.f13078b;
                c49.c receiver = (c49.c) this.f13079c;
                i4b.f fVar = dVar.f21125g;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(receiver, "receiver");
                ((Context) fVar.f158330b).unregisterReceiver(receiver);
                break;
            case 2:
                g gVar = (g) this.f13078b;
                gVar.N().removeOnScrollListener((e) this.f13079c);
                break;
            case 3:
                RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f13078b;
                dqi.d dVar2 = (dqi.d) this.f13079c;
                if (adapter != null) {
                    adapter.unregisterAdapterDataObserver(dVar2);
                }
                break;
            case 4:
                g gVar2 = (g) this.f13078b;
                gVar2.N().removeOnScrollListener((dqi.f) this.f13079c);
                break;
            case 5:
                t60.g gVar3 = (t60.g) this.f13078b;
                gVar3.f268128c.removeOnScrollListener((t60.e) this.f13079c);
                break;
            case 6:
                t60.g gVar4 = (t60.g) this.f13078b;
                gVar4.f268128c.removeOnScrollListener((t60.f) this.f13079c);
                break;
            case 7:
                RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) this.f13078b;
                t60.d dVar3 = (t60.d) this.f13079c;
                if (adapter2 != null) {
                    adapter2.unregisterAdapterDataObserver(dVar3);
                }
                break;
            default:
                zh0.e eVar = (zh0.e) this.f13078b;
                ((FusedLocationProviderClient) eVar.f322209c.getValue()).removeLocationUpdates((zh0.d) this.f13079c);
                break;
        }
    }
}
