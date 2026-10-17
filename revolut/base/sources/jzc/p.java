package jzc;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001c"}, d2 = {"Ljzc/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "type", "b", "d", "question", "", "c", "Z", "h", "()Z", "isRequired", "e", "title", "description", "fieldName", "g", "defaultAnswer", "", "Ljava/util/Map;", "()Ljava/util/Map;", "valueToTitle", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("question")
    @NotNull
    private final String question;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isRequired")
    private final boolean isRequired;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fieldName")
    @NotNull
    private final String fieldName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultAnswer")
    private final String defaultAnswer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueToTitle")
    private final Map<String, String> valueToTitle;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultAnswer() {
        return this.defaultAnswer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.type, pVar.type) && Intrinsics.f(this.question, pVar.question) && this.isRequired == pVar.isRequired && Intrinsics.f(this.title, pVar.title) && Intrinsics.f(this.description, pVar.description) && Intrinsics.f(this.fieldName, pVar.fieldName) && Intrinsics.f(this.defaultAnswer, pVar.defaultAnswer) && Intrinsics.f(this.valueToTitle, pVar.valueToTitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Map getValueToTitle() {
        return this.valueToTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(j6.a.c(p.a.c(this.type.hashCode() * 31, 31, this.question), 31, this.isRequired), 31, this.title), 31, this.description), 31, this.fieldName);
        String str = this.defaultAnswer;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.valueToTitle;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
