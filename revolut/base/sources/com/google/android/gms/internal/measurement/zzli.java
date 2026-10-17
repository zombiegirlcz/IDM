package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.mlkit_vision_face.a;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class zzli extends IOException {
    public zzli() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzli(long j2, long j3, int i, Throwable th10) {
        Locale locale = Locale.US;
        StringBuilder sbV = a.v(j2, "Pos: ", ", limit: ");
        sbV.append(j3);
        sbV.append(", len: ");
        sbV.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbV.toString()), th10);
    }

    public zzli(Throwable th10) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th10);
    }
}
