package rn2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lrn2/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSwitchType", "switchType", "b", "getTargetAccountType", "targetAccountType", "c", "getSwitchDate", "switchDate", "", "d", "Ljava/util/Map;", "getFormFields", "()Ljava/util/Map;", "formFields", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchType")
    @NotNull
    private final String switchType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("targetAccountType")
    @NotNull
    private final String targetAccountType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchDate")
    private final String switchDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("formFields")
    @NotNull
    private final Map<String, String> formFields;

    public t(String switchType, String targetAccountType, String str, LinkedHashMap formFields) {
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        this.switchType = switchType;
        this.targetAccountType = targetAccountType;
        this.switchDate = str;
        this.formFields = formFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.switchType, tVar.switchType) && Intrinsics.f(this.targetAccountType, tVar.targetAccountType) && Intrinsics.f(this.switchDate, tVar.switchDate) && Intrinsics.f(this.formFields, tVar.formFields);
    }

    public final int hashCode() {
        int iC = p.a.c(this.switchType.hashCode() * 31, 31, this.targetAccountType);
        String str = this.switchDate;
        return this.formFields.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
