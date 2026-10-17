package androidx.glance.unit;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/glance/unit/FixedColorProvider;", "Landroidx/glance/unit/ColorProvider;", "Landroidx/compose/ui/graphics/Color;", "color", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "getColor-vNxB06k", "(Landroid/content/Context;)J", "getColor", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "()J", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FixedColorProvider implements ColorProvider {
    private final long color;

    public /* synthetic */ FixedColorProvider(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedColorProvider) && Color.m1978equalsimpl0(this.color, ((FixedColorProvider) other).color);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    @Override // androidx.glance.unit.ColorProvider
    /* JADX INFO: renamed from: getColor-vNxB06k */
    public long mo3583getColorvNxB06k(@NotNull Context context) {
        return this.color;
    }

    public int hashCode() {
        return Color.m1984hashCodeimpl(this.color);
    }

    @NotNull
    public String toString() {
        return "FixedColorProvider(color=" + ((Object) Color.m1985toStringimpl(this.color)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private FixedColorProvider(long j2) {
        this.color = j2;
    }
}
