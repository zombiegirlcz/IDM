package com.fourthline.vision.internal;

import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b6 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a6[] f35992a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35995c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f35996g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f35997h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f35998j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f35999l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f36000m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f36001n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f36002p;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36001n = obj2;
            this.f36002p |= Integer.MIN_VALUE;
            return b6.this.validate(null, null, this);
        }
    }

    public b6(@NotNull a6... validators) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f35992a = validators;
    }

    @Override // com.fourthline.vision.internal.a6
    public /* bridge */ DocumentValidationError toDocumentValidationError(@NotNull OcrValidationError ocrValidationError, @NotNull List<? extends ValidationError> list) {
        return super.toDocumentValidationError(ocrValidationError, list);
    }

    @Override // com.fourthline.vision.internal.a6
    @NotNull
    public /* bridge */ Set<DocumentValidationError> toDocumentValidationErrors(@NotNull Set<? extends OcrValidationError> set, @NotNull List<? extends ValidationError> list) {
        return super.toDocumentValidationErrors(set, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0097 -> B:20:0x009e). Please report as a decompilation issue!!! */
    @Override // com.fourthline.vision.internal.a6, com.fourthline.vision.internal.ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object validate(@org.jetbrains.annotations.NotNull com.fourthline.vision.internal.ud r12, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.sd r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<? extends com.fourthline.vision.document.DocumentValidationError>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.fourthline.vision.internal.b6.a
            if (r0 == 0) goto L13
            r0 = r14
            com.fourthline.vision.internal.b6$a r0 = (com.fourthline.vision.internal.b6.a) r0
            int r1 = r0.f36002p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36002p = r1
            goto L18
        L13:
            com.fourthline.vision.internal.b6$a r0 = new com.fourthline.vision.internal.b6$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f36001n
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f36002p
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            if (r2 != r4) goto L57
            int r12 = r0.f35999l
            int r13 = r0.k
            int r2 = r0.f35998j
            java.lang.Object r5 = r0.i
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f35997h
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r6 = r0.f35996g
            com.fourthline.vision.internal.a6 r6 = (com.fourthline.vision.internal.a6) r6
            java.lang.Object r6 = r0.f
            com.fourthline.vision.internal.a6 r6 = (com.fourthline.vision.internal.a6) r6
            java.lang.Object r6 = r0.e
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r6 = r0.d
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r6 = r0.f35995c
            com.fourthline.vision.internal.a6[] r6 = (com.fourthline.vision.internal.a6[]) r6
            java.lang.Object r7 = r0.f35994b
            com.fourthline.vision.internal.sd r7 = (com.fourthline.vision.internal.sd) r7
            java.lang.Object r8 = r0.f35993a
            com.fourthline.vision.internal.ud r8 = (com.fourthline.vision.internal.ud) r8
            yhm.o.b(r14)
            r10 = r2
            r2 = r0
            r0 = r7
            r7 = r6
            r6 = r10
            goto L9e
        L57:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L5f:
            yhm.o.b(r14)
            com.fourthline.vision.internal.a6[] r14 = r11.f35992a
            zhm.h0 r2 = zhm.h0.f322473a
            int r5 = r14.length
            r7 = r14
            r6 = r2
            r14 = r3
            r2 = r0
            r0 = r13
            r13 = r12
            r12 = r5
            r5 = r14
        L6f:
            if (r14 >= r12) goto Laa
            r8 = r7[r14]
            r2.f35993a = r13
            r2.f35994b = r0
            r2.f35995c = r7
            r9 = 0
            r2.d = r9
            r2.e = r9
            r2.f = r9
            r2.f35996g = r9
            r2.f35997h = r9
            r2.i = r6
            r2.f35998j = r5
            r2.k = r14
            r2.f35999l = r12
            r2.f36000m = r3
            r2.f36002p = r4
            java.lang.Object r8 = r8.validate(r13, r0, r2)
            if (r8 != r1) goto L97
            return r1
        L97:
            r10 = r8
            r8 = r13
            r13 = r14
            r14 = r10
            r10 = r6
            r6 = r5
            r5 = r10
        L9e:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.LinkedHashSet r14 = zhm.a1.l(r5, r14)
            int r13 = r13 + r4
            r5 = r6
            r6 = r14
            r14 = r13
            r13 = r8
            goto L6f
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.b6.validate(com.fourthline.vision.internal.ud, com.fourthline.vision.internal.sd, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
