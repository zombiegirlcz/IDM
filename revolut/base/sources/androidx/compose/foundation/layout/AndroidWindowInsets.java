package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R0\u0010.\u001a\u00020%2\u000b\u0010'\u001a\u00070%¢\u0006\u0002\b&8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u00100\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "", "update$foundation_layout", "(Landroidx/core/view/WindowInsetsCompat;I)V", "update", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getType$foundation_layout", "Ljava/lang/String;", "Landroidx/core/graphics/Insets;", "Lkotlin/jvm/internal/EnhancedNullability;", "<set-?>", "insets$delegate", "Landroidx/compose/runtime/MutableState;", "getInsets$foundation_layout", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout", "(Landroidx/core/graphics/Insets;)V", "insets", "isVisible$delegate", "isVisible", "()Z", "setVisible", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidWindowInsets implements WindowInsets {

    /* JADX INFO: renamed from: insets$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState insets = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @NotNull
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i, @NotNull String str) {
        this.type = i;
        this.name = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) other).type;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        return getInsets$foundation_layout().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Insets getInsets$foundation_layout() {
        return (Insets) this.insets.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        return getInsets$foundation_layout().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        return getInsets$foundation_layout().top;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public final void setInsets$foundation_layout(@NotNull Insets insets) {
        this.insets.setValue(insets);
    }

    public final void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.name);
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb6.append(getInsets$foundation_layout().left);
        sb6.append(", ");
        sb6.append(getInsets$foundation_layout().top);
        sb6.append(", ");
        sb6.append(getInsets$foundation_layout().right);
        sb6.append(", ");
        return j6.a.t(sb6, getInsets$foundation_layout().bottom, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final void update$foundation_layout(@NotNull WindowInsetsCompat windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            setInsets$foundation_layout(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
