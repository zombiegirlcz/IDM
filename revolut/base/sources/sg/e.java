package sg;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements rg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f262572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f262573b = new LinkedHashSet();

    public e(LatLng latLng) {
        this.f262572a = latLng;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return eVar.f262572a.equals(this.f262572a) && eVar.f262573b.equals(this.f262573b);
    }

    @Override // rg.a
    public final Collection getItems() {
        return this.f262573b;
    }

    @Override // rg.a
    public final LatLng getPosition() {
        return this.f262572a;
    }

    @Override // rg.a
    public final int getSize() {
        return this.f262573b.size();
    }

    public final int hashCode() {
        return this.f262573b.hashCode() + this.f262572a.hashCode();
    }

    public final String toString() {
        return "StaticCluster{mCenter=" + this.f262572a + ", mItems.size=" + this.f262573b.size() + CoreConstants.CURLY_RIGHT;
    }
}
