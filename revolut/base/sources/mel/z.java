package mel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements d0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f204784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f204786c;

    public z(dj0.d money, String placeholder, c0 style) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f204784a = money;
        this.f204785b = placeholder;
        this.f204786c = style;
    }

    @Override // mel.d0
    public final String a() {
        return this.f204785b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f204784a, zVar.f204784a) && Intrinsics.f(this.f204785b, zVar.f204785b) && this.f204786c == zVar.f204786c;
    }

    @Override // mel.d0
    public final c0 h() {
        return this.f204786c;
    }

    public final int hashCode() {
        return this.f204786c.hashCode() + p.a.c(this.f204784a.hashCode() * 31, 31, this.f204785b);
    }
}
