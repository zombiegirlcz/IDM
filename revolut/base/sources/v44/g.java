package v44;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f285942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f285944c;
    public final DocumentViewerScreenConfig d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f285945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f285946h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f285947j;

    public g(Clause toolbarTitle, String documentId, f document, DocumentViewerScreenConfig screenConfig, boolean z, String str, Clause clause, List checkboxes, l lVar, boolean z3) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        this.f285942a = toolbarTitle;
        this.f285943b = documentId;
        this.f285944c = document;
        this.d = screenConfig;
        this.e = z;
        this.f = str;
        this.f285945g = clause;
        this.f285946h = checkboxes;
        this.i = lVar;
        this.f285947j = z3;
    }

    public static g a(g gVar, ArrayList arrayList, l lVar, int i) {
        Clause toolbarTitle = gVar.f285942a;
        String documentId = gVar.f285943b;
        f document = gVar.f285944c;
        DocumentViewerScreenConfig screenConfig = gVar.d;
        boolean z = (i & 16) != 0 ? gVar.e : true;
        String str = gVar.f;
        Clause clause = gVar.f285945g;
        List list = arrayList;
        if ((i & 128) != 0) {
            list = gVar.f285946h;
        }
        List checkboxes = list;
        if ((i & 256) != 0) {
            lVar = gVar.i;
        }
        boolean z3 = gVar.f285947j;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        return new g(toolbarTitle, documentId, document, screenConfig, z, str, clause, checkboxes, lVar, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f285942a, gVar.f285942a) && Intrinsics.f(this.f285943b, gVar.f285943b) && Intrinsics.f(this.f285944c, gVar.f285944c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f285945g, gVar.f285945g) && Intrinsics.f(this.f285946h, gVar.f285946h) && Intrinsics.f(this.i, gVar.i) && this.f285947j == gVar.f285947j;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + ((this.f285944c.hashCode() + p.a.c(this.f285942a.hashCode() * 31, 31, this.f285943b)) * 31)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Clause clause = this.f285945g;
        int iD = p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f285946h);
        l lVar = this.i;
        return Boolean.hashCode(this.f285947j) + ((iD + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }
}
