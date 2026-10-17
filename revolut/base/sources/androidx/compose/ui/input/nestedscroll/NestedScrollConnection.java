package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPreScroll", "Landroidx/compose/ui/geometry/Offset;", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPostScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NestedScrollConnection {
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m2402onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, long j3, Continuation<? super Velocity> continuation) {
        return Velocity.m3391boximpl(Velocity.INSTANCE.m3405getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m2403onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, Continuation<? super Velocity> continuation) {
        return Velocity.m3391boximpl(Velocity.INSTANCE.m3405getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo776onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
        return m2402onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, continuation);
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo777onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m1845getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    default Object mo2404onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        return m2403onPreFlingQWom1Mo$suspendImpl(this, j2, continuation);
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo946onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m1845getZeroF1C5BW0();
    }
}
