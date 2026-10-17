package em2;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.JuniorGlowThemeDeclaration;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BLUE;
    public static final h GREEN;
    public static final h GREY;
    public static final h PURPLE;
    public static final h PURPLE_AND_BLUE;

    @NotNull
    private final String backgroundId;

    static {
        h hVar = new h("BLUE", 0, "bg190");
        BLUE = hVar;
        h hVar2 = new h("PURPLE", 1, "bg192");
        PURPLE = hVar2;
        h hVar3 = new h("GREY", 2, "bg193");
        GREY = hVar3;
        h hVar4 = new h("GREEN", 3, "bg194");
        GREEN = hVar4;
        h hVar5 = new h("PURPLE_AND_BLUE", 4, "bg472");
        PURPLE_AND_BLUE = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(String str, int i, String str2) {
        this.backgroundId = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a(GlobalThemeDeclaration theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        if ((theme instanceof GlowThemeDeclaration) || (theme instanceof JuniorGlowThemeDeclaration)) {
            return this.backgroundId;
        }
        return null;
    }
}
