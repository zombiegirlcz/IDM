package ee2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\n\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lee2/a;", "", "", "toString", "()Ljava/lang/String;", "Lee2/a$b;", "a", "Lee2/a$b;", "()Lee2/a$b;", "outbound", "b", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("outbound")
    @NotNull
    private final b outbound;

    /* JADX INFO: renamed from: ee2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lee2/a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getMin", "()Ljo3/a;", "min", "b", "max", "c", "current", "", "d", "Z", "getConfigurable", "()Z", "configurable", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0728a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("min")
        private final jo3.a min;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("max")
        private final jo3.a max;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("current")
        private final jo3.a current;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("configurable")
        private final boolean configurable;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCurrent() {
            return this.current;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getMax() {
            return this.max;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0728a)) {
                return false;
            }
            C0728a c0728a = (C0728a) obj2;
            return Intrinsics.f(this.min, c0728a.min) && Intrinsics.f(this.max, c0728a.max) && Intrinsics.f(this.current, c0728a.current) && this.configurable == c0728a.configurable;
        }

        public final int hashCode() {
            jo3.a aVar = this.min;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jo3.a aVar2 = this.max;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.current;
            return Boolean.hashCode(this.configurable) + ((iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lee2/a$b;", "", "", "toString", "()Ljava/lang/String;", "Lee2/a$a;", "a", "Lee2/a$a;", "b", "()Lee2/a$a;", "p2p", "p2m", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("p2p")
        private final C0728a p2p;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("p2m")
        private final C0728a p2m;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0728a getP2m() {
            return this.p2m;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C0728a getP2p() {
            return this.p2p;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.p2p, bVar.p2p) && Intrinsics.f(this.p2m, bVar.p2m);
        }

        public final int hashCode() {
            C0728a c0728a = this.p2p;
            int iHashCode = (c0728a == null ? 0 : c0728a.hashCode()) * 31;
            C0728a c0728a2 = this.p2m;
            return iHashCode + (c0728a2 != null ? c0728a2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getOutbound() {
        return this.outbound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.outbound, ((a) obj2).outbound);
    }

    public final int hashCode() {
        return this.outbound.hashCode();
    }
}
