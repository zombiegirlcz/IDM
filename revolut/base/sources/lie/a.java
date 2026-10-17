package lie;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tab.accounts.api.R$string;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements txl.e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOUNT_SWIPE;
    public static final a AIR_PULL_DOWN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f195481id;

    @NotNull
    private final txl.d type;

    static {
        Intrinsics.checkNotNullParameter("ACCOUNT_SWIPE", "value");
        a aVar = new a("ACCOUNT_SWIPE", 0, "ACCOUNT_SWIPE", txl.c.f275435a);
        ACCOUNT_SWIPE = aVar;
        Intrinsics.checkNotNullParameter("AIR_PULL_DOWN", "value");
        a aVar2 = new a("AIR_PULL_DOWN", 1, "AIR_PULL_DOWN", new txl.b(new txl.f(new TextLocalisedClause(R$string.tab_accounts_nudge_air_pull_down_title, null, null, 14))));
        AIR_PULL_DOWN = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2, txl.d dVar) {
        this.f195481id = str2;
        this.type = dVar;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String b() {
        return this.f195481id;
    }

    public final txl.d c() {
        return this.type;
    }
}
