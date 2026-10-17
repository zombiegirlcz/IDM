package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import jjm.a;
import jjm.b;
import jjm.c;
import jjm.d;
import jjm.e;
import jjm.f;
import jjm.g;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.MemberKind;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;
import wim.h;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class FlagDelegatesImplKt {
    @NotNull
    public static final BooleanFlagDelegate<KmClass> classBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(a.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmConstructor> constructorBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(b.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmFunction> functionBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(c.f, flag);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, MemberKind> memberKindDelegate(@NotNull h flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.MemberKind> MEMBER_KIND = Flags.MEMBER_KIND;
        Intrinsics.checkNotNullExpressionValue(MEMBER_KIND, "MEMBER_KIND");
        EnumEntries entries = MemberKind.getEntries();
        EnumEntries entries2 = MemberKind.getEntries();
        ArrayList arrayList = new ArrayList(w.t(entries2, 10));
        Iterator<E> it8 = entries2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((MemberKind) it8.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, MEMBER_KIND, entries, arrayList);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, Modality> modalityDelegate(@NotNull h flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.Modality> MODALITY = Flags.MODALITY;
        Intrinsics.checkNotNullExpressionValue(MODALITY, "MODALITY");
        EnumEntries entries = Modality.getEntries();
        EnumEntries entries2 = Modality.getEntries();
        ArrayList arrayList = new ArrayList(w.t(entries2, 10));
        Iterator<E> it8 = entries2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Modality) it8.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, MODALITY, entries, arrayList);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmPropertyAccessorAttributes> propertyAccessorBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(d.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmProperty> propertyBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(e.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmTypeAlias> typeAliasBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(f.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmType> typeBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(g.f, flag);
    }

    @NotNull
    public static final BooleanFlagDelegate<KmValueParameter> valueParameterBooleanFlag(@NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return new BooleanFlagDelegate<>(jjm.h.f, flag);
    }

    @NotNull
    public static final <Node> EnumFlagDelegate<Node, Visibility> visibilityDelegate(@NotNull h flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Flags.FlagField<ProtoBuf.Visibility> VISIBILITY = Flags.VISIBILITY;
        Intrinsics.checkNotNullExpressionValue(VISIBILITY, "VISIBILITY");
        EnumEntries entries = Visibility.getEntries();
        EnumEntries entries2 = Visibility.getEntries();
        ArrayList arrayList = new ArrayList(w.t(entries2, 10));
        Iterator<E> it8 = entries2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Visibility) it8.next()).getFlag$kotlin_metadata());
        }
        return new EnumFlagDelegate<>(flags, VISIBILITY, entries, arrayList);
    }
}
