package tb;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f269372b;

    public a(boolean z, a0 pagerState) {
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.f269371a = z;
        this.f269372b = pagerState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo776onPostFlingRZ2iAVY(long j2, long j3, Continuation continuation) {
        long jM3405getZero9UxMQ8M;
        float fFloatValue = ((Number) this.f269372b.e.getValue()).floatValue();
        float fM3397getXimpl = BitmapDescriptorFactory.HUE_RED;
        if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
            if (this.f269371a) {
                fM3397getXimpl = Velocity.m3397getXimpl(j3);
            }
            jM3405getZero9UxMQ8M = VelocityKt.Velocity(fM3397getXimpl, Velocity.m3398getYimpl(j3));
        } else {
            jM3405getZero9UxMQ8M = Velocity.INSTANCE.m3405getZero9UxMQ8M();
        }
        return Velocity.m3391boximpl(jM3405getZero9UxMQ8M);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo777onPostScrollDzOQY0M(long j2, long j3, int i) {
        if (NestedScrollSource.m2410equalsimpl0(i, NestedScrollSource.INSTANCE.m2411getFlingWNlRxjI())) {
            return OffsetKt.Offset(this.f269371a ? Offset.m1835getXimpl(j3) : BitmapDescriptorFactory.HUE_RED, Offset.m1836getYimpl(j3));
        }
        return Offset.INSTANCE.m1845getZeroF1C5BW0();
    }
}
