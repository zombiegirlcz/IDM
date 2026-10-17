package h0d;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gzc.i f148360c;
    public final gzc.f d;

    public h(String title, String description, gzc.i evidenceDocument, gzc.f attachment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        this.f148358a = title;
        this.f148359b = description;
        this.f148360c = evidenceDocument;
        this.d = attachment;
        attachment.f147997b.e.size();
    }

    @Override // h0d.j
    public final gzc.i a() {
        return this.f148360c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f148358a, hVar.f148358a) && Intrinsics.f(this.f148359b, hVar.f148359b) && Intrinsics.f(this.f148360c, hVar.f148360c) && Intrinsics.f(this.d, hVar.d);
    }

    @Override // h0d.j
    public final String getTitle() {
        return this.f148358a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f148360c.hashCode() + p.a.c(this.f148358a.hashCode() * 31, 31, this.f148359b)) * 31);
    }
}
