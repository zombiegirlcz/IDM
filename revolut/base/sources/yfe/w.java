package yfe;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0005\t\n¨\u0006\u000b"}, d2 = {"Lyfe/w;", "", "<init>", "()V", "Companion", "yfe/z", "c", "b", "a", "Lyfe/w$b;", "Lyfe/w$c;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public abstract class w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f313315a = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(19));

    /* JADX INFO: renamed from: yfe.w$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) w.f313315a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyfe/w$b;", "Lyfe/w;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class b extends w {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f313316b = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(20));

        private b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f313316b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyfe/w$c;", "Lyfe/w;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class c extends w {

        @NotNull
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f313317b = yhm.j.c(yhm.k.PUBLICATION, new yfd.c(21));

        private c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f313317b.getValue();
        }
    }

    private w() {
    }
}
