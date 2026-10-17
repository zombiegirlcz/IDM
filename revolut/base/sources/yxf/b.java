package yxf;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.image_gallery.ImageGalleryController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof rd7.e) {
            rd7.e eVar = (rd7.e) descriptor;
            return eVar.a(new ImageGalleryController(eVar.b(), null, null, 6));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
