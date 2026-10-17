package av8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f9948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f9949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f9950c;

    public j(wi0.b citizenship, Data documents, i iVar) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f9948a = citizenship;
        this.f9949b = documents;
        this.f9950c = iVar;
    }

    public static j a(j jVar, wi0.b citizenship, Data documents, i iVar, int i) {
        if ((i & 1) != 0) {
            citizenship = jVar.f9948a;
        }
        if ((i & 2) != 0) {
            documents = jVar.f9949b;
        }
        if ((i & 4) != 0) {
            iVar = jVar.f9950c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new j(citizenship, documents, iVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f9948a, jVar.f9948a) && Intrinsics.f(this.f9949b, jVar.f9949b) && Intrinsics.f(this.f9950c, jVar.f9950c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f9949b, this.f9948a.f297794a.hashCode() * 31, 31);
        i iVar = this.f9950c;
        return iC + (iVar == null ? 0 : iVar.hashCode());
    }
}
