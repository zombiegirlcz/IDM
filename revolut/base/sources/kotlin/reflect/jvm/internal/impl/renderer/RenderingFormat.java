package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wjm.d;
import wjm.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class RenderingFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat HTML;
    public static final RenderingFormat PLAIN;

    static {
        e eVar = new e("PLAIN", 0, null);
        PLAIN = eVar;
        d dVar = new d("HTML", 1, null);
        HTML = dVar;
        RenderingFormat[] renderingFormatArr = {eVar, dVar};
        $VALUES = renderingFormatArr;
        $ENTRIES = s.n(renderingFormatArr);
    }

    public RenderingFormat(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    @NotNull
    public abstract String escape(@NotNull String str);
}
