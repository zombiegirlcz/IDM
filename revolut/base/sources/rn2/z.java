package rn2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lrn2/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSwitchType", "switchType", "b", "getSwitchDate", "switchDate", "", "c", "Ljava/util/Map;", "getFormFields", "()Ljava/util/Map;", "formFields", "d", "getLastCardDigits", "lastCardDigits", "e", "getJointPeerLastCardDigits", "jointPeerLastCardDigits", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchType")
    @NotNull
    private final String switchType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("switchDate")
    private final String switchDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("formFields")
    @NotNull
    private final Map<String, String> formFields;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastCardDigits")
    private final String lastCardDigits;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("jointPeerLastCardDigits")
    private final String jointPeerLastCardDigits;

    public z(String switchType, String str, LinkedHashMap formFields, String str2, String str3) {
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        this.switchType = switchType;
        this.switchDate = str;
        this.formFields = formFields;
        this.lastCardDigits = str2;
        this.jointPeerLastCardDigits = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.switchType, zVar.switchType) && Intrinsics.f(this.switchDate, zVar.switchDate) && Intrinsics.f(this.formFields, zVar.formFields) && Intrinsics.f(this.lastCardDigits, zVar.lastCardDigits) && Intrinsics.f(this.jointPeerLastCardDigits, zVar.jointPeerLastCardDigits);
    }

    public final int hashCode() {
        int iHashCode = this.switchType.hashCode() * 31;
        String str = this.switchDate;
        int iE = p.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.formFields);
        String str2 = this.lastCardDigits;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jointPeerLastCardDigits;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
