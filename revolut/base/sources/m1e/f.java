package m1e;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f201479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f201480b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data isOptIn, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            isOptIn = fVar.f201479a;
        }
        Set expandedFaqIds = linkedHashSet;
        if ((i & 2) != 0) {
            expandedFaqIds = fVar.f201480b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(isOptIn, "isOptIn");
        Intrinsics.checkNotNullParameter(expandedFaqIds, "expandedFaqIds");
        return new f(isOptIn, expandedFaqIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f201479a, fVar.f201479a) && Intrinsics.f(this.f201480b, fVar.f201480b);
    }

    public final int hashCode() {
        return this.f201480b.hashCode() + (this.f201479a.hashCode() * 31);
    }

    public f(Data isOptIn, Set expandedFaqIds) {
        Intrinsics.checkNotNullParameter(isOptIn, "isOptIn");
        Intrinsics.checkNotNullParameter(expandedFaqIds, "expandedFaqIds");
        this.f201479a = isOptIn;
        this.f201480b = expandedFaqIds;
    }

    public f(int i) {
        this(new Data(null, null, false, 7, null), h0.f322473a);
    }
}
