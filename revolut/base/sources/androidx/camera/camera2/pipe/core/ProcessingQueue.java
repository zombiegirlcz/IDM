package androidx.camera.camera2.pipe.core;

import gim.c;
import gim.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import rkm.b;
import skm.e0;
import ukm.u;
import ukm.y;
import ukm.z;
import vc.s;
import xx9.f;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001'BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR6\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "T", "", "", "capacity", "Lkotlin/Function1;", "", "", "onUnprocessedElements", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "process", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "processingLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "releaseUnprocessedElements", "(Ljava/lang/Throwable;)V", "element", "", "tryEmit", "(Ljava/lang/Object;)Z", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lrkm/b;", "started", "Lrkm/b;", "Lukm/u;", "channel", "Lukm/u;", "Lkotlin/collections/ArrayDeque;", "queue", "Lkotlin/collections/ArrayDeque;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessingQueue<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int capacity;

    @NotNull
    private final u channel;

    @NotNull
    private final Function1<List<? extends T>, Unit> onUnprocessedElements;

    @NotNull
    private final Function2<List<T>, Continuation<? super Unit>, Object> process;

    @NotNull
    private final ArrayDeque<T> queue;

    @NotNull
    private final b started;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/core/ProcessingQueue$Companion;", "", "<init>", "()V", "processIn", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "T", "scope", "Lkotlinx/coroutines/CoroutineScope;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ProcessingQueue<T> processIn(@NotNull ProcessingQueue<T> processingQueue, @NotNull CoroutineScope scope) throws Throwable {
            Intrinsics.checkNotNullParameter(processingQueue, "<this>");
            Intrinsics.checkNotNullParameter(scope, "scope");
            if (!((ProcessingQueue) processingQueue).started.a()) {
                throw new IllegalStateException("ProcessingQueue cannot be re-started!");
            }
            if (e0.C(scope, null, null, new ProcessingQueue$Companion$processIn$job$1(processingQueue, null), 3).isCancelled()) {
                processingQueue.releaseUnprocessedElements(null);
            }
            return processingQueue;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.core.ProcessingQueue", f = "ProcessingQueue.kt", l = {102, LDSFile.EF_DG2_TAG}, m = "processingLoop", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ProcessingQueue<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProcessingQueue<T> processingQueue, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = processingQueue;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processingLoop(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessingQueue(int i, @NotNull Function1<? super List<? extends T>, Unit> onUnprocessedElements, @NotNull Function2<? super List<T>, ? super Continuation<? super Unit>, ? extends Object> process) {
        Intrinsics.checkNotNullParameter(onUnprocessedElements, "onUnprocessedElements");
        Intrinsics.checkNotNullParameter(process, "process");
        this.capacity = i;
        this.onUnprocessedElements = onUnprocessedElements;
        this.process = process;
        this.started = hx7.b.g(false);
        this.channel = s.a(i, null, new xw9.c(this, 24), 2);
        this.queue = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(List it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit channel$lambda$0(ProcessingQueue processingQueue, Object obj2) {
        processingQueue.queue.addLast(obj2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r7.invoke(r5, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r2 == r6.queue.size()) goto L22;
     */
    /* JADX WARN: Path cross not found for [B:22:0x003d, B:26:0x004d], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:13:0x0028, B:35:0x0083, B:26:0x004d, B:28:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x006e, B:22:0x003d, B:25:0x0048, B:19:0x0036), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:13:0x0028, B:35:0x0083, B:26:0x004d, B:28:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x006e, B:22:0x003d, B:25:0x0048, B:19:0x0036), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:13:0x0028, B:35:0x0083, B:26:0x004d, B:28:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x006e, B:22:0x003d, B:25:0x0048, B:19:0x0036), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:35:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processingLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.core.ProcessingQueue.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1 r0 = (androidx.camera.camera2.pipe.core.ProcessingQueue.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1 r0 = new androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.I$0
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L83
        L2c:
            r7 = move-exception
            goto L8c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L48
        L3a:
            yhm.o.b(r7)
        L3d:
            ukm.u r7 = r6.channel     // Catch: java.lang.Throwable -> L2c
            r0.label = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.j(r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L48
            goto L82
        L48:
            kotlin.collections.ArrayDeque<T> r2 = r6.queue     // Catch: java.lang.Throwable -> L2c
            r2.addLast(r7)     // Catch: java.lang.Throwable -> L2c
        L4d:
            kotlin.collections.ArrayDeque<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2c
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r7 != 0) goto L3d
            ukm.u r7 = r6.channel     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.c()     // Catch: java.lang.Throwable -> L2c
        L5b:
            boolean r2 = r7 instanceof ukm.y     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L6e
            kotlin.collections.ArrayDeque<T> r2 = r6.queue     // Catch: java.lang.Throwable -> L2c
            ukm.z.c(r7)     // Catch: java.lang.Throwable -> L2c
            r2.addLast(r7)     // Catch: java.lang.Throwable -> L2c
            ukm.u r7 = r6.channel     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.c()     // Catch: java.lang.Throwable -> L2c
            goto L5b
        L6e:
            kotlin.collections.ArrayDeque<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2c
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L2c
            kotlin.jvm.functions.Function2<java.util.List<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.process     // Catch: java.lang.Throwable -> L2c
            kotlin.collections.ArrayDeque<T> r5 = r6.queue     // Catch: java.lang.Throwable -> L2c
            r0.I$0 = r2     // Catch: java.lang.Throwable -> L2c
            r0.label = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.collections.ArrayDeque<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2c
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L2c
            if (r2 != r7) goto L4d
            goto L3d
        L8c:
            r6.releaseUnprocessedElements(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.core.ProcessingQueue.processingLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseUnprocessedElements(Throwable cause) throws Throwable {
        if (this.channel.close(cause)) {
            Object objC = this.channel.c();
            while (!(objC instanceof y)) {
                ArrayDeque<T> arrayDeque = this.queue;
                z.c(objC);
                arrayDeque.addLast(objC);
                objC = this.channel.c();
            }
            if (this.queue.isEmpty()) {
                return;
            }
            this.onUnprocessedElements.invoke(d0.f1(this.queue));
            this.queue.clear();
        }
    }

    public final boolean tryEmit(T element) {
        return !(this.channel.mo3647trySendJP2dKIU(element) instanceof y);
    }

    public /* synthetic */ ProcessingQueue(int i, Function1 function1, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? new f(26) : function1, function2);
    }
}
