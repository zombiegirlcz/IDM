package lk3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Llk3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "input", "", "b", "I", "c", "()I", "minLen", "maxLen", "feature_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("input")
    @NotNull
    private final String input;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minLen")
    private final int minLen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxLen")
    private final int maxLen;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxLen() {
        return this.maxLen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinLen() {
        return this.minLen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.input, aVar.input) && this.minLen == aVar.minLen && this.maxLen == aVar.maxLen;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxLen) + j6.a.b(this.minLen, this.input.hashCode() * 31, 31);
    }
}
