package aw0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e8 implements i8 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10295a;

    public static final class a {
        private a() {
        }
    }

    public e8(boolean z) {
        this.f10295a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e8) && this.f10295a == ((e8) obj2).f10295a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10295a);
    }

    public e8() {
        this(true);
    }
}
