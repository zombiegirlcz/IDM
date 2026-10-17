package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lot3/k0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "layout", "Lot3/c;", "Lot3/c;", "()Lot3/c;", "intro", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("layout")
    private final String layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intro")
    private final c intro;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getIntro() {
        return this.intro;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLayout() {
        return this.layout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.layout, k0Var.layout) && Intrinsics.f(this.intro, k0Var.intro);
    }

    public final int hashCode() {
        String str = this.layout;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.intro;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
