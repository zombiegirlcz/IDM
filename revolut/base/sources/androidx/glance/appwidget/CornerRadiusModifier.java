package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/glance/appwidget/CornerRadiusModifier;", "Landroidx/glance/GlanceModifier$Element;", "Landroidx/glance/unit/Dimension;", "radius", "<init>", "(Landroidx/glance/unit/Dimension;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/unit/Dimension;", "getRadius", "()Landroidx/glance/unit/Dimension;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CornerRadiusModifier implements GlanceModifier.Element {

    @NotNull
    private final Dimension radius;

    public CornerRadiusModifier(@NotNull Dimension dimension) {
        this.radius = dimension;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CornerRadiusModifier) && Intrinsics.f(this.radius, ((CornerRadiusModifier) other).radius);
    }

    @NotNull
    public final Dimension getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return this.radius.hashCode();
    }

    @NotNull
    public String toString() {
        return "CornerRadiusModifier(radius=" + this.radius + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
