package yfe;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lyfe/h;", "", "<init>", "()V", "Companion", "c", "a", "b", "Lyfe/h$a;", "Lyfe/h$c;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f313258a = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(11));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b7\u0018\u0000 \u00042\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u0006\u0005\u0007\n\t\b¨\u0006\f"}, d2 = {"Lyfe/h$a;", "Lyfe/h;", "<init>", "()V", "Companion", "yfe/k", "yfe/g", "yfe/n", "yfe/a0", "yfe/t", "yfe/q", "a", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static abstract class a extends h {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f313259b = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(12));

        /* JADX INFO: renamed from: yfe.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) a.f313259b.getValue();
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: yfe.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) h.f313258a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\u0005\r\u000e\t\u0006\u000f¨\u0006\u0010"}, d2 = {"Lyfe/h$c;", "Lyfe/h;", "<init>", "()V", "Companion", "yfe/h0", "yfe/n0", "b", "d", "yfe/k0", "c", "yfe/e0", "a", "Lyfe/h$c$b;", "Lyfe/h$c$c;", "Lyfe/h$c$d;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static abstract class c extends h {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f313260b = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(22));

        /* JADX INFO: renamed from: yfe.h$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) c.f313260b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyfe/h$c$b;", "Lyfe/h$c;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final class b extends c {

            @NotNull
            public static final b INSTANCE = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Object f313261c = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(24));

            private b() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) f313261c.getValue();
            }
        }

        /* JADX INFO: renamed from: yfe.h$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyfe/h$c$c;", "Lyfe/h$c;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final class C1743c extends c {

            @NotNull
            public static final C1743c INSTANCE = new C1743c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Object f313262c = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(25));

            private C1743c() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) f313262c.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyfe/h$c$d;", "Lyfe/h$c;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final class d extends c {

            @NotNull
            public static final d INSTANCE = new d();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Object f313263c = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(26));

            private d() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) f313263c.getValue();
            }
        }

        private c() {
        }
    }

    private h() {
    }
}
