package vt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lvt6/d;", "", "", "toString", "()Ljava/lang/String;", "Lvt6/a;", "a", "Lvt6/a;", "()Lvt6/a;", "conditionsDto", "Lvt6/b;", "b", "Lvt6/b;", "()Lvt6/b;", "feeDto", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("conditions")
    private final a conditionsDto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final b feeDto;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getConditionsDto() {
        return this.conditionsDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFeeDto() {
        return this.feeDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.conditionsDto, dVar.conditionsDto) && Intrinsics.f(this.feeDto, dVar.feeDto);
    }

    public final int hashCode() {
        a aVar = this.conditionsDto;
        return this.feeDto.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
