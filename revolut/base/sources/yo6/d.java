package yo6;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AIR_MESSAGE;
    public static final d AI_SEARCH;
    public static final d CUSTOMER_RATING;
    public static final d FAQ;
    public static final d TICKETOR;
    public static final d TROUBLESHOOTER;
    public static final d WORKFLOW_STEP;

    @NotNull
    private final String value;

    static {
        d dVar = new d("AI_SEARCH", 0, "ai-search");
        AI_SEARCH = dVar;
        d dVar2 = new d("FAQ", 1, "faq");
        FAQ = dVar2;
        d dVar3 = new d("TICKETOR", 2, "ticketor");
        TICKETOR = dVar3;
        d dVar4 = new d("TROUBLESHOOTER", 3, "troubleshooter");
        TROUBLESHOOTER = dVar4;
        d dVar5 = new d("CUSTOMER_RATING", 4, "customer-rating");
        CUSTOMER_RATING = dVar5;
        d dVar6 = new d("AIR_MESSAGE", 5, "air-message");
        AIR_MESSAGE = dVar6;
        d dVar7 = new d("WORKFLOW_STEP", 6, "workflow-step");
        WORKFLOW_STEP = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
