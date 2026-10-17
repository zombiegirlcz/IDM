package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "<init>", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", "plus", "enter", "toString", "", "equals", "", "other", "hashCode", "", "Companion", "Landroidx/compose/animation/EnterTransitionImpl;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EnterTransition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, null, false, null, CertificateBody.profileType, null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "<init>", "()V", "None", "Landroidx/compose/animation/EnterTransition;", "getNone", "()Landroidx/compose/animation/EnterTransition;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnterTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(Object other) {
        return (other instanceof EnterTransition) && Intrinsics.f(((EnterTransition) other).getData$animation(), getData$animation());
    }

    @NotNull
    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    @NotNull
    public final EnterTransition plus(@NotNull EnterTransition enter) {
        Fade fade = enter.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = enter.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = enter.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = enter.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        enter.getData$animation().getVeil();
        getData$animation().getVeil();
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, null, false, r0.p(getData$animation().getEffectsMap(), enter.getData$animation().getEffectsMap()), 32, null));
    }

    @NotNull
    public String toString() {
        if (equals(None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb6 = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb6.toString();
    }

    private EnterTransition() {
    }
}
