package kr;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f188525c = {null, yhm.j.c(yhm.k.PUBLICATION, new kl7.w0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f188527b;

    public m(String scanType, Map metadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188526a = scanType;
        this.f188527b = metadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f188526a, mVar.f188526a) && Intrinsics.f(this.f188527b, mVar.f188527b);
    }

    public final int hashCode() {
        return this.f188527b.hashCode() + (this.f188526a.hashCode() * 31);
    }

    public /* synthetic */ m(Map map, String str, int i) {
        if (3 != (i & 3)) {
            qlm.j1.f(k.f188516a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188526a = str;
        this.f188527b = map;
    }
}
