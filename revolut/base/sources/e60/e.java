package e60;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f122842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f122843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f122844c;

    public e(i iVar, List documentTypes, boolean z) {
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        this.f122842a = iVar;
        this.f122843b = documentTypes;
        this.f122844c = z;
    }

    @Override // e60.h
    public final i a() {
        return this.f122842a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f122842a, eVar.f122842a) && Intrinsics.f(this.f122843b, eVar.f122843b) && this.f122844c == eVar.f122844c;
    }

    public final int hashCode() {
        i iVar = this.f122842a;
        return Boolean.hashCode(this.f122844c) + p.a.d((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f122843b);
    }
}
