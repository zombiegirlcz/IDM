package o01;

import android.widget.RemoteViews;
import b9.e;
import com.revolut.core.ui_kit_remote.R$layout;
import k01.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends k01.a {

    @NotNull
    private static final b Companion = new b();

    @Override // k01.a
    public final RemoteViews a(n nVar, e spec) {
        if (nVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "item");
        Intrinsics.checkNotNullParameter(spec, "spec");
        int i = spec.f13338b;
        int i2 = spec.f13337a;
        String str = this.f179896b;
        if (i != -1 && i <= 80) {
            new RemoteViews(str, R$layout.remote_icon_tile_delegate_horizontal);
            throw null;
        }
        if (i == -1 || i >= 160 || i2 == -1 || i2 < 160) {
            new RemoteViews(str, R$layout.remote_icon_tile_delegate_vertical);
            throw null;
        }
        new RemoteViews(str, R$layout.remote_icon_tile_delegate_horizontal);
        throw null;
    }

    @Override // k01.a
    public final boolean b(n item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }
}
