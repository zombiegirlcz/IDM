package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ScopeKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScopeKind[] $VALUES;
    public static final ScopeKind CLASSIFIER;
    public static final ScopeKind PACKAGE;

    static {
        ScopeKind scopeKind = new ScopeKind("PACKAGE", 0);
        PACKAGE = scopeKind;
        ScopeKind scopeKind2 = new ScopeKind("CLASSIFIER", 1);
        CLASSIFIER = scopeKind2;
        ScopeKind[] scopeKindArr = {scopeKind, scopeKind2};
        $VALUES = scopeKindArr;
        $ENTRIES = s.n(scopeKindArr);
    }

    public static ScopeKind valueOf(String str) {
        return (ScopeKind) Enum.valueOf(ScopeKind.class, str);
    }

    public static ScopeKind[] values() {
        return (ScopeKind[]) $VALUES.clone();
    }
}
