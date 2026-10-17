package ly;

import gv.q;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv.m f200611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.n f200612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f200613c;
    public final boolean d;
    public final Locale e;

    public e(gv.m media, gv.n metadata, q telemetry, boolean z, Locale locale) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.f200611a = media;
        this.f200612b = metadata;
        this.f200613c = telemetry;
        this.d = z;
        this.e = locale;
    }

    @Override // ly.g
    public final gv.m J() {
        return this.f200611a;
    }

    @Override // ly.g
    public final q a() {
        return this.f200613c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200611a, eVar.f200611a) && Intrinsics.f(this.f200612b, eVar.f200612b) && Intrinsics.f(this.f200613c, eVar.f200613c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    @Override // ly.g
    public final gv.n getMetadata() {
        return this.f200612b;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f200613c.hashCode() + ((this.f200612b.hashCode() + (this.f200611a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Locale locale = this.e;
        return iC + (locale == null ? 0 : locale.hashCode());
    }
}
