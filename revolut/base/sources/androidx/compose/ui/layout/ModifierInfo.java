package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "extra", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Ljava/lang/Object;", "getExtra", "()Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModifierInfo {

    @NotNull
    private final LayoutCoordinates coordinates;
    private final Object extra;

    @NotNull
    private final Modifier modifier;

    public ModifierInfo(@NotNull Modifier modifier, @NotNull LayoutCoordinates layoutCoordinates, Object obj2) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj2;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @NotNull
    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
