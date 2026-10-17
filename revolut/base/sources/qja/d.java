package qja;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqja/d;", "Lqja/e;", "", "toString", "()Ljava/lang/String;", "Lqja/i;", "a", "Lqja/i;", "c", "()Lqja/i;", "value", "b", "Ljava/lang/String;", "format", "Lqja/s;", "Lqja/s;", "()Lqja/s;", "screenConfiguration", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final i value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("format")
    @NotNull
    private final String format;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenConfiguration")
    @NotNull
    private final s screenConfiguration;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getScreenConfiguration() {
        return this.screenConfiguration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.value, dVar.value) && Intrinsics.f(this.format, dVar.format) && Intrinsics.f(this.screenConfiguration, dVar.screenConfiguration);
    }

    public final int hashCode() {
        i iVar = this.value;
        return this.screenConfiguration.hashCode() + p.a.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.format);
    }
}
