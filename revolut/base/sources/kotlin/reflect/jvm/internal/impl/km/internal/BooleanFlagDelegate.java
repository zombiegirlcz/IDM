package kotlin.reflect.jvm.internal.impl.km.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import wim.h;

/* JADX INFO: loaded from: classes14.dex */
public final class BooleanFlagDelegate<Node> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f186820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlagImpl f186821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186822c;

    public BooleanFlagDelegate(@NotNull h flags, @NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.f186820a = flags;
        this.f186821b = flag;
        if (flag.getBitWidth$kotlin_metadata() == 1 && flag.getValue$kotlin_metadata() == 1) {
            this.f186822c = 1 << flag.getOffset$kotlin_metadata();
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + flag + " was passed").toString());
    }

    public final boolean getValue(Node node, @NotNull KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f186821b.invoke(((Number) this.f186820a.get(node)).intValue());
    }

    public final void setValue(Node node, @NotNull KProperty property, boolean z) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(property, "property");
        int i = this.f186822c;
        h hVar = this.f186820a;
        if (z) {
            iIntValue = i | ((Number) hVar.get(node)).intValue();
        } else {
            iIntValue = (~i) & ((Number) hVar.get(node)).intValue();
        }
        hVar.f(node, Integer.valueOf(iIntValue));
    }
}
