package vi9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f289541a;

    public g0(b merchantIconMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(merchantIconMapper, "merchantIconMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f289541a = merchantIconMapper;
    }

    public final RowDelegate.Model.MainImage.Image40 a(List list) {
        List listV0 = zhm.d0.V0(list, 2);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f289541a.c(u0.Y(((zh9.y) it8.next()).f322365a), null));
        }
        return arrayList.size() == 1 ? new RowDelegate.Model.MainImage.Image40((Image) zhm.d0.K0(arrayList), null, null, false, null, false, 62) : new RowDelegate.Model.MainImage.Image40(new PairedImage((Image) arrayList.get(0), (Image) arrayList.get(1)), null, null, false, null, false, 62);
    }
}
