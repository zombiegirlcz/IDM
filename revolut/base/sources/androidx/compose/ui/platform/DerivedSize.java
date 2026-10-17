package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/DerivedSize;", "", "Landroidx/compose/ui/unit/IntSize;", "pxSize", "Landroidx/compose/ui/unit/DpSize;", "dpSize", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPxSize-YbymL2g", "()J", "getDpSize-MYxV2XQ", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DerivedSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DerivedSize Zero = new DerivedSize(IntSize.INSTANCE.m3359getZeroYbymL2g(), DpSize.INSTANCE.m3327getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/DerivedSize$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntSize;", "pxSize", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/platform/DerivedSize;", "fromPxSize-viCIZxY", "(JLandroidx/compose/ui/unit/Density;)Landroidx/compose/ui/platform/DerivedSize;", "fromPxSize", "Landroidx/compose/ui/unit/DpSize;", "dpSize", "fromDpSize-itqla9I", "fromDpSize", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final DerivedSize m2793fromDpSizeitqla9I(long dpSize, @NotNull Density density) {
            return new DerivedSize(IntSizeKt.m3362toIntSizeuvyYCjk(density.mo769toSizeXkaWNTQ(dpSize)), dpSize, null);
        }

        @NotNull
        /* JADX INFO: renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final DerivedSize m2794fromPxSizeviCIZxY(long pxSize, @NotNull Density density) {
            return new DerivedSize(pxSize, density.mo766toDpSizekrfVVM(IntSizeKt.m3363toSizeozmzZPI(pxSize)), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DerivedSize(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) other;
        return IntSize.m3353equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m3320equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    public int hashCode() {
        return DpSize.m3323hashCodeimpl(this.dpSize) + (IntSize.m3356hashCodeimpl(this.pxSize) * 31);
    }

    private DerivedSize(long j2, long j3) {
        this.pxSize = j2;
        this.dpSize = j3;
    }
}
