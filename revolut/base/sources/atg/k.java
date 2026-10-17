package atg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f9054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f9055b;

    public k(xe0.e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9054a = storage;
        this.f9055b = yhm.j.b(new androidx.lifecycle.b(this, 3));
    }

    public final List a() {
        return (List) this.f9055b.getValue();
    }

    public final synchronized int b(String item) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(item, "item");
        int iIndexOf = a().indexOf(item);
        numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
    }

    public final void c(int i, String str) {
        int iIndexOf = a().indexOf(str);
        int i2 = 0;
        if (iIndexOf >= 0 && iIndexOf < i) {
            i2 = 1;
        }
        int size = i - i2;
        if (a().contains(str)) {
            a().remove(str);
        }
        if (size > a().size()) {
            size = a().size();
        }
        a().add(size, str);
    }
}
