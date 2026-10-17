package slm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends dki.h {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a80.e writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.d = z;
    }

    @Override // dki.h
    public final void w(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.d) {
            super.w(value);
        } else {
            u(value);
        }
    }
}
