package kej;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka9.b f183099a;

    public static final class a {
        private a() {
        }
    }

    public g() {
        this(0);
    }

    public g(int i) {
        ka9.b contentValuesSupplier = new ka9.b(12);
        Intrinsics.checkNotNullParameter(contentValuesSupplier, "contentValuesSupplier");
        this.f183099a = contentValuesSupplier;
    }
}
