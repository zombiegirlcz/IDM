package ia;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Lia/a;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "type", "b", "formKey", "", "Ljava/util/Map;", "()Ljava/util/Map;", "formInputParams", "d", "workflowId", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("formKey")
    private final String formKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("formInputParams")
    private final Map<String, String> formInputParams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    public a(int i, String type, String str, String str2, Map map) {
        str = (i & 2) != 0 ? null : str;
        map = (i & 4) != 0 ? null : map;
        str2 = (i & 8) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.formKey = str;
        this.formInputParams = map;
        this.workflowId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getFormInputParams() {
        return this.formInputParams;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFormKey() {
        return this.formKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.formKey, aVar.formKey) && Intrinsics.f(this.formInputParams, aVar.formInputParams) && Intrinsics.f(this.workflowId, aVar.workflowId);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.formKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.formInputParams;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.workflowId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.formKey;
        Map<String, String> map = this.formInputParams;
        String str3 = this.workflowId;
        StringBuilder sbM = v0.a.m("ActionDto(type=", str, ", formKey=", str2, ", formInputParams=");
        sbM.append(map);
        sbM.append(", workflowId=");
        sbM.append(str3);
        sbM.append(")");
        return sbM.toString();
    }
}
