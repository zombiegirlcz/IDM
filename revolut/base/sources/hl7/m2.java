package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m2 {

    @NotNull
    public static final l2 Companion = new l2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153212c;

    public /* synthetic */ m2(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(k2.f153167a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153210a = str;
        this.f153211b = str2;
        this.f153212c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f153210a, m2Var.f153210a) && Intrinsics.f(this.f153211b, m2Var.f153211b) && Intrinsics.f(this.f153212c, m2Var.f153212c);
    }

    public final int hashCode() {
        return this.f153212c.hashCode() + p.a.c(this.f153210a.hashCode() * 31, 31, this.f153211b);
    }

    public m2(String title, String description, String iconKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        this.f153210a = title;
        this.f153211b = description;
        this.f153212c = iconKey;
    }
}
