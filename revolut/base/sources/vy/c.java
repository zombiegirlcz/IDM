package vy;

import gv.m;
import gv.n;
import gv.q;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f293114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f293115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f293116c;
    public final boolean d;
    public final Locale e;

    public c(m media, n metadata, q telemetry, boolean z, Locale locale) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.f293114a = media;
        this.f293115b = metadata;
        this.f293116c = telemetry;
        this.d = z;
        this.e = locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f293114a, cVar.f293114a) && Intrinsics.f(this.f293115b, cVar.f293115b) && Intrinsics.f(this.f293116c, cVar.f293116c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f293116c.hashCode() + ((this.f293115b.hashCode() + (this.f293114a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Locale locale = this.e;
        return iC + (locale == null ? 0 : locale.hashCode());
    }
}
