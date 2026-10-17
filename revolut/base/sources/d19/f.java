package d19;

import android.net.Uri;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseControllerContract$InputData;
import com.revolut.feature.licenses.impl.ui.licenses.offline.declaration.OfflineLicenseDestination;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import w4l.j;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends oki.h implements d {
    public final a19.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n80.d f110612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f110613q;

    public f(g mapper, a19.f librariesRepository, n80.d packageManagerResolver) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(librariesRepository, "librariesRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        this.o = librariesRepository;
        this.f110612p = packageManagerResolver;
        this.f110613q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.q(this.o.f566c.b(Unit.f186387a, j.f294644c)), null, null, new cvi.j(this, (Continuation) null, 13), 3);
    }

    public final void I2(LicenseItem licenseItem) {
        Uri uri2;
        Intrinsics.checkNotNullParameter(licenseItem, "licenseItem");
        String str = licenseItem.f78045c;
        if (str != null) {
            try {
                uri2 = Uri.parse(str);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                uri2 = null;
            }
        } else {
            uri2 = null;
        }
        if (uri2 == null || !this.f110612p.a(null, uri2, f0.f322471a)) {
            C1(new OfflineLicenseDestination(new OfflineLicenseControllerContract$InputData(licenseItem)));
        } else {
            C1(new ExternalDestination.Browser(licenseItem.f78045c, null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110613q;
    }
}
