package bj1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbj1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "value", "b", "displayName", "displayCode", "", "d", "Z", "()Z", "isEnabled", "feature_address_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayCode")
    private final String displayCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("isEnabled")
    private final boolean isEnabled;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayCode() {
        return this.displayCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.displayName, cVar.displayName) && Intrinsics.f(this.displayCode, cVar.displayCode) && this.isEnabled == cVar.isEnabled;
    }

    public final int hashCode() {
        int iC = p.a.c(this.value.hashCode() * 31, 31, this.displayName);
        String str = this.displayCode;
        return Boolean.hashCode(this.isEnabled) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
