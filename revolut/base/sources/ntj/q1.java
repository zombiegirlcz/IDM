package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219114a;

    public /* synthetic */ q1(int i, String str) {
        if (1 == (i & 1)) {
            this.f219114a = str;
        } else {
            qlm.j1.f(o1.f219108a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q1) && Intrinsics.f(this.f219114a, ((q1) obj2).f219114a);
    }

    public final int hashCode() {
        return this.f219114a.hashCode();
    }

    public q1(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f219114a = description;
    }
}
