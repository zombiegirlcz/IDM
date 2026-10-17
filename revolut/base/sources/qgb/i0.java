package qgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245746c;
    public final q d;

    public /* synthetic */ i0(int i, String str, String str2, String str3, q qVar) {
        if (15 != (i & 15)) {
            j1.f(g0.f245738a.getDescriptor(), i, 15);
            throw null;
        }
        this.f245744a = str;
        this.f245745b = str2;
        this.f245746c = str3;
        this.d = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f245744a, i0Var.f245744a) && Intrinsics.f(this.f245745b, i0Var.f245745b) && Intrinsics.f(this.f245746c, i0Var.f245746c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f245744a.hashCode() * 31, 31, this.f245745b), 31, this.f245746c);
    }

    public i0(String title, String description, String backgroundUrl, q cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f245744a = title;
        this.f245745b = description;
        this.f245746c = backgroundUrl;
        this.d = cta2;
    }
}
