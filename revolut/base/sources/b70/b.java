package b70;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CONTROL_MAGNIFICATION;

    @NotNull
    public static final a Companion;
    public static final b PERFORM_GESTURES;
    public static final b REQUEST_ENHANCED_WEB_ACCESSIBILITY;
    public static final b REQUEST_FILTER_KEY_EVENTS;
    public static final b REQUEST_FINGERPRINT_GESTURES;
    public static final b REQUEST_TOUCH_EXPLORATION;
    public static final b RETRIEVE_WINDOW_CONTENT;
    public static final b TAKE_SCREENSHOT;
    private final int mask;

    static {
        b bVar = new b("CONTROL_MAGNIFICATION", 0, 16);
        CONTROL_MAGNIFICATION = bVar;
        b bVar2 = new b("PERFORM_GESTURES", 1, 32);
        PERFORM_GESTURES = bVar2;
        b bVar3 = new b("REQUEST_ENHANCED_WEB_ACCESSIBILITY", 2, 4);
        REQUEST_ENHANCED_WEB_ACCESSIBILITY = bVar3;
        b bVar4 = new b("REQUEST_FILTER_KEY_EVENTS", 3, 8);
        REQUEST_FILTER_KEY_EVENTS = bVar4;
        b bVar5 = new b("REQUEST_FINGERPRINT_GESTURES", 4, 64);
        REQUEST_FINGERPRINT_GESTURES = bVar5;
        b bVar6 = new b("REQUEST_TOUCH_EXPLORATION", 5, 2);
        REQUEST_TOUCH_EXPLORATION = bVar6;
        b bVar7 = new b("RETRIEVE_WINDOW_CONTENT", 6, 1);
        RETRIEVE_WINDOW_CONTENT = bVar7;
        b bVar8 = new b("TAKE_SCREENSHOT", 7, 128);
        TAKE_SCREENSHOT = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, int i2) {
        this.mask = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
