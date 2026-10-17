package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mmm.h0;
import mmm.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "Lmmm/s;", "fileSystem", "Lmmm/h0;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lmmm/s;Lmmm/h0;Landroidx/datastore/core/okio/OkioSerializer;)V", "value", "", "writeData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    @d(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {Constants.TAG_EMV_L2_CHECKSUM}, m = "writeData")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OkioWriteScope<T> okioWriteScope, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(@NotNull s fileSystem, @NotNull h0 path, @NotNull OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #2 {all -> 0x0094, blocks: (B:42:0x009b, B:48:0x00a8, B:37:0x0090, B:34:0x008b), top: B:64:0x0020, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0094, blocks: (B:42:0x009b, B:48:0x00a8, B:37:0x0090, B:34:0x008b), top: B:64:0x0020, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioWriteScope$writeData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [mmm.b0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.datastore.core.okio.OkioSerializer] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, mmm.b0] */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = (androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = new androidx.datastore.core.okio.OkioWriteScope$writeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$2
            java.io.Closeable r8 = (java.io.Closeable) r8
            java.lang.Object r1 = r0.L$1
            mmm.b0 r1 = (mmm.b0) r1
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L76
        L34:
            r9 = move-exception
            goto L89
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            yhm.o.b(r9)
            r7.checkClose()
            mmm.s r9 = r7.getFileSystem()
            mmm.h0 r2 = r7.getPath()
            r9.getClass()
            java.lang.String r5 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            mmm.b0 r9 = r9.q(r2)
            mmm.p r2 = mmm.b0.d(r9)     // Catch: java.lang.Throwable -> La9
            mmm.k0 r2 = le.u1.b(r2)     // Catch: java.lang.Throwable -> La9
            androidx.datastore.core.okio.OkioSerializer r5 = r7.getSerializer()     // Catch: java.lang.Throwable -> L85
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L85
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L85
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L85
            r0.label = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r5.writeTo(r8, r2, r0)     // Catch: java.lang.Throwable -> L85
            if (r8 != r1) goto L73
            return r1
        L73:
            r0 = r9
            r1 = r0
            r8 = r2
        L76:
            r1.flush()     // Catch: java.lang.Throwable -> L34
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L83
            r8.close()     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r8 = move-exception
            goto L99
        L83:
            r8 = r4
            goto L99
        L85:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r2
        L89:
            if (r8 == 0) goto L97
            r8.close()     // Catch: java.lang.Throwable -> L8f
            goto L97
        L8f:
            r8 = move-exception
            yhm.f.a(r9, r8)     // Catch: java.lang.Throwable -> L94
            goto L97
        L94:
            r8 = move-exception
            r9 = r0
            goto Laa
        L97:
            r8 = r9
            r9 = r4
        L99:
            if (r8 != 0) goto La8
            kotlin.jvm.internal.Intrinsics.h(r9)     // Catch: java.lang.Throwable -> L94
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto Lb7
            r0.close()     // Catch: java.lang.Throwable -> La6
            goto Lb7
        La6:
            r4 = move-exception
            goto Lb7
        La8:
            throw r8     // Catch: java.lang.Throwable -> L94
        La9:
            r8 = move-exception
        Laa:
            if (r9 == 0) goto Lb4
            r9.close()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r9 = move-exception
            yhm.f.a(r8, r9)
        Lb4:
            r6 = r4
            r4 = r8
            r8 = r6
        Lb7:
            if (r4 != 0) goto Lbf
            kotlin.jvm.internal.Intrinsics.h(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lbf:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
