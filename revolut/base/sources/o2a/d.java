package o2a;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import java.util.Set;
import nng.n;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferPersonalisationGallerySelectorContract$InputData f221603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f221604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f221605c;
    public final e4m.e d;

    public d(b bVar, Activity activity, TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData) {
        this.f221605c = bVar;
        this.f221603a = transferPersonalisationGallerySelectorContract$InputData;
        this.f221604b = activity;
        this.d = e4m.b.b(new n(bVar, this, 12));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
