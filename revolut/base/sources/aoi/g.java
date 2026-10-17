package aoi;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a2g.a f7996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f7997b = j.b(new af0.a(2));

    public static final class a implements c {
        @Override // aoi.c
        public final void a(String str) {
        }

        @Override // aoi.c
        public final h b(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // aoi.c
        public final h c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return b.f7998a;
        }

        @Override // aoi.c
        public final void d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // aoi.c
        public final h e(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return b.f7998a;
        }

        @Override // aoi.c
        public final boolean enabled() {
            return false;
        }

        @Override // aoi.c
        public final h f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // aoi.c
        public final h g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7998a = new b();

        private b() {
        }

        @Override // aoi.h
        public final void a(String attribute, String value) {
            Intrinsics.checkNotNullParameter(attribute, "attribute");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        @Override // aoi.h
        public final String getAttribute(String attribute) {
            Intrinsics.checkNotNullParameter(attribute, "attribute");
            return null;
        }

        @Override // aoi.h
        public final long getDuration() {
            return -1L;
        }

        @Override // aoi.h
        public final void start() {
        }

        @Override // aoi.h
        public final void stop() {
        }
    }

    private g() {
    }

    public static c a() {
        return (c) f7997b.getValue();
    }
}
