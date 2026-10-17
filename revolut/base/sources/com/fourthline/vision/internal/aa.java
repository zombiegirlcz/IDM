package com.fourthline.vision.internal;

import android.media.Image;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.internal.r5;
import com.fourthline.vision.internal.ra;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class aa implements td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f35952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final td f35953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Try.Success f35954c;
    private final sd d;
    private final Try e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35957c;
        /* synthetic */ Object d;
        int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return aa.process$suspendImpl(aa.this, null, this);
        }
    }

    public aa(@NotNull td stepOne, @NotNull td stepTwo) {
        Intrinsics.checkNotNullParameter(stepOne, "stepOne");
        Intrinsics.checkNotNullParameter(stepTwo, "stepTwo");
        this.f35952a = stepOne;
        this.f35953b = stepTwo;
        this.d = stepOne.getStepConfig();
        this.e = TryKt.failure(ra.f.a.f36780a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.ud>] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.fourthline.core.internal.Try] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.fourthline.core.internal.Try<com.fourthline.vision.internal.ud>] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    private final Try<ud> getStepResultByPriority(Try<? extends ud>... tryArr) {
        ?? r3;
        ?? r4;
        ?? r42;
        Set<DocumentValidationError> validationErrors;
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
        Try.Success success = r4 instanceof Try.Success ? (Try.Success) r4 : null;
        if (success != null) {
            ud udVar = (ud) success.getValue();
            if (udVar instanceof r5.a) {
                Try.Success success2 = this.f35954c;
                if (success2 != null) {
                    return success2;
                }
            } else if (udVar instanceof r5.b) {
                Try.Success success3 = this.f35954c;
                if (success3 != null) {
                    Object value = success3.getValue();
                    r5.b bVar = value instanceof r5.b ? (r5.b) value : null;
                    if (((bVar == null || (validationErrors = bVar.getValidationErrors()) == null) ? Integer.MAX_VALUE : validationErrors.size()) < ((r5.b) udVar).getValidationErrors().size()) {
                        return success3;
                    }
                }
            }
            return success;
        }
        int length2 = tryArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                r42 = 0;
                break;
            }
            r42 = tryArr[i3];
            if (r42.isSuccess()) {
                break;
            }
            i3++;
        }
        if (r42 == 0) {
            int length3 = tryArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    r42 = 0;
                    break;
                }
                r42 = tryArr[i5];
                Try.Failure failure = r42 instanceof Try.Failure ? (Try.Failure) r42 : null;
                if ((failure != null ? failure.getException() : null) instanceof ra.a) {
                    break;
                }
                i5++;
            }
            if (r42 == 0) {
                int length4 = tryArr.length;
                while (true) {
                    if (i >= length4) {
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
                return r3 == 0 ? this.e : r3;
            }
        }
        return r42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <SCANNER_STEP> java.lang.Object process$suspendImpl(com.fourthline.vision.internal.aa r6, android.media.Image r7, kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends com.fourthline.vision.internal.ud>> r8) {
        /*
            boolean r0 = r8 instanceof com.fourthline.vision.internal.aa.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.aa$a r0 = (com.fourthline.vision.internal.aa.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.aa$a r0 = new com.fourthline.vision.internal.aa$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f35957c
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            java.lang.Object r7 = r0.f35956b
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r7 = r0.f35955a
            com.fourthline.vision.internal.aa r7 = (com.fourthline.vision.internal.aa) r7
            yhm.o.b(r8)
            goto La3
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            java.lang.Object r6 = r0.f35956b
            r7 = r6
            android.media.Image r7 = (android.media.Image) r7
            java.lang.Object r6 = r0.f35955a
            com.fourthline.vision.internal.aa r6 = (com.fourthline.vision.internal.aa) r6
            yhm.o.b(r8)
            goto L6f
        L4c:
            yhm.o.b(r8)
            boolean r8 = r6.isCompleted()
            if (r8 == 0) goto L58
            com.fourthline.core.internal.Try r6 = r6.e
            return r6
        L58:
            com.fourthline.vision.internal.td r8 = r6.f35952a
            boolean r8 = r8.isCompleted()
            if (r8 != 0) goto L83
            com.fourthline.vision.internal.td r8 = r6.f35952a
            r0.f35955a = r6
            r0.f35956b = r7
            r0.f = r4
            java.lang.Object r8 = r8.process(r7, r0)
            if (r8 != r1) goto L6f
            goto L9e
        L6f:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            boolean r2 = r8.isSuccess()
            if (r2 == 0) goto L85
            com.fourthline.core.internal.Try$Success r8 = (com.fourthline.core.internal.Try.Success) r8
            r6.f35954c = r8
            com.fourthline.vision.internal.td r8 = r6.f35952a
            r8.start()
            com.fourthline.core.internal.Try r8 = r6.e
            goto L85
        L83:
            com.fourthline.core.internal.Try r8 = r6.e
        L85:
            com.fourthline.vision.internal.td r2 = r6.f35953b
            boolean r2 = r2.isCompleted()
            if (r2 != 0) goto Laa
            com.fourthline.vision.internal.td r2 = r6.f35953b
            r0.f35955a = r6
            r4 = 0
            r0.f35956b = r4
            r0.f35957c = r8
            r0.f = r3
            java.lang.Object r7 = r2.process(r7, r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        La3:
            com.fourthline.core.internal.Try r8 = (com.fourthline.core.internal.Try) r8
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lac
        Laa:
            com.fourthline.core.internal.Try r7 = r6.e
        Lac:
            com.fourthline.core.internal.Try[] r7 = new com.fourthline.core.internal.Try[]{r8, r7}
            com.fourthline.core.internal.Try r6 = r6.getStepResultByPriority(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.aa.process$suspendImpl(com.fourthline.vision.internal.aa, android.media.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.td
    @NotNull
    public sd getStepConfig() {
        return this.d;
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f35952a.isCompleted() && this.f35953b.isCompleted();
    }

    public Object process(@NotNull Image image, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        return process$suspendImpl(this, image, continuation);
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void start() {
        this.f35954c = null;
        this.f35952a.start();
        this.f35953b.start();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        this.f35952a.stop();
        this.f35953b.stop();
    }

    @Override // com.fourthline.vision.internal.td, com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Image) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }
}
