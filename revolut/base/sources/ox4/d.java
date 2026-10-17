package ox4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lox4/d;", "Lox4/a;", "", "toString", "()Ljava/lang/String;", "Lnx4/m0;", "a", "Lnx4/m0;", "()Lnx4/m0;", "dto", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dto")
    @NotNull
    private final m0 dto;

    public d(m0 dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.dto = dto;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m0 getDto() {
        return this.dto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.dto, ((d) obj2).dto);
    }

    public final int hashCode() {
        return this.dto.hashCode();
    }
}
