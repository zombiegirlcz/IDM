package oy3;

import fx4.h;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f230880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f230881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx4.c f230882c;

    public d(h header, ArrayList items, fx4.c actionFooter) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f230880a = header;
        this.f230881b = items;
        this.f230882c = actionFooter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f230880a.equals(dVar.f230880a) && this.f230881b.equals(dVar.f230881b) && this.f230882c.equals(dVar.f230882c);
    }

    public final int hashCode() {
        return this.f230882c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f230881b, this.f230880a.hashCode() * 31, 31);
    }
}
