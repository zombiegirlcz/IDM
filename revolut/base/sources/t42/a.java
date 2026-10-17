package t42;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DRAFT;
    public static final a SCHEDULE;
    public static final a SETTINGS;
    public static final a SUBMIT;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    @NotNull
    private final String f267834tag;

    static {
        a aVar = new a("SUBMIT", 0, "APM_TRANSFER_AMOUNT_SUBMIT_BUTTON_TAG");
        SUBMIT = aVar;
        a aVar2 = new a("DRAFT", 1, "APM_TRANSFER_AMOUNT_DRAFT_BUTTON_TAG");
        DRAFT = aVar2;
        a aVar3 = new a("SETTINGS", 2, "APM_TRANSFER_AMOUNT_SETTINGS_BUTTON_TAG");
        SETTINGS = aVar3;
        a aVar4 = new a("SCHEDULE", 3, "APM_TRANSFER_AMOUNT_SCHEDULE_BUTTON_TAG");
        SCHEDULE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.f267834tag = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.f267834tag;
    }
}
