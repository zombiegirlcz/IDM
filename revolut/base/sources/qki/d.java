package qki;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qgf.o;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends cam.f implements a {

    @NotNull
    private static final c Companion = new c();

    @Override // qki.a
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(d.class.getClassLoader());
        Parcelable parcelable = bundle.getParcelable("PersistableStateKey");
        if (parcelable != null) {
            D(new o(parcelable, 9));
        }
    }

    @Override // qki.a
    public final void g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putParcelable("PersistableStateKey", (Parcelable) ((j2) this.f22677a).getValue());
    }
}
