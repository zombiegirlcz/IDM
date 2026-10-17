package igb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161117c;
    public final r d;

    public /* synthetic */ b0(int i, String str, String str2, String str3, r rVar) {
        if (15 != (i & 15)) {
            j1.f(z.f161158a.getDescriptor(), i, 15);
            throw null;
        }
        this.f161115a = str;
        this.f161116b = str2;
        this.f161117c = str3;
        this.d = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f161115a, b0Var.f161115a) && Intrinsics.f(this.f161116b, b0Var.f161116b) && Intrinsics.f(this.f161117c, b0Var.f161117c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f161115a.hashCode() * 31, 31, this.f161116b), 31, this.f161117c);
    }

    public b0(String title, String description, String backgroundUrl, r cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f161115a = title;
        this.f161116b = description;
        this.f161117c = backgroundUrl;
        this.d = cta2;
    }
}
