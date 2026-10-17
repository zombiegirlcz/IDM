package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u000b\u0010 J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u000e\u0010 J-\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b!\u0010 J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u0011\u0010\"J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u0016\u0010\"J-\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b$\u0010 J\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u0003\u0010\"J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u0005\u0010\"J\u001a\u0010'\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,¨\u0006.²\u0006\f\u0010-\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldColors;", "Landroidx/compose/material/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "indicatorColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "error", "labelColor", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "focused", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DefaultTextFieldColors implements TextFieldColors {
    private final long backgroundColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long leadingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final long trailingIconColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;

    public /* synthetic */ DefaultTextFieldColors(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, j42, j46, j47, j57, j58, j65, j69, j76, j85, j100, j101, j102, j103, j104, j105, j106);
    }

    private static final boolean indicatorColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> backgroundColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:853)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(this.backgroundColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> cursorColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:886)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(z ? this.errorCursorColor : this.cursorColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultTextFieldColors.class != other.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) other;
        return Color.m1978equalsimpl0(this.textColor, defaultTextFieldColors.textColor) && Color.m1978equalsimpl0(this.disabledTextColor, defaultTextFieldColors.disabledTextColor) && Color.m1978equalsimpl0(this.cursorColor, defaultTextFieldColors.cursorColor) && Color.m1978equalsimpl0(this.errorCursorColor, defaultTextFieldColors.errorCursorColor) && Color.m1978equalsimpl0(this.focusedIndicatorColor, defaultTextFieldColors.focusedIndicatorColor) && Color.m1978equalsimpl0(this.unfocusedIndicatorColor, defaultTextFieldColors.unfocusedIndicatorColor) && Color.m1978equalsimpl0(this.errorIndicatorColor, defaultTextFieldColors.errorIndicatorColor) && Color.m1978equalsimpl0(this.disabledIndicatorColor, defaultTextFieldColors.disabledIndicatorColor) && Color.m1978equalsimpl0(this.leadingIconColor, defaultTextFieldColors.leadingIconColor) && Color.m1978equalsimpl0(this.disabledLeadingIconColor, defaultTextFieldColors.disabledLeadingIconColor) && Color.m1978equalsimpl0(this.errorLeadingIconColor, defaultTextFieldColors.errorLeadingIconColor) && Color.m1978equalsimpl0(this.trailingIconColor, defaultTextFieldColors.trailingIconColor) && Color.m1978equalsimpl0(this.disabledTrailingIconColor, defaultTextFieldColors.disabledTrailingIconColor) && Color.m1978equalsimpl0(this.errorTrailingIconColor, defaultTextFieldColors.errorTrailingIconColor) && Color.m1978equalsimpl0(this.backgroundColor, defaultTextFieldColors.backgroundColor) && Color.m1978equalsimpl0(this.focusedLabelColor, defaultTextFieldColors.focusedLabelColor) && Color.m1978equalsimpl0(this.unfocusedLabelColor, defaultTextFieldColors.unfocusedLabelColor) && Color.m1978equalsimpl0(this.disabledLabelColor, defaultTextFieldColors.disabledLabelColor) && Color.m1978equalsimpl0(this.errorLabelColor, defaultTextFieldColors.errorLabelColor) && Color.m1978equalsimpl0(this.placeholderColor, defaultTextFieldColors.placeholderColor) && Color.m1978equalsimpl0(this.disabledPlaceholderColor, defaultTextFieldColors.disabledPlaceholderColor);
    }

    public int hashCode() {
        return Color.m1984hashCodeimpl(this.disabledPlaceholderColor) + com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(com.revolut.data.database.models.openbanking.d.b(Color.m1984hashCodeimpl(this.textColor) * 31, 31, this.disabledTextColor), 31, this.cursorColor), 31, this.errorCursorColor), 31, this.focusedIndicatorColor), 31, this.unfocusedIndicatorColor), 31, this.errorIndicatorColor), 31, this.disabledIndicatorColor), 31, this.leadingIconColor), 31, this.disabledLeadingIconColor), 31, this.errorLeadingIconColor), 31, this.trailingIconColor), 31, this.disabledTrailingIconColor), 31, this.errorTrailingIconColor), 31, this.backgroundColor), 31, this.focusedLabelColor), 31, this.unfocusedLabelColor), 31, this.disabledLabelColor), 31, this.errorLabelColor), 31, this.placeholderColor);
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> indicatorColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i) {
        Composer composer2;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceGroup(998675979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(998675979, i, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:835)");
        }
        long j2 = !z ? this.disabledIndicatorColor : z3 ? this.errorIndicatorColor : indicatorColor$lambda$0(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z) {
            composer.startReplaceGroup(318120148);
            composer2 = composer;
            stateRememberUpdatedState = SingleValueAnimationKt.m571animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(318223006);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(j2), composer2, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> labelColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceGroup(727091888);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(727091888, i, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:867)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(!z ? this.disabledLabelColor : z3 ? this.errorLabelColor : labelColor$lambda$0(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> leadingIconColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceGroup(-1519634405);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519634405, i, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(!z ? this.disabledLeadingIconColor : z3 ? this.errorLeadingIconColor : this.leadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> placeholderColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:858)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(z ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> textColor(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:881)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(z ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @NotNull
    public State<Color> trailingIconColor(boolean z, boolean z3, @NotNull InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceGroup(1383318157);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1383318157, i, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1972boximpl(!z ? this.disabledTrailingIconColor : z3 ? this.errorTrailingIconColor : this.trailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    private DefaultTextFieldColors(long j2, long j3, long j5, long j16, long j22, long j42, long j46, long j47, long j57, long j58, long j65, long j69, long j76, long j85, long j100, long j101, long j102, long j103, long j104, long j105, long j106) {
        this.textColor = j2;
        this.disabledTextColor = j3;
        this.cursorColor = j5;
        this.errorCursorColor = j16;
        this.focusedIndicatorColor = j22;
        this.unfocusedIndicatorColor = j42;
        this.errorIndicatorColor = j46;
        this.disabledIndicatorColor = j47;
        this.leadingIconColor = j57;
        this.disabledLeadingIconColor = j58;
        this.errorLeadingIconColor = j65;
        this.trailingIconColor = j69;
        this.disabledTrailingIconColor = j76;
        this.errorTrailingIconColor = j85;
        this.backgroundColor = j100;
        this.focusedLabelColor = j101;
        this.unfocusedLabelColor = j102;
        this.disabledLabelColor = j103;
        this.errorLabelColor = j104;
        this.placeholderColor = j105;
        this.disabledPlaceholderColor = j106;
    }
}
