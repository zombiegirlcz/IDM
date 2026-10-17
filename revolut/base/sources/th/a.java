package th;

import com.google.android.gms.common.internal.Objects;
import hb9.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import qh.c;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f271227c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f271228a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271229b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    @Override // qh.c
    public final String a() {
        return true != c() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // qh.c
    public final String b() {
        return this.f271229b;
    }

    @Override // qh.c
    public final boolean c() {
        return b.u(this.f271228a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // qh.c
    public final String d() {
        return "en";
    }

    @Override // qh.c
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            return Objects.equal(null, null);
        }
        return false;
    }

    @Override // qh.c
    public final String f() {
        return "optional-module-text-latin";
    }

    @Override // qh.c
    public final int g() {
        return c() ? 24317 : 24306;
    }

    @Override // qh.c
    public final String h() {
        return true != c() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }

    @Override // qh.c
    public final Executor i() {
        return null;
    }
}
