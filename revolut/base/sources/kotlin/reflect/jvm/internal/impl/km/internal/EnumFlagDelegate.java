package kotlin.reflect.jvm.internal.impl.km.internal;

import java.lang.Enum;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.jetbrains.annotations.NotNull;
import wim.h;

/* JADX INFO: loaded from: classes14.dex */
public final class EnumFlagDelegate<Node, E extends Enum<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f186823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flags.FlagField f186824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumEntries f186825c;
    public final List d;

    public EnumFlagDelegate(@NotNull h flags, @NotNull Flags.FlagField<? extends Internal.EnumLite> protoSet, @NotNull EnumEntries entries, @NotNull List<FlagImpl> flagValues) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(protoSet, "protoSet");
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(flagValues, "flagValues");
        this.f186823a = flags;
        this.f186824b = protoSet;
        this.f186825c = entries;
        this.d = flagValues;
    }

    @NotNull
    public final E getValue(Node node, @NotNull KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return (E) this.f186825c.get(((Internal.EnumLite) this.f186824b.get(((Number) this.f186823a.get(node)).intValue())).getNumber());
    }
}
