package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q3 {

    @NotNull
    public static final p3 Companion = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131697c;

    public /* synthetic */ q3(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qlm.j1.f(o3.f131681a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131695a = str;
        this.f131696b = str2;
        if ((i & 4) == 0) {
            this.f131697c = null;
        } else {
            this.f131697c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f131695a, q3Var.f131695a) && Intrinsics.f(this.f131696b, q3Var.f131696b) && Intrinsics.f(this.f131697c, q3Var.f131697c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131695a.hashCode() * 31, 31, this.f131696b);
        String str = this.f131697c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public q3(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f131695a = id10;
        this.f131696b = name;
        this.f131697c = str;
    }
}
