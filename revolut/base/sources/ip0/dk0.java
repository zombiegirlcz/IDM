package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dk0 extends com.fasterxml.jackson.core.m {
    public final yj0 d;

    public dk0() {
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
        return (obj2 instanceof dk0) && this.d == ((dk0) obj2).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(int i) {
        super(R$attr.internal_textAppearanceMarketingDisplay2_noXmlUsage, 2, 2);
        yj0 gravity = yj0.CENTER_HORIZONTAL;
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.d = gravity;
    }
}
