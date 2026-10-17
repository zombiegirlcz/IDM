package hpi;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f154562c;

    public k() {
        this(BitmapDescriptorFactory.HUE_RED, 0, CertificateBody.profileType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f154560a == kVar.f154560a && this.f154561b == kVar.f154561b && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.f154562c, kVar.f154562c) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(this.f154562c, m72.b.b(BitmapDescriptorFactory.HUE_RED, j6.a.b(this.f154561b, Integer.hashCode(this.f154560a) * 31, 31), 31), 31), 31), 31);
    }

    public k(float f, int i, int i2) {
        i = (i2 & 2) != 0 ? R$attr.uikit_colorBackground : i;
        f = (i2 & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f;
        this.f154560a = -1;
        this.f154561b = i;
        this.f154562c = f;
    }
}
