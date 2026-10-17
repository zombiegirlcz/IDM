package kotlin.reflect.jvm.internal.impl.descriptors;

import aim.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Visibilities {

    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f186543a;

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Inherited extends Visibility {

        @NotNull
        public static final Inherited INSTANCE = new Inherited("inherited", false);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Internal extends Visibility {

        @NotNull
        public static final Internal INSTANCE = new Internal("internal", false);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class InvisibleFake extends Visibility {

        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake("invisible_fake", false);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Local extends Visibility {

        @NotNull
        public static final Local INSTANCE = new Local("local", false);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Private extends Visibility {

        @NotNull
        public static final Private INSTANCE = new Private("private", false);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class PrivateToThis extends Visibility {

        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Protected extends Visibility {

        @NotNull
        public static final Protected INSTANCE = new Protected("protected", true);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Public extends Visibility {

        @NotNull
        public static final Public INSTANCE = new Public("public", true);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Unknown extends Visibility {

        @NotNull
        public static final Unknown INSTANCE = new Unknown("unknown", false);
    }

    static {
        f builder = new f();
        builder.put(PrivateToThis.INSTANCE, 0);
        builder.put(Private.INSTANCE, 0);
        builder.put(Internal.INSTANCE, 1);
        builder.put(Protected.INSTANCE, 1);
        builder.put(Public.INSTANCE, 2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f186543a = builder.b();
    }

    public final Integer compareLocal$compiler_common(@NotNull Visibility first, @NotNull Visibility second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        f fVar = f186543a;
        Integer num = (Integer) fVar.get(first);
        Integer num2 = (Integer) fVar.get(second);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
