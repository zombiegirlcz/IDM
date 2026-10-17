package o67;

import aii.u;
import com.revolut.feature.gif_view.impl.screen.GifViewScreen;
import com.revolut.feature.gif_view.impl.screen.GifViewScreenContract$InputData;
import com.revolut.feature.gifview.api.declaration.GifViewDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GifViewDestination) {
            return new GifViewScreen(new GifViewScreenContract$InputData(((GifViewDestination) destination).f74525b.f74526a));
        }
        return null;
    }
}
