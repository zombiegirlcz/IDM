package tpl;

import com.revolut.data.model.Data;
import com.revolut.sso.impl.domain.models.Document;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f273421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Document f273422b;

    public j(Data documentsData, Document document) {
        Intrinsics.checkNotNullParameter(documentsData, "documentsData");
        this.f273421a = documentsData;
        this.f273422b = document;
    }

    public static j a(j jVar, Data documentsData, Document document, int i) {
        if ((i & 1) != 0) {
            documentsData = jVar.f273421a;
        }
        if ((i & 2) != 0) {
            document = jVar.f273422b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(documentsData, "documentsData");
        return new j(documentsData, document);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f273421a, jVar.f273421a) && Intrinsics.f(this.f273422b, jVar.f273422b);
    }

    public final int hashCode() {
        int iHashCode = this.f273421a.hashCode() * 31;
        Document document = this.f273422b;
        return iHashCode + (document == null ? 0 : document.hashCode());
    }
}
