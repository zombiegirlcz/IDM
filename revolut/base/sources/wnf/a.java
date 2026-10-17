package wnf;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1652a Companion = new C1652a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f298826a = new a();

    /* JADX INFO: renamed from: wnf.a$a, reason: collision with other inner class name */
    public static final class C1652a {
        private C1652a() {
        }
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false);
    }
}
