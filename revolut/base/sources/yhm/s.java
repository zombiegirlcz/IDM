package yhm;

import com.google.common.primitives.UnsignedBytes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\b\u0087@\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lyhm/s;", "", "Companion", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements Comparable<s> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f314204a;

    /* JADX INFO: renamed from: yhm.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lyhm/s$a;", "", "Lyhm/s;", "MIN_VALUE", "B", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ s(byte b4) {
        this.f314204a = b4;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(s sVar) {
        return Intrinsics.k(this.f314204a & UnsignedBytes.MAX_VALUE, sVar.f314204a & UnsignedBytes.MAX_VALUE);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof s) {
            return this.f314204a == ((s) obj2).f314204a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f314204a);
    }

    public final String toString() {
        return String.valueOf(this.f314204a & UnsignedBytes.MAX_VALUE);
    }
}
