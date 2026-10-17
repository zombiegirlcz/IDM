package com.fourthline.vision.internal;

import android.net.Uri;
import com.fourthline.vision.RecordingType;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f36493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecordingType f36494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f36495c;
    private final Function0 d;
    private final Function1 e;
    private a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Job f36496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f36497h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final me f36498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ke f36499b;

        public a(@NotNull me videoType, @NotNull ke recorder) {
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(recorder, "recorder");
            this.f36498a = videoType;
            this.f36499b = recorder;
        }

        public static /* synthetic */ a copy$default(a aVar, me meVar, ke keVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                meVar = aVar.f36498a;
            }
            if ((i & 2) != 0) {
                keVar = aVar.f36499b;
            }
            return aVar.copy(meVar, keVar);
        }

        @NotNull
        public final me component1() {
            return this.f36498a;
        }

        @NotNull
        public final ke component2() {
            return this.f36499b;
        }

        @NotNull
        public final a copy(@NotNull me videoType, @NotNull ke recorder) {
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(recorder, "recorder");
            return new a(videoType, recorder);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f36498a == aVar.f36498a && Intrinsics.f(this.f36499b, aVar.f36499b);
        }

        @NotNull
        public final ke getRecorder() {
            return this.f36499b;
        }

        @NotNull
        public final me getVideoType() {
            return this.f36498a;
        }

        public int hashCode() {
            return (this.f36498a.hashCode() * 31) + this.f36499b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActiveRecording(videoType=" + this.f36498a + ", recorder=" + this.f36499b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final me f36500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f36501b;

        public b(@NotNull me videoType, @NotNull Uri uri2) {
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.f36500a = videoType;
            this.f36501b = uri2;
        }

        public static /* synthetic */ b copy$default(b bVar, me meVar, Uri uri2, int i, Object obj2) {
            if ((i & 1) != 0) {
                meVar = bVar.f36500a;
            }
            if ((i & 2) != 0) {
                uri2 = bVar.f36501b;
            }
            return bVar.copy(meVar, uri2);
        }

        @NotNull
        public final me component1() {
            return this.f36500a;
        }

        @NotNull
        public final Uri component2() {
            return this.f36501b;
        }

        @NotNull
        public final b copy(@NotNull me videoType, @NotNull Uri uri2) {
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            return new b(videoType, uri2);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f36500a == bVar.f36500a && Intrinsics.f(this.f36501b, bVar.f36501b);
        }

        @NotNull
        public final Uri getUri() {
            return this.f36501b;
        }

        @NotNull
        public final me getVideoType() {
            return this.f36500a;
        }

        public int hashCode() {
            return (this.f36500a.hashCode() * 31) + this.f36501b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Result(videoType=" + this.f36500a + ", uri=" + this.f36501b + ")";
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f36504c;
        final /* synthetic */ le d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j2, le leVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f36504c = j2;
            this.d = leVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new c(this.f36504c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            le leVar;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36503b;
            if (i == 0) {
                yhm.o.b(obj2);
                long j2 = this.f36504c;
                this.f36503b = 1;
                if (skm.k0.b(j2, this) != aVar) {
                }
                return aVar;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                leVar = (le) this.f36502a;
                yhm.o.b(obj2);
                leVar.f36497h = (b) obj2;
                return Unit.f186387a;
            }
            yhm.o.b(obj2);
            le leVar2 = this.d;
            this.f36502a = leVar2;
            this.f36503b = 2;
            Object objStopRecordingForResult = leVar2.stopRecordingForResult(this);
            if (objStopRecordingForResult != aVar) {
                leVar = leVar2;
                obj2 = objStopRecordingForResult;
                leVar.f36497h = (b) obj2;
                return Unit.f186387a;
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36507c;
        /* synthetic */ Object d;
        int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return le.this.stopRecordingForResult(this);
        }
    }

    public le(@NotNull u cameraEngine, @NotNull RecordingType recordingType, @NotNull CoroutineScope scope, @NotNull Function0<Unit> onRecordingStopped, @NotNull Function1<? super me, Unit> onRecordingFailed) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onRecordingStopped, "onRecordingStopped");
        Intrinsics.checkNotNullParameter(onRecordingFailed, "onRecordingFailed");
        this.f36493a = cameraEngine;
        this.f36494b = recordingType;
        this.f36495c = scope;
        this.d = onRecordingStopped;
        this.e = onRecordingFailed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopRecordingForResult(kotlin.coroutines.Continuation<? super com.fourthline.vision.internal.le.b> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.fourthline.vision.internal.le.d
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.vision.internal.le$d r0 = (com.fourthline.vision.internal.le.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.vision.internal.le$d r0 = new com.fourthline.vision.internal.le$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.f36507c
            com.fourthline.vision.internal.me r1 = (com.fourthline.vision.internal.me) r1
            java.lang.Object r2 = r0.f36506b
            com.fourthline.vision.internal.ke r2 = (com.fourthline.vision.internal.ke) r2
            java.lang.Object r0 = r0.f36505a
            com.fourthline.vision.internal.le$a r0 = (com.fourthline.vision.internal.le.a) r0
            yhm.o.b(r6)     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            goto L64
        L34:
            r6 = move-exception
            goto L82
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            yhm.o.b(r6)
            com.fourthline.vision.internal.le$b r6 = r5.f36497h
            if (r6 == 0) goto L46
            return r6
        L46:
            com.fourthline.vision.internal.le$a r6 = r5.f
            if (r6 != 0) goto L4b
            return r4
        L4b:
            com.fourthline.vision.internal.ke r2 = r6.getRecorder()
            com.fourthline.vision.internal.me r6 = r6.getVideoType()
            r0.f36505a = r4     // Catch: com.fourthline.vision.internal.ke.a -> L75 java.lang.Throwable -> L79
            r0.f36506b = r4     // Catch: com.fourthline.vision.internal.ke.a -> L75 java.lang.Throwable -> L79
            r0.f36507c = r6     // Catch: com.fourthline.vision.internal.ke.a -> L75 java.lang.Throwable -> L79
            r0.f = r3     // Catch: com.fourthline.vision.internal.ke.a -> L75 java.lang.Throwable -> L79
            java.lang.Object r0 = r2.stop(r0)     // Catch: com.fourthline.vision.internal.ke.a -> L75 java.lang.Throwable -> L79
            if (r0 != r1) goto L62
            return r1
        L62:
            r1 = r6
            r6 = r0
        L64:
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            r5.f = r4     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            kotlin.jvm.functions.Function0 r0 = r5.d     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            r0.invoke()     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            com.fourthline.vision.internal.le$b r0 = new com.fourthline.vision.internal.le$b     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            r0.<init>(r1, r6)     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            r5.f36497h = r0     // Catch: com.fourthline.vision.internal.ke.a -> L34 java.lang.Throwable -> L7a
            return r0
        L75:
            r0 = move-exception
            r1 = r6
            r6 = r0
            goto L82
        L79:
            r1 = r6
        L7a:
            r5.f = r4
            kotlin.jvm.functions.Function1 r6 = r5.e
            r6.invoke(r1)
            goto L95
        L82:
            r6.toString()
            r5.f = r4
            java.lang.Throwable r6 = r6.getCause()
            if (r6 == 0) goto L90
            r6.printStackTrace()
        L90:
            kotlin.jvm.functions.Function1 r6 = r5.e
            r6.invoke(r1)
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.le.stopRecordingForResult(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean getShouldRecord() {
        return this.f36494b != RecordingType.NONE;
    }

    public final boolean isRecording() {
        return this.f != null;
    }

    public final void startRecording(@NotNull me videoType, long j2) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Objects.toString(videoType);
        if (getShouldRecord() && !isRecording()) {
            this.f36497h = null;
            this.f = new a(videoType, this.f36493a.recordVideo());
            this.f36496g = skm.e0.C(this.f36495c, null, null, new c(j2, this, null), 3);
        }
    }

    public final Object stopRecording(@NotNull Continuation<? super b> continuation) {
        Job job2 = this.f36496g;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36496g = null;
        b bVar = this.f36497h;
        return bVar == null ? stopRecordingForResult(continuation) : bVar;
    }
}
