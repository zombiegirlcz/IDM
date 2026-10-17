package nu3;

import cv3.s;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f219195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f219196c;
    public final d d;
    public final g e;

    public c(String id10, f parameters, s offerContent, d benefitsContent, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(offerContent, "offerContent");
        Intrinsics.checkNotNullParameter(benefitsContent, "benefitsContent");
        this.f219194a = id10;
        this.f219195b = parameters;
        this.f219196c = offerContent;
        this.d = benefitsContent;
        this.e = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f219194a, cVar.f219194a) && Intrinsics.f(this.f219195b, cVar.f219195b) && Intrinsics.f(this.f219196c, cVar.f219196c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f219196c.hashCode() + ((this.f219195b.hashCode() + (this.f219194a.hashCode() * 31)) * 31)) * 31)) * 31;
        g gVar = this.e;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
