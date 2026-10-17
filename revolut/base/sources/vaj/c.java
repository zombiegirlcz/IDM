package vaj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f287305c;

    public /* synthetic */ c(int i, String str, String str2, l lVar) {
        if (7 != (i & 7)) {
            j1.f(a.f287302a.getDescriptor(), i, 7);
            throw null;
        }
        this.f287303a = str;
        this.f287304b = str2;
        this.f287305c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f287303a, cVar.f287303a) && Intrinsics.f(this.f287304b, cVar.f287304b) && Intrinsics.f(this.f287305c, cVar.f287305c);
    }

    public final int hashCode() {
        return this.f287305c.hashCode() + p.a.c(this.f287303a.hashCode() * 31, 31, this.f287304b);
    }

    public c(String currency, String launchDate, l project) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(project, "project");
        this.f287303a = currency;
        this.f287304b = launchDate;
        this.f287305c = project;
    }
}
