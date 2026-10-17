package hh;

import com.google.android.gms.internal.mlkit_vision_barcode.zzui;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f152201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.d f152202b;

    public e(f fVar, ch.d dVar, ch.h hVar) {
        this.f152201a = fVar;
        this.f152202b = dVar;
    }

    public final a a(eh.a aVar) {
        return new a(aVar, (i) this.f152201a.get(aVar), (Executor) this.f152202b.f24016a.get(), zzui.zzb(true != b.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning"));
    }
}
