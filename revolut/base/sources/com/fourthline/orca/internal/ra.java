package com.fourthline.orca.internal;

import com.fourthline.vision.MotionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ra {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final je f32655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg0 f32657c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32660c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32661g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f32661g |= Integer.MIN_VALUE;
            return ra.this.a(null, null, null, this);
        }
    }

    public ra(je dataUploaderWorker, String workflowId, sg0 analyticsTracker) {
        Intrinsics.checkNotNullParameter(dataUploaderWorker, "dataUploaderWorker");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.f32655a = dataUploaderWorker;
        this.f32656b = workflowId;
        this.f32657c = analyticsTracker;
    }

    public final Object b(MotionData motionData, Continuation continuation) {
        Object objA = a(motionData, "selfie_motion_data.json", "SelfieMotionData", continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object a(MotionData motionData, Continuation continuation) {
        Object objA = a(motionData, "document_motion_data.json", "DocumentMotionData", continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.vision.MotionData r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.fourthline.orca.internal.ra.b
            if (r0 == 0) goto L13
            r0 = r12
            com.fourthline.orca.internal.ra$b r0 = (com.fourthline.orca.internal.ra.b) r0
            int r1 = r0.f32661g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32661g = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ra$b r0 = new com.fourthline.orca.internal.ra$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f32661g
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r9 = r0.d
            com.fourthline.orca.internal.je$a r9 = (com.fourthline.orca.internal.je.a) r9
            java.lang.Object r9 = r0.f32660c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f32659b
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.f32658a
            com.fourthline.vision.MotionData r9 = (com.fourthline.vision.MotionData) r9
            yhm.o.b(r12)
            yhm.m r12 = (yhm.m) r12
            java.lang.Object r9 = r12.f314193a
            goto L7f
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            yhm.o.b(r12)
            com.fourthline.orca.internal.je$a r12 = new com.fourthline.orca.internal.je$a
            java.lang.String r2 = r8.f32656b
            com.fourthline.orca.internal.je$a$a$b r4 = new com.fourthline.orca.internal.je$a$a$b
            kotlinx.serialization.json.Json r5 = com.fourthline.orca.internal.s40.a()
            r5.getClass()
            com.fourthline.vision.MotionData$Companion r6 = com.fourthline.vision.MotionData.INSTANCE
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            mlm.h r6 = (mlm.h) r6
            java.lang.String r7 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            kotlinx.serialization.json.JsonElement r9 = g4i.a.O(r5, r9, r6)
            r4.<init>(r9, r11)
            r12.<init>(r2, r10, r4)
            com.fourthline.orca.internal.je r9 = r8.f32655a
            r11 = 0
            r0.f32658a = r11
            r0.f32659b = r10
            r0.f32660c = r11
            r0.d = r11
            r0.f32661g = r3
            java.lang.Object r9 = r9.a(r12, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            yhm.m$a r11 = yhm.m.INSTANCE
            boolean r9 = r9 instanceof yhm.n
            if (r9 != 0) goto L8b
            com.fourthline.orca.internal.gf$f r9 = new com.fourthline.orca.internal.gf$f
            r9.<init>(r10)
            goto L90
        L8b:
            com.fourthline.orca.internal.gf$e r9 = new com.fourthline.orca.internal.gf$e
            r9.<init>(r10)
        L90:
            com.fourthline.orca.internal.sg0 r10 = r8.f32657c
            r10.a(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ra.a(com.fourthline.vision.MotionData, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
