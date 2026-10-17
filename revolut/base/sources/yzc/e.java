package yzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318072c;
    public final String d;
    public final gzc.s e;
    public final gzc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f318073g;

    public e(String fileName, String fileDescription, String fileId, String fileUrl, gzc.s reviewState, gzc.a aVar, String type) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileDescription, "fileDescription");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f318070a = fileName;
        this.f318071b = fileDescription;
        this.f318072c = fileId;
        this.d = fileUrl;
        this.e = reviewState;
        this.f = aVar;
        this.f318073g = type;
    }

    @Override // yzc.f
    public final gzc.a a() {
        return this.f;
    }

    @Override // yzc.f
    public final String b() {
        return this.f318070a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f318070a, eVar.f318070a) && Intrinsics.f(this.f318071b, eVar.f318071b) && Intrinsics.f(this.f318072c, eVar.f318072c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f318073g, eVar.f318073g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f318070a.hashCode() * 31, 31, this.f318071b), 31, this.f318072c), 31, this.d)) * 31;
        gzc.a aVar = this.f;
        return this.f318073g.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
