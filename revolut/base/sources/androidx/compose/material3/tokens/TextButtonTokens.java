package androidx.compose.material3.tokens;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b¨\u0006&"}, d2 = {"Landroidx/compose/material3/tokens/TextButtonTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "", "DisabledContainerOpacity", "F", "getDisabledContainerOpacity", "()F", "DisabledIconColor", "getDisabledIconColor", "DisabledIconOpacity", "getDisabledIconOpacity", "DisabledLabelColor", "getDisabledLabelColor", "DisabledLabelOpacity", "getDisabledLabelOpacity", "FocusedIconColor", "getFocusedIconColor", "FocusedLabelColor", "getFocusedLabelColor", "HoveredIconColor", "getHoveredIconColor", "HoveredLabelColor", "getHoveredLabelColor", "IconColor", "getIconColor", "LabelColor", "getLabelColor", "PressedIconColor", "getPressedIconColor", "PressedLabelColor", "getPressedLabelColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextButtonTokens {

    @NotNull
    private static final ColorSchemeKeyTokens DisabledIconColor;
    private static final float DisabledIconOpacity;

    @NotNull
    private static final ColorSchemeKeyTokens DisabledLabelColor;
    private static final float DisabledLabelOpacity;

    @NotNull
    private static final ColorSchemeKeyTokens FocusedIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens FocusedLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoveredIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens HoveredLabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens IconColor;

    @NotNull
    private static final ColorSchemeKeyTokens LabelColor;

    @NotNull
    private static final ColorSchemeKeyTokens PressedIconColor;

    @NotNull
    private static final ColorSchemeKeyTokens PressedLabelColor;

    @NotNull
    public static final TextButtonTokens INSTANCE = new TextButtonTokens();

    @NotNull
    private static final ColorSchemeKeyTokens DisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledContainerOpacity = 0.1f;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        DisabledIconColor = colorSchemeKeyTokens;
        DisabledIconOpacity = 0.38f;
        DisabledLabelColor = colorSchemeKeyTokens;
        DisabledLabelOpacity = 0.38f;
        FocusedIconColor = colorSchemeKeyTokens;
        FocusedLabelColor = colorSchemeKeyTokens;
        HoveredIconColor = colorSchemeKeyTokens;
        HoveredLabelColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        LabelColor = colorSchemeKeyTokens;
        PressedIconColor = colorSchemeKeyTokens;
        PressedLabelColor = colorSchemeKeyTokens;
    }

    private TextButtonTokens() {
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return DisabledLabelColor;
    }

    public final float getDisabledLabelOpacity() {
        return DisabledLabelOpacity;
    }
}
