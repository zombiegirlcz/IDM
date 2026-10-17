package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "<init>", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", "plus", "exit", "equals", "", "other", "toString", "", "hashCode", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExitTransition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ExitTransition KeepUntilTransitionsFinished;

    @NotNull
    private static final ExitTransition None;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/ExitTransition;", "None", "Landroidx/compose/animation/ExitTransition;", "getNone", "()Landroidx/compose/animation/ExitTransition;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExitTransition getNone() {
            return ExitTransition.None;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Veil veil = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, false, map, CertificateBody.profileType, defaultConstructorMarker));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, true, map, 95, defaultConstructorMarker));
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(Object other) {
        return (other instanceof ExitTransition) && Intrinsics.f(((ExitTransition) other).getData$animation(), getData$animation());
    }

    @NotNull
    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    @NotNull
    public final ExitTransition plus(@NotNull ExitTransition exit) {
        Fade fade = exit.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = exit.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = exit.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = exit.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        exit.getData$animation().getVeil();
        getData$animation().getVeil();
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, null, exit.getData$animation().getHold() || getData$animation().getHold(), r0.p(getData$animation().getEffectsMap(), exit.getData$animation().getEffectsMap())));
    }

    @NotNull
    public String toString() {
        if (equals(None)) {
            return "ExitTransition.None";
        }
        if (equals(KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb6 = new StringBuilder("ExitTransition: \nFade - ");
        Fade fade = data$animation.getFade();
        sb6.append(fade != null ? fade.toString() : null);
        sb6.append(",\nSlide - ");
        Slide slide = data$animation.getSlide();
        sb6.append(slide != null ? slide.toString() : null);
        sb6.append(",\nShrink - ");
        ChangeSize changeSize = data$animation.getChangeSize();
        sb6.append(changeSize != null ? changeSize.toString() : null);
        sb6.append(",\nScale - ");
        Scale scale = data$animation.getScale();
        sb6.append(scale != null ? scale.toString() : null);
        sb6.append(",\nKeepUntilTransitionsFinished - ");
        sb6.append(data$animation.getHold());
        return sb6.toString();
    }

    private ExitTransition() {
    }
}
