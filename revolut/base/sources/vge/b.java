package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f288868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tge.b f288869b;

    public b(ProductAccountDescriptor$Value descriptor, tge.b source) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f288868a = descriptor;
        this.f288869b = source;
    }

    @Override // vge.c
    public final ProductAccountDescriptor$Value getDescriptor() {
        return this.f288868a;
    }
}
