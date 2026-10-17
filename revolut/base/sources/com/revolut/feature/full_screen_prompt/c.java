package com.revolut.feature.full_screen_prompt;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements r {

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f74505a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.full_screen_prompt.c$c, reason: collision with other inner class name */
    public static final class C0497c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0497c f74506a = new C0497c();

        private C0497c() {
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f74507a = new d();

        private d() {
        }
    }

    private c() {
    }

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.full_screen_prompt.b f74504a;

        public a(com.revolut.feature.full_screen_prompt.b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f74504a = source;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && this.f74504a == ((a) obj2).f74504a;
        }

        public final int hashCode() {
            return this.f74504a.hashCode();
        }

        public a() {
            this(com.revolut.feature.full_screen_prompt.b.BUTTON);
        }
    }
}
