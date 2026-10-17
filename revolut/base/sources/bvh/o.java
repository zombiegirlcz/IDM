package bvh;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006\""}, d2 = {"Lbvh/o;", "", "", "toString", "()Ljava/lang/String;", "Lbvh/p;", "a", "Lbvh/p;", "g", "()Lbvh/p;", "token", "b", "Ljava/lang/String;", "checkId", "c", "h", "vendor", "d", "e", "nfcType", "method", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "steps", "Lbvh/j;", "Lbvh/j;", "()Lbvh/j;", "document", "", "Ljava/util/Set;", "()Ljava/util/Set;", "consents", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final p token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkId")
    private final String checkId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("vendor")
    @NotNull
    private final String vendor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nfcType")
    private final String nfcType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("method")
    private final String method;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("steps")
    private final List<String> steps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("document")
    private final j document;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    private final Set<String> consents;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheckId() {
        return this.checkId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getConsents() {
        return this.consents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNfcType() {
        return this.nfcType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.token, oVar.token) && Intrinsics.f(this.checkId, oVar.checkId) && Intrinsics.f(this.vendor, oVar.vendor) && Intrinsics.f(this.nfcType, oVar.nfcType) && Intrinsics.f(this.method, oVar.method) && Intrinsics.f(this.steps, oVar.steps) && Intrinsics.f(this.document, oVar.document) && Intrinsics.f(this.consents, oVar.consents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final p getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    public final int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        String str = this.checkId;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.vendor);
        String str2 = this.nfcType;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.method;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.steps;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        j jVar = this.document;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Set<String> set = this.consents;
        return iHashCode5 + (set != null ? set.hashCode() : 0);
    }
}
