package gkm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f144516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f144517b;

    public e(Collection allSupertypes) {
        Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
        this.f144516a = allSupertypes;
        this.f144517b = u.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
    }

    public final List a() {
        return this.f144517b;
    }
}
