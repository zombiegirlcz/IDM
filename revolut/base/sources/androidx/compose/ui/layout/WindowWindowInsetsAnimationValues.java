package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010 \u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00198V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010$\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\"\u00101\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010.\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\"\u00104\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001f¨\u0006:"}, d2 = {"Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "<set-?>", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible", "(Z)V", "isAnimating$delegate", "isAnimating", "setAnimating", "", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "fraction", "", "durationMillis$delegate", "Landroidx/compose/runtime/MutableLongState;", "getDurationMillis", "()J", "setDurationMillis", "(J)V", "durationMillis", "alpha$delegate", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/layout/RectRulers;", "source", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", "target", "getTarget", "Landroidx/compose/ui/layout/ValueInsets;", "current", "J", "getCurrent-hdzbrEE", "setCurrent-Ynlvx88", "maximum", "getMaximum-hdzbrEE", "setMaximum-Ynlvx88", "sourceValueInsets", "getSourceValueInsets-hdzbrEE", "setSourceValueInsets-Ynlvx88", "targetValueInsets", "getTargetValueInsets-hdzbrEE", "setTargetValueInsets-Ynlvx88", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowWindowInsetsAnimationValues {

    @NotNull
    private final RectRulers source;

    @NotNull
    private final RectRulers target;

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: isAnimating$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isAnimating = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: fraction$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState fraction = PrimitiveSnapshotStateKt.mutableFloatStateOf(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: durationMillis$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableLongState durationMillis = SnapshotLongStateKt.mutableLongStateOf(0);

    /* JADX INFO: renamed from: alpha$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState alpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private long current = ValueInsets_androidKt.getUnsetValueInsets();
    private long maximum = ValueInsets_androidKt.getUnsetValueInsets();
    private long sourceValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
    private long targetValueInsets = ValueInsets_androidKt.getUnsetValueInsets();

    public WindowWindowInsetsAnimationValues(@NotNull String str) {
        this.source = RectRulersKt.RectRulers(str + " source");
        this.target = RectRulersKt.RectRulers(str + " target");
    }

    /* JADX INFO: renamed from: getCurrent-hdzbrEE, reason: not valid java name and from getter */
    public final long getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: getMaximum-hdzbrEE, reason: not valid java name and from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    @NotNull
    public RectRulers getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getSourceValueInsets() {
        return this.sourceValueInsets;
    }

    @NotNull
    public RectRulers getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getTargetValueInsets() {
        return this.targetValueInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isAnimating() {
        return ((Boolean) this.isAnimating.getValue()).booleanValue();
    }

    public void setAlpha(float f) {
        this.alpha.setFloatValue(f);
    }

    public void setAnimating(boolean z) {
        this.isAnimating.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m2600setCurrentYnlvx88(long j2) {
        this.current = j2;
    }

    public void setDurationMillis(long j2) {
        this.durationMillis.setLongValue(j2);
    }

    public void setFraction(float f) {
        this.fraction.setFloatValue(f);
    }

    /* JADX INFO: renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m2601setMaximumYnlvx88(long j2) {
        this.maximum = j2;
    }

    /* JADX INFO: renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m2602setSourceValueInsetsYnlvx88(long j2) {
        this.sourceValueInsets = j2;
    }

    /* JADX INFO: renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m2603setTargetValueInsetsYnlvx88(long j2) {
        this.targetValueInsets = j2;
    }

    public void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }
}
