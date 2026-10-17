package ipi;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import z4l.j;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f167750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.ItemAnimator f167751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f167752c;
    public final float d;
    public final boolean e;

    public a(j adapter, RecyclerView.ItemAnimator itemAnimator, List decorations, float f, boolean z) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(decorations, "decorations");
        this.f167750a = adapter;
        this.f167751b = itemAnimator;
        this.f167752c = decorations;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f167750a, aVar.f167750a) && Intrinsics.f(this.f167751b, aVar.f167751b) && Intrinsics.f(this.f167752c, aVar.f167752c) && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f167750a.hashCode() * 31;
        RecyclerView.ItemAnimator itemAnimator = this.f167751b;
        return Boolean.hashCode(this.e) + b.b(this.d, p.a.d((iHashCode + (itemAnimator == null ? 0 : itemAnimator.hashCode())) * 31, 31, this.f167752c), 31);
    }

    public a(j jVar, DefaultItemAnimator defaultItemAnimator, List list, float f, int i) {
        this(jVar, (i & 2) != 0 ? null : defaultItemAnimator, (i & 4) != 0 ? f0.f322471a : list, (i & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 16) == 0);
    }
}
