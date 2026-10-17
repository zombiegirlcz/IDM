package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f10343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7 f10344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10345c;

    public h7(g7 labelWithValue, f7 textValueColorState, float f) {
        Intrinsics.checkNotNullParameter(labelWithValue, "labelWithValue");
        Intrinsics.checkNotNullParameter(textValueColorState, "textValueColorState");
        this.f10343a = labelWithValue;
        this.f10344b = textValueColorState;
        this.f10345c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj2;
        return Intrinsics.f(this.f10343a, h7Var.f10343a) && this.f10344b == h7Var.f10344b && Float.compare(this.f10345c, h7Var.f10345c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10345c) + ((this.f10344b.hashCode() + (this.f10343a.hashCode() * 31)) * 31);
    }
}
