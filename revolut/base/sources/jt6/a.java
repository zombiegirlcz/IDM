package jt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Ljt6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "binScheme", "b", "lastFour", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("binScheme")
    private final String binScheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    public a(String str, String lastFour) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.binScheme = str;
        this.lastFour = lastFour;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBinScheme() {
        return this.binScheme;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.binScheme, aVar.binScheme) && Intrinsics.f(this.lastFour, aVar.lastFour);
    }

    public final int hashCode() {
        String str = this.binScheme;
        return this.lastFour.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
