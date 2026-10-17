package h8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.i {

    @NotNull
    public static final h Companion = new h();
    public static final m e = new m(new o("", 0, false, false), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f149996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f149997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f149998c;
    public final boolean d;

    public m(o queryState, Data results, Data completions, boolean z) {
        Intrinsics.checkNotNullParameter(queryState, "queryState");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(completions, "completions");
        this.f149996a = queryState;
        this.f149997b = results;
        this.f149998c = completions;
        this.d = z;
    }

    public static m a(m mVar, o queryState, Data results, Data completions, boolean z, int i) {
        if ((i & 1) != 0) {
            queryState = mVar.f149996a;
        }
        if ((i & 2) != 0) {
            results = mVar.f149997b;
        }
        if ((i & 4) != 0) {
            completions = mVar.f149998c;
        }
        if ((i & 8) != 0) {
            z = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(queryState, "queryState");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(completions, "completions");
        return new m(queryState, results, completions, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f149996a, mVar.f149996a) && Intrinsics.f(this.f149997b, mVar.f149997b) && Intrinsics.f(this.f149998c, mVar.f149998c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kii.e.c(this.f149998c, kii.e.c(this.f149997b, this.f149996a.hashCode() * 31, 31), 31);
    }
}
