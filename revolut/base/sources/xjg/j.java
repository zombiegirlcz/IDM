package xjg;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CYBERPUNK;

    @NotNull
    public static final b Companion;
    public static final j DEEP_BLUE;
    public static final j DEFAULT;
    public static final j DYNAMIC;
    public static final j ORANGE;
    public static final j PINK;
    public static final j PURPLE;
    public static final j TEAL;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    @NotNull
    private final String f306519tag;

    static {
        h hVar = new h("PURPLE", 0, "purple");
        PURPLE = hVar;
        i iVar = new i("TEAL", 1, "teal");
        TEAL = iVar;
        f fVar = new f("ORANGE", 2, "terracota");
        ORANGE = fVar;
        g gVar = new g("PINK", 3, "pink");
        PINK = gVar;
        c cVar = new c("DEEP_BLUE", 4, "deep_blue");
        DEEP_BLUE = cVar;
        e eVar = new e("DYNAMIC", 5, "dynamic");
        DYNAMIC = eVar;
        a aVar = new a("CYBERPUNK", 6, "cyberpunk");
        CYBERPUNK = aVar;
        d dVar = new d("DEFAULT", 7, "default");
        DEFAULT = dVar;
        j[] jVarArr = {hVar, iVar, fVar, gVar, cVar, eVar, aVar, dVar};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
        Companion = new b();
    }

    public j(String str, int i, String str2) {
        this.f306519tag = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kli.a.s(R$attr.uikit_colorAccent, new ContextThemeWrapper(context, c(context)));
    }

    public abstract int c(Context context);

    public final String d() {
        return this.f306519tag;
    }
}
