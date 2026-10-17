package ux0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f283749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f283750b;

    public h(b model, o story) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(story, "story");
        this.f283749a = model;
        this.f283750b = story;
    }

    @Override // ux0.i
    public final i a(d model) {
        Object obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof b) {
            b bVar = (b) model;
            List list = bVar.f283737c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i);
                if (Intrinsics.f((o) obj2, this.f283750b)) {
                    break;
                }
                i++;
            }
            o oVar = (o) obj2;
            if (oVar != null) {
                return ((o) zhm.d0.d0(list)) == null ? new e(bVar, new IllegalStateException("At least one story is expected for the product intro")) : new h(bVar, oVar);
            }
        }
        return this;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283749a, hVar.f283749a) && Intrinsics.f(this.f283750b, hVar.f283750b);
    }

    public final int hashCode() {
        return this.f283750b.hashCode() + (this.f283749a.hashCode() * 31);
    }

    @Override // ux0.i
    public final i o() {
        o story = this.f283750b;
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(story, "story");
        b bVar = this.f283749a;
        List list = bVar.f283737c;
        if (list.indexOf(story) >= zhm.v.j(list)) {
            return new e(bVar, null);
        }
        Intrinsics.checkNotNullParameter(story, "currentStory");
        Intrinsics.checkNotNullParameter(story, "story");
        return new h(bVar, (o) list.get(list.indexOf(story) + 1));
    }
}
