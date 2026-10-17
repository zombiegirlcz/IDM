package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmFlags {

    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Flags.BooleanFlagField f187449a = Flags.FlagField.booleanFirst();

    static {
        Flags.FlagField.booleanAfter(Flags.FlagField.booleanFirst());
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return f187449a;
    }
}
