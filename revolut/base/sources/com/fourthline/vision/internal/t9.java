package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class t9 implements td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f36953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final td f36954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sd f36955c;
    private final Try d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36958c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return t9.process$suspendImpl(t9.this, null, this);
        }
    }

    public t9(@NotNull td stepOne, @NotNull td stepTwo) {
        Intrinsics.checkNotNullParameter(stepOne, "stepOne");
        Intrinsics.checkNotNullParameter(stepTwo, "stepTwo");
        this.f36953a = stepOne;
        this.f36954b = stepTwo;
        this.f36955c = stepOne.getStepConfig();
        this.d = TryKt.failure(ra.f.a.f36780a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.ud>] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.ud>] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    private final Try<ud> getStepResultByPriority(Try<? extends ud>... tryArr) {
        ?? r3;
        ?? r4;
        int length = tryArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            r3 = 0;
            if (i2 >= length) {
                r4 = 0;
                break;
            }
            r4 = tryArr[i2];
            if (r4.isSuccess()) {
                break;
            }
            i2++;
        }
        if (r4 == 0) {
            int length2 = tryArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    r4 = 0;
                    break;
                }
                r4 = tryArr[i3];
                Try.Failure failure = r4 instanceof Try.Failure ? (Try.Failure) r4 : null;
                if ((failure != null ? failure.getException() : null) instanceof ra.a) {
                    break;
                }
                i3++;
            }
            if (r4 == 0) {
                int length3 = tryArr.length;
                while (true) {
                    if (i >= length3) {
                        break;
                    }
                    ?? r2 = tryArr[i];
                    Try.Failure failure2 = r2 instanceof Try.Failure ? (Try.Failure) r2 : null;
                    if (!Intrinsics.f(failure2 != null ? failure2.getException() : null, ra.f.a.f36780a)) {
                        r3 = r2;
                        break;
                    }
                    i++;
                }
                return r3 == 0 ? this.d : r3;
            }
        }
        return r4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.t9 r6, android.media.Image r7, kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r8) {
        /*
            boolean r0 = r8 instanceof com.fourthline.vision.internal.t9.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.t9$a r0 = (com.fourthline.vision.internal.t9.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.t9$a r0 = new com.fourthline.vision.internal.t9$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f36958c
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            java.lang.Object r7 = r0.f36957b
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r7 = r0.f36956a
            com.fourthline.vision.internal.t9 r7 = (com.fourthline.vision.internal.t9) r7
            yhm.o.b(r8)
            goto L91
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f36957b
            r7 = r6
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r6 = r0.f36956a
            com.fourthline.vision.internal.t9 r6 = (com.fourthline.vision.internal.t9) r6
            yhm.o.b(r8)
            goto L6e
        L4b:
            yhm.o.b(r8)
            boolean r8 = r6.isCompleted()
            if (r8 == 0) goto L57
            com.fourthline.core.internal.Try r6 = r6.d
            return r6
        L57:
            com.fourthline.vision.internal.td r8 = r6.f36953a
            boolean r8 = r8.isCompleted()
            if (r8 != 0) goto L71
            com.fourthline.vision.internal.td r8 = r6.f36953a
            r0.f36956a = r6
            r0.f36957b = r7
            r0.f = r4
            java.lang.Object r8 = r8.process(r7, r0)
            if (r8 != r1) goto L6e
            goto L8c
        L6e:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            goto L73
        L71:
            com.fourthline.core.internal.Try r8 = r6.d
        L73:
            com.fourthline.vision.internal.td r2 = r6.f36954b
            boolean r2 = r2.isCompleted()
            if (r2 != 0) goto L98
            com.fourthline.vision.internal.td r2 = r6.f36954b
            r0.f36956a = r6
            r4 = 0
            r0.f36957b = r4
            r0.f36958c = r8
            r0.f = r3
            java.lang.Object r7 = r2.process(r7, r0)
            if (r7 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L91:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L9a
        L98:
            com.fourthline.core.internal.Try r7 = r6.d
        L9a:
            com.fourthline.core.internal.Try[] r7 = new com.fourthline.core.internal.Try[]{r8, r7}
            com.fourthline.core.internal.Try r6 = r6.getStepResultByPriority(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.t9.process$suspendImpl(com.fourthline.vision.internal.t9, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.f36955c;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f36953a.isCompleted() && this.f36954b.isCompleted();
    }

    public Object process(@NotNull Image image, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        this.f36953a.start();
        this.f36954b.start();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        this.f36953a.stop();
        this.f36954b.stop();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }
}
