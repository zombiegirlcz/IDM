package evh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001d"}, d2 = {"Levh/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "format", "c", "legalEntityId", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "scopes", "", "e", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "showPurposesApplicableForTeens", "showPurposesApplicableForJoint", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "groupCharacterLimit", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("format")
    private final String format;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("legalEntityId")
    private final String legalEntityId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("scopes")
    private final List<String> scopes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("showPurposesApplicableForTeens")
    private final Boolean showPurposesApplicableForTeens;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("showPurposesApplicableForJoint")
    private final Boolean showPurposesApplicableForJoint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupCharacterLimit")
    private final Integer groupCharacterLimit;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getGroupCharacterLimit() {
        return this.groupCharacterLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLegalEntityId() {
        return this.legalEntityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getScopes() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getShowPurposesApplicableForJoint() {
        return this.showPurposesApplicableForJoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.format, fVar.format) && Intrinsics.f(this.legalEntityId, fVar.legalEntityId) && Intrinsics.f(this.scopes, fVar.scopes) && Intrinsics.f(this.showPurposesApplicableForTeens, fVar.showPurposesApplicableForTeens) && Intrinsics.f(this.showPurposesApplicableForJoint, fVar.showPurposesApplicableForJoint) && Intrinsics.f(this.groupCharacterLimit, fVar.groupCharacterLimit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getShowPurposesApplicableForTeens() {
        return this.showPurposesApplicableForTeens;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.format;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.legalEntityId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.scopes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showPurposesApplicableForTeens;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPurposesApplicableForJoint;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.groupCharacterLimit;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }
}
