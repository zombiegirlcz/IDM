package hz;

import aii.u;
import com.revolut.camerakit.revolut.ui.barcode.screen.BarcodeReaderScreen;
import com.revolut.camerakit.revolut.ui.barcode.standalone_entry.BarcodeReaderScreenDestination;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qz.b;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f156931a = 0;

    @Override // nte.a
    public final List e() {
        b.Companion.getClass();
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BarcodeReaderScreenDestination) {
            return c.b(new BarcodeReaderScreen(((BarcodeReaderScreenDestination) destination).f50765a), new aab.b(16));
        }
        return null;
    }
}
