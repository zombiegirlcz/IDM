package zy3;

import fx4.c;
import fx4.h;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f326362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f326363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f326364c;
    public final ArrayList d;

    public b(h header, ArrayList items, c actionFooter, ArrayList actions) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f326362a = header;
        this.f326363b = items;
        this.f326364c = actionFooter;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f326362a.equals(bVar.f326362a) && this.f326363b.equals(bVar.f326363b) && this.f326364c.equals(bVar.f326364c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f326364c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f326363b, this.f326362a.hashCode() * 31, 31)) * 31);
    }
}
