package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmBuiltInsCustomizerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Name f186515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f186516b;

    static {
        Name nameIdentifier = Name.identifier("getFirst");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        f186515a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("getLast");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        f186516b = nameIdentifier2;
    }
}
