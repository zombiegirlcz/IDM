package iel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n DELISTED;
    public static final n LISTED;
    public static final n NEW_LISTING;
    public static final n RESUMED;
    public static final n SUSPENDED;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f160798id;

    static {
        n nVar = new n("DELISTED", 0, "DELISTED");
        DELISTED = nVar;
        n nVar2 = new n("LISTED", 1, "LISTED");
        LISTED = nVar2;
        n nVar3 = new n("NEW_LISTING", 2, "NEW_LISTING");
        NEW_LISTING = nVar3;
        n nVar4 = new n("RESUMED", 3, "RESUMED");
        RESUMED = nVar4;
        n nVar5 = new n("SUSPENDED", 4, "SUSPENDED");
        SUSPENDED = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public n(String str, int i, String str2) {
        this.f160798id = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f160798id;
    }
}
