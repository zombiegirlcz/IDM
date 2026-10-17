package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements Serializable {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f232676c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f232677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f232678b;

    static {
        z zVar = a0.Companion;
        zVar.getClass();
        a0 a0Var = a0.f232601c;
        zVar.getClass();
        f232676c = new w(a0Var, a0Var);
    }

    public w(a0 info, a0 contactUs) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(contactUs, "contactUs");
        this.f232677a = info;
        this.f232678b = contactUs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f232677a, wVar.f232677a) && Intrinsics.f(this.f232678b, wVar.f232678b);
    }

    public final int hashCode() {
        return this.f232678b.hashCode() + (this.f232677a.hashCode() * 31);
    }
}
