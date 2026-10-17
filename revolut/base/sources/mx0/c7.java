package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c7 implements f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d7 f209635c;

    public c7(Clause text, boolean z, d7 textStyle, int i) {
        z = (i & 2) != 0 ? false : z;
        textStyle = (i & 4) != 0 ? d7.DEFAULT : textStyle;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.f209633a = text;
        this.f209634b = z;
        this.f209635c = textStyle;
    }

    @Override // mx0.f7
    public final d7 a() {
        return this.f209635c;
    }

    @Override // mx0.f7
    public final boolean b() {
        return this.f209634b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj2;
        return Intrinsics.f(this.f209633a, c7Var.f209633a) && this.f209634b == c7Var.f209634b && this.f209635c == c7Var.f209635c;
    }

    @Override // mx0.f7
    public final Clause getText() {
        return this.f209633a;
    }

    public final int hashCode() {
        return this.f209635c.hashCode() + j6.a.c(this.f209633a.hashCode() * 31, 31, this.f209634b);
    }
}
