package sh;

import com.google.android.gms.common.internal.Objects;
import hb9.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import qh.c;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f263338a = new AtomicReference();

    @Override // qh.c
    public final String a() {
        return true != c() ? "play-services-mlkit-text-recognition-japanese" : "text-recognition-japanese";
    }

    @Override // qh.c
    public final String b() {
        return "taser_tflite_gocrjapanese_and_latin_mbv2_aksara_layout_gcn_mobile";
    }

    @Override // qh.c
    public final boolean c() {
        return b.u(this.f263338a, "com.google.mlkit.dynamite.text.japanese");
    }

    @Override // qh.c
    public final String d() {
        return "ja";
    }

    @Override // qh.c
    public final int e() {
        return 4;
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
        return "optional-module-text-japanese";
    }

    @Override // qh.c
    public final int g() {
        return c() ? 24318 : 24332;
    }

    @Override // qh.c
    public final String h() {
        return true != c() ? "com.google.android.gms.mlkit_ocr_japanese" : "com.google.mlkit.dynamite.text.japanese";
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }

    @Override // qh.c
    public final Executor i() {
        return null;
    }
}
