package my8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.a f210377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f210378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210379c;
    public final String d;
    public final String e;
    public final String f;

    public h(av.a scanType, g rotationType, String language, String region, String model, int i) {
        rotationType = (i & 2) != 0 ? g.NORMAL : rotationType;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(rotationType, "rotationType");
        Intrinsics.checkNotNullParameter("FOURTHLINE", "source");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f210377a = scanType;
        this.f210378b = rotationType;
        this.f210379c = "FOURTHLINE";
        this.d = language;
        this.e = region;
        this.f = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f210377a == hVar.f210377a && this.f210378b == hVar.f210378b && Intrinsics.f(this.f210379c, hVar.f210379c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((this.f210378b.hashCode() + (this.f210377a.hashCode() * 31)) * 31, 31, this.f210379c), 31, this.d), 31, this.e);
    }
}
