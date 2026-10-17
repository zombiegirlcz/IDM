package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bk0 extends com.fasterxml.jackson.core.m {
    public final yj0 d;

    public bk0() {
        this(0);
    }

    @Override // com.fasterxml.jackson.core.m
    public final yj0 b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bk0) && this.d == ((bk0) obj2).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public /* synthetic */ bk0(int i) {
        this(yj0.CENTER_HORIZONTAL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(yj0 gravity) {
        super(R$attr.internal_textAppearanceHeading3, 0, 2);
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.d = gravity;
    }
}
