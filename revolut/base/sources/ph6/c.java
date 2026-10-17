package ph6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.b f236223c;
    public final List d;

    public c(String institutionId, String name, io3.b logo, List accountTypes) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        this.f236221a = institutionId;
        this.f236222b = name;
        this.f236223c = logo;
        this.d = accountTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f236221a, cVar.f236221a) && Intrinsics.f(this.f236222b, cVar.f236222b) && Intrinsics.f(this.f236223c, cVar.f236223c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f236223c.hashCode() + p.a.c(this.f236221a.hashCode() * 31, 31, this.f236222b)) * 31);
    }
}
