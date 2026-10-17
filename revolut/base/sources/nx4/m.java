package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lnx4/m;", "Lnx4/n;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "uploadUrl", "", "Ljava/util/List;", "()Ljava/util/List;", "allowedFileTypes", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploadUrl")
    @NotNull
    private final String uploadUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowedFileTypes")
    private final List<String> allowedFileTypes;

    public m(String uploadUrl, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        this.uploadUrl = uploadUrl;
        this.allowedFileTypes = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllowedFileTypes() {
        return this.allowedFileTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.uploadUrl, mVar.uploadUrl) && Intrinsics.f(this.allowedFileTypes, mVar.allowedFileTypes);
    }

    public final int hashCode() {
        int iHashCode = this.uploadUrl.hashCode() * 31;
        List<String> list = this.allowedFileTypes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // nx4.n
    public final String j() {
        return p.a.p("UploadDocumentDto(uploadUrl=", this.uploadUrl, ")");
    }
}
