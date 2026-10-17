package om1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lom1/a;", "", "", "toString", "()Ljava/lang/String;", "Lom1/c;", "a", "Lom1/c;", "b", "()Lom1/c;", "terms", "Lom1/b;", "Lom1/b;", "()Lom1/b;", "status", "feature_apm_bills_boleto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final c terms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    private final b status;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f226496c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(om1.c r2, om1.b r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.terms = r2
            r1.status = r3
            om1.b r0 = om1.b.NOT_REGISTERED
            if (r3 != r0) goto L17
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.getId()
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            r1.f226496c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om1.a.<init>(om1.c, om1.b):void");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getTerms() {
        return this.terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.terms, aVar.terms) && this.status == aVar.status;
    }

    public final int hashCode() {
        c cVar = this.terms;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.status;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
