package zfk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends c.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f322019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbk.f f322020b;

    public e(i result, kbk.f claimGiftResult) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(claimGiftResult, "claimGiftResult");
        this.f322019a = result;
        this.f322020b = claimGiftResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f322019a, eVar.f322019a) && Intrinsics.f(this.f322020b, eVar.f322020b);
    }

    public final int hashCode() {
        return this.f322020b.hashCode() + (this.f322019a.hashCode() * 31);
    }
}
