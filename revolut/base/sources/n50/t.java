package n50;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f212508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212510c;
    public final String d;
    public final v20.n e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f212511g;

    public t(UUID uuid, String str, String str2, String mediaType, v20.n message, boolean z, Map thumbnailUrlHeaders) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(thumbnailUrlHeaders, "thumbnailUrlHeaders");
        this.f212508a = uuid;
        this.f212509b = str;
        this.f212510c = str2;
        this.d = mediaType;
        this.e = message;
        this.f = z;
        this.f212511g = thumbnailUrlHeaders;
    }

    @Override // n50.v
    public final v20.n a() {
        return this.e;
    }

    @Override // n50.v
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f212508a, tVar.f212508a) && Intrinsics.f(this.f212509b, tVar.f212509b) && Intrinsics.f(this.f212510c, tVar.f212510c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && this.f == tVar.f && Intrinsics.f(this.f212511g, tVar.f212511g);
    }

    public final int hashCode() {
        UUID uuid = this.f212508a;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.f212509b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f212510c;
        return this.f212511g.hashCode() + j6.a.c((this.e.hashCode() + p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f);
    }
}
