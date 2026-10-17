package sw9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.profile.impl.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CODE;
    public static final a SCAN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f266126id;

    @NotNull
    private final Clause title;

    static {
        a aVar = new a(0, new TextLocalisedClause(R$string.payments_profile_switcher_scan, null, null, 14), "SCAN", "SCAN");
        SCAN = aVar;
        a aVar2 = new a(1, new TextLocalisedClause(R$string.payments_profile_switcher_my_code, null, null, 14), "CODE", "CODE");
        CODE = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        this.f266126id = str2;
        this.title = textLocalisedClause;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f266126id;
    }
}
