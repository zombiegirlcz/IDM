package bj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0015"}, d2 = {"Lbj7/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "d", "title", "", "Lbj7/d;", "c", "Ljava/util/List;", "()Ljava/util/List;", "documentsInfo", "Lbj7/b;", "conditions", "otherProvidersUrl", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentsInfo")
    @NotNull
    private final List<d> documentsInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("conditions")
    @NotNull
    private final List<b> conditions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("otherProvidersUrl")
    private final String otherProvidersUrl;

    public c(String type, String str, String str2, ArrayList documentsInfo, ArrayList conditions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(documentsInfo, "documentsInfo");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.type = type;
        this.title = str;
        this.documentsInfo = documentsInfo;
        this.conditions = conditions;
        this.otherProvidersUrl = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getConditions() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDocumentsInfo() {
        return this.documentsInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOtherProvidersUrl() {
        return this.otherProvidersUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.documentsInfo, cVar.documentsInfo) && Intrinsics.f(this.conditions, cVar.conditions) && Intrinsics.f(this.otherProvidersUrl, cVar.otherProvidersUrl);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.title;
        int iD = p.a.d(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.documentsInfo), 31, this.conditions);
        String str2 = this.otherProvidersUrl;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
