package vaj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287309c;

    public /* synthetic */ f(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(d.f287306a.getDescriptor(), i, 7);
            throw null;
        }
        this.f287307a = str;
        this.f287308b = str2;
        this.f287309c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f287307a, fVar.f287307a) && Intrinsics.f(this.f287308b, fVar.f287308b) && Intrinsics.f(this.f287309c, fVar.f287309c);
    }

    public final int hashCode() {
        return this.f287309c.hashCode() + p.a.c(this.f287307a.hashCode() * 31, 31, this.f287308b);
    }

    public f(String title, String description, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f287307a = title;
        this.f287308b = description;
        this.f287309c = icon;
    }
}
