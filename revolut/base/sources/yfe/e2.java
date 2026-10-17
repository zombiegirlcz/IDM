package yfe;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e2 implements f2 {

    @NotNull
    public static final d2 Companion = new d2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f313251b = {yhm.j.c(yhm.k.PUBLICATION, new b2(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedSubaccountType f313252a;

    public /* synthetic */ e2(int i, ExtendedSubaccountType extendedSubaccountType) {
        if (1 == (i & 1)) {
            this.f313252a = extendedSubaccountType;
        } else {
            qlm.j1.f(c2.f313246a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e2) && Intrinsics.f(this.f313252a, ((e2) obj2).f313252a);
    }

    public final int hashCode() {
        return this.f313252a.hashCode();
    }

    public e2(ExtendedSubaccountType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f313252a = type;
    }
}
