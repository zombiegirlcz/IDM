package ly5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f200698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f200699c;

    public d(List collections, ArrayList topPerformingCollections, LinkedHashMap performances) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(topPerformingCollections, "topPerformingCollections");
        Intrinsics.checkNotNullParameter(performances, "performances");
        this.f200697a = collections;
        this.f200698b = topPerformingCollections;
        this.f200699c = performances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f200697a, dVar.f200697a) && this.f200698b.equals(dVar.f200698b) && this.f200699c.equals(dVar.f200699c);
    }

    public final int hashCode() {
        return this.f200699c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f200698b, this.f200697a.hashCode() * 31, 31);
    }
}
