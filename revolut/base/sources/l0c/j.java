package l0c;

import com.revolut.data.model.Data;
import com.revolut.feature.terms.api.model.Terms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Terms f191212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191214c;

    public j(Terms terms, Data termsContent, boolean z) {
        Intrinsics.checkNotNullParameter(termsContent, "termsContent");
        this.f191212a = terms;
        this.f191213b = termsContent;
        this.f191214c = z;
    }

    public static j a(j jVar, Terms terms, Data termsContent, boolean z, int i) {
        if ((i & 1) != 0) {
            terms = jVar.f191212a;
        }
        if ((i & 2) != 0) {
            termsContent = jVar.f191213b;
        }
        if ((i & 4) != 0) {
            z = jVar.f191214c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(termsContent, "termsContent");
        return new j(terms, termsContent, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f191212a, jVar.f191212a) && Intrinsics.f(this.f191213b, jVar.f191213b) && this.f191214c == jVar.f191214c;
    }

    public final int hashCode() {
        Terms terms = this.f191212a;
        return Boolean.hashCode(this.f191214c) + kii.e.c(this.f191213b, (terms == null ? 0 : terms.hashCode()) * 31, 31);
    }
}
