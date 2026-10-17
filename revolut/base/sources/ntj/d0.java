package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219053b;

    public /* synthetic */ d0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(b0.f219048a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219052a = str;
        this.f219053b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f219052a, d0Var.f219052a) && Intrinsics.f(this.f219053b, d0Var.f219053b);
    }

    public final int hashCode() {
        return this.f219053b.hashCode() + (this.f219052a.hashCode() * 31);
    }

    public d0(String type, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f219052a = type;
        this.f219053b = url2;
    }
}
