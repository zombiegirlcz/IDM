package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.internal.t9;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hg1 implements fg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fg1 f29247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t9 f29248c;
    private final File d;
    private final sg0 e;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29251c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f29252g;
        int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29252g = obj2;
            this.i |= Integer.MIN_VALUE;
            Object objA = hg1.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s9 f29255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af1 f29256c;
        final /* synthetic */ hg1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s9 s9Var, af1 af1Var, hg1 hg1Var, Continuation continuation) {
            super(2, continuation);
            this.f29255b = s9Var;
            this.f29256c = af1Var;
            this.d = hg1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f29255b, this.f29256c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29254a;
            if (i == 0) {
                yhm.o.b(obj2);
                s9 s9Var = this.f29255b;
                String name = this.f29256c.getName();
                String absolutePath = this.d.d.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                w1 w1Var = new w1(name, absolutePath);
                this.f29254a = 1;
                objA = s9Var.a(w1Var, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
            }
            return new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29257a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ af1 f29259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(af1 af1Var, Continuation continuation) {
            super(2, continuation);
            this.f29259c = af1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return hg1.this.new c(this.f29259c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29257a;
            if (i == 0) {
                yhm.o.b(obj2);
                t9 t9Var = hg1.this.f29248c;
                t9.a aVar2 = new t9.a("remote_styles", "live-content/styling/" + this.f29259c.getRemoteStyles().getFilename(), hg1.this.d.getAbsolutePath() + "/styling/styling.json");
                this.f29257a = 1;
                objA = t9Var.a(aVar2, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
            }
            return new yhm.m(objA);
        }
    }

    public hg1(Context context, fg1 delegate, t9 cdnUrlDownloadWorker, File assetsFourthlineDirectory, sg0 tracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f29246a = context;
        this.f29247b = delegate;
        this.f29248c = cdnUrlDownloadWorker;
        this.d = assetsFourthlineDirectory;
        this.e = tracker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:14:0x0036, B:47:0x0109, B:51:0x0119, B:21:0x005a, B:37:0x00cb, B:42:0x00e1, B:44:0x00eb, B:29:0x0081, B:31:0x0088, B:33:0x00a2, B:39:0x00d6, B:49:0x0112, B:50:0x0118), top: B:55:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.fg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.fg1.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hg1.a(com.fourthline.orca.internal.fg1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
