package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.m8;
import com.fourthline.vision.internal.o8;
import com.fourthline.vision.internal.ra;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class p8 implements o8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f36683h = new a(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ra.a f36684j = new ra.a(pa.i, null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f36686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m8 f36687c;
    private final q8 d;
    private final d2 e;
    private z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Pair f36688g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o8.a.values().length];
            try {
                iArr[o8.a.f36623a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o8.a.f36624b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o8.a.f36625c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36689a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36691c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36689a = obj2;
            this.f36691c |= Integer.MIN_VALUE;
            return p8.this.cancel(this);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f36693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36694c;
        /* synthetic */ Object d;
        int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            return p8.this.stop(this);
        }
    }

    public p8(@NotNull Function0<? extends o8.a> recordingTypeFactory, @NotNull f audioRecorder, @NotNull m8 mediaFilesManager, @NotNull q8 mediaTrimmer, @NotNull d2 mediaDurationIntervalDataSource) {
        Intrinsics.checkNotNullParameter(recordingTypeFactory, "recordingTypeFactory");
        Intrinsics.checkNotNullParameter(audioRecorder, "audioRecorder");
        Intrinsics.checkNotNullParameter(mediaFilesManager, "mediaFilesManager");
        Intrinsics.checkNotNullParameter(mediaTrimmer, "mediaTrimmer");
        Intrinsics.checkNotNullParameter(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        this.f36685a = recordingTypeFactory;
        this.f36686b = audioRecorder;
        this.f36687c = mediaFilesManager;
        this.d = mediaTrimmer;
        this.e = mediaDurationIntervalDataSource;
        this.f36688g = new Pair(recordingTypeFactory.invoke(), Boolean.FALSE);
    }

    private final void changeRecordingStatus(boolean z) {
        this.f36688g = Pair.a(this.f36688g, null, Boolean.valueOf(z), 1);
    }

    private final o8.a getRecordingType() {
        return (o8.a) this.f36688g.f186385a;
    }

    private final boolean isRecording() {
        return ((Boolean) this.f36688g.f186386b).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try start$lambda$1(p8 p8Var, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        p8Var.changeRecordingStatus(false);
        return TryKt.failure(f36684j);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cancel(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.fourthline.vision.internal.p8.c
            if (r0 == 0) goto L13
            r0 = r5
            com.fourthline.vision.internal.p8$c r0 = (com.fourthline.vision.internal.p8.c) r0
            int r1 = r0.f36691c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36691c = r1
            goto L18
        L13:
            com.fourthline.vision.internal.p8$c r0 = new com.fourthline.vision.internal.p8$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f36689a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f36691c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            boolean r5 = r4.isRecording()
            if (r5 == 0) goto L67
            com.fourthline.vision.internal.o8$a r5 = r4.getRecordingType()
            com.fourthline.vision.internal.o8$a r2 = com.fourthline.vision.internal.o8.a.f36623a
            if (r5 == r2) goto L63
            com.fourthline.vision.internal.z r5 = r4.getVideoRecorder()
            if (r5 == 0) goto L51
            r0.f36691c = r3
            java.lang.Object r5 = r5.stopRecording(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.io.File r5 = (java.io.File) r5
        L51:
            com.fourthline.vision.internal.o8$a r5 = r4.getRecordingType()
            com.fourthline.vision.internal.o8$a r0 = com.fourthline.vision.internal.o8.a.f36625c
            if (r5 != r0) goto L5e
            com.fourthline.vision.internal.f r5 = r4.f36686b
            r5.stopRecording()
        L5e:
            com.fourthline.vision.internal.m8 r5 = r4.f36687c
            r5.deleteTempFiles()
        L63:
            r5 = 0
            r4.changeRecordingStatus(r5)
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.p8.cancel(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.o8
    public z getVideoRecorder() {
        return this.f;
    }

    @Override // com.fourthline.vision.internal.o8
    public void setVideoRecorder(z zVar) {
        this.f = zVar;
    }

    @Override // com.fourthline.vision.internal.o8
    @NotNull
    public Try<Unit> start() {
        Try tryJust;
        if (isRecording()) {
            return TryKt.failure(f36684j);
        }
        this.f36688g = new Pair(this.f36685a.invoke(), Boolean.TRUE);
        int i2 = b.$EnumSwitchMapping$0[getRecordingType().ordinal()];
        if (i2 == 1) {
            tryJust = Try.INSTANCE.just(Unit.f186387a);
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Try.Companion companion = Try.INSTANCE;
            try {
                z videoRecorder = getVideoRecorder();
                Intrinsics.h(videoRecorder);
                videoRecorder.startRecording(this.f36687c.createTempFile(m8.a.f36562a));
                if (getRecordingType() == o8.a.f36625c) {
                    this.f36686b.startRecording(this.f36687c.createTempFile(m8.a.f36563b));
                }
                tryJust = new Try.Success(Unit.f186387a);
            } catch (Throwable th10) {
                if ((th10 instanceof VirtualMachineError) || (th10 instanceof ThreadDeath) || (th10 instanceof InterruptedException) || (th10 instanceof LinkageError)) {
                    throw th10;
                }
                tryJust = new Try.Failure(th10);
            }
        }
        return TryKt.handleErrorWith(tryJust, new eg(this, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.fourthline.vision.internal.o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object stop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<java.net.URI>> r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.p8.stop(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
