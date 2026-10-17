package h0d;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzc.i f148361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148363c;
    public final gzc.a d;

    public i(gzc.i evidenceDocument, String title, String description, gzc.a actionToDo) {
        Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionToDo, "actionToDo");
        this.f148361a = evidenceDocument;
        this.f148362b = title;
        this.f148363c = description;
        this.d = actionToDo;
    }

    @Override // h0d.j
    public final gzc.i a() {
        return this.f148361a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f148361a.equals(iVar.f148361a) && this.f148362b.equals(iVar.f148362b) && this.f148363c.equals(iVar.f148363c) && this.d.equals(iVar.d);
    }

    @Override // h0d.j
    public final String getTitle() {
        return this.f148362b;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(0, p.a.c(p.a.c(this.f148361a.hashCode() * 31, 31, this.f148362b), 31, this.f148363c), 31);
    }
}
