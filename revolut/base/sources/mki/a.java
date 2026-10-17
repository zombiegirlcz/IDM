package mki;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.r;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements r {

    @NotNull
    public static final C1168a Companion = new C1168a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f206459a = new Bundle();

    /* JADX INFO: renamed from: mki.a$a, reason: collision with other inner class name */
    public static final class C1168a {
        private C1168a() {
        }
    }

    public final byte[] a() {
        Intrinsics.checkNotNullParameter("SNAPSHOT_BITMAP_META_KEY", "key");
        return this.f206459a.getByteArray("SNAPSHOT_BITMAP_META_KEY");
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Bundle bundle = state.getBundle("META_INFO_BUNDLE_KEY");
        if (bundle != null) {
            Bundle bundle2 = this.f206459a;
            bundle2.clear();
            bundle2.putAll(bundle);
        }
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Bundle bundle = this.f206459a;
        if (bundle.isEmpty()) {
            return;
        }
        outState.putBundle("META_INFO_BUNDLE_KEY", bundle);
    }
}
