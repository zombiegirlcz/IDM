package androidx.camera.camera2.pipe.compat;

import gim.c;
import gim.d;
import hx7.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.h;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/compat/SessionSequencer;", "", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "concurrentSequencer", "<init>", "(Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;)V", "", "awaitSessionLock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "()V", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "Lrkm/h;", "Landroidx/camera/camera2/pipe/compat/SessionSequencer$State;", "state", "Lrkm/h;", "State", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionSequencer {

    @NotNull
    private final ConcurrentSessionSequencer concurrentSequencer;

    @NotNull
    private final h state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/compat/SessionSequencer$State;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "CREATING", "CREATED", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State PENDING = new State("PENDING", 0);
        public static final State CREATING = new State("CREATING", 1);
        public static final State CREATED = new State("CREATED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{PENDING, CREATING, CREATED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = s.n(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.SessionSequencer", f = "ConcurrentSessionSequencers.kt", l = {98}, m = "awaitSessionLock", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SessionSequencer.this.awaitSessionLock(this);
        }
    }

    public SessionSequencer(@NotNull ConcurrentSessionSequencer concurrentSequencer) {
        Intrinsics.checkNotNullParameter(concurrentSequencer, "concurrentSequencer");
        this.concurrentSequencer = concurrentSequencer;
        this.state = b.j(State.PENDING);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitSessionLock(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.compat.SessionSequencer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1 r0 = (androidx.camera.camera2.pipe.compat.SessionSequencer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1 r0 = new androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L42
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer r6 = r5.concurrentSequencer
            hlm.a r6 = r6.getSharedMutex()
            r0.label = r4
            java.lang.Object r6 = r6.lock(r3, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            rkm.h r6 = r5.state
            androidx.camera.camera2.pipe.compat.SessionSequencer$State r0 = androidx.camera.camera2.pipe.compat.SessionSequencer.State.PENDING
            androidx.camera.camera2.pipe.compat.SessionSequencer$State r1 = androidx.camera.camera2.pipe.compat.SessionSequencer.State.CREATING
            boolean r6 = r6.a(r0, r1)
            if (r6 != 0) goto L57
            androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencer r6 = r5.concurrentSequencer
            hlm.a r6 = r6.getSharedMutex()
            r6.unlock(r3)
        L57:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.SessionSequencer.awaitSessionLock(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void release() {
        h hVar = this.state;
        State state = State.CREATED;
        hVar.getClass();
        if (h.f254899b.getAndSet(hVar, state) == State.CREATING) {
            this.concurrentSequencer.getSharedMutex().unlock(null);
        }
    }
}
